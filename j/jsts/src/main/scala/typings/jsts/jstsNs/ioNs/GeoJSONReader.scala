package typings.jsts.jstsNs.ioNs

import typings.jsts.jstsNs.geomNs.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.io.GeoJSONReader")
@js.native
class GeoJSONReader () extends js.Object {
  /**
    * Converts a GeoJSON to its <code>Geometry</code> representation.
    *
    * @param {Object} The GeoJSON representation of the Geometry.
    * @return {jsts.geom.Geometry}
    * geometry a <code>Geometry</code> to process.
    */
  def read(geometry: js.Object): Geometry = js.native
}

