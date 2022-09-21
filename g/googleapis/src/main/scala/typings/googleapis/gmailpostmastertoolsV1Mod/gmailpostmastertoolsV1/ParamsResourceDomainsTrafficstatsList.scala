package typings.googleapis.gmailpostmastertoolsV1Mod.gmailpostmastertoolsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDomainsTrafficstatsList
  extends StObject
     with StandardParameters {
  
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
    * Requested page size. Server may return fewer TrafficStats than requested. If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous List request, if any. This is the value of ListTrafficStatsResponse.next_page_token returned from the previous call to `ListTrafficStats` method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the domain whose traffic statistics we'd like to list. It should have the form `domains/{domain_name\}`, where domain_name is the fully qualified domain name.
    */
  var parent: js.UndefOr[String] = js.undefined
  
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
object ParamsResourceDomainsTrafficstatsList {
  
  inline def apply(): ParamsResourceDomainsTrafficstatsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDomainsTrafficstatsList]
  }
  
  extension [Self <: ParamsResourceDomainsTrafficstatsList](x: Self) {
    
    inline def setEndDateDotday(value: Double): Self = StObject.set(x, "endDate.day", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotdayUndefined: Self = StObject.set(x, "endDate.day", js.undefined)
    
    inline def setEndDateDotmonth(value: Double): Self = StObject.set(x, "endDate.month", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotmonthUndefined: Self = StObject.set(x, "endDate.month", js.undefined)
    
    inline def setEndDateDotyear(value: Double): Self = StObject.set(x, "endDate.year", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotyearUndefined: Self = StObject.set(x, "endDate.year", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStartDateDotday(value: Double): Self = StObject.set(x, "startDate.day", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotdayUndefined: Self = StObject.set(x, "startDate.day", js.undefined)
    
    inline def setStartDateDotmonth(value: Double): Self = StObject.set(x, "startDate.month", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotmonthUndefined: Self = StObject.set(x, "startDate.month", js.undefined)
    
    inline def setStartDateDotyear(value: Double): Self = StObject.set(x, "startDate.year", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotyearUndefined: Self = StObject.set(x, "startDate.year", js.undefined)
  }
}
