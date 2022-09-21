package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter extends StObject {
  
  /** Optional. If true, the match is case-sensitive. If false, the match is case-insensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The list of possible string values to match against. Must be non-empty. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
