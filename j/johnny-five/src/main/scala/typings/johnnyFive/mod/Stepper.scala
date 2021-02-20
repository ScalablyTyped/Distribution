package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Stepper")
@js.native
class Stepper protected () extends StObject {
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
object Stepper {
  
  @JSImport("johnny-five", "Stepper.TYPE")
  @js.native
  class TYPE () extends StObject
  /* static members */
  object TYPE {
    
    @JSImport("johnny-five", "Stepper.TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("johnny-five", "Stepper.TYPE.DRIVER")
    @js.native
    def DRIVER: Double = js.native
    @scala.inline
    def DRIVER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRIVER")(x.asInstanceOf[js.Any])
    
    @JSImport("johnny-five", "Stepper.TYPE.FOUR_WIRE")
    @js.native
    def FOUR_WIRE: Double = js.native
    @scala.inline
    def FOUR_WIRE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOUR_WIRE")(x.asInstanceOf[js.Any])
    
    @JSImport("johnny-five", "Stepper.TYPE.TWO_WIRE")
    @js.native
    def TWO_WIRE: Double = js.native
    @scala.inline
    def TWO_WIRE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_WIRE")(x.asInstanceOf[js.Any])
  }
}
