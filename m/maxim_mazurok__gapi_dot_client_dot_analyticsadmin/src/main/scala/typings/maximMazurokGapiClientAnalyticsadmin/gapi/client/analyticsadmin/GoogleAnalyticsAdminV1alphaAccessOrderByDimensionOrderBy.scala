package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy extends StObject {
  
  /** A dimension name in the request to order by. */
  var dimensionName: js.UndefOr[String] = js.undefined
  
  /** Controls the rule for dimension value ordering. */
  var orderType: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setOrderType(value: String): Self = StObject.set(x, "orderType", value.asInstanceOf[js.Any])
    
    inline def setOrderTypeUndefined: Self = StObject.set(x, "orderType", js.undefined)
  }
}
