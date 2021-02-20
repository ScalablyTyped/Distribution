package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollerOptions extends StObject {
  
  var elastic: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[ScrollerMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pull: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.native
  
  var pullOffset: js.UndefOr[Double] = js.native
  
  var pullToRefresh: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.native
  
  var scroll: js.UndefOr[js.Function1[/* e */ ScrollerScrollEvent, Unit]] = js.native
  
  var useNative: js.UndefOr[Boolean] = js.native
  
  var visibleScrollHints: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[Boolean] = js.native
}
object ScrollerOptions {
  
  @scala.inline
  def apply(): ScrollerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerOptions]
  }
  
  @scala.inline
  implicit class ScrollerOptionsMutableBuilder[Self <: ScrollerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElastic(value: Boolean): Self = StObject.set(x, "elastic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticUndefined: Self = StObject.set(x, "elastic", js.undefined)
    
    @scala.inline
    def setMessages(value: ScrollerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPull(value: /* e */ ScrollerEvent => Unit): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPullOffset(value: Double): Self = StObject.set(x, "pullOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullOffsetUndefined: Self = StObject.set(x, "pullOffset", js.undefined)
    
    @scala.inline
    def setPullToRefresh(value: Boolean): Self = StObject.set(x, "pullToRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullToRefreshUndefined: Self = StObject.set(x, "pullToRefresh", js.undefined)
    
    @scala.inline
    def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ ScrollerEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setScroll(value: /* e */ ScrollerScrollEvent => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
    
    @scala.inline
    def setVisibleScrollHints(value: Boolean): Self = StObject.set(x, "visibleScrollHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleScrollHintsUndefined: Self = StObject.set(x, "visibleScrollHints", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
