package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsReportsSavedGeneratecsv
  extends StObject
     with StandardParameters {
  
  /**
    * The [ISO-4217 currency code](https://en.wikipedia.org/wiki/ISO_4217) to use when reporting on monetary metrics. Defaults to the account's currency if not set.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Date range of the report, if unset the range will be considered CUSTOM.
    */
  var dateRange: js.UndefOr[String] = js.undefined
  
  /**
    * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    */
  @JSName("endDate.day")
  var endDateDotday: js.UndefOr[Double] = js.undefined
  
  /**
    * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    */
  @JSName("endDate.month")
  var endDateDotmonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    */
  @JSName("endDate.year")
  var endDateDotyear: js.UndefOr[Double] = js.undefined
  
  /**
    * The language to use for translating report output. If unspecified, this defaults to English ("en"). If the given language is not supported, report output will be returned in English. The language is specified as an [IETF BCP-47 language code](https://en.wikipedia.org/wiki/IETF_language_tag).
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the saved report. Format: accounts/{account\}/reports/{report\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Timezone in which to generate the report. If unspecified, this defaults to the account timezone. For more information, see [changing the time zone of your reports](https://support.google.com/adsense/answer/9830725).
    */
  var reportingTimeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    */
  @JSName("startDate.day")
  var startDateDotday: js.UndefOr[Double] = js.undefined
  
  /**
    * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    */
  @JSName("startDate.month")
  var startDateDotmonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    */
  @JSName("startDate.year")
  var startDateDotyear: js.UndefOr[Double] = js.undefined
}
object ParamsResourceAccountsReportsSavedGeneratecsv {
  
  inline def apply(): ParamsResourceAccountsReportsSavedGeneratecsv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsReportsSavedGeneratecsv]
  }
  
  extension [Self <: ParamsResourceAccountsReportsSavedGeneratecsv](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDateRange(value: String): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setEndDateDotday(value: Double): Self = StObject.set(x, "endDate.day", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotdayUndefined: Self = StObject.set(x, "endDate.day", js.undefined)
    
    inline def setEndDateDotmonth(value: Double): Self = StObject.set(x, "endDate.month", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotmonthUndefined: Self = StObject.set(x, "endDate.month", js.undefined)
    
    inline def setEndDateDotyear(value: Double): Self = StObject.set(x, "endDate.year", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotyearUndefined: Self = StObject.set(x, "endDate.year", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingTimeZone(value: String): Self = StObject.set(x, "reportingTimeZone", value.asInstanceOf[js.Any])
    
    inline def setReportingTimeZoneUndefined: Self = StObject.set(x, "reportingTimeZone", js.undefined)
    
    inline def setStartDateDotday(value: Double): Self = StObject.set(x, "startDate.day", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotdayUndefined: Self = StObject.set(x, "startDate.day", js.undefined)
    
    inline def setStartDateDotmonth(value: Double): Self = StObject.set(x, "startDate.month", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotmonthUndefined: Self = StObject.set(x, "startDate.month", js.undefined)
    
    inline def setStartDateDotyear(value: Double): Self = StObject.set(x, "startDate.year", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotyearUndefined: Self = StObject.set(x, "startDate.year", js.undefined)
  }
}
