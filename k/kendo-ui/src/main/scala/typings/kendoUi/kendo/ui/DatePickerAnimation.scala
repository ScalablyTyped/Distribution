package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerAnimation extends StObject {
  
  var close: js.UndefOr[DatePickerAnimationClose] = js.native
  
  var open: js.UndefOr[DatePickerAnimationOpen] = js.native
}
object DatePickerAnimation {
  
  @scala.inline
  def apply(): DatePickerAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerAnimation]
  }
  
  @scala.inline
  implicit class DatePickerAnimationMutableBuilder[Self <: DatePickerAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: DatePickerAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: DatePickerAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
