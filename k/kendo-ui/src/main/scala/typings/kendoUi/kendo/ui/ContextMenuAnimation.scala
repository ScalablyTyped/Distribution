package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuAnimation extends StObject {
  
  var close: js.UndefOr[ContextMenuAnimationClose] = js.native
  
  var open: js.UndefOr[ContextMenuAnimationOpen] = js.native
}
object ContextMenuAnimation {
  
  @scala.inline
  def apply(): ContextMenuAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuAnimation]
  }
  
  @scala.inline
  implicit class ContextMenuAnimationMutableBuilder[Self <: ContextMenuAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: ContextMenuAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: ContextMenuAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
