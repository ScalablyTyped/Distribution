package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptMessages extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var okText: js.UndefOr[String] = js.undefined
}
object PromptMessages {
  
  @scala.inline
  def apply(): PromptMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptMessages]
  }
  
  @scala.inline
  implicit class PromptMessagesMutableBuilder[Self <: PromptMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
  }
}
