package typings.materialTabIndicator

import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ACTIVE extends StObject {
    
    var ACTIVE: String
    
    var FADE: String
    
    var NO_TRANSITION: String
  }
  object ACTIVE {
    
    inline def apply(ACTIVE: String, FADE: String, NO_TRANSITION: String): ACTIVE = {
      val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], FADE = FADE.asInstanceOf[js.Any], NO_TRANSITION = NO_TRANSITION.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIVE]
    }
    
    extension [Self <: ACTIVE](x: Self) {
      
      inline def setACTIVE(value: String): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
      
      inline def setFADE(value: String): Self = StObject.set(x, "FADE", value.asInstanceOf[js.Any])
      
      inline def setNO_TRANSITION(value: String): Self = StObject.set(x, "NO_TRANSITION", value.asInstanceOf[js.Any])
    }
  }
  
  trait CONTENTSELECTOR extends StObject {
    
    var CONTENT_SELECTOR: String
  }
  object CONTENTSELECTOR {
    
    inline def apply(CONTENT_SELECTOR: String): CONTENTSELECTOR = {
      val __obj = js.Dynamic.literal(CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[CONTENTSELECTOR]
    }
    
    extension [Self <: CONTENTSELECTOR](x: Self) {
      
      inline def setCONTENT_SELECTOR(value: String): Self = StObject.set(x, "CONTENT_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tab-indicator.@material/tab-indicator/adapter.MDCTabIndicatorAdapter> */
  trait PartialMDCTabIndicatorAda extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var computeContentClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCTabIndicatorAda {
    
    inline def apply(): PartialMDCTabIndicatorAda = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabIndicatorAda]
    }
    
    extension [Self <: PartialMDCTabIndicatorAda](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setComputeContentClientRect(value: () => DOMRect): Self = StObject.set(x, "computeContentClientRect", js.Any.fromFunction0(value))
      
      inline def setComputeContentClientRectUndefined: Self = StObject.set(x, "computeContentClientRect", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetContentStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setContentStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetContentStylePropertyUndefined: Self = StObject.set(x, "setContentStyleProperty", js.undefined)
    }
  }
}
