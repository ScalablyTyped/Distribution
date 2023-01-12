package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimePickerAnimation extends StObject {
  
  var close: js.UndefOr[DateTimePickerAnimationClose] = js.undefined
  
  var open: js.UndefOr[DateTimePickerAnimationOpen] = js.undefined
}
object DateTimePickerAnimation {
  
  inline def apply(): DateTimePickerAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimePickerAnimation] (val x: Self) extends AnyVal {
    
    inline def setClose(value: DateTimePickerAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: DateTimePickerAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
