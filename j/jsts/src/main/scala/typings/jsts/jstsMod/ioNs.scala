package typings.jsts.jstsMod

import typings.jsts.jstsNs.geomNs.GeometryFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "io")
@js.native
object ioNs extends js.Object {
  @js.native
  class GeoJSONReader ()
    extends typings.jsts.jstsNs.ioNs.GeoJSONReader
  
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
    extends typings.jsts.jstsNs.ioNs.GeoJSONWriter
  
  @js.native
  class OL3Parser ()
    extends typings.jsts.jstsNs.ioNs.OL3Parser {
    def this(geometryFactory: GeometryFactory) = this()
  }
  
  @js.native
  /**
    * @constructor
    */
  class WKTReader ()
    extends typings.jsts.jstsNs.ioNs.WKTReader {
    def this(geometryFactory: GeometryFactory) = this()
  }
  
  @js.native
  /**
    * @constructor
    */
  class WKTWriter ()
    extends typings.jsts.jstsNs.ioNs.WKTWriter {
    def this(geometryFactory: GeometryFactory) = this()
  }
  
}

