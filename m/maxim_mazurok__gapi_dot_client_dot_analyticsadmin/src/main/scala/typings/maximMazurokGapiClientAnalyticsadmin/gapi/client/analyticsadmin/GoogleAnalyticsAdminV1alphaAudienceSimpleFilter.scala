package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceSimpleFilter extends StObject {
  
  /** Required. Immutable. A logical expression of Audience dimension, metric, or event filters. */
  var filterExpression: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceFilterExpression] = js.undefined
  
  /** Required. Immutable. Specifies the scope for this filter. */
  var scope: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceSimpleFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceSimpleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceSimpleFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAudienceSimpleFilter] (val x: Self) extends AnyVal {
    
    inline def setFilterExpression(value: GoogleAnalyticsAdminV1alphaAudienceFilterExpression): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "filterExpression", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
