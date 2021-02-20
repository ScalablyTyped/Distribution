package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterExpression extends StObject {
  
  /** The FilterExpressions in and_group have an AND relationship. */
  var andGroup: js.UndefOr[FilterExpressionList] = js.native
  
  /** A primitive filter. All fields in filter in same FilterExpression needs to be either all dimensions or metrics. */
  var filter: js.UndefOr[Filter] = js.native
  
  /** The FilterExpression is NOT of not_expression. */
  var notExpression: js.UndefOr[FilterExpression] = js.native
  
  /** The FilterExpressions in or_group have an OR relationship. */
  var orGroup: js.UndefOr[FilterExpressionList] = js.native
}
object FilterExpression {
  
  @scala.inline
  def apply(): FilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExpression]
  }
  
  @scala.inline
  implicit class FilterExpressionMutableBuilder[Self <: FilterExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndGroup(value: FilterExpressionList): Self = StObject.set(x, "andGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndGroupUndefined: Self = StObject.set(x, "andGroup", js.undefined)
    
    @scala.inline
    def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setNotExpression(value: FilterExpression): Self = StObject.set(x, "notExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotExpressionUndefined: Self = StObject.set(x, "notExpression", js.undefined)
    
    @scala.inline
    def setOrGroup(value: FilterExpressionList): Self = StObject.set(x, "orGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrGroupUndefined: Self = StObject.set(x, "orGroup", js.undefined)
  }
}
