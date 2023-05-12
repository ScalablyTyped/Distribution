package typings.johnnyFive.mod

import typings.johnnyFive.anon.Pressure
import typings.johnnyFive.johnnyFiveStrings.change
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Barometer")
@js.native
open class Barometer protected () extends StObject {
  def this(args: BarometerBMP180Args) = this()
  def this(args: BarometerGenericArgs) = this()
  
  def on(event: change | data, cb: js.Function1[/* data */ Pressure, Unit]): this.type = js.native
  
  /** Pressure is a string because somehow it's been fixed using {@link Number.toFixed} which returns a string. */
  var pressure: String = js.native
}
