package typings.jqueryPnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PNotifyconfirmButton extends StObject {
  
  var addClass: js.UndefOr[String] = js.undefined
  
  def click(notice: PNotify, value: Any): Unit
  
  /**
    *  Whether to trigger this button when the user hits enter in a single line prompt.
    */
  var promptTrigger: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PNotifyconfirmButton {
  
  inline def apply(click: (PNotify, Any) => Unit): PNotifyconfirmButton = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction2(click))
    __obj.asInstanceOf[PNotifyconfirmButton]
  }
  
  extension [Self <: PNotifyconfirmButton](x: Self) {
    
    inline def setAddClass(value: String): Self = StObject.set(x, "addClass", value.asInstanceOf[js.Any])
    
    inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
    
    inline def setClick(value: (PNotify, Any) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
    
    inline def setPromptTrigger(value: Boolean): Self = StObject.set(x, "promptTrigger", value.asInstanceOf[js.Any])
    
    inline def setPromptTriggerUndefined: Self = StObject.set(x, "promptTrigger", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
