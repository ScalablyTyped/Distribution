package typings.materialTabIndicator

import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ACTIVE extends StObject {
    
    var ACTIVE: String = js.native
    
    var FADE: String = js.native
    
    var NO_TRANSITION: String = js.native
  }
  object ACTIVE {
    
    @scala.inline
    def apply(ACTIVE: String, FADE: String, NO_TRANSITION: String): ACTIVE = {
      val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], FADE = FADE.asInstanceOf[js.Any], NO_TRANSITION = NO_TRANSITION.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIVE]
    }
    
    @scala.inline
    implicit class ACTIVEMutableBuilder[Self <: ACTIVE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACTIVE(value: String): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFADE(value: String): Self = StObject.set(x, "FADE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNO_TRANSITION(value: String): Self = StObject.set(x, "NO_TRANSITION", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CONTENTSELECTOR extends StObject {
    
    var CONTENT_SELECTOR: String = js.native
  }
  object CONTENTSELECTOR {
    
    @scala.inline
    def apply(CONTENT_SELECTOR: String): CONTENTSELECTOR = {
      val __obj = js.Dynamic.literal(CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[CONTENTSELECTOR]
    }
    
    @scala.inline
    implicit class CONTENTSELECTORMutableBuilder[Self <: CONTENTSELECTOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCONTENT_SELECTOR(value: String): Self = StObject.set(x, "CONTENT_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tab-indicator.@material/tab-indicator/adapter.MDCTabIndicatorAdapter> */
  @js.native
  trait PartialMDCTabIndicatorAda extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var computeContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCTabIndicatorAda {
    
    @scala.inline
    def apply(): PartialMDCTabIndicatorAda = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabIndicatorAda]
    }
    
    @scala.inline
    implicit class PartialMDCTabIndicatorAdaMutableBuilder[Self <: PartialMDCTabIndicatorAda] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setComputeContentClientRect(value: () => ClientRect): Self = StObject.set(x, "computeContentClientRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComputeContentClientRectUndefined: Self = StObject.set(x, "computeContentClientRect", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetContentStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setContentStyleProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetContentStylePropertyUndefined: Self = StObject.set(x, "setContentStyleProperty", js.undefined)
    }
  }
}
