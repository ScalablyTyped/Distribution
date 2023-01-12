package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuAnimation extends StObject {
  
  var close: js.UndefOr[ContextMenuAnimationClose] = js.undefined
  
  var open: js.UndefOr[ContextMenuAnimationOpen] = js.undefined
}
object ContextMenuAnimation {
  
  inline def apply(): ContextMenuAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextMenuAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: ContextMenuAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: ContextMenuAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
