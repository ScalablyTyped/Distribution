package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownListAnimation extends StObject {
  
  var close: js.UndefOr[DropDownListAnimationClose] = js.undefined
  
  var open: js.UndefOr[DropDownListAnimationOpen] = js.undefined
}
object DropDownListAnimation {
  
  @scala.inline
  def apply(): DropDownListAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownListAnimation]
  }
  
  @scala.inline
  implicit class DropDownListAnimationMutableBuilder[Self <: DropDownListAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: DropDownListAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: DropDownListAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
