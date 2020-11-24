package typings.materialBanner.anon

import typings.materialBanner.constantsMod.CloseReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/banner.@material/banner/adapter.MDCBannerAdapter> */
@js.native
trait PartialMDCBannerAdapter extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var getContentHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var notifyClosed: js.UndefOr[js.Function1[/* reason */ CloseReason, Unit]] = js.native
  
  var notifyClosing: js.UndefOr[js.Function1[/* reason */ CloseReason, Unit]] = js.native
  
  var notifyOpened: js.UndefOr[js.Function0[Unit]] = js.native
  
  var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCBannerAdapter {
  
  @scala.inline
  def apply(): PartialMDCBannerAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCBannerAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCBannerAdapterOps[Self <: PartialMDCBannerAdapter] (val x: Self) extends AnyVal {
    
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
    def setGetContentHeight(value: () => Double): Self = this.set("getContentHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContentHeight: Self = this.set("getContentHeight", js.undefined)
    
    @scala.inline
    def setNotifyClosed(value: /* reason */ CloseReason => Unit): Self = this.set("notifyClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyClosed: Self = this.set("notifyClosed", js.undefined)
    
    @scala.inline
    def setNotifyClosing(value: /* reason */ CloseReason => Unit): Self = this.set("notifyClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyClosing: Self = this.set("notifyClosing", js.undefined)
    
    @scala.inline
    def setNotifyOpened(value: () => Unit): Self = this.set("notifyOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyOpened: Self = this.set("notifyOpened", js.undefined)
    
    @scala.inline
    def setNotifyOpening(value: () => Unit): Self = this.set("notifyOpening", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyOpening: Self = this.set("notifyOpening", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = this.set("setStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyleProperty: Self = this.set("setStyleProperty", js.undefined)
  }
}
