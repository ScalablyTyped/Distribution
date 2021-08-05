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
  
  inline def apply(): FileManagerDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDataSourceOptions]
  }
  
  extension [Self <: FileManagerDataSourceOptions](x: Self) {
    
    inline def setSchema(value: FileManagerDataSourceSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
