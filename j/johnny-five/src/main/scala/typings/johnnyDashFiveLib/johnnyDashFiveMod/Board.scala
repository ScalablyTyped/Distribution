package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Board")
@js.native
class Board () extends js.Object {
  def this(option: BoardOption) = this()
  var id: java.lang.String = js.native
  var io: js.Any = js.native
  var isReady: scala.Boolean = js.native
  var pins: js.Array[Pin] = js.native
  var port: java.lang.String = js.native
  var repl: Repl = js.native
  def analogRead(pin: scala.Double, cb: js.Function1[/* item */ scala.Double, scala.Unit]): scala.Unit = js.native
  def analogWrite(pin: scala.Double, value: scala.Double): scala.Unit = js.native
  def digitalRead(pin: scala.Double, cb: js.Function1[/* item */ scala.Double, scala.Unit]): scala.Unit = js.native
  def digitalWrite(pin: scala.Double, value: scala.Double): scala.Unit = js.native
  def loop(ms: scala.Double, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.connect, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.ready, cb: js.Function0[scala.Unit]): this.type = js.native
  def pinMode(pin: scala.Double, mode: scala.Double): scala.Unit = js.native
  def samplingInterval(ms: scala.Double): scala.Unit = js.native
  def servoWrite(pin: scala.Double, angle: scala.Double): scala.Unit = js.native
  def shiftOut(dataPin: Pin, clockPin: Pin, isBigEndian: scala.Boolean, value: scala.Double): scala.Unit = js.native
  def wait(ms: scala.Double, cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

