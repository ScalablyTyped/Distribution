package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterStringFilter extends StObject {
  
  /** Optional. If true, the match is case-sensitive. If false, the match is case-insensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The match type for the string filter. */
  var matchType: js.UndefOr[String] = js.undefined
  
  /** Required. The string value to be matched against. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterStringFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterStringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterStringFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterStringFilter] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
