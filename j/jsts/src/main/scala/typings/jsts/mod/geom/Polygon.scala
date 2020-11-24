package typings.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsts", "geom.Polygon")
@js.native
class Polygon protected ()
  extends typings.jsts.jsts.geom.Polygon {
  /**
    * @constructor
    */
  def this(shell: typings.jsts.jsts.geom.LinearRing) = this()
  def this(shell: typings.jsts.jsts.geom.LinearRing, holes: js.Array[typings.jsts.jsts.geom.LinearRing]) = this()
  def this(shell: typings.jsts.jsts.geom.LinearRing, holes: js.UndefOr[scala.Nothing], factory: js.Any) = this()
  def this(
    shell: typings.jsts.jsts.geom.LinearRing,
    holes: js.Array[typings.jsts.jsts.geom.LinearRing],
    factory: js.Any
  ) = this()
}
