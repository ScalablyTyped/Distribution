package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorFileBrowserSchemaModelFields extends StObject {
  
  var name: js.UndefOr[String | EditorFileBrowserSchemaModelFieldsName] = js.undefined
  
  var size: js.UndefOr[String | EditorFileBrowserSchemaModelFieldsSize] = js.undefined
  
  var `type`: js.UndefOr[String | EditorFileBrowserSchemaModelFieldsType] = js.undefined
}
object EditorFileBrowserSchemaModelFields {
  
  @scala.inline
  def apply(): EditorFileBrowserSchemaModelFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserSchemaModelFields]
  }
  
  @scala.inline
  implicit class EditorFileBrowserSchemaModelFieldsMutableBuilder[Self <: EditorFileBrowserSchemaModelFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String | EditorFileBrowserSchemaModelFieldsName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: String | EditorFileBrowserSchemaModelFieldsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String | EditorFileBrowserSchemaModelFieldsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
