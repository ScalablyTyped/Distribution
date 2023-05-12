package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Sensor")
@js.native
open class Sensor protected () extends StObject {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: SensorOption) = this()
  
  val analog: Double = js.native
  
  val boolean: Boolean = js.native
  
  def booleanAt(barrier: Double): Boolean = js.native
  
  val constrained: Double = js.native
  
  def fscaleTo(low: Double, high: Double): Double = js.native
  def fscaleTo(range: js.Array[Double]): Double = js.native
  
  var id: String = js.native
  
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
  
  var pin: Double | String = js.native
  
  val raw: Double = js.native
  
  def scaleTo(low: Double, high: Double): Double = js.native
  def scaleTo(range: js.Array[Double]): Double = js.native
  
  var threshold: Double = js.native
  
  val value: Double = js.native
  
  def within(range: js.Array[Double], cb: js.Function0[Unit]): Unit = js.native
}
