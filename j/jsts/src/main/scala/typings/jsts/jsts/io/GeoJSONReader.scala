package typings.jsts.jsts.io

import typings.jsts.jsts.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONReader extends js.Object {
  /**
    * Converts a GeoJSON to its <code>Geometry</code> representation.
    *
    * @param {Object} The GeoJSON representation of the Geometry.
    * @return {jsts.geom.Geometry}
    * geometry a <code>Geometry</code> to process.
    */
  def read(geometry: js.Object): Geometry
}

object GeoJSONReader {
  @scala.inline
  def apply(read: js.Object => Geometry): GeoJSONReader = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[GeoJSONReader]
  }
}

