package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractableInteractableBackCompatOption extends StObject {
  
  var interactable: InteractableBackCompatOption
}
object InteractableInteractableBackCompatOption {
  
  inline def apply(interactable: InteractableBackCompatOption): InteractableInteractableBackCompatOption = {
    val __obj = js.Dynamic.literal(interactable = interactable.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractableInteractableBackCompatOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractableInteractableBackCompatOption] (val x: Self) extends AnyVal {
    
    inline def setInteractable(value: InteractableBackCompatOption): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
  }
}
