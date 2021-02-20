package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowAnimation extends StObject {
  
  var close: js.UndefOr[WindowAnimationClose] = js.native
  
  var open: js.UndefOr[WindowAnimationOpen] = js.native
}
object WindowAnimation {
  
  @scala.inline
  def apply(): WindowAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowAnimation]
  }
  
  @scala.inline
  implicit class WindowAnimationMutableBuilder[Self <: WindowAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: WindowAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: WindowAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
