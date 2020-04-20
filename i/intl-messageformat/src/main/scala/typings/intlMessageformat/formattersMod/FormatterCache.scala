package typings.intlMessageformat.formattersMod

import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
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
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterCache]
  }
}

