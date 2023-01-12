package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAnimation extends StObject {
  
  var close: js.UndefOr[DialogAnimationClose] = js.undefined
  
  var open: js.UndefOr[DialogAnimationOpen] = js.undefined
}
object DialogAnimation {
  
  inline def apply(): DialogAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: DialogAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: DialogAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
