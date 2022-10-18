package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.anon.AllowResume
import typings.interactjsTypes.anon.OmitDoPhaseArgActionNamei
import typings.interactjsTypes.anon.OmitDoPhaseArgActionNamer
import typings.interactjsTypes.anon.PointerArgPropstypedown
import typings.interactjsTypes.coreInteractionMod.DoPhaseArg
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.PointerEventType
import typings.interactjsTypes.interactjsTypesBooleans.`true`
import typings.interactjsTypes.interactjsTypesStrings.inertiastart
import typings.interactjsTypes.interactjsTypesStrings.resume
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import typings.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inertiaPluginMod extends Shortcut {
  
  @JSImport("@interactjs/inertia/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  @JSImport("@interactjs/inertia/plugin", "InertiaState")
  @js.native
  open class InertiaState protected () extends StObject {
    def this(interaction: Interaction[ActionName]) = this()
    
    var active: Boolean = js.native
    
    var allowResume: Boolean = js.native
    
    var currentOffset: Point = js.native
    
    def end(): Unit = js.native
    
    def inertiaTick(): Unit = js.native
    
    val interaction: Interaction[ActionName] = js.native
    
    var isModified: Boolean = js.native
    
    var lambda_v0: js.UndefOr[Double] = js.native
    
    var modification: typings.interactjsTypes.modifiersModificationMod.default = js.native
    
    var modifiedOffset: Point = js.native
    
    var modifierArg: ModifierArg[ModifierState[Any, Any, Any]] = js.native
    
    var modifierCount: Double = js.native
    
    def onNextFrame(tickFn: js.Function0[Unit]): Unit = js.native
    
    var one_ve_v0: js.UndefOr[Double] = js.native
    
    def resume(hasPointerEventEventTarget: PointerArgPropstypedown): Unit = js.native
    
    var smoothEnd: Boolean = js.native
    
    def smoothEndTick(): Unit = js.native
    
    def start(event: PointerEventType): Boolean = js.native
    
    var startCoords: Point = js.native
    
    def startInertia(): Unit = js.native
    
    def startSmoothEnd(): Unit = js.native
    
    def stop(): Unit = js.native
    
    var t0: Double = js.native
    
    var targetOffset: Point = js.native
    
    var te: Double = js.native
    
    var timeout: Double = js.native
    
    var v0: Double = js.native
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `inertiaPluginMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractEventAugmentingMod {
    
    trait PhaseMap extends StObject {
      
      var inertiastart: js.UndefOr[`true`] = js.undefined
      
      var resume: js.UndefOr[`true`] = js.undefined
    }
    object PhaseMap {
      
      inline def apply(): PhaseMap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PhaseMap]
      }
      
      extension [Self <: PhaseMap](x: Self) {
        
        inline def setInertiastart(value: `true`): Self = StObject.set(x, "inertiastart", value.asInstanceOf[js.Any])
        
        inline def setInertiastartUndefined: Self = StObject.set(x, "inertiastart", js.undefined)
        
        inline def setResume(value: `true`): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
        
        inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var inertia: js.UndefOr[InertiaState] = js.undefined
    }
    object Interaction {
      
      inline def apply(): typings.interactjsTypes.inertiaPluginMod.interactjsCoreInteractionAugmentingMod.Interaction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.interactjsTypes.inertiaPluginMod.interactjsCoreInteractionAugmentingMod.Interaction]
      }
      
      extension [Self <: typings.interactjsTypes.inertiaPluginMod.interactjsCoreInteractionAugmentingMod.Interaction](x: Self) {
        
        inline def setInertia(value: InertiaState): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
        
        inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait PerActionDefaults extends StObject {
      
      var inertia: js.UndefOr[AllowResume] = js.undefined
    }
    object PerActionDefaults {
      
      inline def apply(): PerActionDefaults = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PerActionDefaults]
      }
      
      extension [Self <: PerActionDefaults](x: Self) {
        
        inline def setInertia(value: AllowResume): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
        
        inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait SignalArgs extends StObject {
      
      @JSName("interactions:action-inertiastart")
      var `interactionsColonaction-inertiastart`: DoPhaseArg[ActionName, inertiastart]
      
      @JSName("interactions:action-resume")
      var `interactionsColonaction-resume`: DoPhaseArg[ActionName, resume]
      
      @JSName("interactions:after-action-inertiastart")
      var `interactionsColonafter-action-inertiastart`: DoPhaseArg[ActionName, inertiastart]
      
      @JSName("interactions:after-action-resume")
      var `interactionsColonafter-action-resume`: DoPhaseArg[ActionName, resume]
      
      @JSName("interactions:before-action-inertiastart")
      var `interactionsColonbefore-action-inertiastart`: OmitDoPhaseArgActionNamei
      
      @JSName("interactions:before-action-resume")
      var `interactionsColonbefore-action-resume`: OmitDoPhaseArgActionNamer
    }
    object SignalArgs {
      
      inline def apply(
        `interactionsColonaction-inertiastart`: DoPhaseArg[ActionName, inertiastart],
        `interactionsColonaction-resume`: DoPhaseArg[ActionName, resume],
        `interactionsColonafter-action-inertiastart`: DoPhaseArg[ActionName, inertiastart],
        `interactionsColonafter-action-resume`: DoPhaseArg[ActionName, resume],
        `interactionsColonbefore-action-inertiastart`: OmitDoPhaseArgActionNamei,
        `interactionsColonbefore-action-resume`: OmitDoPhaseArgActionNamer
      ): SignalArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("interactions:action-inertiastart")(`interactionsColonaction-inertiastart`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:action-resume")(`interactionsColonaction-resume`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:after-action-inertiastart")(`interactionsColonafter-action-inertiastart`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:after-action-resume")(`interactionsColonafter-action-resume`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:before-action-inertiastart")(`interactionsColonbefore-action-inertiastart`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:before-action-resume")(`interactionsColonbefore-action-resume`.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignalArgs]
      }
      
      extension [Self <: SignalArgs](x: Self) {
        
        inline def `setInteractionsColonaction-inertiastart`(value: DoPhaseArg[ActionName, inertiastart]): Self = StObject.set(x, "interactions:action-inertiastart", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonaction-resume`(value: DoPhaseArg[ActionName, resume]): Self = StObject.set(x, "interactions:action-resume", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonafter-action-inertiastart`(value: DoPhaseArg[ActionName, inertiastart]): Self = StObject.set(x, "interactions:after-action-inertiastart", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonafter-action-resume`(value: DoPhaseArg[ActionName, resume]): Self = StObject.set(x, "interactions:after-action-resume", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonbefore-action-inertiastart`(value: OmitDoPhaseArgActionNamei): Self = StObject.set(x, "interactions:before-action-inertiastart", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonbefore-action-resume`(value: OmitDoPhaseArgActionNamer): Self = StObject.set(x, "interactions:before-action-resume", value.asInstanceOf[js.Any])
      }
    }
  }
}
