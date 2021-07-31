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
  
  @scala.inline
  def apply(): HierarchicalDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSchemaModel]
  }
  
  @scala.inline
  implicit class HierarchicalDataSourceSchemaModelMutableBuilder[Self <: HierarchicalDataSourceSchemaModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHasChildren(value: js.Any): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
  }
}
