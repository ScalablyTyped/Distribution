package typings.johnnyFive.mod

import typings.johnnyFive.anon.Abbr
import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Compass")
@js.native
open class Compass protected () extends StObject {
  def this(option: CompassOption) = this()
  
  val bearing: Abbr = js.native
  
  val heading: Double = js.native
  
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
}
