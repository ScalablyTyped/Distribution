package typings
package makerDotJsLib.MakerJsNs.modelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Star")
@js.native
class Star protected ()
  extends makerDotJsLib.MakerJsNs.IModel {
  def this(numberOfPoints: scala.Double, outerRadius: scala.Double) = this()
  def this(numberOfPoints: scala.Double, outerRadius: scala.Double, innerRadius: scala.Double) = this()
  def this(numberOfPoints: scala.Double, outerRadius: scala.Double, innerRadius: scala.Double, skipPoints: scala.Double) = this()
  @JSName("paths")
  var paths_Star: makerDotJsLib.MakerJsNs.IPathMap = js.native
}

@JSGlobal("MakerJs.models.Star")
@js.native
object Star extends js.Object {
  def InnerRadiusRatio(numberOfPoints: scala.Double, skipPoints: scala.Double): scala.Double = js.native
}

