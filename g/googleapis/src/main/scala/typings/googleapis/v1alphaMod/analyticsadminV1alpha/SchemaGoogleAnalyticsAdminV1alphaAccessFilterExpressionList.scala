package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList extends StObject {
  
  /**
    * A list of filter expressions.
    */
  var expressions: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpressionList](x: Self) {
    
    inline def setExpressions(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression*): Self = StObject.set(x, "expressions", js.Array(value*))
  }
}
