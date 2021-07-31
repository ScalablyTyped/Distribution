package typings.materialTabScroller

import typings.std.ClientRect
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ANIMATING extends StObject {
    
    var ANIMATING: String
    
    var SCROLL_AREA_SCROLL: String
    
    var SCROLL_TEST: String
  }
  object ANIMATING {
    
    @scala.inline
    def apply(ANIMATING: String, SCROLL_AREA_SCROLL: String, SCROLL_TEST: String): ANIMATING = {
      val __obj = js.Dynamic.literal(ANIMATING = ANIMATING.asInstanceOf[js.Any], SCROLL_AREA_SCROLL = SCROLL_AREA_SCROLL.asInstanceOf[js.Any], SCROLL_TEST = SCROLL_TEST.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANIMATING]
    }
    
    @scala.inline
    implicit class ANIMATINGMutableBuilder[Self <: ANIMATING] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setANIMATING(value: String): Self = StObject.set(x, "ANIMATING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCROLL_AREA_SCROLL(value: String): Self = StObject.set(x, "SCROLL_AREA_SCROLL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCROLL_TEST(value: String): Self = StObject.set(x, "SCROLL_TEST", value.asInstanceOf[js.Any])
    }
  }
  
  trait AREASELECTOR extends StObject {
    
    var AREA_SELECTOR: String
    
    var CONTENT_SELECTOR: String
  }
  object AREASELECTOR {
    
    @scala.inline
    def apply(AREA_SELECTOR: String, CONTENT_SELECTOR: String): AREASELECTOR = {
      val __obj = js.Dynamic.literal(AREA_SELECTOR = AREA_SELECTOR.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[AREASELECTOR]
    }
    
    @scala.inline
    implicit class AREASELECTORMutableBuilder[Self <: AREASELECTOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAREA_SELECTOR(value: String): Self = StObject.set(x, "AREA_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONTENT_SELECTOR(value: String): Self = StObject.set(x, "CONTENT_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tab-scroller.@material/tab-scroller/adapter.MDCTabScrollerAdapter> */
  trait PartialMDCTabScrollerAdap extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var addScrollAreaClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var computeHorizontalScrollbarHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var computeScrollAreaClientRect: js.UndefOr[js.Function0[ClientRect]] = js.undefined
    
    var computeScrollContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.undefined
    
    var eventTargetMatchesSelector: js.UndefOr[js.Function2[/* evtTarget */ EventTarget, /* selector */ String, Boolean]] = js.undefined
    
    var getScrollAreaOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getScrollAreaScrollLeft: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getScrollContentOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getScrollContentStyleValue: js.UndefOr[js.Function1[/* propertyName */ String, String]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setScrollAreaScrollLeft: js.UndefOr[js.Function1[/* scrollLeft */ Double, Unit]] = js.undefined
    
    var setScrollAreaStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
    
    var setScrollContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCTabScrollerAdap {
    
    @scala.inline
    def apply(): PartialMDCTabScrollerAdap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabScrollerAdap]
    }
    
    @scala.inline
    implicit class PartialMDCTabScrollerAdapMutableBuilder[Self <: PartialMDCTabScrollerAdap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setAddScrollAreaClass(value: /* className */ String => Unit): Self = StObject.set(x, "addScrollAreaClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddScrollAreaClassUndefined: Self = StObject.set(x, "addScrollAreaClass", js.undefined)
      
      @scala.inline
      def setComputeHorizontalScrollbarHeight(value: () => Double): Self = StObject.set(x, "computeHorizontalScrollbarHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComputeHorizontalScrollbarHeightUndefined: Self = StObject.set(x, "computeHorizontalScrollbarHeight", js.undefined)
      
      @scala.inline
      def setComputeScrollAreaClientRect(value: () => ClientRect): Self = StObject.set(x, "computeScrollAreaClientRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComputeScrollAreaClientRectUndefined: Self = StObject.set(x, "computeScrollAreaClientRect", js.undefined)
      
      @scala.inline
      def setComputeScrollContentClientRect(value: () => ClientRect): Self = StObject.set(x, "computeScrollContentClientRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComputeScrollContentClientRectUndefined: Self = StObject.set(x, "computeScrollContentClientRect", js.undefined)
      
      @scala.inline
      def setEventTargetMatchesSelector(value: (/* evtTarget */ EventTarget, /* selector */ String) => Boolean): Self = StObject.set(x, "eventTargetMatchesSelector", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEventTargetMatchesSelectorUndefined: Self = StObject.set(x, "eventTargetMatchesSelector", js.undefined)
      
      @scala.inline
      def setGetScrollAreaOffsetWidth(value: () => Double): Self = StObject.set(x, "getScrollAreaOffsetWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollAreaOffsetWidthUndefined: Self = StObject.set(x, "getScrollAreaOffsetWidth", js.undefined)
      
      @scala.inline
      def setGetScrollAreaScrollLeft(value: () => Double): Self = StObject.set(x, "getScrollAreaScrollLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollAreaScrollLeftUndefined: Self = StObject.set(x, "getScrollAreaScrollLeft", js.undefined)
      
      @scala.inline
      def setGetScrollContentOffsetWidth(value: () => Double): Self = StObject.set(x, "getScrollContentOffsetWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollContentOffsetWidthUndefined: Self = StObject.set(x, "getScrollContentOffsetWidth", js.undefined)
      
      @scala.inline
      def setGetScrollContentStyleValue(value: /* propertyName */ String => String): Self = StObject.set(x, "getScrollContentStyleValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetScrollContentStyleValueUndefined: Self = StObject.set(x, "getScrollContentStyleValue", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetScrollAreaScrollLeft(value: /* scrollLeft */ Double => Unit): Self = StObject.set(x, "setScrollAreaScrollLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetScrollAreaScrollLeftUndefined: Self = StObject.set(x, "setScrollAreaScrollLeft", js.undefined)
      
      @scala.inline
      def setSetScrollAreaStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setScrollAreaStyleProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetScrollAreaStylePropertyUndefined: Self = StObject.set(x, "setScrollAreaStyleProperty", js.undefined)
      
      @scala.inline
      def setSetScrollContentStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setScrollContentStyleProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetScrollContentStylePropertyUndefined: Self = StObject.set(x, "setScrollContentStyleProperty", js.undefined)
    }
  }
}
