package typings.jsts.jstsNs.geomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.GeometryCollection")
@js.native
class GeometryCollection () extends Geometry {
  def this(geometries: js.Array[Geometry]) = this()
  def this(geometries: js.Array[Geometry], factory: GeometryFactory) = this()
}

