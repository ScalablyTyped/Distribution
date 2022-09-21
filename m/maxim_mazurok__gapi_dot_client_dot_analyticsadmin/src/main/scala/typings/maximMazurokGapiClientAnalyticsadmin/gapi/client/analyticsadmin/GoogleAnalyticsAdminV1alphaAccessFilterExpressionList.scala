package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessFilterExpressionList extends StObject {
  
  /** A list of filter expressions. */
  var expressions: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccessFilterExpression]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessFilterExpressionList {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessFilterExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessFilterExpressionList]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessFilterExpressionList](x: Self) {
    
    inline def setExpressions(value: js.Array[GoogleAnalyticsAdminV1alphaAccessFilterExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: GoogleAnalyticsAdminV1alphaAccessFilterExpression*): Self = StObject.set(x, "expressions", js.Array(value*))
  }
}
