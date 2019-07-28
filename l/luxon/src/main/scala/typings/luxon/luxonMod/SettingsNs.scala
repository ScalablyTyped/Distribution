package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Settings")
@js.native
object SettingsNs extends js.Object {
  var defaultLocale: String = js.native
  var defaultNumberingSystem: String = js.native
  var defaultOutputCalendar: String = js.native
  val defaultZone: Zone = js.native
  var defaultZoneName: String = js.native
  var throwOnInvalid: Boolean = js.native
  def now(): Double = js.native
  def resetCaches(): Unit = js.native
}

