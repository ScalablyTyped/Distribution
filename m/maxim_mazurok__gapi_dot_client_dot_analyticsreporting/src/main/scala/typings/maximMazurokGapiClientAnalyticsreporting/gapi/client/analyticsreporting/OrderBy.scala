package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderBy extends StObject {
  
  /**
    * The field which to sort by. The default sort order is ascending. Example: `ga:browser`. Note, that you can only specify one field for sort here. For example, `ga:browser, ga:city`
    * is not valid.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /** The order type. The default orderType is `VALUE`. */
  var orderType: js.UndefOr[String] = js.undefined
  
  /** The sorting order for the field. */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object OrderBy {
  
  inline def apply(): OrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderBy]
  }
  
  extension [Self <: OrderBy](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setOrderType(value: String): Self = StObject.set(x, "orderType", value.asInstanceOf[js.Any])
    
    inline def setOrderTypeUndefined: Self = StObject.set(x, "orderType", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
