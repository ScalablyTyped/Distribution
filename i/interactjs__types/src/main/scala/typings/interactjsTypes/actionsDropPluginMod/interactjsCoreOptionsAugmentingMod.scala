package typings.interactjsTypes.actionsDropPluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object interactjsCoreOptionsAugmentingMod {
  
  trait ActionDefaults extends StObject {
    
    var drop: DropzoneOptions
  }
  object ActionDefaults {
    
    inline def apply(drop: DropzoneOptions): ActionDefaults = {
      val __obj = js.Dynamic.literal(drop = drop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionDefaults]
    }
    
    extension [Self <: ActionDefaults](x: Self) {
      
      inline def setDrop(value: DropzoneOptions): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    }
  }
}
