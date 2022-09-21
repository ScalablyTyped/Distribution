package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter extends StObject {
  
  /**
    * Required. The operation applied to a numeric filter.
    */
  var operation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The numeric or date value to match against.
    */
  var value: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setValue(value: SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
