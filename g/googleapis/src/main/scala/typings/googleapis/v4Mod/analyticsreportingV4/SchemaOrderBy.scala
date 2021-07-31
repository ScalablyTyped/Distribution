package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the sorting options.
  */
trait SchemaOrderBy extends StObject {
  
  /**
    * The field which to sort by. The default sort order is ascending. Example:
    * `ga:browser`. Note, that you can only specify one field for sort here.
    * For example, `ga:browser, ga:city` is not valid.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The order type. The default orderType is `VALUE`.
    */
  var orderType: js.UndefOr[String] = js.undefined
  
  /**
    * The sorting order for the field.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object SchemaOrderBy {
  
  @scala.inline
  def apply(): SchemaOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderBy]
  }
  
  @scala.inline
  implicit class SchemaOrderByMutableBuilder[Self <: SchemaOrderBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setOrderType(value: String): Self = StObject.set(x, "orderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderTypeUndefined: Self = StObject.set(x, "orderType", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
