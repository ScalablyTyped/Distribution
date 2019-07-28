package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.Anon_Abbr
import typings.johnnyDashFive.johnnyDashFiveStrings.change
import typings.johnnyDashFive.johnnyDashFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Compass")
@js.native
class Compass protected () extends js.Object {
  def this(option: CompassOption) = this()
  val bearing: Anon_Abbr = js.native
  val heading: Double = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
}

