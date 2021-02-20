package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorImageBrowserSchemaModel extends StObject {
  
  var fields: js.UndefOr[EditorImageBrowserSchemaModelFields] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object EditorImageBrowserSchemaModel {
  
  @scala.inline
  def apply(): EditorImageBrowserSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserSchemaModel]
  }
  
  @scala.inline
  implicit class EditorImageBrowserSchemaModelMutableBuilder[Self <: EditorImageBrowserSchemaModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: EditorImageBrowserSchemaModelFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
