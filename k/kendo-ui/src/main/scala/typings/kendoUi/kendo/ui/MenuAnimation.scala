package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuAnimation extends StObject {
  
  var close: js.UndefOr[MenuAnimationClose] = js.undefined
  
  var open: js.UndefOr[MenuAnimationOpen] = js.undefined
}
object MenuAnimation {
  
  @scala.inline
  def apply(): MenuAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuAnimation]
  }
  
  @scala.inline
  implicit class MenuAnimationMutableBuilder[Self <: MenuAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: MenuAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: MenuAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
