package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerAnimation extends StObject {
  
  var close: js.UndefOr[DatePickerAnimationClose] = js.undefined
  
  var open: js.UndefOr[DatePickerAnimationOpen] = js.undefined
}
object DatePickerAnimation {
  
  inline def apply(): DatePickerAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerAnimation]
  }
  
  extension [Self <: DatePickerAnimation](x: Self) {
    
    inline def setClose(value: DatePickerAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: DatePickerAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
