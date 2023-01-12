package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreOptionsMod.PerActionDefaults
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreTypesMod.ActionMethod
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.EdgeOptions
import typings.interactjsTypes.coreTypesMod.FullRect
import typings.interactjsTypes.coreTypesMod.Listener
import typings.interactjsTypes.coreTypesMod.ListenerMap
import typings.interactjsTypes.coreTypesMod.ListenersArg
import typings.interactjsTypes.coreTypesMod.OrBoolean
import typings.interactjsTypes.interactjsTypesStrings.negate
import typings.interactjsTypes.interactjsTypesStrings.none
import typings.interactjsTypes.interactjsTypesStrings.reposition
import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.interactjsTypes.interactjsTypesStrings.x
import typings.interactjsTypes.interactjsTypesStrings.xy
import typings.interactjsTypes.interactjsTypesStrings.y
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsResizePluginMod extends Shortcut {
  
  @JSImport("@interactjs/actions/resize/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.interactjsTypes.interactjsTypesStrings.top
    - typings.interactjsTypes.interactjsTypesStrings.left
    - typings.interactjsTypes.interactjsTypesStrings.bottom
    - typings.interactjsTypes.interactjsTypesStrings.right
  */
  trait EdgeName extends StObject
  object EdgeName {
    
    inline def bottom: typings.interactjsTypes.interactjsTypesStrings.bottom = "bottom".asInstanceOf[typings.interactjsTypes.interactjsTypesStrings.bottom]
    
    inline def left: typings.interactjsTypes.interactjsTypesStrings.left = "left".asInstanceOf[typings.interactjsTypes.interactjsTypesStrings.left]
    
    inline def right: typings.interactjsTypes.interactjsTypesStrings.right = "right".asInstanceOf[typings.interactjsTypes.interactjsTypesStrings.right]
    
    inline def top: typings.interactjsTypes.interactjsTypesStrings.top = "top".asInstanceOf[typings.interactjsTypes.interactjsTypesStrings.top]
  }
  
  type ResizableMethod = ActionMethod[ResizableOptions]
  
  trait ResizableOptions
    extends StObject
       with PerActionDefaults {
    
    var axis: js.UndefOr[x | y | xy] = js.undefined
    
    var edges: js.UndefOr[EdgeOptions | Null] = js.undefined
    
    var invert: js.UndefOr[none | negate | reposition] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var onend: js.UndefOr[ListenersArg] = js.undefined
    
    var oninertiastart: js.UndefOr[ListenersArg] = js.undefined
    
    var onmove: js.UndefOr[ListenersArg] = js.undefined
    
    var onstart: js.UndefOr[ListenersArg] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var square: js.UndefOr[Boolean] = js.undefined
    
    var squareResize: js.UndefOr[Boolean] = js.undefined
  }
  object ResizableOptions {
    
    inline def apply(): ResizableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizableOptions] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: typings.interactjsTypes.interactjsTypesStrings.x | y | xy): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setEdges(value: EdgeOptions): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesNull: Self = StObject.set(x, "edges", null)
      
      inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      inline def setInvert(value: none | negate | reposition): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
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
      
      inline def setPreserveAspectRatio(value: Boolean): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareResize(value: Boolean): Self = StObject.set(x, "squareResize", value.asInstanceOf[js.Any])
      
      inline def setSquareResizeUndefined: Self = StObject.set(x, "squareResize", js.undefined)
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    }
  }
  
  @js.native
  trait ResizeEvent[P /* <: EventPhase */] extends InteractEvent[resize, P] {
    
    var deltaRect: js.UndefOr[FullRect] = js.native
    
    var edges: js.UndefOr[EdgeOptions | Null] = js.native
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `actionsResizePluginMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    trait Interactable extends StObject {
      
      def resizable(): ResizableOptions
      def resizable(options: Boolean): Any
      def resizable(options: Partial[OrBoolean[ResizableOptions]]): Any
      @JSName("resizable")
      var resizable_Original: ResizableMethod
    }
    object Interactable {
      
      inline def apply(resizable: ResizableMethod): Interactable = {
        val __obj = js.Dynamic.literal(resizable = resizable.asInstanceOf[js.Any])
        __obj.asInstanceOf[Interactable]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Interactable] (val x: Self) extends AnyVal {
        
        inline def setResizable(value: ResizableMethod): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction[T /* <: ActionName | Null */] extends StObject {
      
      var resizeAxes: x | y | xy
      
      var resizeStartAspectRatio: Double
    }
    object Interaction {
      
      inline def apply[T /* <: ActionName | Null */](resizeAxes: x | y | xy, resizeStartAspectRatio: Double): Interaction[T] = {
        val __obj = js.Dynamic.literal(resizeAxes = resizeAxes.asInstanceOf[js.Any], resizeStartAspectRatio = resizeStartAspectRatio.asInstanceOf[js.Any])
        __obj.asInstanceOf[Interaction[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Interaction[?], T /* <: ActionName | Null */] (val x: Self & Interaction[T]) extends AnyVal {
        
        inline def setResizeAxes(value: typings.interactjsTypes.interactjsTypesStrings.x | y | xy): Self = StObject.set(x, "resizeAxes", value.asInstanceOf[js.Any])
        
        inline def setResizeStartAspectRatio(value: Double): Self = StObject.set(x, "resizeStartAspectRatio", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait ActionDefaults extends StObject {
      
      var resize: ResizableOptions
    }
    object ActionDefaults {
      
      inline def apply(resize: ResizableOptions): ActionDefaults = {
        val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any])
        __obj.asInstanceOf[ActionDefaults]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ActionDefaults] (val x: Self) extends AnyVal {
        
        inline def setResize(value: ResizableOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreTypesAugmentingMod {
    
    trait ActionMap extends StObject {
      
      var resize: js.UndefOr[Plugin] = js.undefined
    }
    object ActionMap {
      
      inline def apply(): ActionMap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActionMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ActionMap] (val x: Self) extends AnyVal {
        
        inline def setResize(value: Plugin): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
        
        inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      }
    }
  }
}
