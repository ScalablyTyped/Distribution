package typings.javascriptTimeAgo.mod

import typings.javascriptTimeAgo.localeMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("javascript-time-ago", JSImport.Namespace)
@js.native
class ^ () extends TimeAgo {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
}
@JSImport("javascript-time-ago", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def addLocale(localeData: Locale): Unit = js.native
  
  def getDefaultLocale(): String = js.native
  
  def intlDateTimeFormatSupported(): Boolean = js.native
  
  def intlDateTimeFormatSupportedLocale(locale: String): String | Unit = js.native
  
  def locale(localeData: Locale): Unit = js.native
  
  def setDefaultLocale(locale: String): Unit = js.native
}
