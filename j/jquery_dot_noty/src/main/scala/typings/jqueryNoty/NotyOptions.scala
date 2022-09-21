package typings.jqueryNoty

import typings.jqueryNoty.jqueryNotyStrings.backdrop
import typings.jqueryNoty.jqueryNotyStrings.button
import typings.jqueryNoty.jqueryNotyStrings.click
import typings.jqueryNoty.jqueryNotyStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotyOptions extends StObject {
  
  var animation: js.UndefOr[NotyAnimationOptions] = js.undefined
  
  /** an array of buttons, for creating confirmation dialogs. */
  var buttons: js.UndefOr[Any] = js.undefined
  
  var callback: js.UndefOr[NotyCallbackOptions] = js.undefined
  
  /** backdrop click will close all notifications */
  var closeWith: js.UndefOr[js.Array[click | button | hover | backdrop]] = js.undefined
  
  /** If you want to use queue feature set this true. */
  var dismissQueue: js.UndefOr[Boolean] = js.undefined
  
  /** adds notification to the beginning of queue when set to true */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /** if true closes all notifications and shows itself */
  var killer: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[String] = js.undefined
  
  /** You can set max visible notification for dismissQueue true option */
  var maxVisible: js.UndefOr[Double] = js.undefined
  
  /** if true adds an overlay */
  var modal: js.UndefOr[Boolean] = js.undefined
  
  /** displays a progress bar */
  var progressBar: js.UndefOr[Boolean] = js.undefined
  
  /** The note`s optional template like '<div class="noty_message"><span class="noty_text"></span><div class="noty_close"></div></div>' */
  var template: js.UndefOr[String] = js.undefined
  
  /** Text to show. Can be html or string. */
  var text: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  /** Delay for closing event. Set false for sticky notifications */
  var timeout: js.UndefOr[Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object NotyOptions {
  
  inline def apply(): NotyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyOptions]
  }
  
  extension [Self <: NotyOptions](x: Self) {
    
    inline def setAnimation(value: NotyAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setButtons(value: Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCallback(value: NotyCallbackOptions): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCloseWith(value: js.Array[click | button | hover | backdrop]): Self = StObject.set(x, "closeWith", value.asInstanceOf[js.Any])
    
    inline def setCloseWithUndefined: Self = StObject.set(x, "closeWith", js.undefined)
    
    inline def setCloseWithVarargs(value: (click | button | hover | backdrop)*): Self = StObject.set(x, "closeWith", js.Array(value*))
    
    inline def setDismissQueue(value: Boolean): Self = StObject.set(x, "dismissQueue", value.asInstanceOf[js.Any])
    
    inline def setDismissQueueUndefined: Self = StObject.set(x, "dismissQueue", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setKiller(value: Boolean): Self = StObject.set(x, "killer", value.asInstanceOf[js.Any])
    
    inline def setKillerUndefined: Self = StObject.set(x, "killer", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxVisible(value: Double): Self = StObject.set(x, "maxVisible", value.asInstanceOf[js.Any])
    
    inline def setMaxVisibleUndefined: Self = StObject.set(x, "maxVisible", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
    
    inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
