package typings.materialTab.anon

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/tab.@material/tab/adapter.MDCTabAdapter> */
@js.native
trait PartialMDCTabAdapter extends js.Object {
  
  var activateIndicator: js.UndefOr[js.Function1[/* previousIndicatorClientRect */ js.UndefOr[ClientRect], Unit]] = js.native
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var deactivateIndicator: js.UndefOr[js.Function0[Unit]] = js.native
  
  var focus: js.UndefOr[js.Function0[Unit]] = js.native
  
  var getContentOffsetLeft: js.UndefOr[js.Function0[Double]] = js.native
  
  var getContentOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetLeft: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var notifyInteracted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCTabAdapter {
  
  @scala.inline
  def apply(): PartialMDCTabAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTabAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCTabAdapterOps[Self <: PartialMDCTabAdapter] (val x: Self) extends AnyVal {
    
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
    def setActivateIndicator(value: /* previousIndicatorClientRect */ js.UndefOr[ClientRect] => Unit): Self = this.set("activateIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActivateIndicator: Self = this.set("activateIndicator", js.undefined)
    
    @scala.inline
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setDeactivateIndicator(value: () => Unit): Self = this.set("deactivateIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDeactivateIndicator: Self = this.set("deactivateIndicator", js.undefined)
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setGetContentOffsetLeft(value: () => Double): Self = this.set("getContentOffsetLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContentOffsetLeft: Self = this.set("getContentOffsetLeft", js.undefined)
    
    @scala.inline
    def setGetContentOffsetWidth(value: () => Double): Self = this.set("getContentOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContentOffsetWidth: Self = this.set("getContentOffsetWidth", js.undefined)
    
    @scala.inline
    def setGetOffsetLeft(value: () => Double): Self = this.set("getOffsetLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetLeft: Self = this.set("getOffsetLeft", js.undefined)
    
    @scala.inline
    def setGetOffsetWidth(value: () => Double): Self = this.set("getOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetWidth: Self = this.set("getOffsetWidth", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setNotifyInteracted(value: () => Unit): Self = this.set("notifyInteracted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyInteracted: Self = this.set("notifyInteracted", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetAttr: Self = this.set("setAttr", js.undefined)
  }
}
