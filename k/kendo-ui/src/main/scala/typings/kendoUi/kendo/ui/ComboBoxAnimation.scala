package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBoxAnimation extends StObject {
  
  var close: js.UndefOr[ComboBoxAnimationClose] = js.undefined
  
  var open: js.UndefOr[ComboBoxAnimationOpen] = js.undefined
}
object ComboBoxAnimation {
  
  inline def apply(): ComboBoxAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboBoxAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboBoxAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: ComboBoxAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: ComboBoxAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
