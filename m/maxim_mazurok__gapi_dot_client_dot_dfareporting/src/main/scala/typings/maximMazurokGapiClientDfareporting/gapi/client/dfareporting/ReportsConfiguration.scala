package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsConfiguration extends js.Object {
  
  /** Whether the exposure to conversion report is enabled. This report shows detailed pathway information on up to 10 of the most recent ad exposures seen by a user before converting. */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  
  /** Default lookback windows for new advertisers in this account. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
  
  /**
    * Report generation time zone ID of this account. This is a required field that can only be changed by a superuser. Acceptable values are: - "1" for "America/New_York" - "2" for
    * "Europe/London" - "3" for "Europe/Paris" - "4" for "Africa/Johannesburg" - "5" for "Asia/Jerusalem" - "6" for "Asia/Shanghai" - "7" for "Asia/Hong_Kong" - "8" for "Asia/Tokyo" - "9"
    * for "Australia/Sydney" - "10" for "Asia/Dubai" - "11" for "America/Los_Angeles" - "12" for "Pacific/Auckland" - "13" for "America/Sao_Paulo" - "16" for "America/Asuncion" - "17" for
    * "America/Chicago" - "18" for "America/Denver" - "19" for "America/St_Johns" - "20" for "Asia/Dhaka" - "21" for "Asia/Jakarta" - "22" for "Asia/Kabul" - "23" for "Asia/Karachi" -
    * "24" for "Asia/Calcutta" - "25" for "Asia/Pyongyang" - "26" for "Asia/Rangoon" - "27" for "Atlantic/Cape_Verde" - "28" for "Atlantic/South_Georgia" - "29" for "Australia/Adelaide" -
    * "30" for "Australia/Lord_Howe" - "31" for "Europe/Moscow" - "32" for "Pacific/Kiritimati" - "35" for "Pacific/Norfolk" - "36" for "Pacific/Tongatapu"
    */
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.native
}
object ReportsConfiguration {
  
  @scala.inline
  def apply(): ReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportsConfiguration]
  }
  
  @scala.inline
  implicit class ReportsConfigurationOps[Self <: ReportsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setExposureToConversionEnabled(value: Boolean): Self = this.set("exposureToConversionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposureToConversionEnabled: Self = this.set("exposureToConversionEnabled", js.undefined)
    
    @scala.inline
    def setLookbackConfiguration(value: LookbackConfiguration): Self = this.set("lookbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookbackConfiguration: Self = this.set("lookbackConfiguration", js.undefined)
    
    @scala.inline
    def setReportGenerationTimeZoneId(value: String): Self = this.set("reportGenerationTimeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportGenerationTimeZoneId: Self = this.set("reportGenerationTimeZoneId", js.undefined)
  }
}
