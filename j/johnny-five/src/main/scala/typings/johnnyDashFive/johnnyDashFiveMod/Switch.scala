package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.close
import typings.johnnyDashFive.johnnyDashFiveStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Switch")
@js.native
class Switch protected () extends js.Object {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: SwitchOption) = this()
  var id: String = js.native
  val isClosed: Boolean = js.native
  val isOpen: Boolean = js.native
  var pin: Double | String = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, cb: js.Function0[Unit]): this.type = js.native
}

