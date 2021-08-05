package typings.ink.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledFocusIds extends StObject {
  
  var activeFocusId: Unit
  
  var disabledFocusIds: js.Array[scala.Nothing]
  
  var focusIds: js.Array[scala.Nothing]
  
  var isFocusEnabled: Boolean
}
object DisabledFocusIds {
  
  inline def apply(
    activeFocusId: Unit,
    disabledFocusIds: js.Array[scala.Nothing],
    focusIds: js.Array[scala.Nothing],
    isFocusEnabled: Boolean
  ): DisabledFocusIds = {
    val __obj = js.Dynamic.literal(activeFocusId = activeFocusId.asInstanceOf[js.Any], disabledFocusIds = disabledFocusIds.asInstanceOf[js.Any], focusIds = focusIds.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledFocusIds]
  }
  
  extension [Self <: DisabledFocusIds](x: Self) {
    
    inline def setActiveFocusId(value: Unit): Self = StObject.set(x, "activeFocusId", value.asInstanceOf[js.Any])
    
    inline def setDisabledFocusIds(value: js.Array[scala.Nothing]): Self = StObject.set(x, "disabledFocusIds", value.asInstanceOf[js.Any])
    
    inline def setDisabledFocusIdsVarargs(value: scala.Nothing*): Self = StObject.set(x, "disabledFocusIds", js.Array(value :_*))
    
    inline def setFocusIds(value: js.Array[scala.Nothing]): Self = StObject.set(x, "focusIds", value.asInstanceOf[js.Any])
    
    inline def setFocusIdsVarargs(value: scala.Nothing*): Self = StObject.set(x, "focusIds", js.Array(value :_*))
    
    inline def setIsFocusEnabled(value: Boolean): Self = StObject.set(x, "isFocusEnabled", value.asInstanceOf[js.Any])
  }
}
