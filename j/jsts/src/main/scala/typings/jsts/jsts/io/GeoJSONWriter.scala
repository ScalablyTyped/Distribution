package typings.jsts.jsts.io

import typings.jsts.jsts.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONWriter extends js.Object {
  /**
    * Converts a <code>Geometry</code> to its GeoJSON representation.
    *
    * @param {jsts.geom.Geometry}
    *          geometry a <code>Geometry</code> to process.
    * @return {Object} The GeoJSON representation of the Geometry.
    */
  def write(geometry: Geometry): js.Object
}

object GeoJSONWriter {
  @scala.inline
  def apply(write: Geometry => js.Object): GeoJSONWriter = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[GeoJSONWriter]
  }
}

