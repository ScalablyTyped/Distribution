package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Fn")
@js.native
class Fn () extends StObject
/* static members */
object Fn {
  
  @JSImport("johnny-five", "Fn")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bitSize(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bitSize")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def bitValue(bit: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bitValue")(bit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def constrain(value: Double, lower: Double, upper: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrain")(value.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def fmap(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fmap")(value.asInstanceOf[js.Any], fromLow.asInstanceOf[js.Any], fromHigh.asInstanceOf[js.Any], toLow.asInstanceOf[js.Any], toHigh.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def fscale(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fscale")(value.asInstanceOf[js.Any], fromLow.asInstanceOf[js.Any], fromHigh.asInstanceOf[js.Any], toLow.asInstanceOf[js.Any], toHigh.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def inRange(value: Double, lower: Double, upper: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(value.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def int16(msb: Double, lsb: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int16")(msb.asInstanceOf[js.Any], lsb.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def int24(b16: Double, b8: Double, b0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int24")(b16.asInstanceOf[js.Any], b8.asInstanceOf[js.Any], b0.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def int32(b24: Double, b16: Double, b8: Double, b0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int32")(b24.asInstanceOf[js.Any], b16.asInstanceOf[js.Any], b8.asInstanceOf[js.Any], b0.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def map(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(value.asInstanceOf[js.Any], fromLow.asInstanceOf[js.Any], fromHigh.asInstanceOf[js.Any], toLow.asInstanceOf[js.Any], toHigh.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def range(lower: Double, upper: Double, tick: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], tick.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def scale(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(value.asInstanceOf[js.Any], fromLow.asInstanceOf[js.Any], fromHigh.asInstanceOf[js.Any], toLow.asInstanceOf[js.Any], toHigh.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sum(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toFixed(number: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def uid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[String]
  
  @scala.inline
  def uint16(msb: Double, lsb: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uint16")(msb.asInstanceOf[js.Any], lsb.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def uint24(b16: Double, b8: Double, b0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uint24")(b16.asInstanceOf[js.Any], b8.asInstanceOf[js.Any], b0.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def uint32(b24: Double, b16: Double, b8: Double, b0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uint32")(b24.asInstanceOf[js.Any], b16.asInstanceOf[js.Any], b8.asInstanceOf[js.Any], b0.asInstanceOf[js.Any])).asInstanceOf[Double]
}
