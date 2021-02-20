package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateChangingEventUIParam extends StObject {
  
  /**
    * Gets the name of the action. That can be one of the following: "open" - request to open the dialog. "close" - request to close the dialog. "minimize" - request to minimize the dialog. "maximize" - request to maximize the dialog. "restore" - request to restore the dialog from minimized or maximized state. "pin" - request to pin the dialog. "unpin" - request to unpin the dialog.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the button, which triggered the event. Note: if the state was modified from the code, then "button" is undefined.
    */
  var button: js.UndefOr[String] = js.native
  
  /**
    * Gets the boolean value of the old pin state of the dialog.
    */
  var oldPinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the old state of the dialog, which can be one of the following: "opened", "minimized", "maximized", "closed".
    */
  var oldState: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object StateChangingEventUIParam {
  
  @scala.inline
  def apply(): StateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateChangingEventUIParam]
  }
  
  @scala.inline
  implicit class StateChangingEventUIParamMutableBuilder[Self <: StateChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setOldPinned(value: Boolean): Self = StObject.set(x, "oldPinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPinnedUndefined: Self = StObject.set(x, "oldPinned", js.undefined)
    
    @scala.inline
    def setOldState(value: String): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldStateUndefined: Self = StObject.set(x, "oldState", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
