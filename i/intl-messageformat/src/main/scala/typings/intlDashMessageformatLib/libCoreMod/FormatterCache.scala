package typings
package intlDashMessageformatLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterCache extends js.Object {
  var dateTime: stdLib.Record[java.lang.String, stdLib.IntlNs.DateTimeFormat]
  var number: stdLib.Record[java.lang.String, stdLib.IntlNs.NumberFormat]
  var pluralRules: stdLib.Record[java.lang.String, stdLib.IntlNs.PluralRules]
}

object FormatterCache {
  @scala.inline
  def apply(
    dateTime: stdLib.Record[java.lang.String, stdLib.IntlNs.DateTimeFormat],
    number: stdLib.Record[java.lang.String, stdLib.IntlNs.NumberFormat],
    pluralRules: stdLib.Record[java.lang.String, stdLib.IntlNs.PluralRules]
  ): FormatterCache = {
    val __obj = js.Dynamic.literal(dateTime = dateTime, number = number, pluralRules = pluralRules)
  
    __obj.asInstanceOf[FormatterCache]
  }
}

