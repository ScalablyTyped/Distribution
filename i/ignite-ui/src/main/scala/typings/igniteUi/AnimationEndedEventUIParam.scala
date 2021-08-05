package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEndedEventUIParam extends StObject {
  
  /**
    * Gets the name of the action, which triggered the animation.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the name of the button, which triggered the event. Note: if the state was modified from the code, then "button" is undefined.
    */
  var button: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the boolean value of the old pin state of the dialog.
    */
  var oldPinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the old state of the dialog, which can be one of the following: "opened", "minimized", "maximized", "closed".
    */
  var oldState: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object AnimationEndedEventUIParam {
  
  inline def apply(): AnimationEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEndedEventUIParam]
  }
  
  extension [Self <: AnimationEndedEventUIParam](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setOldPinned(value: Boolean): Self = StObject.set(x, "oldPinned", value.asInstanceOf[js.Any])
    
    inline def setOldPinnedUndefined: Self = StObject.set(x, "oldPinned", js.undefined)
    
    inline def setOldState(value: String): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setOldStateUndefined: Self = StObject.set(x, "oldState", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
