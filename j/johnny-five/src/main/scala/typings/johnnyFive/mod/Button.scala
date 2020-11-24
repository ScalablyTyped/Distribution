package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.down
import typings.johnnyFive.johnnyFiveStrings.hold
import typings.johnnyFive.johnnyFiveStrings.press
import typings.johnnyFive.johnnyFiveStrings.release
import typings.johnnyFive.johnnyFiveStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Button")
@js.native
class Button protected () extends js.Object {
  def this(pin: String) = this()
  def this(pin: Double) = this()
  def this(pin: ButtonOption) = this()
  
  var downValue: Double = js.native
  
  var holdtime: Double = js.native
  
  var id: String = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_down(event: down, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_hold(event: hold, cb: js.Function1[/* holdTime */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_press(event: press, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_release(event: release, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_up(event: up, cb: js.Function0[Unit]): this.type = js.native
  
  var pin: Double | String = js.native
  
  var upValue: Double = js.native
}
