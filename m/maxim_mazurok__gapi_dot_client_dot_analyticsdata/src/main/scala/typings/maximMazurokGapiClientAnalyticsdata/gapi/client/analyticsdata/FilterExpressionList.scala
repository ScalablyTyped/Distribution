package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterExpressionList extends StObject {
  
  /** A list of filter expressions. */
  var expressions: js.UndefOr[js.Array[FilterExpression]] = js.undefined
}
object FilterExpressionList {
  
  inline def apply(): FilterExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExpressionList]
  }
  
  extension [Self <: FilterExpressionList](x: Self) {
    
    inline def setExpressions(value: js.Array[FilterExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: FilterExpression*): Self = StObject.set(x, "expressions", js.Array(value*))
  }
}
