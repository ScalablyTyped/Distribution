package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchUserActivityRequest extends StObject {
  
  /**
    * Set of all activity types being requested. Only acvities matching these types will be returned in the response. If empty, all activies will be returned.
    */
  var activityTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Date range for which to retrieve the user activity. If a date range is not provided, the default date range is (startDate: current date - 7 days, endDate: current date - 1 day).
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  /**
    * Page size is for paging and specifies the maximum number of returned rows. Page size should be \> 0. If the value is 0 or if the field isn't specified, the request returns the default of 1000 rows per page.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A continuation token to get the next page of the results. Adding this to the request will return the rows after the pageToken. The pageToken should be the value returned in the nextPageToken parameter in the response to the [SearchUserActivityRequest](#SearchUserActivityRequest) request.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Unique user Id to query for. Every [SearchUserActivityRequest](#SearchUserActivityRequest) must contain this field.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Required. The Analytics [view ID](https://support.google.com/analytics/answer/1009618) from which to retrieve data. Every [SearchUserActivityRequest](#SearchUserActivityRequest) must contain the `viewId`.
    */
  var viewId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchUserActivityRequest {
  
  inline def apply(): SchemaSearchUserActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchUserActivityRequest]
  }
  
  extension [Self <: SchemaSearchUserActivityRequest](x: Self) {
    
    inline def setActivityTypes(value: js.Array[String]): Self = StObject.set(x, "activityTypes", value.asInstanceOf[js.Any])
    
    inline def setActivityTypesNull: Self = StObject.set(x, "activityTypes", null)
    
    inline def setActivityTypesUndefined: Self = StObject.set(x, "activityTypes", js.undefined)
    
    inline def setActivityTypesVarargs(value: String*): Self = StObject.set(x, "activityTypes", js.Array(value*))
    
    inline def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
    
    inline def setViewIdNull: Self = StObject.set(x, "viewId", null)
    
    inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
  }
}
