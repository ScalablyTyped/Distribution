package typings.jsDashClipper.ClipperLibNs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib")
@js.native
object ^ extends js.Object {
  var MaxSteps: Double = js.native
  var PI: Double = js.native
  var PI2: Double = js.native
  var biginteger_used: Boolean = js.native
  def Cast_Int32(a: Double): Double = js.native
  def Cast_Int64(a: Double): Double = js.native
  def Clean(polygon: ArrayLike[ArrayLike[IntPoint] | IntPoint], delta: Double): ArrayLike[ArrayLike[IntPoint] | IntPoint] = js.native
  def Clear(a: ArrayLike[_]): Unit = js.native
  def Clone(polygon: ArrayLike[ArrayLike[IntPoint] | IntPoint]): ArrayLike[ArrayLike[IntPoint] | IntPoint] = js.native
  def Error(message: String): Unit = js.native
  def Lighten(polygon: ArrayLike[ArrayLike[IntPoint] | IntPoint], tolerance: Double): ArrayLike[ArrayLike[IntPoint] | IntPoint] = js.native
  def Math_Abs_Double(a: Double): Double = js.native
  def Math_Abs_Int32(a: Double): Double = js.native
  def Math_Abs_Int64(a: Double): Double = js.native
  def Math_Max_Int32_Int32(a: Double, b: Double): Double = js.native
}

