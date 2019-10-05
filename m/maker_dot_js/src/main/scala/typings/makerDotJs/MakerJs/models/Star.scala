package typings.makerDotJs.MakerJs.models

import typings.makerDotJs.MakerJs.IModel
import typings.makerDotJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Star")
@js.native
class Star protected () extends IModel {
  def this(numberOfPoints: Double, outerRadius: Double) = this()
  def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double) = this()
  def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double, skipPoints: Double) = this()
  @JSName("paths")
  var paths_Star: IPathMap = js.native
}

/* static members */
@JSGlobal("MakerJs.models.Star")
@js.native
object Star extends js.Object {
  def InnerRadiusRatio(numberOfPoints: Double, skipPoints: Double): Double = js.native
}

