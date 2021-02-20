package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogModal extends StObject {
  
  var preventScroll: js.UndefOr[String] = js.native
}
object DialogModal {
  
  @scala.inline
  def apply(): DialogModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogModal]
  }
  
  @scala.inline
  implicit class DialogModalMutableBuilder[Self <: DialogModal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventScroll(value: String): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
