package typings.interactjsTypes

import typings.interactjsTypes.anon.Call
import typings.interactjsTypes.anon.Dictkey
import typings.interactjsTypes.anon.Enabled
import typings.interactjsTypes.anon.IEventInteraction
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierModule
import typings.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersBaseMod {
  
  @JSImport("@interactjs/modifiers/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@interactjs/modifiers/base", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  inline def addEventModifiers(param0: IEventInteraction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEventModifiers")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def makeModifier[Defaults /* <: Enabled */, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */, Result](module: ModifierModule[Defaults, State, Result]): Call[Defaults, State, Name, Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeModifier")(module.asInstanceOf[js.Any]).asInstanceOf[Call[Defaults, State, Name, Result]]
  inline def makeModifier[Defaults /* <: Enabled */, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */, Result](module: ModifierModule[Defaults, State, Result], name: Name): Call[Defaults, State, Name, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeModifier")(module.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Call[Defaults, State, Name, Result]]
  
  /* augmented module */
  object interactjsCoreInteractEventAugmentingMod {
    
    trait InteractEvent extends StObject {
      
      var modifiers: js.UndefOr[js.Array[Dictkey]] = js.undefined
    }
    object InteractEvent {
      
      inline def apply(): InteractEvent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InteractEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InteractEvent] (val x: Self) extends AnyVal {
        
        inline def setModifiers(value: js.Array[Dictkey]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
        
        inline def setModifiersVarargs(value: Dictkey*): Self = StObject.set(x, "modifiers", js.Array(value*))
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var modification: js.UndefOr[typings.interactjsTypes.modifiersModificationMod.default] = js.undefined
    }
    object Interaction {
      
      inline def apply(): Interaction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Interaction]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Interaction] (val x: Self) extends AnyVal {
        
        inline def setModification(value: typings.interactjsTypes.modifiersModificationMod.default): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
        
        inline def setModificationUndefined: Self = StObject.set(x, "modification", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait PerActionDefaults extends StObject {
      
      var modifiers: js.UndefOr[js.Array[Modifier[Any, Any, Any, Any]]] = js.undefined
    }
    object PerActionDefaults {
      
      inline def apply(): PerActionDefaults = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PerActionDefaults]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PerActionDefaults] (val x: Self) extends AnyVal {
        
        inline def setModifiers(value: js.Array[Modifier[Any, Any, Any, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
        
        inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      }
    }
  }
}
