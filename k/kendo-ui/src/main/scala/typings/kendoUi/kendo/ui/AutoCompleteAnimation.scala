package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteAnimation extends StObject {
  
  var close: js.UndefOr[AutoCompleteAnimationClose] = js.undefined
  
  var open: js.UndefOr[AutoCompleteAnimationOpen] = js.undefined
}
object AutoCompleteAnimation {
  
  @scala.inline
  def apply(): AutoCompleteAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteAnimation]
  }
  
  @scala.inline
  implicit class AutoCompleteAnimationMutableBuilder[Self <: AutoCompleteAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: AutoCompleteAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: AutoCompleteAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
