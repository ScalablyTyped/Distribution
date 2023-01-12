package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStripAnimation extends StObject {
  
  var close: js.UndefOr[TabStripAnimationClose] = js.undefined
  
  var open: js.UndefOr[TabStripAnimationOpen] = js.undefined
}
object TabStripAnimation {
  
  inline def apply(): TabStripAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStripAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabStripAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: TabStripAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: TabStripAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
