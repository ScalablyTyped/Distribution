package typings.makerJs.global.MakerJs.models

import typings.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Star")
@js.native
class Star protected ()
  extends typings.makerJs.MakerJs.models.Star {
  def this(numberOfPoints: Double, outerRadius: Double) = this()
  def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double) = this()
  def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double, skipPoints: Double) = this()
  /* CompleteClass */
  @JSName("paths")
  override var paths_Star: IPathMap = js.native
}

/* static members */
@JSGlobal("MakerJs.models.Star")
@js.native
object Star extends js.Object {
  def InnerRadiusRatio(numberOfPoints: Double, skipPoints: Double): Double = js.native
}

