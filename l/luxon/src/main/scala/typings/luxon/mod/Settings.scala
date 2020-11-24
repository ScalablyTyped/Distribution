package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "Settings")
@js.native
object Settings extends js.Object {
  
  var defaultLocale: String = js.native
  
  var defaultNumberingSystem: String = js.native
  
  var defaultOutputCalendar: String = js.native
  
  val defaultZone: Zone = js.native
  
  var defaultZoneName: String = js.native
  
  def now(): Double = js.native
  
  def resetCaches(): Unit = js.native
  
  var throwOnInvalid: Boolean = js.native
}
