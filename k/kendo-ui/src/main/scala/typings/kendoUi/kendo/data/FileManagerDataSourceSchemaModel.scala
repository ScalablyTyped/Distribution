package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerDataSourceSchemaModel
  extends StObject
     with HierarchicalDataSourceSchemaModel {
  
  var isDirectory: js.UndefOr[Any] = js.undefined
}
object FileManagerDataSourceSchemaModel {
  
  inline def apply(): FileManagerDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDataSourceSchemaModel]
  }
  
  extension [Self <: FileManagerDataSourceSchemaModel](x: Self) {
    
    inline def setIsDirectory(value: Any): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
  }
}
