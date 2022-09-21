package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.anon.InteractableDeltaSource
import typings.interactjsTypes.scopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactableTargetsMod extends Shortcut {
  
  @JSImport("@interactjs/pointer-events/interactableTargets", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `interactableTargetsMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    trait Interactable extends StObject {
      
      def __backCompatOption(optionName: String, newValue: Any): Any
      
      def pointerEvents(options: Any): InteractableDeltaSource
      @JSName("pointerEvents")
      var pointerEvents_Original: js.ThisFunction1[/* this */ InteractableDeltaSource, /* options */ Any, InteractableDeltaSource]
    }
    object Interactable {
      
      inline def apply(
        __backCompatOption: (String, Any) => Any,
        pointerEvents: js.ThisFunction1[/* this */ InteractableDeltaSource, /* options */ Any, InteractableDeltaSource]
      ): Interactable = {
        val __obj = js.Dynamic.literal(__backCompatOption = js.Any.fromFunction2(__backCompatOption), pointerEvents = pointerEvents.asInstanceOf[js.Any])
        __obj.asInstanceOf[Interactable]
      }
      
      extension [Self <: Interactable](x: Self) {
        
        inline def setPointerEvents(
          value: js.ThisFunction1[/* this */ InteractableDeltaSource, /* options */ Any, InteractableDeltaSource]
        ): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
        
        inline def set__backCompatOption(value: (String, Any) => Any): Self = StObject.set(x, "__backCompatOption", js.Any.fromFunction2(value))
      }
    }
  }
}
