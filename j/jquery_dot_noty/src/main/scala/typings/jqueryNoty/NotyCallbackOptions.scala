package typings.jqueryNoty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotyCallbackOptions extends StObject {
  
  var afterClose: js.UndefOr[js.Function] = js.native
  
  var afterShow: js.UndefOr[js.Function] = js.native
  
  var onClose: js.UndefOr[js.Function] = js.native
  
  var onCloseClick: js.UndefOr[js.Function] = js.native
  
  var onShow: js.UndefOr[js.Function] = js.native
}
object NotyCallbackOptions {
  
  @scala.inline
  def apply(): NotyCallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyCallbackOptions]
  }
  
  @scala.inline
  implicit class NotyCallbackOptionsMutableBuilder[Self <: NotyCallbackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterClose(value: js.Function): Self = StObject.set(x, "afterClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    @scala.inline
    def setAfterShow(value: js.Function): Self = StObject.set(x, "afterShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseClick(value: js.Function): Self = StObject.set(x, "onCloseClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseClickUndefined: Self = StObject.set(x, "onCloseClick", js.undefined)
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.Function): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
  }
}
