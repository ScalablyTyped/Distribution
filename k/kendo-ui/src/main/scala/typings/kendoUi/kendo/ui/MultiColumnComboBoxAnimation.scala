package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiColumnComboBoxAnimation extends StObject {
  
  var close: js.UndefOr[MultiColumnComboBoxAnimationClose] = js.native
  
  var open: js.UndefOr[MultiColumnComboBoxAnimationOpen] = js.native
}
object MultiColumnComboBoxAnimation {
  
  @scala.inline
  def apply(): MultiColumnComboBoxAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnComboBoxAnimation]
  }
  
  @scala.inline
  implicit class MultiColumnComboBoxAnimationMutableBuilder[Self <: MultiColumnComboBoxAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: MultiColumnComboBoxAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: MultiColumnComboBoxAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
