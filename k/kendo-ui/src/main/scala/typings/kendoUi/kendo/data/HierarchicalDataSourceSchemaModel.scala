package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchicalDataSourceSchemaModel
  extends StObject
     with DataSourceSchemaModel {
  
  var children: js.UndefOr[Any] = js.undefined
  
  var hasChildren: js.UndefOr[Any] = js.undefined
}
object HierarchicalDataSourceSchemaModel {
  
  inline def apply(): HierarchicalDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSchemaModel]
  }
  
  extension [Self <: HierarchicalDataSourceSchemaModel](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHasChildren(value: Any): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
  }
}
