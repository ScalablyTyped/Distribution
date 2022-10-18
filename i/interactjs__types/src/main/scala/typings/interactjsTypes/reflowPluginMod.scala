package typings.interactjsTypes

import typings.interactjsTypes.anon.FnCallInteractableActionScope
import typings.interactjsTypes.anon.OmitDoAnyPhaseArgiEvent
import typings.interactjsTypes.coreInteractionMod.DoAnyPhaseArg
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreScopeMod.Scope
import typings.interactjsTypes.coreTypesMod.ActionProps
import typings.interactjsTypes.interactjsTypesBooleans.`true`
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflowPluginMod {
  
  @JSImport("@interactjs/reflow/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@interactjs/reflow/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  inline def install(scope: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* augmented module */
  object interactjsCoreInteractEventAugmentingMod {
    
    trait PhaseMap extends StObject {
      
      var reflow: js.UndefOr[`true`] = js.undefined
    }
    object PhaseMap {
      
      inline def apply(): PhaseMap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PhaseMap]
      }
      
      extension [Self <: PhaseMap](x: Self) {
        
        inline def setReflow(value: `true`): Self = StObject.set(x, "reflow", value.asInstanceOf[js.Any])
        
        inline def setReflowUndefined: Self = StObject.set(x, "reflow", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    @js.native
    trait Interactable extends StObject {
      
      @JSName("reflow")
      def reflow_drag(action: ActionProps[drag]): ReturnType[FnCallInteractableActionScope] = js.native
      @JSName("reflow")
      def reflow_drop(action: ActionProps[drop]): ReturnType[FnCallInteractableActionScope] = js.native
      @JSName("reflow")
      def reflow_gesture(action: ActionProps[gesture]): ReturnType[FnCallInteractableActionScope] = js.native
      @JSName("reflow")
      def reflow_resize(action: ActionProps[resize]): ReturnType[FnCallInteractableActionScope] = js.native
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var _reflowPromise: js.Promise[Unit]
      
      def _reflowResolve(args: Any*): Unit
    }
    object Interaction {
      
      inline def apply(_reflowPromise: js.Promise[Unit], _reflowResolve: /* repeated */ Any => Unit): Interaction = {
        val __obj = js.Dynamic.literal(_reflowPromise = _reflowPromise.asInstanceOf[js.Any], _reflowResolve = js.Any.fromFunction1(_reflowResolve))
        __obj.asInstanceOf[Interaction]
      }
      
      extension [Self <: Interaction](x: Self) {
        
        inline def set_reflowPromise(value: js.Promise[Unit]): Self = StObject.set(x, "_reflowPromise", value.asInstanceOf[js.Any])
        
        inline def set_reflowResolve(value: /* repeated */ Any => Unit): Self = StObject.set(x, "_reflowResolve", js.Any.fromFunction1(value))
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait SignalArgs extends StObject {
      
      @JSName("interactions:action-reflow")
      var `interactionsColonaction-reflow`: DoAnyPhaseArg
      
      @JSName("interactions:after-action-reflow")
      var `interactionsColonafter-action-reflow`: DoAnyPhaseArg
      
      @JSName("interactions:before-action-reflow")
      var `interactionsColonbefore-action-reflow`: OmitDoAnyPhaseArgiEvent
    }
    object SignalArgs {
      
      inline def apply(
        `interactionsColonaction-reflow`: DoAnyPhaseArg,
        `interactionsColonafter-action-reflow`: DoAnyPhaseArg,
        `interactionsColonbefore-action-reflow`: OmitDoAnyPhaseArgiEvent
      ): SignalArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("interactions:action-reflow")(`interactionsColonaction-reflow`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:after-action-reflow")(`interactionsColonafter-action-reflow`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:before-action-reflow")(`interactionsColonbefore-action-reflow`.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignalArgs]
      }
      
      extension [Self <: SignalArgs](x: Self) {
        
        inline def `setInteractionsColonaction-reflow`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:action-reflow", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonafter-action-reflow`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:after-action-reflow", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonbefore-action-reflow`(value: OmitDoAnyPhaseArgiEvent): Self = StObject.set(x, "interactions:before-action-reflow", value.asInstanceOf[js.Any])
      }
    }
  }
}
