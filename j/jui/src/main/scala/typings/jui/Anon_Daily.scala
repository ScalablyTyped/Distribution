package typings.jui

import typings.jui.juiStrings.daily
import typings.jui.juiStrings.monthly
import typings.jui.juiStrings.now
import typings.jui.juiStrings.yearly
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Daily extends js.Object {
  /**
    * @cfg {Date} [date="now"]
    * Selects a specific date as a basic
    */
  var date: js.UndefOr[now | Date] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {String} [format="yyyy-MM-dd"]
    * Format of the date handed over when selecting a specific date
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Date} [maxDate="null"]
    * Selects a specific maximum date
    */
  var maxDate: js.UndefOr[Date] = js.undefined
  /**
    * @cfg {Date} [minDate="null"]
    * Selects a specific minimum date
    */
  var minDate: js.UndefOr[Date] = js.undefined
  /**
    * @cfg {String} [titleFormat="yyyy.MM"]
    * Title format of a calendar
    */
  var titleFormat: js.UndefOr[String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {"daily"/"monthly"/"yearly"} [type="daily"]
    * Determines the type of a calendar
    */
  var `type`: js.UndefOr[daily | monthly | yearly] = js.undefined
}

object Anon_Daily {
  @scala.inline
  def apply(
    date: now | Date = null,
    event: js.Any = null,
    format: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    titleFormat: String = null,
    tpl: js.Any = null,
    `type`: daily | monthly | yearly = null
  ): Anon_Daily = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (format != null) __obj.updateDynamic("format")(format)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (titleFormat != null) __obj.updateDynamic("titleFormat")(titleFormat)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Daily]
  }
}

