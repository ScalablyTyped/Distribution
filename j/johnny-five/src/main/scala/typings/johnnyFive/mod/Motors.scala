package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Motors")
@js.native
class Motors protected () extends js.Object {
  def this(option: js.Array[Double | MotorOption]) = this()
  
  def brake(): Unit = js.native
  
  def forward(speed: Double): Unit = js.native
  
  def fwd(speed: Double): Unit = js.native
  
  val isOn: Boolean = js.native
  
  def release(): Unit = js.native
  
  def rev(speed: Double): Unit = js.native
  
  def reverse(speed: Double): Unit = js.native
  
  def start(): Unit = js.native
  def start(speed: Double): Unit = js.native
  
  def stop(): Unit = js.native
}
