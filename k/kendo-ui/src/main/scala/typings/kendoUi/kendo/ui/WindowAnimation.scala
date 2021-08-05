package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowAnimation extends StObject {
  
  var close: js.UndefOr[WindowAnimationClose] = js.undefined
  
  var open: js.UndefOr[WindowAnimationOpen] = js.undefined
}
object WindowAnimation {
  
  inline def apply(): WindowAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowAnimation]
  }
  
  extension [Self <: WindowAnimation](x: Self) {
    
    inline def setClose(value: WindowAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: WindowAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
