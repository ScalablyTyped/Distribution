package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceSimpleFilter extends StObject {
  
  /**
    * Required. Immutable. A logical expression of Audience dimension, metric, or event filters.
    */
  var filterExpression: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression] = js.undefined
  
  /**
    * Required. Immutable. Specifies the scope for this filter.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceSimpleFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceSimpleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceSimpleFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceSimpleFilter](x: Self) {
    
    inline def setFilterExpression(value: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "filterExpression", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
