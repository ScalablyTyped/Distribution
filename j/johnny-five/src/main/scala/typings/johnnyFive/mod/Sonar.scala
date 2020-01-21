package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Sonar")
@js.native
class Sonar protected () extends js.Object {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: SonarOption) = this()
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  def within(range: js.Array[Double], cb: js.Function0[Unit]): Unit = js.native
  def within(range: js.Array[Double], unit: String, cb: js.Function0[Unit]): Unit = js.native
}

