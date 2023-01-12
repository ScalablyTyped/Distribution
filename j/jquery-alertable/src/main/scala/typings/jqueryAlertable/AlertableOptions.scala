package typings.jqueryAlertable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertableOptions extends StObject {
  
  var cancelButton: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var hide: js.UndefOr[js.Function] = js.undefined
  
  var html: js.UndefOr[Boolean] = js.undefined
  
  var modal: js.UndefOr[String] = js.undefined
  
  var okButton: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[js.Function] = js.undefined
}
object AlertableOptions {
  
  inline def apply(): AlertableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertableOptions] (val x: Self) extends AnyVal {
    
    inline def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setHide(value: js.Function): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setModal(value: String): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setOkButton(value: String): Self = StObject.set(x, "okButton", value.asInstanceOf[js.Any])
    
    inline def setOkButtonUndefined: Self = StObject.set(x, "okButton", js.undefined)
    
    inline def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setShow(value: js.Function): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
