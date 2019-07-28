package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.calibrated
import typings.johnnyDashFive.johnnyDashFiveStrings.change
import typings.johnnyDashFive.johnnyDashFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Orientiation")
@js.native
class Orientiation protected () extends js.Object {
  def this(option: OrientiationOption) = this()
  val euler: js.Any = js.native
  val quarternion: js.Any = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_calibrated(event: calibrated, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
}

