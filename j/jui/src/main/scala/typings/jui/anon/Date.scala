package typings.jui.anon

import typings.jui.juiStrings.daily
import typings.jui.juiStrings.monthly
import typings.jui.juiStrings.now
import typings.jui.juiStrings.yearly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  /**
    * @cfg {Date} [date="now"]
    * Selects a specific date as a basic
    */
  var date: js.UndefOr[now | typings.std.Date] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {String} [format="yyyy-MM-dd"]
    * Format of the date handed over when selecting a specific date
    */
  var format: js.UndefOr[String] = js.native
  /**
    * @cfg {Date} [maxDate="null"]
    * Selects a specific maximum date
    */
  var maxDate: js.UndefOr[typings.std.Date] = js.native
  /**
    * @cfg {Date} [minDate="null"]
    * Selects a specific minimum date
    */
  var minDate: js.UndefOr[typings.std.Date] = js.native
  /**
    * @cfg {String} [titleFormat="yyyy.MM"]
    * Title format of a calendar
    */
  var titleFormat: js.UndefOr[String] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {"daily"/"monthly"/"yearly"} [type="daily"]
    * Determines the type of a calendar
    */
  var `type`: js.UndefOr[daily | monthly | yearly] = js.native
}

object Date {
  @scala.inline
  def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
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
    def setDate(value: now | typings.std.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMaxDate(value: typings.std.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: typings.std.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setTitleFormat(value: String): Self = this.set("titleFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFormat: Self = this.set("titleFormat", js.undefined)
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
    @scala.inline
    def setType(value: daily | monthly | yearly): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

