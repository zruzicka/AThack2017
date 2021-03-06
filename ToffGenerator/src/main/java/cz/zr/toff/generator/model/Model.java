/*
 * Released under the MIT/X11 License.
 *
 * Copyright (c) 2017 Zbynek Ruzicka
 *
 * You should have received a copy of the License along with this project in the project root.
 */

package cz.zr.toff.generator.model;

import java.util.Date;

import cz.zr.toff.generator.Utils;

public class Model {

    private final String from;
    private final String to;
    private Date start;
    private Date end;

    public Model(String from, String to, Date start, Date end) {
        super();
        this.from = from;
        this.to = to;
        this.start = start;
        this.end = end;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getStart() {
        return Utils.DATE.format(start);
    }

    public String getEnd() {
        return Utils.DATE.format(end);
    }

    
}
