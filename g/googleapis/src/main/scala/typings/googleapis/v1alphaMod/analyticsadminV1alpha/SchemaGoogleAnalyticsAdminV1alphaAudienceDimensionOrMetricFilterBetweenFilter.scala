package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter extends StObject {
  
  /**
    * Required. Begins with this number, inclusive.
    */
  var fromValue: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue] = js.undefined
  
  /**
    * Required. Ends with this number, inclusive.
    */
  var toValue: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter](x: Self) {
    
    inline def setFromValue(value: SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
    
    inline def setFromValueUndefined: Self = StObject.set(x, "fromValue", js.undefined)
    
    inline def setToValue(value: SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
  }
}
