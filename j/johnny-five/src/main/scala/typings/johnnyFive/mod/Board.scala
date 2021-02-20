package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.connect
import typings.johnnyFive.johnnyFiveStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Board")
@js.native
class Board () extends StObject {
  def this(option: BoardOption) = this()
  
  def analogRead(pin: String, cb: js.Function1[/* item */ Double, Unit]): Unit = js.native
  def analogRead(pin: Double, cb: js.Function1[/* item */ Double, Unit]): Unit = js.native
  
  def analogWrite(pin: String, value: Double): Unit = js.native
  def analogWrite(pin: Double, value: Double): Unit = js.native
  
  def digitalRead(pin: String, cb: js.Function1[/* item */ Double, Unit]): Unit = js.native
  def digitalRead(pin: Double, cb: js.Function1[/* item */ Double, Unit]): Unit = js.native
  
  def digitalWrite(pin: String, value: Double): Unit = js.native
  def digitalWrite(pin: Double, value: Double): Unit = js.native
  
  var id: String = js.native
  
  var io: js.Any = js.native
  
  var isReady: Boolean = js.native
  
  def loop(ms: Double, cb: js.Function0[Unit]): Unit = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, cb: js.Function0[Unit]): this.type = js.native
  
  def pinMode(pin: String, mode: Double): Unit = js.native
  def pinMode(pin: Double, mode: Double): Unit = js.native
  
  var pins: js.Array[Pin] = js.native
  
  var port: String = js.native
  
  var repl: Repl = js.native
  
  def samplingInterval(ms: Double): Unit = js.native
  
  def servoWrite(pin: String, angle: Double): Unit = js.native
  def servoWrite(pin: Double, angle: Double): Unit = js.native
  
  def shiftOut(dataPin: Pin, clockPin: Pin, isBigEndian: Boolean, value: Double): Unit = js.native
  
  def wait(ms: Double, cb: js.Function0[Unit]): Unit = js.native
}
