package typings
package gregorianDashCalendarLib.gregorianDashCalendarDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  var Style: DateTimeStyle = js.native
  /**
           * format an instance of GregorianCalendar according to pattern
           */
  def format(calendar: gregorianDashCalendarLib.gregorianDashCalendarMod.namespaced): java.lang.String = js.native
  /**
           * get a predefine GregorianCalendarFormat instance
           */
  def getDateTimeInstance(dateStyle: DateTimeStyle, timeStyle: DateTimeStyle): DateTimeFormat = js.native
  /**
           * get a predefine GregorianCalendarFormat instance
           */
  def getDateTimeInstance(dateStyle: DateTimeStyle, timeStyle: DateTimeStyle, locale: js.Object): DateTimeFormat = js.native
  /**
           * parse a dateString to an instance of GregorianCalendar according to pattern, it's better to specify calendarLocale, such as
           *  `df.parse('2013-11-12', {locale: require('gregorian-calendar/lib/locale/zh_CN'}));`
           */
  def parse(dateString: java.lang.String, hasLocale: gregorianDashCalendarLib.Anon_Locale): gregorianDashCalendarLib.gregorianDashCalendarMod.namespaced = js.native
}

