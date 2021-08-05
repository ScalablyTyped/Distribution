package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownTreeAnimation extends StObject {
  
  var close: js.UndefOr[DropDownTreeAnimationClose] = js.undefined
  
  var open: js.UndefOr[DropDownTreeAnimationOpen] = js.undefined
}
object DropDownTreeAnimation {
  
  inline def apply(): DropDownTreeAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeAnimation]
  }
  
  extension [Self <: DropDownTreeAnimation](x: Self) {
    
    inline def setClose(value: DropDownTreeAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: DropDownTreeAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
