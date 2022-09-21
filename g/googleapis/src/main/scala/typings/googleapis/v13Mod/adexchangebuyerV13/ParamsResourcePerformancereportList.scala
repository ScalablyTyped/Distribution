package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePerformancereportList
  extends StObject
     with StandardParameters {
  
  /**
    * The account id to get the reports.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The end time of the report in ISO 8601 timestamp format using UTC.
    */
  var endDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token, used to page through performance reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The start time of the report in ISO 8601 timestamp format using UTC.
    */
  var startDateTime: js.UndefOr[String] = js.undefined
}
object ParamsResourcePerformancereportList {
  
  inline def apply(): ParamsResourcePerformancereportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePerformancereportList]
  }
  
  extension [Self <: ParamsResourcePerformancereportList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
