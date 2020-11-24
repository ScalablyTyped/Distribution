package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilityAxisOptions extends js.Object {
  
  var rangeCategories: js.UndefOr[String] = js.native
  
  var rangeFromTo: js.UndefOr[String] = js.native
  
  var timeRangeDays: js.UndefOr[String] = js.native
  
  var timeRangeHours: js.UndefOr[String] = js.native
  
  var timeRangeMinutes: js.UndefOr[String] = js.native
  
  var timeRangeSeconds: js.UndefOr[String] = js.native
  
  var xAxisDescriptionPlural: js.UndefOr[String] = js.native
  
  var xAxisDescriptionSingular: js.UndefOr[String] = js.native
  
  var yAxisDescriptionPlural: js.UndefOr[String] = js.native
  
  var yAxisDescriptionSingular: js.UndefOr[String] = js.native
}
object LangAccessibilityAxisOptions {
  
  @scala.inline
  def apply(): LangAccessibilityAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityAxisOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityAxisOptionsOps[Self <: LangAccessibilityAxisOptions] (val x: Self) extends AnyVal {
    
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
    def setRangeCategories(value: String): Self = this.set("rangeCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeCategories: Self = this.set("rangeCategories", js.undefined)
    
    @scala.inline
    def setRangeFromTo(value: String): Self = this.set("rangeFromTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeFromTo: Self = this.set("rangeFromTo", js.undefined)
    
    @scala.inline
    def setTimeRangeDays(value: String): Self = this.set("timeRangeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRangeDays: Self = this.set("timeRangeDays", js.undefined)
    
    @scala.inline
    def setTimeRangeHours(value: String): Self = this.set("timeRangeHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRangeHours: Self = this.set("timeRangeHours", js.undefined)
    
    @scala.inline
    def setTimeRangeMinutes(value: String): Self = this.set("timeRangeMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRangeMinutes: Self = this.set("timeRangeMinutes", js.undefined)
    
    @scala.inline
    def setTimeRangeSeconds(value: String): Self = this.set("timeRangeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRangeSeconds: Self = this.set("timeRangeSeconds", js.undefined)
    
    @scala.inline
    def setXAxisDescriptionPlural(value: String): Self = this.set("xAxisDescriptionPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisDescriptionPlural: Self = this.set("xAxisDescriptionPlural", js.undefined)
    
    @scala.inline
    def setXAxisDescriptionSingular(value: String): Self = this.set("xAxisDescriptionSingular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisDescriptionSingular: Self = this.set("xAxisDescriptionSingular", js.undefined)
    
    @scala.inline
    def setYAxisDescriptionPlural(value: String): Self = this.set("yAxisDescriptionPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisDescriptionPlural: Self = this.set("yAxisDescriptionPlural", js.undefined)
    
    @scala.inline
    def setYAxisDescriptionSingular(value: String): Self = this.set("yAxisDescriptionSingular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisDescriptionSingular: Self = this.set("yAxisDescriptionSingular", js.undefined)
  }
}
