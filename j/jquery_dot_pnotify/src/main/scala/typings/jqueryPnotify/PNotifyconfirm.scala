package typings.jqueryPnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNotifyconfirm extends StObject {
  
  /**
    * Where to align the buttons. (right, center, left, justify)
    */
  var align: js.UndefOr[String] = js.native
  
  /**
    * The buttons to display, and their callbacks.
    */
  var buttons: js.UndefOr[js.Array[PNotifyconfirmButton]] = js.native
  
  /**
    * Make a confirmation box.
    */
  var confirm: js.UndefOr[Boolean] = js.native
  
  /**
    * Make a prompt.
    */
  var prompt: js.UndefOr[Boolean] = js.native
  
  /**
    * Classes to add to the input element of the prompt.
    */
  var prompt_class: js.UndefOr[String] = js.native
  
  /**
    * The default value of the prompt.
    */
  var prompt_default: js.UndefOr[String] = js.native
  
  /**
    * Whether the prompt should accept multiple lines of text.
    */
  var prompt_multi_line: js.UndefOr[Boolean] = js.native
}
object PNotifyconfirm {
  
  @scala.inline
  def apply(): PNotifyconfirm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyconfirm]
  }
  
  @scala.inline
  implicit class PNotifyconfirmMutableBuilder[Self <: PNotifyconfirm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[PNotifyconfirmButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: PNotifyconfirmButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    @scala.inline
    def setPrompt(value: Boolean): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setPrompt_class(value: String): Self = StObject.set(x, "prompt_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt_classUndefined: Self = StObject.set(x, "prompt_class", js.undefined)
    
    @scala.inline
    def setPrompt_default(value: String): Self = StObject.set(x, "prompt_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt_defaultUndefined: Self = StObject.set(x, "prompt_default", js.undefined)
    
    @scala.inline
    def setPrompt_multi_line(value: Boolean): Self = StObject.set(x, "prompt_multi_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt_multi_lineUndefined: Self = StObject.set(x, "prompt_multi_line", js.undefined)
  }
}
