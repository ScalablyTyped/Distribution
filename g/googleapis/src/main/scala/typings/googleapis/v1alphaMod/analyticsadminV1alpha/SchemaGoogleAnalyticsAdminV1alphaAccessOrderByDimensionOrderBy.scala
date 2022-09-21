package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy extends StObject {
  
  /**
    * A dimension name in the request to order by.
    */
  var dimensionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls the rule for dimension value ordering.
    */
  var orderType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameNull: Self = StObject.set(x, "dimensionName", null)
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setOrderType(value: String): Self = StObject.set(x, "orderType", value.asInstanceOf[js.Any])
    
    inline def setOrderTypeNull: Self = StObject.set(x, "orderType", null)
    
    inline def setOrderTypeUndefined: Self = StObject.set(x, "orderType", js.undefined)
  }
}
