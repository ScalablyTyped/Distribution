package typings.materialTabScroller.anon

import typings.std.ClientRect
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/tab-scroller.@material/tab-scroller/adapter.MDCTabScrollerAdapter> */
@js.native
trait PartialMDCTabScrollerAdap extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var addScrollAreaClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var computeHorizontalScrollbarHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var computeScrollAreaClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  
  var computeScrollContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  
  var eventTargetMatchesSelector: js.UndefOr[js.Function2[/* evtTarget */ EventTarget, /* selector */ String, Boolean]] = js.native
  
  var getScrollAreaOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getScrollAreaScrollLeft: js.UndefOr[js.Function0[Double]] = js.native
  
  var getScrollContentOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getScrollContentStyleValue: js.UndefOr[js.Function1[/* propertyName */ String, String]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setScrollAreaScrollLeft: js.UndefOr[js.Function1[/* scrollLeft */ Double, Unit]] = js.native
  
  var setScrollAreaStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.native
  
  var setScrollContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCTabScrollerAdap {
  
  @scala.inline
  def apply(): PartialMDCTabScrollerAdap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTabScrollerAdap]
  }
  
  @scala.inline
  implicit class PartialMDCTabScrollerAdapOps[Self <: PartialMDCTabScrollerAdap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setAddScrollAreaClass(value: /* className */ String => Unit): Self = this.set("addScrollAreaClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddScrollAreaClass: Self = this.set("addScrollAreaClass", js.undefined)
    
    @scala.inline
    def setComputeHorizontalScrollbarHeight(value: () => Double): Self = this.set("computeHorizontalScrollbarHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComputeHorizontalScrollbarHeight: Self = this.set("computeHorizontalScrollbarHeight", js.undefined)
    
    @scala.inline
    def setComputeScrollAreaClientRect(value: () => ClientRect): Self = this.set("computeScrollAreaClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComputeScrollAreaClientRect: Self = this.set("computeScrollAreaClientRect", js.undefined)
    
    @scala.inline
    def setComputeScrollContentClientRect(value: () => ClientRect): Self = this.set("computeScrollContentClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComputeScrollContentClientRect: Self = this.set("computeScrollContentClientRect", js.undefined)
    
    @scala.inline
    def setEventTargetMatchesSelector(value: (/* evtTarget */ EventTarget, /* selector */ String) => Boolean): Self = this.set("eventTargetMatchesSelector", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEventTargetMatchesSelector: Self = this.set("eventTargetMatchesSelector", js.undefined)
    
    @scala.inline
    def setGetScrollAreaOffsetWidth(value: () => Double): Self = this.set("getScrollAreaOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollAreaOffsetWidth: Self = this.set("getScrollAreaOffsetWidth", js.undefined)
    
    @scala.inline
    def setGetScrollAreaScrollLeft(value: () => Double): Self = this.set("getScrollAreaScrollLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollAreaScrollLeft: Self = this.set("getScrollAreaScrollLeft", js.undefined)
    
    @scala.inline
    def setGetScrollContentOffsetWidth(value: () => Double): Self = this.set("getScrollContentOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollContentOffsetWidth: Self = this.set("getScrollContentOffsetWidth", js.undefined)
    
    @scala.inline
    def setGetScrollContentStyleValue(value: /* propertyName */ String => String): Self = this.set("getScrollContentStyleValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetScrollContentStyleValue: Self = this.set("getScrollContentStyleValue", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetScrollAreaScrollLeft(value: /* scrollLeft */ Double => Unit): Self = this.set("setScrollAreaScrollLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetScrollAreaScrollLeft: Self = this.set("setScrollAreaScrollLeft", js.undefined)
    
    @scala.inline
    def setSetScrollAreaStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = this.set("setScrollAreaStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetScrollAreaStyleProperty: Self = this.set("setScrollAreaStyleProperty", js.undefined)
    
    @scala.inline
    def setSetScrollContentStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = this.set("setScrollContentStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetScrollContentStyleProperty: Self = this.set("setScrollContentStyleProperty", js.undefined)
  }
}
