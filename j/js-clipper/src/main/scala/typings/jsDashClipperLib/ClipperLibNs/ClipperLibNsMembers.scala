package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib")
@js.native
object ClipperLibNsMembers extends js.Object {
  var MaxSteps: scala.Double = js.native
  var PI: scala.Double = js.native
  var PI2: scala.Double = js.native
  var biginteger_used: scala.Boolean = js.native
  def Cast_Int32(a: scala.Double): scala.Double = js.native
  def Cast_Int64(a: scala.Double): scala.Double = js.native
  def Clean(polygon: stdLib.ArrayLike[IntPoint | stdLib.ArrayLike[IntPoint]], delta: scala.Double): stdLib.ArrayLike[IntPoint] | stdLib.ArrayLike[stdLib.ArrayLike[IntPoint]] = js.native
  def Clear(a: stdLib.ArrayLike[_]): scala.Unit = js.native
  def Clone(polygon: stdLib.ArrayLike[IntPoint | stdLib.ArrayLike[IntPoint]]): stdLib.ArrayLike[IntPoint] | stdLib.ArrayLike[stdLib.ArrayLike[IntPoint]] = js.native
  def Error(message: java.lang.String): scala.Unit = js.native
  def Lighten(polygon: stdLib.ArrayLike[IntPoint | stdLib.ArrayLike[IntPoint]], tolerance: scala.Double): stdLib.ArrayLike[IntPoint] | stdLib.ArrayLike[stdLib.ArrayLike[IntPoint]] = js.native
  def Math_Abs_Double(a: scala.Double): scala.Double = js.native
  def Math_Abs_Int32(a: scala.Double): scala.Double = js.native
  def Math_Abs_Int64(a: scala.Double): scala.Double = js.native
  def Math_Max_Int32_Int32(a: scala.Double, b: scala.Double): scala.Double = js.native
}

