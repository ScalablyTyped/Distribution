package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.calibrated
import typings.johnnyFive.johnnyFiveStrings.data
import typings.johnnyFive.johnnyFiveStrings.motionend
import typings.johnnyFive.johnnyFiveStrings.motionstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Motion")
@js.native
open class Motion protected () extends StObject {
  def this(option: Double) = this()
  def this(option: MotionOption) = this()
  
  def on(event: calibrated | motionstart | motionend, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
}
