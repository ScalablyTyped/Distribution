package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogMessages extends StObject {
  
  var close: js.UndefOr[String] = js.undefined
  
  var promptInput: js.UndefOr[String] = js.undefined
}
object DialogMessages {
  
  @scala.inline
  def apply(): DialogMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogMessages]
  }
  
  @scala.inline
  implicit class DialogMessagesMutableBuilder[Self <: DialogMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setPromptInput(value: String): Self = StObject.set(x, "promptInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptInputUndefined: Self = StObject.set(x, "promptInput", js.undefined)
  }
}
