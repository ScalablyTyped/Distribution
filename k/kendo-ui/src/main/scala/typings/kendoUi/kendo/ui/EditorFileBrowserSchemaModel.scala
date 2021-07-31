package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorFileBrowserSchemaModel extends StObject {
  
  var fields: js.UndefOr[EditorFileBrowserSchemaModelFields] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object EditorFileBrowserSchemaModel {
  
  @scala.inline
  def apply(): EditorFileBrowserSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserSchemaModel]
  }
  
  @scala.inline
  implicit class EditorFileBrowserSchemaModelMutableBuilder[Self <: EditorFileBrowserSchemaModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: EditorFileBrowserSchemaModelFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
