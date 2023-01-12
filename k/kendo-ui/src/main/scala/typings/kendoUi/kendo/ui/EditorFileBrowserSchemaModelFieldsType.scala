package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorFileBrowserSchemaModelFieldsType extends StObject {
  
  var field: js.UndefOr[String] = js.undefined
  
  var parse: js.UndefOr[js.Function] = js.undefined
}
object EditorFileBrowserSchemaModelFieldsType {
  
  inline def apply(): EditorFileBrowserSchemaModelFieldsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserSchemaModelFieldsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorFileBrowserSchemaModelFieldsType] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
