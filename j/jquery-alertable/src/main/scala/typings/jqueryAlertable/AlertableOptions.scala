package typings.jqueryAlertable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertableOptions extends StObject {
  
  var cancelButton: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var hide: js.UndefOr[js.Function] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var modal: js.UndefOr[String] = js.native
  
  var okButton: js.UndefOr[String] = js.native
  
  var overlay: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[js.Function] = js.native
}
object AlertableOptions {
  
  @scala.inline
  def apply(): AlertableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertableOptions]
  }
  
  @scala.inline
  implicit class AlertableOptionsMutableBuilder[Self <: AlertableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setHide(value: js.Function): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setModal(value: String): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setOkButton(value: String): Self = StObject.set(x, "okButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkButtonUndefined: Self = StObject.set(x, "okButton", js.undefined)
    
    @scala.inline
    def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setShow(value: js.Function): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
