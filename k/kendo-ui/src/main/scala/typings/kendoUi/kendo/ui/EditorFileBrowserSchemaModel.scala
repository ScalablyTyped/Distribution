package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorFileBrowserSchemaModel extends StObject {
  
  var fields: js.UndefOr[EditorFileBrowserSchemaModelFields] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object EditorFileBrowserSchemaModel {
  
  inline def apply(): EditorFileBrowserSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserSchemaModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorFileBrowserSchemaModel] (val x: Self) extends AnyVal {
    
    inline def setFields(value: EditorFileBrowserSchemaModelFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
