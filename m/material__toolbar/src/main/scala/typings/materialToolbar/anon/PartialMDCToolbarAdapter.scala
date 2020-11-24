package typings.materialToolbar.anon

import typings.materialBase.typesMod.SpecificEventListener
import typings.materialToolbar.materialToolbarStrings.resize
import typings.materialToolbar.materialToolbarStrings.scroll
import typings.materialToolbar.typesMod.MDCToolbarEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/toolbar.@material/toolbar/adapter.MDCToolbarAdapter> */
@js.native
trait PartialMDCToolbarAdapter extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  
  var deregisterScrollHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[scroll], Unit]] = js.native
  
  var getFirstRowElementOffsetHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var getViewportScrollY: js.UndefOr[js.Function0[Double]] = js.native
  
  var getViewportWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCToolbarEventDetail, Unit]] = js.native
  
  var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  
  var registerScrollHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[scroll], Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setStyle: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
  
  var setStyleForFixedAdjustElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
  
  var setStyleForFlexibleRowElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
  
  var setStyleForTitleElement: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCToolbarAdapter {
  
  @scala.inline
  def apply(): PartialMDCToolbarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCToolbarAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCToolbarAdapterOps[Self <: PartialMDCToolbarAdapter] (val x: Self) extends AnyVal {
    
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
    def setDeregisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("deregisterResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeregisterResizeHandler: Self = this.set("deregisterResizeHandler", js.undefined)
    
    @scala.inline
    def setDeregisterScrollHandler(value: /* handler */ SpecificEventListener[scroll] => Unit): Self = this.set("deregisterScrollHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeregisterScrollHandler: Self = this.set("deregisterScrollHandler", js.undefined)
    
    @scala.inline
    def setGetFirstRowElementOffsetHeight(value: () => Double): Self = this.set("getFirstRowElementOffsetHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFirstRowElementOffsetHeight: Self = this.set("getFirstRowElementOffsetHeight", js.undefined)
    
    @scala.inline
    def setGetOffsetHeight(value: () => Double): Self = this.set("getOffsetHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetHeight: Self = this.set("getOffsetHeight", js.undefined)
    
    @scala.inline
    def setGetViewportScrollY(value: () => Double): Self = this.set("getViewportScrollY", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetViewportScrollY: Self = this.set("getViewportScrollY", js.undefined)
    
    @scala.inline
    def setGetViewportWidth(value: () => Double): Self = this.set("getViewportWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetViewportWidth: Self = this.set("getViewportWidth", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setNotifyChange(value: /* evtData */ MDCToolbarEventDetail => Unit): Self = this.set("notifyChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyChange: Self = this.set("notifyChange", js.undefined)
    
    @scala.inline
    def setRegisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("registerResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterResizeHandler: Self = this.set("registerResizeHandler", js.undefined)
    
    @scala.inline
    def setRegisterScrollHandler(value: /* handler */ SpecificEventListener[scroll] => Unit): Self = this.set("registerScrollHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterScrollHandler: Self = this.set("registerScrollHandler", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetStyle(value: (/* property */ String, /* value */ String) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    
    @scala.inline
    def setSetStyleForFixedAdjustElement(value: (/* property */ String, /* value */ String) => Unit): Self = this.set("setStyleForFixedAdjustElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyleForFixedAdjustElement: Self = this.set("setStyleForFixedAdjustElement", js.undefined)
    
    @scala.inline
    def setSetStyleForFlexibleRowElement(value: (/* property */ String, /* value */ String) => Unit): Self = this.set("setStyleForFlexibleRowElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyleForFlexibleRowElement: Self = this.set("setStyleForFlexibleRowElement", js.undefined)
    
    @scala.inline
    def setSetStyleForTitleElement(value: (/* property */ String, /* value */ String) => Unit): Self = this.set("setStyleForTitleElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyleForTitleElement: Self = this.set("setStyleForTitleElement", js.undefined)
  }
}
