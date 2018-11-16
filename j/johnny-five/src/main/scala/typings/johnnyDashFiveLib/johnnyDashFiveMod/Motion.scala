package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Motion")
@js.native
class Motion protected () extends js.Object {
  def this(option: MotionOption) = this()
  def this(option: scala.Double) = this()
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_calibrated(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.calibrated, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_motionend(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.motionend, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_motionstart(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.motionstart, cb: js.Function0[scala.Unit]): this.type = js.native
}

