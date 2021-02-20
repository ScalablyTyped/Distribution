package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerAnimation extends StObject {
  
  var close: js.UndefOr[TimePickerAnimationClose] = js.native
  
  var open: js.UndefOr[TimePickerAnimationOpen] = js.native
}
object TimePickerAnimation {
  
  @scala.inline
  def apply(): TimePickerAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerAnimation]
  }
  
  @scala.inline
  implicit class TimePickerAnimationMutableBuilder[Self <: TimePickerAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: TimePickerAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: TimePickerAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
