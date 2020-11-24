package typings.materialTabs.anon

import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTabs.materialTabsStrings.resize
import typings.materialTabs.typesMod.MDCTabBarChangeEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/tabs.@material/tabs/tab-bar/adapter.MDCTabBarAdapter> */
@js.native
trait PartialMDCTabBarAdapter extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var bindOnMDCTabSelectedEvent: js.UndefOr[js.Function0[Unit]] = js.native
  
  var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  
  var getComputedLeftForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  
  var getComputedWidthForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  
  var getNumberOfTabs: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetWidthForIndicator: js.UndefOr[js.Function0[Double]] = js.native
  
  var isDefaultPreventedOnClickForTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.native
  
  var isTabActiveAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.native
  
  var measureTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCTabBarChangeEventDetail, Unit]] = js.native
  
  var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setPreventDefaultOnClickForTabAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* preventDefaultOnClick */ Boolean, Unit]] = js.native
  
  var setStyleForIndicator: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
  
  var setTabActiveAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* isActive */ Boolean, Unit]] = js.native
  
  var unbindOnMDCTabSelectedEvent: js.UndefOr[js.Function0[Unit]] = js.native
}
object PartialMDCTabBarAdapter {
  
  @scala.inline
  def apply(): PartialMDCTabBarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTabBarAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCTabBarAdapterOps[Self <: PartialMDCTabBarAdapter] (val x: Self) extends AnyVal {
    
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
    def setBindOnMDCTabSelectedEvent(value: () => Unit): Self = this.set("bindOnMDCTabSelectedEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBindOnMDCTabSelectedEvent: Self = this.set("bindOnMDCTabSelectedEvent", js.undefined)
    
    @scala.inline
    def setDeregisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("deregisterResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeregisterResizeHandler: Self = this.set("deregisterResizeHandler", js.undefined)
    
    @scala.inline
    def setGetComputedLeftForTabAtIndex(value: /* index */ Double => Double): Self = this.set("getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetComputedLeftForTabAtIndex: Self = this.set("getComputedLeftForTabAtIndex", js.undefined)
    
    @scala.inline
    def setGetComputedWidthForTabAtIndex(value: /* index */ Double => Double): Self = this.set("getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetComputedWidthForTabAtIndex: Self = this.set("getComputedWidthForTabAtIndex", js.undefined)
    
    @scala.inline
    def setGetNumberOfTabs(value: () => Double): Self = this.set("getNumberOfTabs", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNumberOfTabs: Self = this.set("getNumberOfTabs", js.undefined)
    
    @scala.inline
    def setGetOffsetWidth(value: () => Double): Self = this.set("getOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetWidth: Self = this.set("getOffsetWidth", js.undefined)
    
    @scala.inline
    def setGetOffsetWidthForIndicator(value: () => Double): Self = this.set("getOffsetWidthForIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetWidthForIndicator: Self = this.set("getOffsetWidthForIndicator", js.undefined)
    
    @scala.inline
    def setIsDefaultPreventedOnClickForTabAtIndex(value: /* index */ Double => Boolean): Self = this.set("isDefaultPreventedOnClickForTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsDefaultPreventedOnClickForTabAtIndex: Self = this.set("isDefaultPreventedOnClickForTabAtIndex", js.undefined)
    
    @scala.inline
    def setIsTabActiveAtIndex(value: /* index */ Double => Boolean): Self = this.set("isTabActiveAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsTabActiveAtIndex: Self = this.set("isTabActiveAtIndex", js.undefined)
    
    @scala.inline
    def setMeasureTabAtIndex(value: /* index */ Double => Unit): Self = this.set("measureTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMeasureTabAtIndex: Self = this.set("measureTabAtIndex", js.undefined)
    
    @scala.inline
    def setNotifyChange(value: /* evtData */ MDCTabBarChangeEventDetail => Unit): Self = this.set("notifyChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyChange: Self = this.set("notifyChange", js.undefined)
    
    @scala.inline
    def setRegisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = this.set("registerResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterResizeHandler: Self = this.set("registerResizeHandler", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetPreventDefaultOnClickForTabAtIndex(value: (/* index */ Double, /* preventDefaultOnClick */ Boolean) => Unit): Self = this.set("setPreventDefaultOnClickForTabAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetPreventDefaultOnClickForTabAtIndex: Self = this.set("setPreventDefaultOnClickForTabAtIndex", js.undefined)
    
    @scala.inline
    def setSetStyleForIndicator(value: (/* propertyName */ String, /* value */ String) => Unit): Self = this.set("setStyleForIndicator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyleForIndicator: Self = this.set("setStyleForIndicator", js.undefined)
    
    @scala.inline
    def setSetTabActiveAtIndex(value: (/* index */ Double, /* isActive */ Boolean) => Unit): Self = this.set("setTabActiveAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetTabActiveAtIndex: Self = this.set("setTabActiveAtIndex", js.undefined)
    
    @scala.inline
    def setUnbindOnMDCTabSelectedEvent(value: () => Unit): Self = this.set("unbindOnMDCTabSelectedEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnbindOnMDCTabSelectedEvent: Self = this.set("unbindOnMDCTabSelectedEvent", js.undefined)
  }
}
