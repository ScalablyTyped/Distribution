package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.change
import typings.johnnyDashFive.johnnyDashFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Hygrometer")
@js.native
class Hygrometer protected () extends js.Object {
  def this(option: HygrometerOption) = this()
  val RH: Double = js.native
  var id: String = js.native
  val relativeHumidity: Double = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
}

