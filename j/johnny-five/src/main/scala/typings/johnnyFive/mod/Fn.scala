package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Fn")
@js.native
class Fn () extends js.Object
/* static members */
@JSImport("johnny-five", "Fn")
@js.native
object Fn extends js.Object {
  
  def bitSize(n: Double): Double = js.native
  
  def bitValue(bit: Double): Double = js.native
  
  def constrain(value: Double, lower: Double, upper: Double): Double = js.native
  
  def fmap(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native
  
  def fscale(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native
  
  def inRange(value: Double, lower: Double, upper: Double): Boolean = js.native
  
  def int16(msb: Double, lsb: Double): Double = js.native
  
  def int24(b16: Double, b8: Double, b0: Double): Double = js.native
  
  def int32(b24: Double, b16: Double, b8: Double, b0: Double): Double = js.native
  
  def map(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native
  
  def range(lower: Double, upper: Double, tick: Double): js.Array[Double] = js.native
  
  def scale(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native
  
  def sum(values: js.Array[Double]): Double = js.native
  
  def toFixed(number: Double, digits: Double): Double = js.native
  
  def uid(): String = js.native
  
  def uint16(msb: Double, lsb: Double): Double = js.native
  
  def uint24(b16: Double, b8: Double, b0: Double): Double = js.native
  
  def uint32(b24: Double, b16: Double, b8: Double, b0: Double): Double = js.native
}
