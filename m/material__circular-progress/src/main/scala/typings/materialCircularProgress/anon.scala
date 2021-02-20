package typings.materialCircularProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ARIAVALUENOW extends StObject {
    
    var ARIA_VALUENOW: String = js.native
    
    var DETERMINATE_CIRCLE_SELECTOR: String = js.native
    
    var RADIUS: String = js.native
    
    var STROKE_DASHOFFSET: String = js.native
  }
  object ARIAVALUENOW {
    
    @scala.inline
    def apply(
      ARIA_VALUENOW: String,
      DETERMINATE_CIRCLE_SELECTOR: String,
      RADIUS: String,
      STROKE_DASHOFFSET: String
    ): ARIAVALUENOW = {
      val __obj = js.Dynamic.literal(ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], DETERMINATE_CIRCLE_SELECTOR = DETERMINATE_CIRCLE_SELECTOR.asInstanceOf[js.Any], RADIUS = RADIUS.asInstanceOf[js.Any], STROKE_DASHOFFSET = STROKE_DASHOFFSET.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIAVALUENOW]
    }
    
    @scala.inline
    implicit class ARIAVALUENOWMutableBuilder[Self <: ARIAVALUENOW] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARIA_VALUENOW(value: String): Self = StObject.set(x, "ARIA_VALUENOW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDETERMINATE_CIRCLE_SELECTOR(value: String): Self = StObject.set(x, "DETERMINATE_CIRCLE_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRADIUS(value: String): Self = StObject.set(x, "RADIUS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTROKE_DASHOFFSET(value: String): Self = StObject.set(x, "STROKE_DASHOFFSET", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CLOSEDCLASS extends StObject {
    
    var CLOSED_CLASS: String = js.native
    
    var INDETERMINATE_CLASS: String = js.native
  }
  object CLOSEDCLASS {
    
    @scala.inline
    def apply(CLOSED_CLASS: String, INDETERMINATE_CLASS: String): CLOSEDCLASS = {
      val __obj = js.Dynamic.literal(CLOSED_CLASS = CLOSED_CLASS.asInstanceOf[js.Any], INDETERMINATE_CLASS = INDETERMINATE_CLASS.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLOSEDCLASS]
    }
    
    @scala.inline
    implicit class CLOSEDCLASSMutableBuilder[Self <: CLOSEDCLASS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCLOSED_CLASS(value: String): Self = StObject.set(x, "CLOSED_CLASS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINDETERMINATE_CLASS(value: String): Self = StObject.set(x, "INDETERMINATE_CLASS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/circular-progress.@material/circular-progress/adapter.MDCCircularProgressAdapter> */
  @js.native
  trait PartialMDCCircularProgres extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var getDeterminateCircleAttribute: js.UndefOr[js.Function1[/* attributeName */ String, String | Null]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var removeAttribute: js.UndefOr[js.Function1[/* attributeName */ String, Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setAttribute: js.UndefOr[js.Function2[/* attributeName */ String, /* value */ String, Unit]] = js.native
    
    var setDeterminateCircleAttribute: js.UndefOr[js.Function2[/* attributeName */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCCircularProgres {
    
    @scala.inline
    def apply(): PartialMDCCircularProgres = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCCircularProgres]
    }
    
    @scala.inline
    implicit class PartialMDCCircularProgresMutableBuilder[Self <: PartialMDCCircularProgres] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setGetDeterminateCircleAttribute(value: /* attributeName */ String => String | Null): Self = StObject.set(x, "getDeterminateCircleAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDeterminateCircleAttributeUndefined: Self = StObject.set(x, "getDeterminateCircleAttribute", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setRemoveAttribute(value: /* attributeName */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAttributeUndefined: Self = StObject.set(x, "removeAttribute", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetAttribute(value: (/* attributeName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
      
      @scala.inline
      def setSetDeterminateCircleAttribute(value: (/* attributeName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setDeterminateCircleAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDeterminateCircleAttributeUndefined: Self = StObject.set(x, "setDeterminateCircleAttribute", js.undefined)
    }
  }
}
