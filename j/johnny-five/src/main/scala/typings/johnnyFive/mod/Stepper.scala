package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Stepper")
@js.native
class Stepper protected () extends js.Object {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: StepperOption) = this()
  def accel(): Stepper = js.native
  def accel(value: Double): Stepper = js.native
  def ccw(): Stepper = js.native
  def cw(): Stepper = js.native
  def decel(): Stepper = js.native
  def decel(value: Double): Stepper = js.native
  def direction(): Stepper = js.native
  def direction(value: Double): Stepper = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  def rpm(): Stepper = js.native
  def rpm(value: Double): Stepper = js.native
  def speed(): Stepper = js.native
  def speed(value: Double): Stepper = js.native
  def step(stepsOrOpts: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def within(range: js.Array[Double], cb: js.Function0[Unit]): Unit = js.native
  def within(range: js.Array[Double], unit: String, cb: js.Function0[Unit]): Unit = js.native
}

@JSImport("johnny-five", "Stepper")
@js.native
object Stepper extends js.Object {
  @js.native
  class TYPE () extends js.Object
  
  /* static members */
  @js.native
  object TYPE extends js.Object {
    var DRIVER: Double = js.native
    var FOUR_WIRE: Double = js.native
    var TWO_WIRE: Double = js.native
  }
  
}

