package typings.javascriptTimeAgo

import typings.javascriptTimeAgo.localeMod.DefaultFormats
import typings.javascriptTimeAgo.localeMod.Duration
import typings.javascriptTimeAgo.localeMod.Formats
import typings.javascriptTimeAgo.localeMod.Locale
import typings.javascriptTimeAgo.localeMod.RTFFormatter
import typings.javascriptTimeAgo.localeMod.TimeUnit
import typings.javascriptTimeAgo.styleMod.FormatStyle
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("javascript-time-ago", JSImport.Namespace)
  @js.native
  class ^ () extends TimeAgo {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
  }
  
  /* static member */
  @JSImport("javascript-time-ago", "addLocale")
  @js.native
  def addLocale(localeData: Locale): Unit = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "getDefaultLocale")
  @js.native
  def getDefaultLocale(): String = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "intlDateTimeFormatSupported")
  @js.native
  def intlDateTimeFormatSupported(): Boolean = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "intlDateTimeFormatSupportedLocale")
  @js.native
  def intlDateTimeFormatSupportedLocale(locale: String): String | Unit = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "locale")
  @js.native
  def locale(localeData: Locale): Unit = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "setDefaultLocale")
  @js.native
  def setDefaultLocale(locale: String): Unit = js.native
  
  @js.native
  trait TimeAgo extends StObject {
    
    def format(input: Double): String = js.native
    def format(input: Double, style: String): String = js.native
    def format(input: Double, style: FormatStyle): String = js.native
    def format(input: Date): String = js.native
    def format(input: Date, style: String): String = js.native
    def format(input: Date, style: FormatStyle): String = js.native
    
    def formatNumber(number: Double): String = js.native
    
    def formatValue(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
    def formatValue(value: Date, unit: TimeUnit, localeData: Duration): String = js.native
    
    def getFormatter(flavor: DefaultFormats): RTFFormatter = js.native
    
    def getLocaleData(): Duration = js.native
    def getLocaleData(format: Formats): Duration = js.native
    
    def getRule(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
    // Defaults to "long"
    def getRule(value: Date, unit: TimeUnit, localeData: Duration): String = js.native
  }
}
