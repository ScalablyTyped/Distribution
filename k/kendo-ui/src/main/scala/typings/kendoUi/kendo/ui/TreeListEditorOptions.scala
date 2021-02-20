package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListEditorOptions extends StObject {
  
  var field: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var model: js.UndefOr[Model] = js.native
  
  var values: js.UndefOr[js.Array[_]] = js.native
}
object TreeListEditorOptions {
  
  @scala.inline
  def apply(): TreeListEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListEditorOptions]
  }
  
  @scala.inline
  implicit class TreeListEditorOptionsMutableBuilder[Self <: TreeListEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
