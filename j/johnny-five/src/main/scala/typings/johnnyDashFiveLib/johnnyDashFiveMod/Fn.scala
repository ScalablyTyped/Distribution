package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Fn")
@js.native
class Fn () extends js.Object

/* static members */
@JSImport("johnny-five", "Fn")
@js.native
object Fn extends js.Object {
  def bitSize(n: scala.Double): scala.Double = js.native
  def bitValue(bit: scala.Double): scala.Double = js.native
  def constrain(value: scala.Double, lower: scala.Double, upper: scala.Double): scala.Double = js.native
  def fmap(
    value: scala.Double,
    fromLow: scala.Double,
    fromHigh: scala.Double,
    toLow: scala.Double,
    toHigh: scala.Double
  ): scala.Double = js.native
  def fscale(
    value: scala.Double,
    fromLow: scala.Double,
    fromHigh: scala.Double,
    toLow: scala.Double,
    toHigh: scala.Double
  ): scala.Double = js.native
  def inRange(value: scala.Double, lower: scala.Double, upper: scala.Double): scala.Boolean = js.native
  def int16(msb: scala.Double, lsb: scala.Double): scala.Double = js.native
  def int24(b16: scala.Double, b8: scala.Double, b0: scala.Double): scala.Double = js.native
  def int32(b24: scala.Double, b16: scala.Double, b8: scala.Double, b0: scala.Double): scala.Double = js.native
  def map(
    value: scala.Double,
    fromLow: scala.Double,
    fromHigh: scala.Double,
    toLow: scala.Double,
    toHigh: scala.Double
  ): scala.Double = js.native
  def range(lower: scala.Double, upper: scala.Double, tick: scala.Double): js.Array[scala.Double] = js.native
  def scale(
    value: scala.Double,
    fromLow: scala.Double,
    fromHigh: scala.Double,
    toLow: scala.Double,
    toHigh: scala.Double
  ): scala.Double = js.native
  def sum(values: js.Array[scala.Double]): scala.Double = js.native
  def toFixed(number: scala.Double, digits: scala.Double): scala.Double = js.native
  def uid(): java.lang.String = js.native
  def uint16(msb: scala.Double, lsb: scala.Double): scala.Double = js.native
  def uint24(b16: scala.Double, b8: scala.Double, b0: scala.Double): scala.Double = js.native
  def uint32(b24: scala.Double, b16: scala.Double, b8: scala.Double, b0: scala.Double): scala.Double = js.native
}

