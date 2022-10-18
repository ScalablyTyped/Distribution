package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.coreScopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsHoldRepeatMod extends Shortcut {
  
  @JSImport("@interactjs/pointer-events/holdRepeat", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pointerEventsHoldRepeatMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var holdIntervalHandle: js.UndefOr[Any] = js.undefined
    }
    object Interaction {
      
      inline def apply(): Interaction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Interaction]
      }
      
      extension [Self <: Interaction](x: Self) {
        
        inline def setHoldIntervalHandle(value: Any): Self = StObject.set(x, "holdIntervalHandle", value.asInstanceOf[js.Any])
        
        inline def setHoldIntervalHandleUndefined: Self = StObject.set(x, "holdIntervalHandle", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsPointerEventsBaseAugmentingMod {
    
    trait PointerEventOptions extends StObject {
      
      var holdRepeatInterval: js.UndefOr[Double] = js.undefined
    }
    object PointerEventOptions {
      
      inline def apply(): PointerEventOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PointerEventOptions]
      }
      
      extension [Self <: PointerEventOptions](x: Self) {
        
        inline def setHoldRepeatInterval(value: Double): Self = StObject.set(x, "holdRepeatInterval", value.asInstanceOf[js.Any])
        
        inline def setHoldRepeatIntervalUndefined: Self = StObject.set(x, "holdRepeatInterval", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsPointerEventsPointerEventAugmentingMod {
    
    trait PointerEvent[T /* <: String */] extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
    }
    object PointerEvent {
      
      inline def apply[T /* <: String */](): PointerEvent[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PointerEvent[T]]
      }
      
      extension [Self <: PointerEvent[?], T /* <: String */](x: Self & PointerEvent[T]) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      }
    }
  }
}
