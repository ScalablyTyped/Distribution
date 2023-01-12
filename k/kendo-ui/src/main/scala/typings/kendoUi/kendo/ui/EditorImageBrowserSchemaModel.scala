package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorImageBrowserSchemaModel extends StObject {
  
  var fields: js.UndefOr[EditorImageBrowserSchemaModelFields] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object EditorImageBrowserSchemaModel {
  
  inline def apply(): EditorImageBrowserSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserSchemaModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorImageBrowserSchemaModel] (val x: Self) extends AnyVal {
    
    inline def setFields(value: EditorImageBrowserSchemaModelFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
