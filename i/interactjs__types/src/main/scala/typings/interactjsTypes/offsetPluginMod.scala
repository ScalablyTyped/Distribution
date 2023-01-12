package typings.interactjsTypes

import typings.interactjsTypes.anon.Pending
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetPluginMod {
  
  @JSImport("@interactjs/offset/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@interactjs/offset/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  inline def addTotal(interaction: Interaction[ActionName]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTotal")(interaction.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def applyPending(interaction: Interaction[ActionName]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPending")(interaction.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    @js.native
    sealed trait ProxyMethods extends StObject
    @JSImport("@interactjs/core/Interaction", "_ProxyMethods")
    @js.native
    object ProxyMethods extends StObject {
      
      @js.native
      sealed trait offsetBy
        extends StObject
           with ProxyMethods
    }
    
    trait Interaction extends StObject {
      
      var offset: Pending
      
      var offsetBy: js.UndefOr[
            js.ThisFunction1[
              /* this */ typings.interactjsTypes.coreInteractionMod.Interaction[ActionName], 
              /* param1 */ Point, 
              Unit
            ]
          ] = js.undefined
    }
    object Interaction {
      
      inline def apply(offset: Pending): typings.interactjsTypes.offsetPluginMod.interactjsCoreInteractionAugmentingMod.Interaction = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.interactjsTypes.offsetPluginMod.interactjsCoreInteractionAugmentingMod.Interaction]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.interactjsTypes.offsetPluginMod.interactjsCoreInteractionAugmentingMod.Interaction] (val x: Self) extends AnyVal {
        
        inline def setOffset(value: Pending): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetBy(
          value: js.ThisFunction1[
                  /* this */ typings.interactjsTypes.coreInteractionMod.Interaction[ActionName], 
                  /* param1 */ Point, 
                  Unit
                ]
        ): Self = StObject.set(x, "offsetBy", value.asInstanceOf[js.Any])
        
        inline def setOffsetByUndefined: Self = StObject.set(x, "offsetBy", js.undefined)
      }
    }
  }
}
