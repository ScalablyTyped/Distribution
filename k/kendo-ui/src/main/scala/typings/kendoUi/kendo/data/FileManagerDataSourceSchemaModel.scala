package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
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
  implicit class FileManagerDataSourceSchemaModelMutableBuilder[Self <: FileManagerDataSourceSchemaModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDirectory(value: js.Any): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
  }
}
