package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorFileBrowserSchemaModelFieldsName extends StObject {
  
  var field: js.UndefOr[String] = js.native
  
  var parse: js.UndefOr[js.Function] = js.native
}
object EditorFileBrowserSchemaModelFieldsName {
  
  @scala.inline
  def apply(): EditorFileBrowserSchemaModelFieldsName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserSchemaModelFieldsName]
  }
  
  @scala.inline
  implicit class EditorFileBrowserSchemaModelFieldsNameMutableBuilder[Self <: EditorFileBrowserSchemaModelFieldsName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
