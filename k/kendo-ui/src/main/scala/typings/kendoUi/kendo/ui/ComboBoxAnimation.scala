package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBoxAnimation extends StObject {
  
  var close: js.UndefOr[ComboBoxAnimationClose] = js.native
  
  var open: js.UndefOr[ComboBoxAnimationOpen] = js.native
}
object ComboBoxAnimation {
  
  @scala.inline
  def apply(): ComboBoxAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboBoxAnimation]
  }
  
  @scala.inline
  implicit class ComboBoxAnimationMutableBuilder[Self <: ComboBoxAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: ComboBoxAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: ComboBoxAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
