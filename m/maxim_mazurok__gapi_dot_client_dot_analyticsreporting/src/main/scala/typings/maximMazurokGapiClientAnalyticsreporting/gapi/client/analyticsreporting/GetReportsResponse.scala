package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReportsResponse extends StObject {
  
  /** The amount of resource quota tokens deducted to execute the query. Includes all responses. */
  var queryCost: js.UndefOr[Double] = js.undefined
  
  /** Responses corresponding to each of the request. */
  var reports: js.UndefOr[js.Array[Report]] = js.undefined
  
  /** The amount of resource quota remaining for the property. */
  var resourceQuotasRemaining: js.UndefOr[ResourceQuotasRemaining] = js.undefined
}
object GetReportsResponse {
  
  inline def apply(): GetReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportsResponse]
  }
  
  extension [Self <: GetReportsResponse](x: Self) {
    
    inline def setQueryCost(value: Double): Self = StObject.set(x, "queryCost", value.asInstanceOf[js.Any])
    
    inline def setQueryCostUndefined: Self = StObject.set(x, "queryCost", js.undefined)
    
    inline def setReports(value: js.Array[Report]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: Report*): Self = StObject.set(x, "reports", js.Array(value :_*))
    
    inline def setResourceQuotasRemaining(value: ResourceQuotasRemaining): Self = StObject.set(x, "resourceQuotasRemaining", value.asInstanceOf[js.Any])
    
    inline def setResourceQuotasRemainingUndefined: Self = StObject.set(x, "resourceQuotasRemaining", js.undefined)
  }
}
