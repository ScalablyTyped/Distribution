package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportsConfiguration extends StObject {
  
  /** Whether the exposure to conversion report is enabled. This report shows detailed pathway information on up to 10 of the most recent ad exposures seen by a user before converting. */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Default lookback windows for new advertisers in this account. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  
  /**
    * Report generation time zone ID of this account. This is a required field that can only be changed by a superuser. Acceptable values are: - "1" for "America/New_York" - "2" for
    * "Europe/London" - "3" for "Europe/Paris" - "4" for "Africa/Johannesburg" - "5" for "Asia/Jerusalem" - "6" for "Asia/Shanghai" - "7" for "Asia/Hong_Kong" - "8" for "Asia/Tokyo" - "9"
    * for "Australia/Sydney" - "10" for "Asia/Dubai" - "11" for "America/Los_Angeles" - "12" for "Pacific/Auckland" - "13" for "America/Sao_Paulo" - "16" for "America/Asuncion" - "17" for
    * "America/Chicago" - "18" for "America/Denver" - "19" for "America/St_Johns" - "20" for "Asia/Dhaka" - "21" for "Asia/Jakarta" - "22" for "Asia/Kabul" - "23" for "Asia/Karachi" -
    * "24" for "Asia/Calcutta" - "25" for "Asia/Pyongyang" - "26" for "Asia/Rangoon" - "27" for "Atlantic/Cape_Verde" - "28" for "Atlantic/South_Georgia" - "29" for "Australia/Adelaide" -
    * "30" for "Australia/Lord_Howe" - "31" for "Europe/Moscow" - "32" for "Pacific/Kiritimati" - "35" for "Pacific/Norfolk" - "36" for "Pacific/Tongatapu"
    */
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.undefined
}
object ReportsConfiguration {
  
  inline def apply(): ReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportsConfiguration]
  }
  
  extension [Self <: ReportsConfiguration](x: Self) {
    
    inline def setExposureToConversionEnabled(value: Boolean): Self = StObject.set(x, "exposureToConversionEnabled", value.asInstanceOf[js.Any])
    
    inline def setExposureToConversionEnabledUndefined: Self = StObject.set(x, "exposureToConversionEnabled", js.undefined)
    
    inline def setLookbackConfiguration(value: LookbackConfiguration): Self = StObject.set(x, "lookbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLookbackConfigurationUndefined: Self = StObject.set(x, "lookbackConfiguration", js.undefined)
    
    inline def setReportGenerationTimeZoneId(value: String): Self = StObject.set(x, "reportGenerationTimeZoneId", value.asInstanceOf[js.Any])
    
    inline def setReportGenerationTimeZoneIdUndefined: Self = StObject.set(x, "reportGenerationTimeZoneId", js.undefined)
  }
}
