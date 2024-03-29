package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetReportsResponse extends StObject {
  
  /**
    * The amount of resource quota tokens deducted to execute the query. Includes all responses.
    */
  var queryCost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Responses corresponding to each of the request.
    */
  var reports: js.UndefOr[js.Array[SchemaReport]] = js.undefined
  
  /**
    * The amount of resource quota remaining for the property.
    */
  var resourceQuotasRemaining: js.UndefOr[SchemaResourceQuotasRemaining] = js.undefined
}
object SchemaGetReportsResponse {
  
  inline def apply(): SchemaGetReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetReportsResponse]
  }
  
  extension [Self <: SchemaGetReportsResponse](x: Self) {
    
    inline def setQueryCost(value: Double): Self = StObject.set(x, "queryCost", value.asInstanceOf[js.Any])
    
    inline def setQueryCostNull: Self = StObject.set(x, "queryCost", null)
    
    inline def setQueryCostUndefined: Self = StObject.set(x, "queryCost", js.undefined)
    
    inline def setReports(value: js.Array[SchemaReport]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: SchemaReport*): Self = StObject.set(x, "reports", js.Array(value*))
    
    inline def setResourceQuotasRemaining(value: SchemaResourceQuotasRemaining): Self = StObject.set(x, "resourceQuotasRemaining", value.asInstanceOf[js.Any])
    
    inline def setResourceQuotasRemainingUndefined: Self = StObject.set(x, "resourceQuotasRemaining", js.undefined)
  }
}
