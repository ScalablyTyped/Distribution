package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStripAnimation extends StObject {
  
  var close: js.UndefOr[TabStripAnimationClose] = js.native
  
  var open: js.UndefOr[TabStripAnimationOpen] = js.native
}
object TabStripAnimation {
  
  @scala.inline
  def apply(): TabStripAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStripAnimation]
  }
  
  @scala.inline
  implicit class TabStripAnimationMutableBuilder[Self <: TabStripAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: TabStripAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: TabStripAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
