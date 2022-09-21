package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderBy extends StObject {
  
  /**
    * The field which to sort by. The default sort order is ascending. Example: `ga:browser`. Note, that you can only specify one field for sort here. For example, `ga:browser, ga:city` is not valid.
    */
  var fieldName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order type. The default orderType is `VALUE`.
    */
  var orderType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sorting order for the field.
    */
  var sortOrder: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderBy {
  
  inline def apply(): SchemaOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderBy]
  }
  
  extension [Self <: SchemaOrderBy](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setOrderType(value: String): Self = StObject.set(x, "orderType", value.asInstanceOf[js.Any])
    
    inline def setOrderTypeNull: Self = StObject.set(x, "orderType", null)
    
    inline def setOrderTypeUndefined: Self = StObject.set(x, "orderType", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
