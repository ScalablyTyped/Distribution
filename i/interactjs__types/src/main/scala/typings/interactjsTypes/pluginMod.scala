package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.interactEventMod.EventPhase
import typings.interactjsTypes.interactEventMod.InteractEvent
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.start
import typings.interactjsTypes.interactjsTypesStrings.x
import typings.interactjsTypes.interactjsTypesStrings.xy
import typings.interactjsTypes.interactjsTypesStrings.y
import typings.interactjsTypes.optionsMod.PerActionDefaults
import typings.interactjsTypes.scopeMod.Plugin
import typings.interactjsTypes.typesMod.ActionMethod
import typings.interactjsTypes.typesMod.Listener
import typings.interactjsTypes.typesMod.ListenerMap
import typings.interactjsTypes.typesMod.ListenersArg
import typings.interactjsTypes.typesMod.OrBoolean
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod extends Shortcut {
  
  @JSImport("@interactjs/actions/drag/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type DragEvent = InteractEvent[drag, EventPhase]
  
  type DraggableMethod = ActionMethod[DraggableOptions]
  
  trait DraggableOptions
    extends StObject
       with PerActionDefaults {
    
    var lockAxis: js.UndefOr[x | y | xy | start] = js.undefined
    
    var onend: js.UndefOr[ListenersArg] = js.undefined
    
    var oninertiastart: js.UndefOr[ListenersArg] = js.undefined
    
    var onmove: js.UndefOr[ListenersArg] = js.undefined
    
    var onstart: js.UndefOr[ListenersArg] = js.undefined
    
    var startAxis: js.UndefOr[x | y | xy] = js.undefined
  }
  object DraggableOptions {
    
    inline def apply(): DraggableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggableOptions]
    }
    
    extension [Self <: DraggableOptions](x: Self) {
      
      inline def setLockAxis(value: typings.interactjsTypes.interactjsTypesStrings.x | y | xy | start): Self = StObject.set(x, "lockAxis", value.asInstanceOf[js.Any])
      
      inline def setLockAxisUndefined: Self = StObject.set(x, "lockAxis", js.undefined)
      
      inline def setOnend(value: ListenersArg): Self = StObject.set(x, "onend", value.asInstanceOf[js.Any])
      
      inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
      
      inline def setOnendVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "onend", js.Array(value*))
      
      inline def setOninertiastart(value: ListenersArg): Self = StObject.set(x, "oninertiastart", value.asInstanceOf[js.Any])
      
      inline def setOninertiastartUndefined: Self = StObject.set(x, "oninertiastart", js.undefined)
      
      inline def setOninertiastartVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "oninertiastart", js.Array(value*))
      
      inline def setOnmove(value: ListenersArg): Self = StObject.set(x, "onmove", value.asInstanceOf[js.Any])
      
      inline def setOnmoveUndefined: Self = StObject.set(x, "onmove", js.undefined)
      
      inline def setOnmoveVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "onmove", js.Array(value*))
      
      inline def setOnstart(value: ListenersArg): Self = StObject.set(x, "onstart", value.asInstanceOf[js.Any])
      
      inline def setOnstartUndefined: Self = StObject.set(x, "onstart", js.undefined)
      
      inline def setOnstartVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "onstart", js.Array(value*))
      
      inline def setStartAxis(value: typings.interactjsTypes.interactjsTypesStrings.x | y | xy): Self = StObject.set(x, "startAxis", value.asInstanceOf[js.Any])
      
      inline def setStartAxisUndefined: Self = StObject.set(x, "startAxis", js.undefined)
    }
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pluginMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    trait Interactable extends StObject {
      
      def draggable(): DraggableOptions
      def draggable(options: Boolean): Any
      def draggable(options: Partial[OrBoolean[DraggableOptions]]): Any
      @JSName("draggable")
      var draggable_Original: DraggableMethod
    }
    object Interactable {
      
      inline def apply(draggable: DraggableMethod): Interactable = {
        val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any])
        __obj.asInstanceOf[Interactable]
      }
      
      extension [Self <: Interactable](x: Self) {
        
        inline def setDraggable(value: DraggableMethod): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait ActionDefaults extends StObject {
      
      var drag: DraggableOptions
    }
    object ActionDefaults {
      
      inline def apply(drag: DraggableOptions): ActionDefaults = {
        val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any])
        __obj.asInstanceOf[ActionDefaults]
      }
      
      extension [Self <: ActionDefaults](x: Self) {
        
        inline def setDrag(value: DraggableOptions): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreTypesAugmentingMod {
    
    trait ActionMap extends StObject {
      
      var drag: js.UndefOr[Plugin] = js.undefined
    }
    object ActionMap {
      
      inline def apply(): ActionMap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActionMap]
      }
      
      extension [Self <: ActionMap](x: Self) {
        
        inline def setDrag(value: Plugin): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
        
        inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      }
    }
  }
}
