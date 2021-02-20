package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmMessages extends StObject {
  
  var cancel: js.UndefOr[String] = js.native
  
  var okText: js.UndefOr[String] = js.native
}
object ConfirmMessages {
  
  @scala.inline
  def apply(): ConfirmMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmMessages]
  }
  
  @scala.inline
  implicit class ConfirmMessagesMutableBuilder[Self <: ConfirmMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
  }
}
