package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownTreeAnimation extends StObject {
  
  var close: js.UndefOr[DropDownTreeAnimationClose] = js.native
  
  var open: js.UndefOr[DropDownTreeAnimationOpen] = js.native
}
object DropDownTreeAnimation {
  
  @scala.inline
  def apply(): DropDownTreeAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeAnimation]
  }
  
  @scala.inline
  implicit class DropDownTreeAnimationMutableBuilder[Self <: DropDownTreeAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: DropDownTreeAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: DropDownTreeAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
