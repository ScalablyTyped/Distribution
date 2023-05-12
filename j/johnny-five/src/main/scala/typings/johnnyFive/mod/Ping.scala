package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Ping")
@js.native
open class Ping protected () extends StObject {
  def this(option: Double) = this()
  def this(option: PingOption) = this()
  
  /** Calculated distance to object in centimeters */
  val cm: Double = js.native
  
  /** Calculated distance to object in inches */
  val in: Double = js.native
  
  /** Calculated distance to object in inches */
  val inches: Double = js.native
  
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
}
