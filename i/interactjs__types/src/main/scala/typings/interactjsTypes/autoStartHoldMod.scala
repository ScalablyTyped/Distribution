package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.coreScopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoStartHoldMod extends Shortcut {
  
  @JSImport("@interactjs/auto-start/hold", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `autoStartHoldMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var autoStartHoldTimer: js.UndefOr[Any] = js.undefined
    }
    object Interaction {
      
      inline def apply(): Interaction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Interaction]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Interaction] (val x: Self) extends AnyVal {
        
        inline def setAutoStartHoldTimer(value: Any): Self = StObject.set(x, "autoStartHoldTimer", value.asInstanceOf[js.Any])
        
        inline def setAutoStartHoldTimerUndefined: Self = StObject.set(x, "autoStartHoldTimer", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait PerActionDefaults extends StObject {
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var hold: js.UndefOr[Double] = js.undefined
    }
    object PerActionDefaults {
      
      inline def apply(): PerActionDefaults = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PerActionDefaults]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PerActionDefaults] (val x: Self) extends AnyVal {
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
        
        inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      }
    }
  }
}
