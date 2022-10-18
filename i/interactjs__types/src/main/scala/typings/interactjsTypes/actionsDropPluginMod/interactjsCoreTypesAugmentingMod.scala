package typings.interactjsTypes.actionsDropPluginMod

import typings.interactjsTypes.coreScopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object interactjsCoreTypesAugmentingMod {
  
  trait ActionMap extends StObject {
    
    var drop: js.UndefOr[Plugin] = js.undefined
  }
  object ActionMap {
    
    inline def apply(): ActionMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionMap]
    }
    
    extension [Self <: ActionMap](x: Self) {
      
      inline def setDrop(value: Plugin): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    }
  }
}
