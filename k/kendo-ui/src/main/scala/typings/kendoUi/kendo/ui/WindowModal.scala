package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowModal extends StObject {
  
  var preventScroll: js.UndefOr[Boolean] = js.native
}
object WindowModal {
  
  @scala.inline
  def apply(): WindowModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowModal]
  }
  
  @scala.inline
  implicit class WindowModalMutableBuilder[Self <: WindowModal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
