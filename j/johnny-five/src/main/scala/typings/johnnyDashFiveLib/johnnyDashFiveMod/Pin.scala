package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Pin")
@js.native
class Pin protected () extends js.Object {
  def this(option: java.lang.String) = this()
  def this(option: PinOption) = this()
  def this(option: scala.Double) = this()
  var id: scala.Double | java.lang.String = js.native
  var mode: scala.Double = js.native
  var pin: scala.Double | java.lang.String = js.native
  var `type`: johnnyDashFiveLib.johnnyDashFiveLibStrings.digital | johnnyDashFiveLib.johnnyDashFiveLibStrings.analog = js.native
  var value: scala.Double = js.native
  def high(): scala.Unit = js.native
  def low(): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_high(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.high, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_low(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.low, cb: js.Function0[scala.Unit]): this.type = js.native
  def query(cb: js.Function1[/* pin */ PinState, scala.Unit]): scala.Unit = js.native
  def read(cb: js.Function2[/* error */ nodeLib.Error, /* value */ scala.Double, scala.Unit]): scala.Unit = js.native
  def write(value: scala.Double): scala.Unit = js.native
}

@JSImport("johnny-five", "Pin")
@js.native
object Pin extends js.Object {
  def read(
    pin: scala.Double,
    cb: js.Function2[/* error */ nodeLib.Error, /* data */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def write(pin: scala.Double, value: scala.Double): scala.Unit = js.native
}

