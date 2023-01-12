package typings.interactjsTypes.actionsDropPluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object interactjsCoreInteractionAugmentingMod {
  
  trait Interaction extends StObject {
    
    var dropState: js.UndefOr[DropState] = js.undefined
  }
  object Interaction {
    
    inline def apply(): Interaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Interaction] (val x: Self) extends AnyVal {
      
      inline def setDropState(value: DropState): Self = StObject.set(x, "dropState", value.asInstanceOf[js.Any])
      
      inline def setDropStateUndefined: Self = StObject.set(x, "dropState", js.undefined)
    }
  }
}
