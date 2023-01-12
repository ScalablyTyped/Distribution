package typings.materialTabScroller

import typings.std.DOMRect
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
    
    inline def apply(ANIMATING: String, SCROLL_AREA_SCROLL: String, SCROLL_TEST: String): ANIMATING = {
      val __obj = js.Dynamic.literal(ANIMATING = ANIMATING.asInstanceOf[js.Any], SCROLL_AREA_SCROLL = SCROLL_AREA_SCROLL.asInstanceOf[js.Any], SCROLL_TEST = SCROLL_TEST.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANIMATING]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ANIMATING] (val x: Self) extends AnyVal {
      
      inline def setANIMATING(value: String): Self = StObject.set(x, "ANIMATING", value.asInstanceOf[js.Any])
      
      inline def setSCROLL_AREA_SCROLL(value: String): Self = StObject.set(x, "SCROLL_AREA_SCROLL", value.asInstanceOf[js.Any])
      
      inline def setSCROLL_TEST(value: String): Self = StObject.set(x, "SCROLL_TEST", value.asInstanceOf[js.Any])
    }
  }
  
  trait AREASELECTOR extends StObject {
    
    var AREA_SELECTOR: String
    
    var CONTENT_SELECTOR: String
  }
  object AREASELECTOR {
    
    inline def apply(AREA_SELECTOR: String, CONTENT_SELECTOR: String): AREASELECTOR = {
      val __obj = js.Dynamic.literal(AREA_SELECTOR = AREA_SELECTOR.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[AREASELECTOR]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AREASELECTOR] (val x: Self) extends AnyVal {
      
      inline def setAREA_SELECTOR(value: String): Self = StObject.set(x, "AREA_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setCONTENT_SELECTOR(value: String): Self = StObject.set(x, "CONTENT_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/tab-scroller.@material/tab-scroller/adapter.MDCTabScrollerAdapter> */
  trait PartialMDCTabScrollerAdap extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var addScrollAreaClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var computeHorizontalScrollbarHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var computeScrollAreaClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
    
    var computeScrollContentClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
    
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
    
    inline def apply(): PartialMDCTabScrollerAdap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTabScrollerAdap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCTabScrollerAdap] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setAddScrollAreaClass(value: /* className */ String => Unit): Self = StObject.set(x, "addScrollAreaClass", js.Any.fromFunction1(value))
      
      inline def setAddScrollAreaClassUndefined: Self = StObject.set(x, "addScrollAreaClass", js.undefined)
      
      inline def setComputeHorizontalScrollbarHeight(value: () => Double): Self = StObject.set(x, "computeHorizontalScrollbarHeight", js.Any.fromFunction0(value))
      
      inline def setComputeHorizontalScrollbarHeightUndefined: Self = StObject.set(x, "computeHorizontalScrollbarHeight", js.undefined)
      
      inline def setComputeScrollAreaClientRect(value: () => DOMRect): Self = StObject.set(x, "computeScrollAreaClientRect", js.Any.fromFunction0(value))
      
      inline def setComputeScrollAreaClientRectUndefined: Self = StObject.set(x, "computeScrollAreaClientRect", js.undefined)
      
      inline def setComputeScrollContentClientRect(value: () => DOMRect): Self = StObject.set(x, "computeScrollContentClientRect", js.Any.fromFunction0(value))
      
      inline def setComputeScrollContentClientRectUndefined: Self = StObject.set(x, "computeScrollContentClientRect", js.undefined)
      
      inline def setEventTargetMatchesSelector(value: (/* evtTarget */ EventTarget, /* selector */ String) => Boolean): Self = StObject.set(x, "eventTargetMatchesSelector", js.Any.fromFunction2(value))
      
      inline def setEventTargetMatchesSelectorUndefined: Self = StObject.set(x, "eventTargetMatchesSelector", js.undefined)
      
      inline def setGetScrollAreaOffsetWidth(value: () => Double): Self = StObject.set(x, "getScrollAreaOffsetWidth", js.Any.fromFunction0(value))
      
      inline def setGetScrollAreaOffsetWidthUndefined: Self = StObject.set(x, "getScrollAreaOffsetWidth", js.undefined)
      
      inline def setGetScrollAreaScrollLeft(value: () => Double): Self = StObject.set(x, "getScrollAreaScrollLeft", js.Any.fromFunction0(value))
      
      inline def setGetScrollAreaScrollLeftUndefined: Self = StObject.set(x, "getScrollAreaScrollLeft", js.undefined)
      
      inline def setGetScrollContentOffsetWidth(value: () => Double): Self = StObject.set(x, "getScrollContentOffsetWidth", js.Any.fromFunction0(value))
      
      inline def setGetScrollContentOffsetWidthUndefined: Self = StObject.set(x, "getScrollContentOffsetWidth", js.undefined)
      
      inline def setGetScrollContentStyleValue(value: /* propertyName */ String => String): Self = StObject.set(x, "getScrollContentStyleValue", js.Any.fromFunction1(value))
      
      inline def setGetScrollContentStyleValueUndefined: Self = StObject.set(x, "getScrollContentStyleValue", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetScrollAreaScrollLeft(value: /* scrollLeft */ Double => Unit): Self = StObject.set(x, "setScrollAreaScrollLeft", js.Any.fromFunction1(value))
      
      inline def setSetScrollAreaScrollLeftUndefined: Self = StObject.set(x, "setScrollAreaScrollLeft", js.undefined)
      
      inline def setSetScrollAreaStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setScrollAreaStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetScrollAreaStylePropertyUndefined: Self = StObject.set(x, "setScrollAreaStyleProperty", js.undefined)
      
      inline def setSetScrollContentStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setScrollContentStyleProperty", js.Any.fromFunction2(value))
      
      inline def setSetScrollContentStylePropertyUndefined: Self = StObject.set(x, "setScrollContentStyleProperty", js.undefined)
    }
  }
}
