package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorExecParams extends StObject {
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object EditorExecParams {
  
  @scala.inline
  def apply(): EditorExecParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorExecParams]
  }
  
  @scala.inline
  implicit class EditorExecParamsMutableBuilder[Self <: EditorExecParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
