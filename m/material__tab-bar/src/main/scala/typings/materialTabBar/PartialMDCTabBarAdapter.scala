package typings.materialTabBar

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-bar.@material/tab-bar/adapter.MDCTabBarAdapter> */
trait PartialMDCTabBarAdapter extends js.Object {
  var activateTabAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* clientRect */ js.UndefOr[ClientRect], Unit]] = js.undefined
  var deactivateTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var focusTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var getFocusedTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  var getIndexOfTabById: js.UndefOr[js.Function1[/* id */ String, Double]] = js.undefined
  var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  var getPreviousActiveTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollContentWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.undefined
  var getTabDimensionsAtIndex: js.UndefOr[
    js.Function1[
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCTabDimensions */ _
    ]
  ] = js.undefined
  var getTabIndicatorClientRectAtIndex: js.UndefOr[js.Function1[/* index */ Double, ClientRect]] = js.undefined
  var getTabListLength: js.UndefOr[js.Function0[Double]] = js.undefined
  var incrementScroll: js.UndefOr[js.Function1[/* scrollXIncrement */ Double, Unit]] = js.undefined
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var notifyTabActivated: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var scrollTo: js.UndefOr[js.Function1[/* scrollX */ Double, Unit]] = js.undefined
  var setActiveTab: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
}

object PartialMDCTabBarAdapter {
  @scala.inline
  def apply(
    activateTabAtIndex: (/* index */ Double, /* clientRect */ js.UndefOr[ClientRect]) => Unit = null,
    deactivateTabAtIndex: /* index */ Double => Unit = null,
    focusTabAtIndex: /* index */ Double => Unit = null,
    getFocusedTabIndex: () => Double = null,
    getIndexOfTabById: /* id */ String => Double = null,
    getOffsetWidth: () => Double = null,
    getPreviousActiveTabIndex: () => Double = null,
    getScrollContentWidth: () => Double = null,
    getScrollPosition: () => Double = null,
    getTabDimensionsAtIndex: /* index */ Double => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCTabDimensions */ _ = null,
    getTabIndicatorClientRectAtIndex: /* index */ Double => ClientRect = null,
    getTabListLength: () => Double = null,
    incrementScroll: /* scrollXIncrement */ Double => Unit = null,
    isRTL: () => Boolean = null,
    notifyTabActivated: /* index */ Double => Unit = null,
    scrollTo: /* scrollX */ Double => Unit = null,
    setActiveTab: /* index */ Double => Unit = null
  ): PartialMDCTabBarAdapter = {
    val __obj = js.Dynamic.literal()
    if (activateTabAtIndex != null) __obj.updateDynamic("activateTabAtIndex")(js.Any.fromFunction2(activateTabAtIndex))
    if (deactivateTabAtIndex != null) __obj.updateDynamic("deactivateTabAtIndex")(js.Any.fromFunction1(deactivateTabAtIndex))
    if (focusTabAtIndex != null) __obj.updateDynamic("focusTabAtIndex")(js.Any.fromFunction1(focusTabAtIndex))
    if (getFocusedTabIndex != null) __obj.updateDynamic("getFocusedTabIndex")(js.Any.fromFunction0(getFocusedTabIndex))
    if (getIndexOfTabById != null) __obj.updateDynamic("getIndexOfTabById")(js.Any.fromFunction1(getIndexOfTabById))
    if (getOffsetWidth != null) __obj.updateDynamic("getOffsetWidth")(js.Any.fromFunction0(getOffsetWidth))
    if (getPreviousActiveTabIndex != null) __obj.updateDynamic("getPreviousActiveTabIndex")(js.Any.fromFunction0(getPreviousActiveTabIndex))
    if (getScrollContentWidth != null) __obj.updateDynamic("getScrollContentWidth")(js.Any.fromFunction0(getScrollContentWidth))
    if (getScrollPosition != null) __obj.updateDynamic("getScrollPosition")(js.Any.fromFunction0(getScrollPosition))
    if (getTabDimensionsAtIndex != null) __obj.updateDynamic("getTabDimensionsAtIndex")(js.Any.fromFunction1(getTabDimensionsAtIndex))
    if (getTabIndicatorClientRectAtIndex != null) __obj.updateDynamic("getTabIndicatorClientRectAtIndex")(js.Any.fromFunction1(getTabIndicatorClientRectAtIndex))
    if (getTabListLength != null) __obj.updateDynamic("getTabListLength")(js.Any.fromFunction0(getTabListLength))
    if (incrementScroll != null) __obj.updateDynamic("incrementScroll")(js.Any.fromFunction1(incrementScroll))
    if (isRTL != null) __obj.updateDynamic("isRTL")(js.Any.fromFunction0(isRTL))
    if (notifyTabActivated != null) __obj.updateDynamic("notifyTabActivated")(js.Any.fromFunction1(notifyTabActivated))
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction1(scrollTo))
    if (setActiveTab != null) __obj.updateDynamic("setActiveTab")(js.Any.fromFunction1(setActiveTab))
    __obj.asInstanceOf[PartialMDCTabBarAdapter]
  }
}

