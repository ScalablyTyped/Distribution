package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Switch")
@js.native
class Switch protected () extends js.Object {
  def this(option: java.lang.String) = this()
  def this(option: SwitchOption) = this()
  def this(option: scala.Double) = this()
  var id: java.lang.String = js.native
  val isClosed: scala.Boolean = js.native
  val isOpen: scala.Boolean = js.native
  var pin: scala.Double | java.lang.String = js.native
  @JSName("on")
  def on_close(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.close, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.open, cb: js.Function0[scala.Unit]): this.type = js.native
}

