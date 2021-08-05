package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchicalDataSourceSchemaModel
  extends StObject
     with DataSourceSchemaModel {
  
  var children: js.UndefOr[js.Any] = js.undefined
  
  var hasChildren: js.UndefOr[js.Any] = js.undefined
}
object HierarchicalDataSourceSchemaModel {
  
  inline def apply(): HierarchicalDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSchemaModel]
  }
  
  extension [Self <: HierarchicalDataSourceSchemaModel](x: Self) {
    
    inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHasChildren(value: js.Any): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
  }
}
