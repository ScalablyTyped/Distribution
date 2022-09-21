package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter extends StObject {
  
  /** Required. The operation applied to a numeric filter. */
  var operation: js.UndefOr[String] = js.undefined
  
  /** Required. The numeric or date value to match against. */
  var value: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setValue(value: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
