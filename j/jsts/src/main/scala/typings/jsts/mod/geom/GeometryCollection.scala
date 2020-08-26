package typings.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom.GeometryCollection")
@js.native
class GeometryCollection ()
  extends typings.jsts.jsts.geom.Geometry {
  def this(geometries: js.Array[typings.jsts.jsts.geom.Geometry]) = this()
  def this(geometries: js.UndefOr[scala.Nothing], factory: typings.jsts.jsts.geom.GeometryFactory) = this()
  def this(
    geometries: js.Array[typings.jsts.jsts.geom.Geometry],
    factory: typings.jsts.jsts.geom.GeometryFactory
  ) = this()
}

