package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Thermometer")
@js.native
open class Thermometer protected () extends StObject {
  def this(option: ThermometerOption) = this()
  
  val C: Double = js.native
  
  val F: Double = js.native
  
  val K: Double = js.native
  
  val celsius: Double = js.native
  
  val fahrenheit: Double = js.native
  
  var id: String = js.native
  
  val kelvin: Double = js.native
  
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
  
  var pin: Double | String = js.native
}
