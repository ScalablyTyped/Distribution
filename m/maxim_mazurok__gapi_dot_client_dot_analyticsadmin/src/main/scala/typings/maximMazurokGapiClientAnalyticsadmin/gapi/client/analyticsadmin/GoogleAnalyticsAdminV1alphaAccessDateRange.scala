package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessDateRange extends StObject {
  
  /**
    * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot be before `startDate`. The format `NdaysAgo`, `yesterday`, or `today` is also accepted, and in that case, the
    * date is inferred based on the current time in the request's time zone.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot be after `endDate`. The format `NdaysAgo`, `yesterday`, or `today` is also accepted, and in that case, the
    * date is inferred based on the current time in the request's time zone.
    */
  var startDate: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessDateRange {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessDateRange]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessDateRange](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
