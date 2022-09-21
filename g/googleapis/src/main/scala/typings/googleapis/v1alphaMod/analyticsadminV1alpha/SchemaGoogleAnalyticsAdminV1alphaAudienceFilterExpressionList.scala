package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList extends StObject {
  
  /**
    * A list of Audience filter expressions.
    */
  var filterExpressions: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList](x: Self) {
    
    inline def setFilterExpressions(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression]): Self = StObject.set(x, "filterExpressions", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionsUndefined: Self = StObject.set(x, "filterExpressions", js.undefined)
    
    inline def setFilterExpressionsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression*): Self = StObject.set(x, "filterExpressions", js.Array(value*))
  }
}
