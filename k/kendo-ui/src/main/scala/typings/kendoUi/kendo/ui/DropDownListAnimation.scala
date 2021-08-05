package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownListAnimation extends StObject {
  
  var close: js.UndefOr[DropDownListAnimationClose] = js.undefined
  
  var open: js.UndefOr[DropDownListAnimationOpen] = js.undefined
}
object DropDownListAnimation {
  
  inline def apply(): DropDownListAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownListAnimation]
  }
  
  extension [Self <: DropDownListAnimation](x: Self) {
    
    inline def setClose(value: DropDownListAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: DropDownListAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
