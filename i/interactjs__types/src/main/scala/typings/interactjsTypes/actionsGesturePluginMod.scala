package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.anon.Distance
import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreInteractionMod.DoPhaseArg
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreOptionsMod.PerActionDefaults
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreTypesMod.ActionMethod
import typings.interactjsTypes.coreTypesMod.Listener
import typings.interactjsTypes.coreTypesMod.ListenerMap
import typings.interactjsTypes.coreTypesMod.ListenersArg
import typings.interactjsTypes.coreTypesMod.OrBoolean
import typings.interactjsTypes.coreTypesMod.PointerEventType
import typings.interactjsTypes.coreTypesMod.PointerType
import typings.interactjsTypes.coreTypesMod.Rect
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsGesturePluginMod extends Shortcut {
  
  @JSImport("@interactjs/actions/gesture/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type GesturableMethod = ActionMethod[GesturableOptions]
  
  trait GesturableOptions
    extends StObject
       with PerActionDefaults {
    
    var onend: js.UndefOr[ListenersArg] = js.undefined
    
    var onmove: js.UndefOr[ListenersArg] = js.undefined
    
    var onstart: js.UndefOr[ListenersArg] = js.undefined
  }
  object GesturableOptions {
    
    inline def apply(): GesturableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GesturableOptions]
    }
    
    extension [Self <: GesturableOptions](x: Self) {
      
      inline def setOnend(value: ListenersArg): Self = StObject.set(x, "onend", value.asInstanceOf[js.Any])
      
      inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
      
      inline def setOnendVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "onend", js.Array(value*))
      
      inline def setOnmove(value: ListenersArg): Self = StObject.set(x, "onmove", value.asInstanceOf[js.Any])
      
      inline def setOnmoveUndefined: Self = StObject.set(x, "onmove", js.undefined)
      
      inline def setOnmoveVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "onmove", js.Array(value*))
      
      inline def setOnstart(value: ListenersArg): Self = StObject.set(x, "onstart", value.asInstanceOf[js.Any])
      
      inline def setOnstartUndefined: Self = StObject.set(x, "onstart", js.undefined)
      
      inline def setOnstartVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "onstart", js.Array(value*))
    }
  }
  
  @js.native
  trait GestureEvent extends InteractEvent[gesture, EventPhase] {
    
    var angle: Double = js.native
    
    var box: Rect = js.native
    
    var da: Double = js.native
    
    var distance: Double = js.native
    
    var ds: Double = js.native
    
    var scale: Double = js.native
    
    var touches: js.Array[PointerType] = js.native
  }
  
  trait GestureSignalArg
    extends StObject
       with DoPhaseArg[gesture, EventPhase] {
    
    @JSName("iEvent")
    var iEvent_GestureSignalArg: GestureEvent
  }
  object GestureSignalArg {
    
    inline def apply(
      event: PointerEventType,
      iEvent: GestureEvent,
      interaction: Interaction[gesture],
      phase: EventPhase
    ): GestureSignalArg = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], iEvent = iEvent.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureSignalArg]
    }
    
    extension [Self <: GestureSignalArg](x: Self) {
      
      inline def setIEvent(value: GestureEvent): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `actionsGesturePluginMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    trait Interactable extends StObject {
      
      def gesturable(): GesturableOptions
      def gesturable(options: Boolean): Any
      def gesturable(options: Partial[OrBoolean[GesturableOptions]]): Any
      @JSName("gesturable")
      var gesturable_Original: GesturableMethod
    }
    object Interactable {
      
      inline def apply(gesturable: GesturableMethod): Interactable = {
        val __obj = js.Dynamic.literal(gesturable = gesturable.asInstanceOf[js.Any])
        __obj.asInstanceOf[Interactable]
      }
      
      extension [Self <: Interactable](x: Self) {
        
        inline def setGesturable(value: GesturableMethod): Self = StObject.set(x, "gesturable", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var gesture: js.UndefOr[Distance] = js.undefined
    }
    object Interaction {
      
      inline def apply(): typings.interactjsTypes.actionsGesturePluginMod.interactjsCoreInteractionAugmentingMod.Interaction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.interactjsTypes.actionsGesturePluginMod.interactjsCoreInteractionAugmentingMod.Interaction]
      }
      
      extension [Self <: typings.interactjsTypes.actionsGesturePluginMod.interactjsCoreInteractionAugmentingMod.Interaction](x: Self) {
        
        inline def setGesture(value: Distance): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
        
        inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait ActionDefaults extends StObject {
      
      var gesture: GesturableOptions
    }
    object ActionDefaults {
      
      inline def apply(gesture: GesturableOptions): ActionDefaults = {
        val __obj = js.Dynamic.literal(gesture = gesture.asInstanceOf[js.Any])
        __obj.asInstanceOf[ActionDefaults]
      }
      
      extension [Self <: ActionDefaults](x: Self) {
        
        inline def setGesture(value: GesturableOptions): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreTypesAugmentingMod {
    
    trait ActionMap extends StObject {
      
      var gesture: js.UndefOr[Plugin] = js.undefined
    }
    object ActionMap {
      
      inline def apply(): ActionMap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActionMap]
      }
      
      extension [Self <: ActionMap](x: Self) {
        
        inline def setGesture(value: Plugin): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
        
        inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
      }
    }
  }
}
