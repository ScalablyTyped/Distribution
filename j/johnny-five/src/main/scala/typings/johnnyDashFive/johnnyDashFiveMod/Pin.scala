package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.analog
import typings.johnnyDashFive.johnnyDashFiveStrings.data
import typings.johnnyDashFive.johnnyDashFiveStrings.digital
import typings.johnnyDashFive.johnnyDashFiveStrings.high
import typings.johnnyDashFive.johnnyDashFiveStrings.low
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Pin")
@js.native
class Pin protected () extends js.Object {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: PinOption) = this()
  var id: Double | String = js.native
  var mode: Double = js.native
  var pin: Double | String = js.native
  var `type`: digital | analog = js.native
  var value: Double = js.native
  def high(): Unit = js.native
  def low(): Unit = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_high(event: high, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_low(event: low, cb: js.Function0[Unit]): this.type = js.native
  def query(cb: js.Function1[/* pin */ PinState, Unit]): Unit = js.native
  def read(cb: js.Function2[/* error */ Error, /* value */ Double, Unit]): Unit = js.native
  def write(value: Double): Unit = js.native
}

/* static members */
@JSImport("johnny-five", "Pin")
@js.native
object Pin extends js.Object {
  def read(pin: Double, cb: js.Function2[/* error */ Error, /* data */ Double, Unit]): Unit = js.native
  def write(pin: Double, value: Double): Unit = js.native
}

