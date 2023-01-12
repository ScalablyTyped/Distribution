package typings.materialCircularProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ARIAHIDDEN extends StObject {
    
    var ARIA_HIDDEN: String
    
    var ARIA_VALUENOW: String
    
    var DETERMINATE_CIRCLE_SELECTOR: String
    
    var RADIUS: String
    
    var STROKE_DASHOFFSET: String
  }
  object ARIAHIDDEN {
    
    inline def apply(
      ARIA_HIDDEN: String,
      ARIA_VALUENOW: String,
      DETERMINATE_CIRCLE_SELECTOR: String,
      RADIUS: String,
      STROKE_DASHOFFSET: String
    ): ARIAHIDDEN = {
      val __obj = js.Dynamic.literal(ARIA_HIDDEN = ARIA_HIDDEN.asInstanceOf[js.Any], ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], DETERMINATE_CIRCLE_SELECTOR = DETERMINATE_CIRCLE_SELECTOR.asInstanceOf[js.Any], RADIUS = RADIUS.asInstanceOf[js.Any], STROKE_DASHOFFSET = STROKE_DASHOFFSET.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIAHIDDEN]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ARIAHIDDEN] (val x: Self) extends AnyVal {
      
      inline def setARIA_HIDDEN(value: String): Self = StObject.set(x, "ARIA_HIDDEN", value.asInstanceOf[js.Any])
      
      inline def setARIA_VALUENOW(value: String): Self = StObject.set(x, "ARIA_VALUENOW", value.asInstanceOf[js.Any])
      
      inline def setDETERMINATE_CIRCLE_SELECTOR(value: String): Self = StObject.set(x, "DETERMINATE_CIRCLE_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setRADIUS(value: String): Self = StObject.set(x, "RADIUS", value.asInstanceOf[js.Any])
      
      inline def setSTROKE_DASHOFFSET(value: String): Self = StObject.set(x, "STROKE_DASHOFFSET", value.asInstanceOf[js.Any])
    }
  }
  
  trait CLOSEDCLASS extends StObject {
    
    var CLOSED_CLASS: String
    
    var INDETERMINATE_CLASS: String
  }
  object CLOSEDCLASS {
    
    inline def apply(CLOSED_CLASS: String, INDETERMINATE_CLASS: String): CLOSEDCLASS = {
      val __obj = js.Dynamic.literal(CLOSED_CLASS = CLOSED_CLASS.asInstanceOf[js.Any], INDETERMINATE_CLASS = INDETERMINATE_CLASS.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLOSEDCLASS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CLOSEDCLASS] (val x: Self) extends AnyVal {
      
      inline def setCLOSED_CLASS(value: String): Self = StObject.set(x, "CLOSED_CLASS", value.asInstanceOf[js.Any])
      
      inline def setINDETERMINATE_CLASS(value: String): Self = StObject.set(x, "INDETERMINATE_CLASS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/circular-progress.@material/circular-progress/adapter.MDCCircularProgressAdapter> */
  trait PartialMDCCircularProgres extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var getDeterminateCircleAttribute: js.UndefOr[js.Function1[/* attributeName */ String, String | Null]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var removeAttribute: js.UndefOr[js.Function1[/* attributeName */ String, Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setAttribute: js.UndefOr[js.Function2[/* attributeName */ String, /* value */ String, Unit]] = js.undefined
    
    var setDeterminateCircleAttribute: js.UndefOr[js.Function2[/* attributeName */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCCircularProgres {
    
    inline def apply(): PartialMDCCircularProgres = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCCircularProgres]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCCircularProgres] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setGetDeterminateCircleAttribute(value: /* attributeName */ String => String | Null): Self = StObject.set(x, "getDeterminateCircleAttribute", js.Any.fromFunction1(value))
      
      inline def setGetDeterminateCircleAttributeUndefined: Self = StObject.set(x, "getDeterminateCircleAttribute", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setRemoveAttribute(value: /* attributeName */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setRemoveAttributeUndefined: Self = StObject.set(x, "removeAttribute", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetAttribute(value: (/* attributeName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetAttributeUndefined: Self = StObject.set(x, "setAttribute", js.undefined)
      
      inline def setSetDeterminateCircleAttribute(value: (/* attributeName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setDeterminateCircleAttribute", js.Any.fromFunction2(value))
      
      inline def setSetDeterminateCircleAttributeUndefined: Self = StObject.set(x, "setDeterminateCircleAttribute", js.undefined)
    }
  }
}
