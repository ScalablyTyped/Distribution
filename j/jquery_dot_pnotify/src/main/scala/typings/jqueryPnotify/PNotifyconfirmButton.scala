package typings.jqueryPnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PNotifyconfirmButton extends StObject {
  
  var addClass: js.UndefOr[String] = js.undefined
  
  def click(notice: PNotify, value: js.Any): Unit
  
  /**
    *  Whether to trigger this button when the user hits enter in a single line prompt.
    */
  var promptTrigger: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PNotifyconfirmButton {
  
  @scala.inline
  def apply(click: (PNotify, js.Any) => Unit): PNotifyconfirmButton = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction2(click))
    __obj.asInstanceOf[PNotifyconfirmButton]
  }
  
  @scala.inline
  implicit class PNotifyconfirmButtonMutableBuilder[Self <: PNotifyconfirmButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddClass(value: String): Self = StObject.set(x, "addClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
    
    @scala.inline
    def setClick(value: (PNotify, js.Any) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPromptTrigger(value: Boolean): Self = StObject.set(x, "promptTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptTriggerUndefined: Self = StObject.set(x, "promptTrigger", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
