package typings.interactjsTypes.anon

import typings.interactjsTypes.coreOptionsMod.OptionsArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var interactable: InteractableBackCompatOption
  
  var options: OptionsArg
}
object Options {
  
  inline def apply(interactable: InteractableBackCompatOption, options: OptionsArg): Options = {
    val __obj = js.Dynamic.literal(interactable = interactable.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setInteractable(value: InteractableBackCompatOption): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: OptionsArg): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
