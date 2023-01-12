package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList extends StObject {
  
  /** A list of Audience filter expressions. */
  var filterExpressions: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAudienceFilterExpression]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList] (val x: Self) extends AnyVal {
    
    inline def setFilterExpressions(value: js.Array[GoogleAnalyticsAdminV1alphaAudienceFilterExpression]): Self = StObject.set(x, "filterExpressions", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionsUndefined: Self = StObject.set(x, "filterExpressions", js.undefined)
    
    inline def setFilterExpressionsVarargs(value: GoogleAnalyticsAdminV1alphaAudienceFilterExpression*): Self = StObject.set(x, "filterExpressions", js.Array(value*))
  }
}
