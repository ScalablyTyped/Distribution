package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.calibrated
import typings.johnnyFive.johnnyFiveStrings.data
import typings.johnnyFive.johnnyFiveStrings.motionend
import typings.johnnyFive.johnnyFiveStrings.motionstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Motion")
@js.native
class Motion protected () extends js.Object {
  def this(option: Double) = this()
  def this(option: MotionOption) = this()
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_calibrated(event: calibrated, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_motionend(event: motionend, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_motionstart(event: motionstart, cb: js.Function0[Unit]): this.type = js.native
}
