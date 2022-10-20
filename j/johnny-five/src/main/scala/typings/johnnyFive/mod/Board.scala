package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.close
import typings.johnnyFive.johnnyFiveStrings.connect
import typings.johnnyFive.johnnyFiveStrings.error
import typings.johnnyFive.johnnyFiveStrings.exit
import typings.johnnyFive.johnnyFiveStrings.fail
import typings.johnnyFive.johnnyFiveStrings.info
import typings.johnnyFive.johnnyFiveStrings.message
import typings.johnnyFive.johnnyFiveStrings.ready
import typings.johnnyFive.johnnyFiveStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Board")
@js.native
open class Board () extends StObject {
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
  
  var io: Any = js.native
  
  var isReady: Boolean = js.native
  
  def loop(ms: Double, cb: js.Function0[Unit]): Unit = js.native
  
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_exit(event: exit, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_fail(event: fail, cb: js.Function1[/* event */ BoardLogEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_info(event: info, cb: js.Function1[/* event */ BoardLogEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, cb: js.Function1[/* event */ BoardLogEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_warn(event: warn, cb: js.Function1[/* event */ BoardLogEvent, Unit]): this.type = js.native
  
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
