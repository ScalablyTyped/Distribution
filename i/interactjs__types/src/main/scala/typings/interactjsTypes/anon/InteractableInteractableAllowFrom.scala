package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractableInteractableAllowFrom extends StObject {
  
  var interactable: InteractableAllowFrom
}
object InteractableInteractableAllowFrom {
  
  inline def apply(interactable: InteractableAllowFrom): InteractableInteractableAllowFrom = {
    val __obj = js.Dynamic.literal(interactable = interactable.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractableInteractableAllowFrom]
  }
  
  extension [Self <: InteractableInteractableAllowFrom](x: Self) {
    
    inline def setInteractable(value: InteractableAllowFrom): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
  }
}
