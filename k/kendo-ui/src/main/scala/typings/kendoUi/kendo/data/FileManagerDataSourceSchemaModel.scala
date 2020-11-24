package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerDataSourceSchemaModel extends HierarchicalDataSourceSchemaModel {
  
  var isDirectory: js.UndefOr[js.Any] = js.native
}
object FileManagerDataSourceSchemaModel {
  
  @scala.inline
  def apply(): FileManagerDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDataSourceSchemaModel]
  }
  
  @scala.inline
  implicit class FileManagerDataSourceSchemaModelOps[Self <: FileManagerDataSourceSchemaModel] (val x: Self) extends AnyVal {
    
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
    def setIsDirectory(value: js.Any): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDirectory: Self = this.set("isDirectory", js.undefined)
  }
}
