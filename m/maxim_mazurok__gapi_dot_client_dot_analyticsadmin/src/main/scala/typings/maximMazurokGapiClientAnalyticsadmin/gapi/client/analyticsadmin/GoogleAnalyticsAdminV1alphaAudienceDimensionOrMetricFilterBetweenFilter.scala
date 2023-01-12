package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter extends StObject {
  
  /** Required. Begins with this number, inclusive. */
  var fromValue: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue] = js.undefined
  
  /** Required. Ends with this number, inclusive. */
  var toValue: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter] (val x: Self) extends AnyVal {
    
    inline def setFromValue(value: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
    
    inline def setFromValueUndefined: Self = StObject.set(x, "fromValue", js.undefined)
    
    inline def setToValue(value: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
  }
}
