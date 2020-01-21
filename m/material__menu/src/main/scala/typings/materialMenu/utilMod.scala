package typings.materialMenu

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def bezierProgress(time: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def clamp(value: Double): Double = js.native
  def clamp(value: Double, min: Double): Double = js.native
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  def getTransformPropertyName(globalObj: Window_): js.UndefOr[String] = js.native
  def getTransformPropertyName(globalObj: Window_, forceRefresh: Boolean): js.UndefOr[String] = js.native
}

