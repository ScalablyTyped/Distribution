package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.moveColoncomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Servo")
@js.native
open class Servo protected () extends StObject {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: ServoGeneralOption) = this()
  
  def ccw(speed: Double): Unit = js.native
  
  def center(): Unit = js.native
  
  def cw(speed: Double): Unit = js.native
  
  var history: js.Array[Any] = js.native
  
  def home(): Unit = js.native
  
  var id: String = js.native
  
  var interval: Double = js.native
  
  var invert: Boolean = js.native
  
  var isMoving: Boolean = js.native
  
  val last: Any = js.native
  
  def max(): Unit = js.native
  
  def min(): Unit = js.native
  
  @JSName("on")
  def on_movecomplete(event: moveColoncomplete, cb: js.Function0[Unit]): this.type = js.native
  
  var pin: Double | String = js.native
  
  val position: Double = js.native
  
  var range: js.Array[Double] = js.native
  
  var startAt: Double = js.native
  
  def stop(): Unit = js.native
  
  def sweep(): Unit = js.native
  def sweep(arg: js.Array[Double]): Unit = js.native
  def sweep(arg: ServoSweepOpts): Unit = js.native
  
  def to(degrees: Double): Unit = js.native
  def to(degrees: Double, ms: Double): Unit = js.native
  def to(degrees: Double, ms: Double, rage: Double): Unit = js.native
  def to(degrees: Double, ms: Unit, rage: Double): Unit = js.native
  
  var value: Double = js.native
}
