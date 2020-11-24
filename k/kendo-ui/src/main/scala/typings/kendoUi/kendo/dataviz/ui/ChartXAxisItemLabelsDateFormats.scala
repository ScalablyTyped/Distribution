package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartXAxisItemLabelsDateFormats extends js.Object {
  
  var days: js.UndefOr[String] = js.native
  
  var hours: js.UndefOr[String] = js.native
  
  var months: js.UndefOr[String] = js.native
  
  var weeks: js.UndefOr[String] = js.native
  
  var years: js.UndefOr[String] = js.native
}
object ChartXAxisItemLabelsDateFormats {
  
  @scala.inline
  def apply(): ChartXAxisItemLabelsDateFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxisItemLabelsDateFormats]
  }
  
  @scala.inline
  implicit class ChartXAxisItemLabelsDateFormatsOps[Self <: ChartXAxisItemLabelsDateFormats] (val x: Self) extends AnyVal {
    
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
    def setDays(value: String): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setHours(value: String): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMonths(value: String): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setWeeks(value: String): Self = this.set("weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeks: Self = this.set("weeks", js.undefined)
    
    @scala.inline
    def setYears(value: String): Self = this.set("years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
}
