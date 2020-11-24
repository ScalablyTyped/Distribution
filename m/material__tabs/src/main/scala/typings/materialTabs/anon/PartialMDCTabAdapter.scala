package typings.materialTabs.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/tabs.@material/tabs/tab/adapter.MDCTabAdapter> */
@js.native
trait PartialMDCTabAdapter extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var deregisterInteractionHandler: js.UndefOr[
    js.Function2[/* type */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var getOffsetLeft: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var notifySelected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var registerInteractionHandler: js.UndefOr[
    js.Function2[/* type */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setDeregisterInteractionHandler(value: (/* type */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeregisterInteractionHandler: Self = this.set("deregisterInteractionHandler", js.undefined)
    
    @scala.inline
    def setGetOffsetLeft(value: () => Double): Self = this.set("getOffsetLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetLeft: Self = this.set("getOffsetLeft", js.undefined)
    
    @scala.inline
    def setGetOffsetWidth(value: () => Double): Self = this.set("getOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetWidth: Self = this.set("getOffsetWidth", js.undefined)
    
    @scala.inline
    def setNotifySelected(value: () => Unit): Self = this.set("notifySelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifySelected: Self = this.set("notifySelected", js.undefined)
    
    @scala.inline
    def setRegisterInteractionHandler(value: (/* type */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegisterInteractionHandler: Self = this.set("registerInteractionHandler", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
  }
}
