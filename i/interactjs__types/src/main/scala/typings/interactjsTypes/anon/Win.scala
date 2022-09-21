package typings.interactjsTypes.anon

import typings.interactjsTypes.optionsMod.OptionsArg
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win extends StObject {
  
  var interactable: InteractableAllowFrom
  
  var options: OptionsArg
  
  var target: typings.interactjsTypes.typesMod.Target
  
  var win: Window
}
object Win {
  
  inline def apply(
    interactable: InteractableAllowFrom,
    options: OptionsArg,
    target: typings.interactjsTypes.typesMod.Target,
    win: Window
  ): Win = {
    val __obj = js.Dynamic.literal(interactable = interactable.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
    __obj.asInstanceOf[Win]
  }
  
  extension [Self <: Win](x: Self) {
    
    inline def setInteractable(value: InteractableAllowFrom): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: OptionsArg): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: typings.interactjsTypes.typesMod.Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setWin(value: Window): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
  }
}
