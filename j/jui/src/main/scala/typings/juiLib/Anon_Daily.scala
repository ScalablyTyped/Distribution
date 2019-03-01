package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Daily extends js.Object {
  /**
    * @cfg {Date} [date="now"]
    * Selects a specific date as a basic
    */
  var date: js.UndefOr[juiLib.juiLibStrings.now | stdLib.Date] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {String} [format="yyyy-MM-dd"]
    * Format of the date handed over when selecting a specific date
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @cfg {Date} [maxDate="null"]
    * Selects a specific maximum date
    */
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * @cfg {Date} [minDate="null"]
    * Selects a specific minimum date
    */
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * @cfg {String} [titleFormat="yyyy.MM"]
    * Title format of a calendar
    */
  var titleFormat: js.UndefOr[java.lang.String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {"daily"/"monthly"/"yearly"} [type="daily"]
    * Determines the type of a calendar
    */
  var `type`: js.UndefOr[
    juiLib.juiLibStrings.daily | juiLib.juiLibStrings.monthly | juiLib.juiLibStrings.yearly
  ] = js.undefined
}

object Anon_Daily {
  @scala.inline
  def apply(
    date: juiLib.juiLibStrings.now | stdLib.Date = null,
    event: js.Any = null,
    format: java.lang.String = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    titleFormat: java.lang.String = null,
    tpl: js.Any = null,
    `type`: juiLib.juiLibStrings.daily | juiLib.juiLibStrings.monthly | juiLib.juiLibStrings.yearly = null
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

