package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDetailedleadreportsSearch
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
    * The maximum number of accounts to return. If the page size is unset, page size will default to 1000. Maximum page_size is 10000. Optional.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The `next_page_token` value returned from a previous request to SearchDetailedLeadReports that indicates where listing should continue. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A query string for searching for account reports. Caller must provide a customer id of their MCC account with an associated Gaia Mint that allows read permission on their linked accounts. Search expressions are case insensitive. Example query: | Query | Description | |-------------------------|-----------------------------------------------| | manager_customer_id:123 | Get Detailed Lead Report for Manager with id | | | 123. | Required.
    */
  var query: js.UndefOr[String] = js.undefined
  
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
object ParamsResourceDetailedleadreportsSearch {
  
  inline def apply(): ParamsResourceDetailedleadreportsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDetailedleadreportsSearch]
  }
  
  extension [Self <: ParamsResourceDetailedleadreportsSearch](x: Self) {
    
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
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setStartDateDotday(value: Double): Self = StObject.set(x, "startDate.day", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotdayUndefined: Self = StObject.set(x, "startDate.day", js.undefined)
    
    inline def setStartDateDotmonth(value: Double): Self = StObject.set(x, "startDate.month", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotmonthUndefined: Self = StObject.set(x, "startDate.month", js.undefined)
    
    inline def setStartDateDotyear(value: Double): Self = StObject.set(x, "startDate.year", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotyearUndefined: Self = StObject.set(x, "startDate.year", js.undefined)
  }
}
