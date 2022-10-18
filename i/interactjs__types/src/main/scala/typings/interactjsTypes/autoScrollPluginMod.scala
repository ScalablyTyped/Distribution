package typings.interactjsTypes

import typings.interactjsTypes.anon.Check
import typings.interactjsTypes.anon.ElementElement
import typings.interactjsTypes.anon.ElementElementInteractionPartial
import typings.interactjsTypes.anon.ElementInteraction
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.anon.InteractionPartial
import typings.interactjsTypes.anon.X
import typings.interactjsTypes.anon.Y
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoScrollPluginMod {
  
  @JSImport("@interactjs/auto-scroll/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@interactjs/auto-scroll/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  inline def getContainer(value: Any, interactable: InteractableActions, element: Element): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")(value.asInstanceOf[js.Any], interactable.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getScroll(container: Any): Y = ^.asInstanceOf[js.Dynamic].applyDynamic("getScroll")(container.asInstanceOf[js.Any]).asInstanceOf[Y]
  
  inline def getScrollSize(container: Any): Y = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollSize")(container.asInstanceOf[js.Any]).asInstanceOf[Y]
  
  inline def getScrollSizeDelta(hasInteractionElement: ElementElementInteractionPartial, func: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollSizeDelta")(hasInteractionElement.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getScrollSizeDelta(hasInteractionElement: ElementElement, func: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollSizeDelta")(hasInteractionElement.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getScrollSizeDelta(hasInteractionElement: ElementInteraction, func: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollSizeDelta")(hasInteractionElement.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getScrollSizeDelta(hasInteractionElement: InteractionPartial, func: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollSizeDelta")(hasInteractionElement.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[X]
  
  trait AutoScrollOptions extends StObject {
    
    var container: js.UndefOr[Window | HTMLElement | String] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object AutoScrollOptions {
    
    inline def apply(): AutoScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScrollOptions]
    }
    
    extension [Self <: AutoScrollOptions](x: Self) {
      
      inline def setContainer(value: Window | HTMLElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var autoScroll: js.UndefOr[Check] = js.undefined
    }
    object Interaction {
      
      inline def apply(): Interaction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Interaction]
      }
      
      extension [Self <: Interaction](x: Self) {
        
        inline def setAutoScroll(value: Check): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
        
        inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait PerActionDefaults extends StObject {
      
      var autoScroll: js.UndefOr[AutoScrollOptions] = js.undefined
    }
    object PerActionDefaults {
      
      inline def apply(): PerActionDefaults = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PerActionDefaults]
      }
      
      extension [Self <: PerActionDefaults](x: Self) {
        
        inline def setAutoScroll(value: AutoScrollOptions): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
        
        inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait Scope extends StObject {
      
      var autoScroll: Check
    }
    object Scope {
      
      inline def apply(autoScroll: Check): Scope = {
        val __obj = js.Dynamic.literal(autoScroll = autoScroll.asInstanceOf[js.Any])
        __obj.asInstanceOf[Scope]
      }
      
      extension [Self <: Scope](x: Self) {
        
        inline def setAutoScroll(value: Check): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
      }
    }
  }
}
