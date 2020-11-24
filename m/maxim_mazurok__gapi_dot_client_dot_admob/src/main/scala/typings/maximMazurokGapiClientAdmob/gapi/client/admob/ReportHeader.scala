package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportHeader extends js.Object {
  
  /** The date range for which the report is generated. This is identical to the range specified in the report request. */
  var dateRange: js.UndefOr[DateRange] = js.native
  
  /** Localization settings of the report. This is identical to the settings in the report request. */
  var localizationSettings: js.UndefOr[LocalizationSettings] = js.native
  
  /** The report time zone. The value is a time-zone ID as specified by the CLDR project, for example, "America/Los_Angeles". */
  var reportingTimeZone: js.UndefOr[String] = js.native
}
object ReportHeader {
  
  @scala.inline
  def apply(): ReportHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportHeader]
  }
  
  @scala.inline
  implicit class ReportHeaderOps[Self <: ReportHeader] (val x: Self) extends AnyVal {
    
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
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setLocalizationSettings(value: LocalizationSettings): Self = this.set("localizationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizationSettings: Self = this.set("localizationSettings", js.undefined)
    
    @scala.inline
    def setReportingTimeZone(value: String): Self = this.set("reportingTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportingTimeZone: Self = this.set("reportingTimeZone", js.undefined)
  }
}
