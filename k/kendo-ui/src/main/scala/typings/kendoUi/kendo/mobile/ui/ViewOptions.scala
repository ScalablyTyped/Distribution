package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewOptions extends StObject {
  
  var afterShow: js.UndefOr[js.Function1[/* e */ ViewAfterShowEvent, Unit]] = js.native
  
  var beforeHide: js.UndefOr[js.Function1[/* e */ ViewBeforeHideEvent, Unit]] = js.native
  
  var beforeShow: js.UndefOr[js.Function1[/* e */ ViewBeforeShowEvent, Unit]] = js.native
  
  var hide: js.UndefOr[js.Function1[/* e */ ViewHideEvent, Unit]] = js.native
  
  var init: js.UndefOr[js.Function1[/* e */ ViewInitEvent, Unit]] = js.native
  
  var model: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var reload: js.UndefOr[Boolean] = js.native
  
  var scroller: js.UndefOr[js.Any] = js.native
  
  var show: js.UndefOr[js.Function1[/* e */ ViewShowEvent, Unit]] = js.native
  
  var stretch: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var transitionEnd: js.UndefOr[js.Function1[/* e */ ViewTransitionEndEvent, Unit]] = js.native
  
  var transitionStart: js.UndefOr[js.Function1[/* e */ ViewTransitionStartEvent, Unit]] = js.native
  
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[Boolean] = js.native
}
object ViewOptions {
  
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  
  @scala.inline
  implicit class ViewOptionsMutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterShow(value: /* e */ ViewAfterShowEvent => Unit): Self = StObject.set(x, "afterShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    @scala.inline
    def setBeforeHide(value: /* e */ ViewBeforeHideEvent => Unit): Self = StObject.set(x, "beforeHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeHideUndefined: Self = StObject.set(x, "beforeHide", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: /* e */ ViewBeforeShowEvent => Unit): Self = StObject.set(x, "beforeShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setHide(value: /* e */ ViewHideEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setInit(value: /* e */ ViewInitEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    
    @scala.inline
    def setScroller(value: js.Any): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
    
    @scala.inline
    def setShow(value: /* e */ ViewShowEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransitionEnd(value: /* e */ ViewTransitionEndEvent => Unit): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
    
    @scala.inline
    def setTransitionStart(value: /* e */ ViewTransitionStartEvent => Unit): Self = StObject.set(x, "transitionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransitionStartUndefined: Self = StObject.set(x, "transitionStart", js.undefined)
    
    @scala.inline
    def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
