package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimePickerAnimation extends StObject {
  
  var close: js.UndefOr[DateTimePickerAnimationClose] = js.undefined
  
  var open: js.UndefOr[DateTimePickerAnimationOpen] = js.undefined
}
object DateTimePickerAnimation {
  
  @scala.inline
  def apply(): DateTimePickerAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerAnimation]
  }
  
  @scala.inline
  implicit class DateTimePickerAnimationMutableBuilder[Self <: DateTimePickerAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: DateTimePickerAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: DateTimePickerAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
