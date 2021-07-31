package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerDataSourceOptions
  extends StObject
     with HierarchicalDataSourceOptions {
  
  @JSName("schema")
  var schema_FileManagerDataSourceOptions: js.UndefOr[FileManagerDataSourceSchema] = js.undefined
}
object FileManagerDataSourceOptions {
  
  @scala.inline
  def apply(): FileManagerDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDataSourceOptions]
  }
  
  @scala.inline
  implicit class FileManagerDataSourceOptionsMutableBuilder[Self <: FileManagerDataSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: FileManagerDataSourceSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
