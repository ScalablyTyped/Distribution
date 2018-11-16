package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilScaleOrdinal
  extends js.Function {
  def apply(x: scala.Double): scala.Double = js.native
  def domain(values: js.Array[_]): UtilScaleOrdinal = js.native
  def invert(x: scala.Double): scala.Double = js.native
  def range(values: js.Array[_]): UtilScaleOrdinal = js.native
  def rangeBands(interval: scala.Double): js.Function0[scala.Unit] = js.native
  def rangeBands(interval: scala.Double, padding: scala.Double): js.Function0[scala.Unit] = js.native
  def rangeBands(interval: scala.Double, padding: scala.Double, outerPadding: scala.Double): js.Function0[scala.Unit] = js.native
  def rangePoints(interval: scala.Double): js.Function0[scala.Unit] = js.native
  def rangePoints(interval: scala.Double, padding: scala.Double): js.Function0[scala.Unit] = js.native
}

