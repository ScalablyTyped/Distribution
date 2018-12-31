package typings
package jstsLib.jstsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "io")
@js.native
object ioNs extends js.Object {
  @js.native
  class GeoJSONReader ()
    extends jstsLib.jstsNs.ioNs.GeoJSONReader
  
  @js.native
  /**
    * Writes the GeoJSON representation of a {@link Geometry}. The
    * The GeoJSON format is defined <A
    * HREF="http://geojson.org/geojson-spec.html">here</A>.
    * <p>
    * The <code>GeoJSONWriter</code> outputs coordinates rounded to the precision
    * model. Only the maximum number of decimal places necessary to represent the
    * ordinates to the required precision will be output.
    * <p>
    *
    * @see WKTReader
    * @constructor
    */
  class GeoJSONWriter ()
    extends jstsLib.jstsNs.ioNs.GeoJSONWriter
  
  @js.native
  class OL3Parser ()
    extends jstsLib.jstsNs.ioNs.OL3Parser {
    def this(geometryFactory: jstsLib.jstsNs.geomNs.GeometryFactory) = this()
  }
  
  @js.native
  /**
    * @constructor
    */
  class WKTReader ()
    extends jstsLib.jstsNs.ioNs.WKTReader {
    def this(geometryFactory: jstsLib.jstsNs.geomNs.GeometryFactory) = this()
  }
  
  @js.native
  /**
    * @constructor
    */
  class WKTWriter ()
    extends jstsLib.jstsNs.ioNs.WKTWriter {
    def this(geometryFactory: jstsLib.jstsNs.geomNs.GeometryFactory) = this()
  }
  
}

