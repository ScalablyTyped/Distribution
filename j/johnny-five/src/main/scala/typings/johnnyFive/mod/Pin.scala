package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.analog
import typings.johnnyFive.johnnyFiveStrings.data
import typings.johnnyFive.johnnyFiveStrings.digital
import typings.johnnyFive.johnnyFiveStrings.high
import typings.johnnyFive.johnnyFiveStrings.low
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Pin")
@js.native
open class Pin protected () extends StObject {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: PinOption) = this()
  
  def high(): Unit = js.native
  
  var id: Double | String = js.native
  
  def low(): Unit = js.native
  
  var mode: PinMode = js.native
  
  def on(event: high | low, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
  
  var pin: Double | String = js.native
  
  def query(cb: js.Function1[/* pin */ PinState, Unit]): Unit = js.native
  
  def read(cb: js.Function2[/* error */ js.Error, /* value */ Double, Unit]): Unit = js.native
  
  var `type`: digital | analog = js.native
  
  var value: Double = js.native
  
  def write(value: Double): Unit = js.native
}
/* static members */
object Pin {
  
  @JSImport("johnny-five", "Pin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("johnny-five", "Pin.ANALOG")
  @js.native
  val ANALOG: /* 2 */ Double = js.native
  
  @JSImport("johnny-five", "Pin.INPUT")
  @js.native
  val INPUT: /* 0 */ Double = js.native
  
  @JSImport("johnny-five", "Pin.OUTPUT")
  @js.native
  val OUTPUT: /* 1 */ Double = js.native
  
  @JSImport("johnny-five", "Pin.PWM")
  @js.native
  val PWM: /* 3 */ Double = js.native
  
  @JSImport("johnny-five", "Pin.SERVO")
  @js.native
  val SERVO: /* 4 */ Double = js.native
  
  inline def read(pin: Double, cb: js.Function2[/* error */ js.Error, /* data */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(pin.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def write(pin: Double, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(pin.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
