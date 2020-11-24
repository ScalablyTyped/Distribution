package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerDataSourceOptions extends HierarchicalDataSourceOptions {
  
  @JSName("schema")
  var schema_FileManagerDataSourceOptions: js.UndefOr[FileManagerDataSourceSchema] = js.native
}
object FileManagerDataSourceOptions {
  
  @scala.inline
  def apply(): FileManagerDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDataSourceOptions]
  }
  
  @scala.inline
  implicit class FileManagerDataSourceOptionsOps[Self <: FileManagerDataSourceOptions] (val x: Self) extends AnyVal {
    
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
    def setSchema(value: FileManagerDataSourceSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
