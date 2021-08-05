package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorImageBrowserSchemaModelFields extends StObject {
  
  var name: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsName] = js.undefined
  
  var size: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsSize] = js.undefined
  
  var `type`: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsType] = js.undefined
}
object EditorImageBrowserSchemaModelFields {
  
  inline def apply(): EditorImageBrowserSchemaModelFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserSchemaModelFields]
  }
  
  extension [Self <: EditorImageBrowserSchemaModelFields](x: Self) {
    
    inline def setName(value: String | EditorImageBrowserSchemaModelFieldsName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: String | EditorImageBrowserSchemaModelFieldsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String | EditorImageBrowserSchemaModelFieldsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
