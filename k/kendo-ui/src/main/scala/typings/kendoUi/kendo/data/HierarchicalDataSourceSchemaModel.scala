package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchicalDataSourceSchemaModel extends DataSourceSchemaModel {
  
  var children: js.UndefOr[js.Any] = js.native
  
  var hasChildren: js.UndefOr[js.Any] = js.native
}
object HierarchicalDataSourceSchemaModel {
  
  @scala.inline
  def apply(): HierarchicalDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSchemaModel]
  }
  
  @scala.inline
  implicit class HierarchicalDataSourceSchemaModelOps[Self <: HierarchicalDataSourceSchemaModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHasChildren(value: js.Any): Self = this.set("hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasChildren: Self = this.set("hasChildren", js.undefined)
  }
}
