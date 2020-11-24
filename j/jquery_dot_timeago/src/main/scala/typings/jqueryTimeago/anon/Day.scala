package typings.jqueryTimeago.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Day extends js.Object {
  
  var day: js.UndefOr[js.Any] = js.native
  
  var days: js.UndefOr[js.Any] = js.native
  
  var hour: js.UndefOr[js.Any] = js.native
  
  var hours: js.UndefOr[js.Any] = js.native
  
  var minute: js.UndefOr[js.Any] = js.native
  
  var minutes: js.UndefOr[js.Any] = js.native
  
  var month: js.UndefOr[js.Any] = js.native
  
  var months: js.UndefOr[js.Any] = js.native
  
  var numbers: js.UndefOr[js.Array[_]] = js.native
  
  var prefixAgo: js.UndefOr[String] = js.native
  
  var prefixFromNow: js.UndefOr[String] = js.native
  
  // Those can be string or Function
  var seconds: js.UndefOr[js.Any] = js.native
  
  var suffixAgo: js.UndefOr[String] = js.native
  
  var suffixFromNow: js.UndefOr[String] = js.native
  
  var wordSeparator: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[js.Any] = js.native
  
  var years: js.UndefOr[js.Any] = js.native
}
object Day {
  
  @scala.inline
  def apply(): Day = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Day]
  }
  
  @scala.inline
  implicit class DayOps[Self <: Day] (val x: Self) extends AnyVal {
    
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
    def setDay(value: js.Any): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setDays(value: js.Any): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setHour(value: js.Any): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setHours(value: js.Any): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMinute(value: js.Any): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMinutes(value: js.Any): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setMonth(value: js.Any): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setMonths(value: js.Any): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setNumbersVarargs(value: js.Any*): Self = this.set("numbers", js.Array(value :_*))
    
    @scala.inline
    def setNumbers(value: js.Array[_]): Self = this.set("numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumbers: Self = this.set("numbers", js.undefined)
    
    @scala.inline
    def setPrefixAgo(value: String): Self = this.set("prefixAgo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixAgo: Self = this.set("prefixAgo", js.undefined)
    
    @scala.inline
    def setPrefixFromNow(value: String): Self = this.set("prefixFromNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixFromNow: Self = this.set("prefixFromNow", js.undefined)
    
    @scala.inline
    def setSeconds(value: js.Any): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    
    @scala.inline
    def setSuffixAgo(value: String): Self = this.set("suffixAgo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffixAgo: Self = this.set("suffixAgo", js.undefined)
    
    @scala.inline
    def setSuffixFromNow(value: String): Self = this.set("suffixFromNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffixFromNow: Self = this.set("suffixFromNow", js.undefined)
    
    @scala.inline
    def setWordSeparator(value: String): Self = this.set("wordSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSeparator: Self = this.set("wordSeparator", js.undefined)
    
    @scala.inline
    def setYear(value: js.Any): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
    
    @scala.inline
    def setYears(value: js.Any): Self = this.set("years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
}
