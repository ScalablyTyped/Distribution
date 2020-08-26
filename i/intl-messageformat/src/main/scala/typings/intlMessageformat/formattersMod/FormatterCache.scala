package typings.intlMessageformat.formattersMod

import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatterCache extends js.Object {
  var dateTime: Record[String, DateTimeFormat] = js.native
  var number: Record[String, NumberFormat] = js.native
  var pluralRules: Record[String, PluralRules] = js.native
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
  @scala.inline
  implicit class FormatterCacheOps[Self <: FormatterCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDateTime(value: Record[String, DateTimeFormat]): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Record[String, NumberFormat]): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluralRules(value: Record[String, PluralRules]): Self = this.set("pluralRules", value.asInstanceOf[js.Any])
  }
  
}

