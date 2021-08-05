package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptMessages extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var okText: js.UndefOr[String] = js.undefined
}
object PromptMessages {
  
  inline def apply(): PromptMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptMessages]
  }
  
  extension [Self <: PromptMessages](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
  }
}
