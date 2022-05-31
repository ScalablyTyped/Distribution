package typings.materialLinearProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ANIMATIONREADYCLASS extends StObject {
    
    var ANIMATION_READY_CLASS: String
    
    var CLOSED_ANIMATION_OFF_CLASS: String
    
    var CLOSED_CLASS: String
    
    var INDETERMINATE_CLASS: String
    
    var REVERSED_CLASS: String
  }
  object ANIMATIONREADYCLASS {
    
    inline def apply(
      ANIMATION_READY_CLASS: String,
      CLOSED_ANIMATION_OFF_CLASS: String,
      CLOSED_CLASS: String,
      INDETERMINATE_CLASS: String,
      REVERSED_CLASS: String
    ): ANIMATIONREADYCLASS = {
      val __obj = js.Dynamic.literal(ANIMATION_READY_CLASS = ANIMATION_READY_CLASS.asInstanceOf[js.Any], CLOSED_ANIMATION_OFF_CLASS = CLOSED_ANIMATION_OFF_CLASS.asInstanceOf[js.Any], CLOSED_CLASS = CLOSED_CLASS.asInstanceOf[js.Any], INDETERMINATE_CLASS = INDETERMINATE_CLASS.asInstanceOf[js.Any], REVERSED_CLASS = REVERSED_CLASS.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANIMATIONREADYCLASS]
    }
    
    extension [Self <: ANIMATIONREADYCLASS](x: Self) {
      
      inline def setANIMATION_READY_CLASS(value: String): Self = StObject.set(x, "ANIMATION_READY_CLASS", value.asInstanceOf[js.Any])
      
      inline def setCLOSED_ANIMATION_OFF_CLASS(value: String): Self = StObject.set(x, "CLOSED_ANIMATION_OFF_CLASS", value.asInstanceOf[js.Any])
      
      inline def setCLOSED_CLASS(value: String): Self = StObject.set(x, "CLOSED_CLASS", value.asInstanceOf[js.Any])
      
      inline def setINDETERMINATE_CLASS(value: String): Self = StObject.set(x, "INDETERMINATE_CLASS", value.asInstanceOf[js.Any])
      
      inline def setREVERSED_CLASS(value: String): Self = StObject.set(x, "REVERSED_CLASS", value.asInstanceOf[js.Any])
    }
  }
  
  trait ARIAVALUENOW extends StObject {
    
    var ARIA_VALUENOW: String
    
    var BUFFER_BAR_SELECTOR: String
    
    var FLEX_BASIS: String
    
    var PRIMARY_BAR_SELECTOR: String
  }
  object ARIAVALUENOW {
    
    inline def apply(
      ARIA_VALUENOW: String,
      BUFFER_BAR_SELECTOR: String,
      FLEX_BASIS: String,
      PRIMARY_BAR_SELECTOR: String
    ): ARIAVALUENOW = {
      val __obj = js.Dynamic.literal(ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], BUFFER_BAR_SELECTOR = BUFFER_BAR_SELECTOR.asInstanceOf[js.Any], FLEX_BASIS = FLEX_BASIS.asInstanceOf[js.Any], PRIMARY_BAR_SELECTOR = PRIMARY_BAR_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIAVALUENOW]
    }
    
    extension [Self <: ARIAVALUENOW](x: Self) {
      
      inline def setARIA_VALUENOW(value: String): Self = StObject.set(x, "ARIA_VALUENOW", value.asInstanceOf[js.Any])
      
      inline def setBUFFER_BAR_SELECTOR(value: String): Self = StObject.set(x, "BUFFER_BAR_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setFLEX_BASIS(value: String): Self = StObject.set(x, "FLEX_BASIS", value.asInstanceOf[js.Any])
      
      inline def setPRIMARY_BAR_SELECTOR(value: String): Self = StObject.set(x, "PRIMARY_BAR_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/linear-progress.@material/linear-progress/adapter.MDCLinearProgressAdapter> */
  trait PartialMDCLinearProgressA extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var attachResizeObserver: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ /* callback */ js.Any, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ js.Any) | Null
        ]
      ] = js.undefined
    
    var forceLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var removeAttribute: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setAttribute: js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]] = js.undefined
    
    var setBufferBarStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.undefined
    
    var setPrimaryBarStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.undefined
    
    var setStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCLinearProgressA {
    
    inline def apply(): PartialMDCLinearProgressA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCLinearProgressA]
    }
    
    extension [Self <: PartialMDCLinearProgressA](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setAttachResizeObserver(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ /* callback */ js.Any => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ js.Any) | Null
      ): Self = StObject.set(x, "attachResizeObserver", js.Any.fromFunction1(value))
      
      inline def setAttachResizeObserverUndefined: Self = StObject.set(x, "attachResizeObserver", js.undefined)
      
      inline def setForceLayout(value: () => Unit): Self = StObject.set(x, "forceLayout", js.Any.fromFunction0(value))
      
      inline def setForceLayoutUndefined: Self = StObject.set(x, "forceLayout", js.undefined)
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setRemoveAttribute(value: /* name */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setRemoveAttributeUndefined: Self = StObject.set(x, "removeAttribute", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetAttribute(value: (/* name */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
      
      inline def setSetBufferBarStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = StObject.set(x, "setBufferBarStyle", js.Any.fromFunction2(value))
      
      inline def setSetBufferBarStyleUndefined: Self = StObject.set(x, "setBufferBarStyle", js.undefined)
      
      inline def setSetPrimaryBarStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = StObject.set(x, "setPrimaryBarStyle", js.Any.fromFunction2(value))
      
      inline def setSetPrimaryBarStyleUndefined: Self = StObject.set(x, "setPrimaryBarStyle", js.undefined)
      
      inline def setSetStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    }
  }
}
