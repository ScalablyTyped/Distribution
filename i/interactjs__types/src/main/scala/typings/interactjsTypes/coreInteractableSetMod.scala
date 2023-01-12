package typings.interactjsTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.anon.InteractableCheckAndPreventDefault
import typings.interactjsTypes.anon.Win
import typings.interactjsTypes.coreOptionsMod.Options
import typings.interactjsTypes.coreScopeMod.Scope
import typings.interactjsTypes.coreTypesMod.Context
import typings.interactjsTypes.coreTypesMod.Target
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInteractableSetMod {
  
  @JSImport("@interactjs/core/InteractableSet", "InteractableSet")
  @js.native
  open class InteractableSet protected ()
    extends StObject
       with Instantiable1[/* target */ Target, InteractableCheckAndPreventDefault]
       with Instantiable2[/* target */ Target, /* options */ Any, InteractableCheckAndPreventDefault] {
    def this(scope: Scope) = this()
    
    def forEachMatch[T](node: Node, callback: js.Function1[/* interactable */ InteractableActions, T]): Unit | T = js.native
    
    def get(target: Target): InteractableActions = js.native
    def get(target: Target, options: Options): InteractableActions = js.native
    
    var list: js.Array[InteractableActions] = js.native
    
    var scope: Scope = js.native
    
    var selectorMap: StringDictionary[js.Array[InteractableScopeProp]] = js.native
  }
  
  trait InteractableScopeProp extends StObject {
    
    var context: Context
    
    var interactable: InteractableActions
  }
  object InteractableScopeProp {
    
    inline def apply(context: Context, interactable: InteractableActions): InteractableScopeProp = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], interactable = interactable.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractableScopeProp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractableScopeProp] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setInteractable(value: InteractableActions): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait SignalArgs extends StObject {
      
      @JSName("interactable:new")
      var interactableColonnew: Win
    }
    object SignalArgs {
      
      inline def apply(interactableColonnew: Win): SignalArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("interactable:new")(interactableColonnew.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignalArgs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SignalArgs] (val x: Self) extends AnyVal {
        
        inline def setInteractableColonnew(value: Win): Self = StObject.set(x, "interactable:new", value.asInstanceOf[js.Any])
      }
    }
  }
}
