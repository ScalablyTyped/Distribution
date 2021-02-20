package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonCancelClickEventUIParam extends StObject {
  
  /**
    * Gets a reference to the igGridModalDialog element.
    */
  var modalDialog: js.UndefOr[String] = js.native
  
  /**
    * Gets the reference to the igGridModalDialog widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ButtonCancelClickEventUIParam {
  
  @scala.inline
  def apply(): ButtonCancelClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonCancelClickEventUIParam]
  }
  
  @scala.inline
  implicit class ButtonCancelClickEventUIParamMutableBuilder[Self <: ButtonCancelClickEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModalDialog(value: String): Self = StObject.set(x, "modalDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogUndefined: Self = StObject.set(x, "modalDialog", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
