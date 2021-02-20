package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Fn")
@js.native
class Fn () extends StObject
/* static members */
object Fn {
  
  @JSImport("johnny-five", "Fn.bitSize")
  @js.native
  def bitSize(n: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.bitValue")
  @js.native
  def bitValue(bit: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.constrain")
  @js.native
  def constrain(value: Double, lower: Double, upper: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.fmap")
  @js.native
  def fmap(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.fscale")
  @js.native
  def fscale(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.inRange")
  @js.native
  def inRange(value: Double, lower: Double, upper: Double): Boolean = js.native
  
  @JSImport("johnny-five", "Fn.int16")
  @js.native
  def int16(msb: Double, lsb: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.int24")
  @js.native
  def int24(b16: Double, b8: Double, b0: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.int32")
  @js.native
  def int32(b24: Double, b16: Double, b8: Double, b0: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.map")
  @js.native
  def map(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.range")
  @js.native
  def range(lower: Double, upper: Double, tick: Double): js.Array[Double] = js.native
  
  @JSImport("johnny-five", "Fn.scale")
  @js.native
  def scale(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.sum")
  @js.native
  def sum(values: js.Array[Double]): Double = js.native
  
  @JSImport("johnny-five", "Fn.toFixed")
  @js.native
  def toFixed(number: Double, digits: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.uid")
  @js.native
  def uid(): String = js.native
  
  @JSImport("johnny-five", "Fn.uint16")
  @js.native
  def uint16(msb: Double, lsb: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.uint24")
  @js.native
  def uint24(b16: Double, b8: Double, b0: Double): Double = js.native
  
  @JSImport("johnny-five", "Fn.uint32")
  @js.native
  def uint32(b24: Double, b16: Double, b8: Double, b0: Double): Double = js.native
}
