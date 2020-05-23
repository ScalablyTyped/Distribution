package typings.jsts.jsts.io

import typings.jsts.jsts.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WKTReader extends js.Object {
  /**
    * Reads a Well-Known Text representation of a {@link Geometry}
    *
    * @param {string}
    *          wkt a <Geometry Tagged Text> string (see the OpenGIS Simple Features
    *          Specification).
    * @return {jsts.geom.Geometry} a <code>Geometry</code> read from
    *         <code>string.</code>
    */
  def read(wkt: String): Geometry
  def reducePrecision(geometry: Geometry): Unit
}

object WKTReader {
  @scala.inline
  def apply(read: String => Geometry, reducePrecision: Geometry => Unit): WKTReader = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), reducePrecision = js.Any.fromFunction1(reducePrecision))
    __obj.asInstanceOf[WKTReader]
  }
}

