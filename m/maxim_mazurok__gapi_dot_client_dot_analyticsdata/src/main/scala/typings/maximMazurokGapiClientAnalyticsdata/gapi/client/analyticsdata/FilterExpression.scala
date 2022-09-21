package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterExpression extends StObject {
  
  /** The FilterExpressions in and_group have an AND relationship. */
  var andGroup: js.UndefOr[FilterExpressionList] = js.undefined
  
  /** A primitive filter. In the same FilterExpression, all of the filter's field names need to be either all dimensions or all metrics. */
  var filter: js.UndefOr[Filter] = js.undefined
  
  /** The FilterExpression is NOT of not_expression. */
  var notExpression: js.UndefOr[FilterExpression] = js.undefined
  
  /** The FilterExpressions in or_group have an OR relationship. */
  var orGroup: js.UndefOr[FilterExpressionList] = js.undefined
}
object FilterExpression {
  
  inline def apply(): FilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExpression]
  }
  
  extension [Self <: FilterExpression](x: Self) {
    
    inline def setAndGroup(value: FilterExpressionList): Self = StObject.set(x, "andGroup", value.asInstanceOf[js.Any])
    
    inline def setAndGroupUndefined: Self = StObject.set(x, "andGroup", js.undefined)
    
    inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setNotExpression(value: FilterExpression): Self = StObject.set(x, "notExpression", value.asInstanceOf[js.Any])
    
    inline def setNotExpressionUndefined: Self = StObject.set(x, "notExpression", js.undefined)
    
    inline def setOrGroup(value: FilterExpressionList): Self = StObject.set(x, "orGroup", value.asInstanceOf[js.Any])
    
    inline def setOrGroupUndefined: Self = StObject.set(x, "orGroup", js.undefined)
  }
}
