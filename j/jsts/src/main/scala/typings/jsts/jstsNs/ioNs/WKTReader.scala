package typings.jsts.jstsNs.ioNs

import typings.jsts.jstsNs.geomNs.Geometry
import typings.jsts.jstsNs.geomNs.GeometryFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.io.WKTReader")
@js.native
/**
  * @constructor
  */
class WKTReader () extends js.Object {
  def this(geometryFactory: GeometryFactory) = this()
  /**
    * Reads a Well-Known Text representation of a {@link Geometry}
    *
    * @param {string}
    *          wkt a <Geometry Tagged Text> string (see the OpenGIS Simple Features
    *          Specification).
    * @return {jsts.geom.Geometry} a <code>Geometry</code> read from
    *         <code>string.</code>
    */
  def read(wkt: String): Geometry = js.native
  def reducePrecision(geometry: Geometry): Unit = js.native
}

