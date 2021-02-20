package typings.materialLinearProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ANIMATIONREADYCLASS extends StObject {
    
    var ANIMATION_READY_CLASS: String = js.native
    
    var CLOSED_ANIMATION_OFF_CLASS: String = js.native
    
    var CLOSED_CLASS: String = js.native
    
    var INDETERMINATE_CLASS: String = js.native
    
    var REVERSED_CLASS: String = js.native
  }
  object ANIMATIONREADYCLASS {
    
    @scala.inline
    def apply(
      ANIMATION_READY_CLASS: String,
      CLOSED_ANIMATION_OFF_CLASS: String,
      CLOSED_CLASS: String,
      INDETERMINATE_CLASS: String,
      REVERSED_CLASS: String
    ): ANIMATIONREADYCLASS = {
      val __obj = js.Dynamic.literal(ANIMATION_READY_CLASS = ANIMATION_READY_CLASS.asInstanceOf[js.Any], CLOSED_ANIMATION_OFF_CLASS = CLOSED_ANIMATION_OFF_CLASS.asInstanceOf[js.Any], CLOSED_CLASS = CLOSED_CLASS.asInstanceOf[js.Any], INDETERMINATE_CLASS = INDETERMINATE_CLASS.asInstanceOf[js.Any], REVERSED_CLASS = REVERSED_CLASS.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANIMATIONREADYCLASS]
    }
    
    @scala.inline
    implicit class ANIMATIONREADYCLASSMutableBuilder[Self <: ANIMATIONREADYCLASS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setANIMATION_READY_CLASS(value: String): Self = StObject.set(x, "ANIMATION_READY_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSED_ANIMATION_OFF_CLASS(value: String): Self = StObject.set(x, "CLOSED_ANIMATION_OFF_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSED_CLASS(value: String): Self = StObject.set(x, "CLOSED_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINDETERMINATE_CLASS(value: String): Self = StObject.set(x, "INDETERMINATE_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREVERSED_CLASS(value: String): Self = StObject.set(x, "REVERSED_CLASS", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ARIAVALUENOW extends StObject {
    
    var ARIA_VALUENOW: String = js.native
    
    var BUFFER_BAR_SELECTOR: String = js.native
    
    var FLEX_BASIS: String = js.native
    
    var PRIMARY_BAR_SELECTOR: String = js.native
  }
  object ARIAVALUENOW {
    
    @scala.inline
    def apply(
      ARIA_VALUENOW: String,
      BUFFER_BAR_SELECTOR: String,
      FLEX_BASIS: String,
      PRIMARY_BAR_SELECTOR: String
    ): ARIAVALUENOW = {
      val __obj = js.Dynamic.literal(ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], BUFFER_BAR_SELECTOR = BUFFER_BAR_SELECTOR.asInstanceOf[js.Any], FLEX_BASIS = FLEX_BASIS.asInstanceOf[js.Any], PRIMARY_BAR_SELECTOR = PRIMARY_BAR_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIAVALUENOW]
    }
    
    @scala.inline
    implicit class ARIAVALUENOWMutableBuilder[Self <: ARIAVALUENOW] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARIA_VALUENOW(value: String): Self = StObject.set(x, "ARIA_VALUENOW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUFFER_BAR_SELECTOR(value: String): Self = StObject.set(x, "BUFFER_BAR_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFLEX_BASIS(value: String): Self = StObject.set(x, "FLEX_BASIS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRIMARY_BAR_SELECTOR(value: String): Self = StObject.set(x, "PRIMARY_BAR_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/linear-progress.@material/linear-progress/adapter.MDCLinearProgressAdapter> */
  @js.native
  trait PartialMDCLinearProgressA extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var attachResizeObserver: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ /* callback */ js.Any, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ _) | Null
        ]
      ] = js.native
    
    var forceLayout: js.UndefOr[js.Function0[Unit]] = js.native
    
    var getWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var removeAttribute: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setAttribute: js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]] = js.native
    
    var setBufferBarStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.native
    
    var setPrimaryBarStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.native
    
    var setStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCLinearProgressA {
    
    @scala.inline
    def apply(): PartialMDCLinearProgressA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCLinearProgressA]
    }
    
    @scala.inline
    implicit class PartialMDCLinearProgressAMutableBuilder[Self <: PartialMDCLinearProgressA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setAttachResizeObserver(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ /* callback */ js.Any => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ _) | Null
      ): Self = StObject.set(x, "attachResizeObserver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttachResizeObserverUndefined: Self = StObject.set(x, "attachResizeObserver", js.undefined)
      
      @scala.inline
      def setForceLayout(value: () => Unit): Self = StObject.set(x, "forceLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setForceLayoutUndefined: Self = StObject.set(x, "forceLayout", js.undefined)
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setRemoveAttribute(value: /* name */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAttributeUndefined: Self = StObject.set(x, "removeAttribute", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetAttribute(value: (/* name */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
      
      @scala.inline
      def setSetBufferBarStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = StObject.set(x, "setBufferBarStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetBufferBarStyleUndefined: Self = StObject.set(x, "setBufferBarStyle", js.undefined)
      
      @scala.inline
      def setSetPrimaryBarStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = StObject.set(x, "setPrimaryBarStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetPrimaryBarStyleUndefined: Self = StObject.set(x, "setPrimaryBarStyle", js.undefined)
      
      @scala.inline
      def setSetStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    }
  }
}
