package typings.jqueryNoty

import typings.jqueryNoty.jqueryNotyStrings.backdrop
import typings.jqueryNoty.jqueryNotyStrings.button
import typings.jqueryNoty.jqueryNotyStrings.click
import typings.jqueryNoty.jqueryNotyStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotyOptions extends StObject {
  
  var animation: js.UndefOr[NotyAnimationOptions] = js.native
  
  /** an array of buttons, for creating confirmation dialogs. */
  var buttons: js.UndefOr[js.Any] = js.native
  
  var callback: js.UndefOr[NotyCallbackOptions] = js.native
  
  /** backdrop click will close all notifications */
  var closeWith: js.UndefOr[js.Array[click | button | hover | backdrop]] = js.native
  
  /** If you want to use queue feature set this true. */
  var dismissQueue: js.UndefOr[Boolean] = js.native
  
  /** adds notification to the beginning of queue when set to true */
  var force: js.UndefOr[Boolean] = js.native
  
  /** if true closes all notifications and shows itself */
  var killer: js.UndefOr[Boolean] = js.native
  
  var layout: js.UndefOr[String] = js.native
  
  /** You can set max visible notification for dismissQueue true option */
  var maxVisible: js.UndefOr[Double] = js.native
  
  /** if true adds an overlay */
  var modal: js.UndefOr[Boolean] = js.native
  
  /** displays a progress bar */
  var progressBar: js.UndefOr[Boolean] = js.native
  
  /** The note`s optional template like '<div class="noty_message"><span class="noty_text"></span><div class="noty_close"></div></div>' */
  var template: js.UndefOr[String] = js.native
  
  /** Text to show. Can be html or string. */
  var text: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  /** Delay for closing event. Set false for sticky notifications */
  var timeout: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object NotyOptions {
  
  @scala.inline
  def apply(): NotyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyOptions]
  }
  
  @scala.inline
  implicit class NotyOptionsMutableBuilder[Self <: NotyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: NotyAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setCallback(value: NotyCallbackOptions): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCloseWith(value: js.Array[click | button | hover | backdrop]): Self = StObject.set(x, "closeWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseWithUndefined: Self = StObject.set(x, "closeWith", js.undefined)
    
    @scala.inline
    def setCloseWithVarargs(value: (click | button | hover | backdrop)*): Self = StObject.set(x, "closeWith", js.Array(value :_*))
    
    @scala.inline
    def setDismissQueue(value: Boolean): Self = StObject.set(x, "dismissQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissQueueUndefined: Self = StObject.set(x, "dismissQueue", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setKiller(value: Boolean): Self = StObject.set(x, "killer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKillerUndefined: Self = StObject.set(x, "killer", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMaxVisible(value: Double): Self = StObject.set(x, "maxVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVisibleUndefined: Self = StObject.set(x, "maxVisible", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
