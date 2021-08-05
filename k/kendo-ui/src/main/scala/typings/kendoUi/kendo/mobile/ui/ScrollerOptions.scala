package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollerOptions extends StObject {
  
  var elastic: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[ScrollerMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pull: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.undefined
  
  var pullOffset: js.UndefOr[Double] = js.undefined
  
  var pullToRefresh: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.undefined
  
  var scroll: js.UndefOr[js.Function1[/* e */ ScrollerScrollEvent, Unit]] = js.undefined
  
  var useNative: js.UndefOr[Boolean] = js.undefined
  
  var visibleScrollHints: js.UndefOr[Boolean] = js.undefined
  
  var zoom: js.UndefOr[Boolean] = js.undefined
}
object ScrollerOptions {
  
  inline def apply(): ScrollerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerOptions]
  }
  
  extension [Self <: ScrollerOptions](x: Self) {
    
    inline def setElastic(value: Boolean): Self = StObject.set(x, "elastic", value.asInstanceOf[js.Any])
    
    inline def setElasticUndefined: Self = StObject.set(x, "elastic", js.undefined)
    
    inline def setMessages(value: ScrollerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPull(value: /* e */ ScrollerEvent => Unit): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullOffset(value: Double): Self = StObject.set(x, "pullOffset", value.asInstanceOf[js.Any])
    
    inline def setPullOffsetUndefined: Self = StObject.set(x, "pullOffset", js.undefined)
    
    inline def setPullToRefresh(value: Boolean): Self = StObject.set(x, "pullToRefresh", value.asInstanceOf[js.Any])
    
    inline def setPullToRefreshUndefined: Self = StObject.set(x, "pullToRefresh", js.undefined)
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setResize(value: /* e */ ScrollerEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setScroll(value: /* e */ ScrollerScrollEvent => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
    
    inline def setVisibleScrollHints(value: Boolean): Self = StObject.set(x, "visibleScrollHints", value.asInstanceOf[js.Any])
    
    inline def setVisibleScrollHintsUndefined: Self = StObject.set(x, "visibleScrollHints", js.undefined)
    
    inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
