package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerDataSourceSchema
  extends StObject
     with HierarchicalDataSourceSchema {
  
  @JSName("model")
  var model_FileManagerDataSourceSchema: js.UndefOr[FileManagerDataSourceSchemaModel] = js.undefined
}
object FileManagerDataSourceSchema {
  
  @scala.inline
  def apply(): FileManagerDataSourceSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDataSourceSchema]
  }
  
  @scala.inline
  implicit class FileManagerDataSourceSchemaMutableBuilder[Self <: FileManagerDataSourceSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: FileManagerDataSourceSchemaModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
