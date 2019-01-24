package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Settings")
@js.native
object SettingsNs extends js.Object {
  var defaultLocale: java.lang.String = js.native
  var defaultNumberingSystem: java.lang.String = js.native
  var defaultOutputCalendar: java.lang.String = js.native
  val defaultZone: luxonLib.luxonMod.Zone = js.native
  var defaultZoneName: java.lang.String = js.native
  var throwOnInvalid: scala.Boolean = js.native
  def now(): scala.Double = js.native
  def resetCaches(): scala.Unit = js.native
}

