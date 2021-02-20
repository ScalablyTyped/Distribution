package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterExpressionList extends StObject {
  
  /** A list of filter expressions. */
  var expressions: js.UndefOr[js.Array[FilterExpression]] = js.native
}
object FilterExpressionList {
  
  @scala.inline
  def apply(): FilterExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExpressionList]
  }
  
  @scala.inline
  implicit class FilterExpressionListMutableBuilder[Self <: FilterExpressionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: js.Array[FilterExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    @scala.inline
    def setExpressionsVarargs(value: FilterExpression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
  }
}
