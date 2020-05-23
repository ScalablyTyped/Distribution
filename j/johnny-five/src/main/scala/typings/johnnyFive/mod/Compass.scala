package typings.johnnyFive.mod

import typings.johnnyFive.anon.Abbr
import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Compass")
@js.native
class Compass protected () extends js.Object {
  def this(option: CompassOption) = this()
  val bearing: Abbr = js.native
  val heading: Double = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
}

