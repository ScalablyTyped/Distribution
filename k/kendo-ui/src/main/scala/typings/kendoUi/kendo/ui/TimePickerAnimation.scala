package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerAnimation extends StObject {
  
  var close: js.UndefOr[TimePickerAnimationClose] = js.undefined
  
  var open: js.UndefOr[TimePickerAnimationOpen] = js.undefined
}
object TimePickerAnimation {
  
  inline def apply(): TimePickerAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimePickerAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: TimePickerAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: TimePickerAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
