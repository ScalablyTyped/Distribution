package typings.intlDashMessageformat.libFormattersMod

import typings.std.IntlNs.DateTimeFormat
import typings.std.IntlNs.NumberFormat
import typings.std.IntlNs.PluralRules
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterCache extends js.Object {
  var dateTime: Record[String, DateTimeFormat]
  var number: Record[String, NumberFormat]
  var pluralRules: Record[String, PluralRules]
}

object FormatterCache {
  @scala.inline
  def apply(
    dateTime: Record[String, DateTimeFormat],
    number: Record[String, NumberFormat],
    pluralRules: Record[String, PluralRules]
  ): FormatterCache = {
    val __obj = js.Dynamic.literal(dateTime = dateTime, number = number, pluralRules = pluralRules)
  
    __obj.asInstanceOf[FormatterCache]
  }
}

