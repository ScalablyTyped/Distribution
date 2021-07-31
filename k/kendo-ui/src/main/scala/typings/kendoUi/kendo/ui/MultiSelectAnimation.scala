package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSelectAnimation extends StObject {
  
  var close: js.UndefOr[MultiSelectAnimationClose] = js.undefined
  
  var open: js.UndefOr[MultiSelectAnimationOpen] = js.undefined
}
object MultiSelectAnimation {
  
  @scala.inline
  def apply(): MultiSelectAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectAnimation]
  }
  
  @scala.inline
  implicit class MultiSelectAnimationMutableBuilder[Self <: MultiSelectAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: MultiSelectAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: MultiSelectAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
