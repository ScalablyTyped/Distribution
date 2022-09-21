package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Accelerometer")
@js.native
open class Accelerometer protected () extends StObject {
  def this(option: AccelerometerAnalogOption) = this()
  def this(option: AccelerometerGeneralOption) = this()
  def this(option: AccelerometerMMA7361Option) = this()
  def this(option: AccelerometerMPU6050Option) = this()
  
  val acceleration: Double = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def hasAxis(name: String): Unit = js.native
  
  var id: String = js.native
  
  val inclination: Double = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* freq */ Any, Unit]): this.type = js.native
  
  val orientation: Double = js.native
  
  var pins: js.Array[String] = js.native
  
  val pitch: Double = js.native
  
  val roll: Double = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
  
  val z: Double = js.native
  
  var zeroV: Double = js.native
}
