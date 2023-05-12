package typings.johnnyFive.mod

import typings.johnnyFive.anon.DRIVER
import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Stepper")
@js.native
open class Stepper protected () extends StObject {
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
  
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
  
  def rpm(): Stepper = js.native
  def rpm(value: Double): Stepper = js.native
  
  def speed(): Stepper = js.native
  def speed(value: Double): Stepper = js.native
  
  def step(stepsOrOpts: Any, cb: js.Function0[Unit]): Unit = js.native
  
  def within(range: js.Array[Double], cb: js.Function0[Unit]): Unit = js.native
  def within(range: js.Array[Double], unit: String, cb: js.Function0[Unit]): Unit = js.native
}
/* static members */
object Stepper {
  
  @JSImport("johnny-five", "Stepper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("johnny-five", "Stepper.TYPE")
  @js.native
  def TYPE: DRIVER = js.native
  inline def TYPE_=(x: DRIVER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
}
