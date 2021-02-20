package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogAction extends StObject {
  
  var action: js.UndefOr[js.Function] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object DialogAction {
  
  @scala.inline
  def apply(): DialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogAction]
  }
  
  @scala.inline
  implicit class DialogActionMutableBuilder[Self <: DialogAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Function): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
