package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Stepper")
@js.native
class Stepper protected () extends js.Object {
  def this(option: java.lang.String) = this()
  def this(option: StepperOption) = this()
  def this(option: scala.Double) = this()
  def accel(): Stepper = js.native
  def accel(value: scala.Double): Stepper = js.native
  def ccw(): Stepper = js.native
  def cw(): Stepper = js.native
  def decel(): Stepper = js.native
  def decel(value: scala.Double): Stepper = js.native
  def direction(): Stepper = js.native
  def direction(value: scala.Double): Stepper = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.change, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  def rpm(): Stepper = js.native
  def rpm(value: scala.Double): Stepper = js.native
  def speed(): Stepper = js.native
  def speed(value: scala.Double): Stepper = js.native
  def step(stepsOrOpts: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def within(range: js.Array[scala.Double], cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def within(range: js.Array[scala.Double], unit: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
}

