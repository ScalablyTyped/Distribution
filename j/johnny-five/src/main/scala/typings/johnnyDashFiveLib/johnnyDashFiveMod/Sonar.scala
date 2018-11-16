package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Sonar")
@js.native
class Sonar protected () extends js.Object {
  def this(option: java.lang.String) = this()
  def this(option: SonarOption) = this()
  def this(option: scala.Double) = this()
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.change, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  def within(range: js.Array[scala.Double], cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def within(range: js.Array[scala.Double], unit: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

