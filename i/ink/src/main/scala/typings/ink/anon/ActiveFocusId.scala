package typings.ink.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveFocusId extends StObject {
  
  var activeFocusId: Unit
  
  var error: Unit
  
  var focusables: js.Array[scala.Nothing]
  
  var isFocusEnabled: Boolean
}
object ActiveFocusId {
  
  inline def apply(activeFocusId: Unit, error: Unit, focusables: js.Array[scala.Nothing], isFocusEnabled: Boolean): ActiveFocusId = {
    val __obj = js.Dynamic.literal(activeFocusId = activeFocusId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focusables = focusables.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveFocusId]
  }
  
  extension [Self <: ActiveFocusId](x: Self) {
    
    inline def setActiveFocusId(value: Unit): Self = StObject.set(x, "activeFocusId", value.asInstanceOf[js.Any])
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFocusables(value: js.Array[scala.Nothing]): Self = StObject.set(x, "focusables", value.asInstanceOf[js.Any])
    
    inline def setFocusablesVarargs(value: scala.Nothing*): Self = StObject.set(x, "focusables", js.Array(value :_*))
    
    inline def setIsFocusEnabled(value: Boolean): Self = StObject.set(x, "isFocusEnabled", value.asInstanceOf[js.Any])
  }
}
