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
  class GeoJSONWriter ()
    extends jstsLib.jstsNs.ioNs.GeoJSONWriter
  
  @js.native
  class OL3Parser ()
    extends jstsLib.jstsNs.ioNs.OL3Parser {
    def this(geometryFactory: jstsLib.jstsNs.geomNs.GeometryFactory) = this()
  }
  
  @js.native
  class WKTReader ()
    extends jstsLib.jstsNs.ioNs.WKTReader {
    /**
                 * @constructor
                 */
    def this(geometryFactory: jstsLib.jstsNs.geomNs.GeometryFactory) = this()
  }
  
  @js.native
  class WKTWriter ()
    extends jstsLib.jstsNs.ioNs.WKTWriter {
    /**
                 * @constructor
                 */
    def this(geometryFactory: jstsLib.jstsNs.geomNs.GeometryFactory) = this()
  }
  
}

