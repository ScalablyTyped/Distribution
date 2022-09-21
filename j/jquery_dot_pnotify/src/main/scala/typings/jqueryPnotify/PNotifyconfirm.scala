package typings.jqueryPnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PNotifyconfirm extends StObject {
  
  /**
    * Where to align the buttons. (right, center, left, justify)
    */
  var align: js.UndefOr[String] = js.undefined
  
  /**
    * The buttons to display, and their callbacks.
    */
  var buttons: js.UndefOr[js.Array[PNotifyconfirmButton]] = js.undefined
  
  /**
    * Make a confirmation box.
    */
  var confirm: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Make a prompt.
    */
  var prompt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Classes to add to the input element of the prompt.
    */
  var prompt_class: js.UndefOr[String] = js.undefined
  
  /**
    * The default value of the prompt.
    */
  var prompt_default: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the prompt should accept multiple lines of text.
    */
  var prompt_multi_line: js.UndefOr[Boolean] = js.undefined
}
object PNotifyconfirm {
  
  inline def apply(): PNotifyconfirm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyconfirm]
  }
  
  extension [Self <: PNotifyconfirm](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setButtons(value: js.Array[PNotifyconfirmButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: PNotifyconfirmButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    inline def setPrompt(value: Boolean): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setPrompt_class(value: String): Self = StObject.set(x, "prompt_class", value.asInstanceOf[js.Any])
    
    inline def setPrompt_classUndefined: Self = StObject.set(x, "prompt_class", js.undefined)
    
    inline def setPrompt_default(value: String): Self = StObject.set(x, "prompt_default", value.asInstanceOf[js.Any])
    
    inline def setPrompt_defaultUndefined: Self = StObject.set(x, "prompt_default", js.undefined)
    
    inline def setPrompt_multi_line(value: Boolean): Self = StObject.set(x, "prompt_multi_line", value.asInstanceOf[js.Any])
    
    inline def setPrompt_multi_lineUndefined: Self = StObject.set(x, "prompt_multi_line", js.undefined)
  }
}
