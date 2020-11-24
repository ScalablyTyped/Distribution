package typings.materialTabBar.anon

import typings.materialTab.typesMod.MDCTabDimensions
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/tab-bar.@material/tab-bar/adapter.MDCTabBarAdapter> */
@js.native
trait PartialMDCTabBarAdapter extends js.Object {
  
  var activateTabAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* clientRect */ js.UndefOr[ClientRect], Unit]] = js.native
  
  var deactivateTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var focusTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var getFocusedTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  
  var getIndexOfTabById: js.UndefOr[js.Function1[/* id */ String, Double]] = js.native
  
  var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getPreviousActiveTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  
  var getScrollContentWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.native
  
  var getTabDimensionsAtIndex: js.UndefOr[js.Function1[/* index */ Double, MDCTabDimensions]] = js.native
  
  var getTabIndicatorClientRectAtIndex: js.UndefOr[js.Function1[/* index */ Double, ClientRect]] = js.native
  
  var getTabListLength: js.UndefOr[js.Function0[Double]] = js.native
  
  var incrementScroll: js.UndefOr[js.Function1[/* scrollXIncrement */ Double, Unit]] = js.native
  
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var notifyTabActivated: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var scrollTo: js.UndefOr[js.Function1[/* scrollX */ Double, Unit]] = js.native
  
  var setActiveTab: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
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
    def setActivateTabAtIndex(value: (/* index */ Double, /* clientRect */ js.UndefOr[ClientRect]) => Unit): Self = this.set("activateTabAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActivateTabAtIndex: Self = this.set("activateTabAtIndex", js.undefined)
    
    @scala.inline
    def setDeactivateTabAtIndex(value: /* index */ Double => Unit): Self = this.set("deactivateTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeactivateTabAtIndex: Self = this.set("deactivateTabAtIndex", js.undefined)
    
    @scala.inline
    def setFocusTabAtIndex(value: /* index */ Double => Unit): Self = this.set("focusTabAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusTabAtIndex: Self = this.set("focusTabAtIndex", js.undefined)
    
    @scala.inline
    def setGetFocusedTabIndex(value: () => Double): Self = this.set("getFocusedTabIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFocusedTabIndex: Self = this.set("getFocusedTabIndex", js.undefined)
    
    @scala.inline
    def setGetIndexOfTabById(value: /* id */ String => Double): Self = this.set("getIndexOfTabById", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetIndexOfTabById: Self = this.set("getIndexOfTabById", js.undefined)
    
    @scala.inline
    def setGetOffsetWidth(value: () => Double): Self = this.set("getOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetWidth: Self = this.set("getOffsetWidth", js.undefined)
    
    @scala.inline
    def setGetPreviousActiveTabIndex(value: () => Double): Self = this.set("getPreviousActiveTabIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPreviousActiveTabIndex: Self = this.set("getPreviousActiveTabIndex", js.undefined)
    
    @scala.inline
    def setGetScrollContentWidth(value: () => Double): Self = this.set("getScrollContentWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollContentWidth: Self = this.set("getScrollContentWidth", js.undefined)
    
    @scala.inline
    def setGetScrollPosition(value: () => Double): Self = this.set("getScrollPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollPosition: Self = this.set("getScrollPosition", js.undefined)
    
    @scala.inline
    def setGetTabDimensionsAtIndex(value: /* index */ Double => MDCTabDimensions): Self = this.set("getTabDimensionsAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetTabDimensionsAtIndex: Self = this.set("getTabDimensionsAtIndex", js.undefined)
    
    @scala.inline
    def setGetTabIndicatorClientRectAtIndex(value: /* index */ Double => ClientRect): Self = this.set("getTabIndicatorClientRectAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetTabIndicatorClientRectAtIndex: Self = this.set("getTabIndicatorClientRectAtIndex", js.undefined)
    
    @scala.inline
    def setGetTabListLength(value: () => Double): Self = this.set("getTabListLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTabListLength: Self = this.set("getTabListLength", js.undefined)
    
    @scala.inline
    def setIncrementScroll(value: /* scrollXIncrement */ Double => Unit): Self = this.set("incrementScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIncrementScroll: Self = this.set("incrementScroll", js.undefined)
    
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setNotifyTabActivated(value: /* index */ Double => Unit): Self = this.set("notifyTabActivated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyTabActivated: Self = this.set("notifyTabActivated", js.undefined)
    
    @scala.inline
    def setScrollTo(value: /* scrollX */ Double => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    
    @scala.inline
    def setSetActiveTab(value: /* index */ Double => Unit): Self = this.set("setActiveTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveTab: Self = this.set("setActiveTab", js.undefined)
  }
}
