package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestrictionResponse extends StObject {
  
  /**
    * All restrictions actively enforced in creating the report. For example, `purchaseRevenue` always has the restriction type `REVENUE_DATA`. However, this active response restriction
    * is only populated if the user's custom role disallows access to `REVENUE_DATA`.
    */
  var activeMetricRestrictions: js.UndefOr[js.Array[ActiveMetricRestriction]] = js.undefined
}
object SchemaRestrictionResponse {
  
  inline def apply(): SchemaRestrictionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictionResponse]
  }
  
  extension [Self <: SchemaRestrictionResponse](x: Self) {
    
    inline def setActiveMetricRestrictions(value: js.Array[ActiveMetricRestriction]): Self = StObject.set(x, "activeMetricRestrictions", value.asInstanceOf[js.Any])
    
    inline def setActiveMetricRestrictionsUndefined: Self = StObject.set(x, "activeMetricRestrictions", js.undefined)
    
    inline def setActiveMetricRestrictionsVarargs(value: ActiveMetricRestriction*): Self = StObject.set(x, "activeMetricRestrictions", js.Array(value*))
  }
}
