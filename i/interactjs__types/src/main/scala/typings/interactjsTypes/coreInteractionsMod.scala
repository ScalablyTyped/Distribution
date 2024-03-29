package typings.interactjsTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.anon.DocEvents
import typings.interactjsTypes.anon.ScopeFire
import typings.interactjsTypes.anon.SearchDetails
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreTypesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInteractionsMod extends Shortcut {
  
  @JSImport("@interactjs/core/interactions", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `coreInteractionsMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait Scope extends StObject {
      
      var Interaction: Instantiable1[
            /* param0 */ ScopeFire, 
            typings.interactjsTypes.coreInteractionMod.Interaction[ActionName | Null]
          ]
      
      var interactions: DocEvents
      
      var prevTouchTime: Double
    }
    object Scope {
      
      inline def apply(
        Interaction: Instantiable1[/* param0 */ ScopeFire, Interaction[ActionName | Null]],
        interactions: DocEvents,
        prevTouchTime: Double
      ): Scope = {
        val __obj = js.Dynamic.literal(Interaction = Interaction.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], prevTouchTime = prevTouchTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[Scope]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
        
        inline def setInteraction(value: Instantiable1[/* param0 */ ScopeFire, Interaction[ActionName | Null]]): Self = StObject.set(x, "Interaction", value.asInstanceOf[js.Any])
        
        inline def setInteractions(value: DocEvents): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
        
        inline def setPrevTouchTime(value: Double): Self = StObject.set(x, "prevTouchTime", value.asInstanceOf[js.Any])
      }
    }
    
    trait SignalArgs extends StObject {
      
      @JSName("interactions:find")
      var interactionsColonfind: SearchDetails
    }
    object SignalArgs {
      
      inline def apply(interactionsColonfind: SearchDetails): SignalArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("interactions:find")(interactionsColonfind.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignalArgs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SignalArgs] (val x: Self) extends AnyVal {
        
        inline def setInteractionsColonfind(value: SearchDetails): Self = StObject.set(x, "interactions:find", value.asInstanceOf[js.Any])
      }
    }
  }
}
