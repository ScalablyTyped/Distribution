package typings.interactjsTypes.anon

import typings.interactjsTypes.coreOptionsMod.OptionsArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractableOptions extends StObject {
  
  var interactable: InteractableAllowFrom
  
  var options: OptionsArg
}
object InteractableOptions {
  
  inline def apply(interactable: InteractableAllowFrom, options: OptionsArg): InteractableOptions = {
    val __obj = js.Dynamic.literal(interactable = interactable.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractableOptions] (val x: Self) extends AnyVal {
    
    inline def setInteractable(value: InteractableAllowFrom): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: OptionsArg): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
