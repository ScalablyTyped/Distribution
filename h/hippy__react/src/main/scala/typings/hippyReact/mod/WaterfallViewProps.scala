package typings.hippyReact.mod

import typings.hippyReact.anon.EndEdgePos
import typings.hippyReact.anon.Right
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallViewProps extends StObject {
  
  // Horizontal space between columns
  var columnSpacing: Double
  
  // Declare whether banner view exists
  var containBannerView: js.UndefOr[Boolean] = js.undefined
  
  // Declare whether PullFooter view exists
  var containPullFooter: js.UndefOr[Boolean] = js.undefined
  
  // Declare whether PullHeader view exists
  var containPullHeader: js.UndefOr[Boolean] = js.undefined
  
  // Inner content padding
  var contentInset: js.UndefOr[Right] = js.undefined
  
  /**
    * Specific the key of row, for better data diff
    * More info: https://reactjs.org/docs/lists-and-keys.html
    *
    * @param {number} index - Index Of data.
    * @returns {string}
    */
  var getItemKey: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  
  /**
    * Returns the style for specific index of row.
    *
    * @param {number} index - Index Of data.
    * @returns {Object}
    */
  var getItemStyle: js.UndefOr[js.Function1[/* index */ Double, Style]] = js.undefined
  
  /**
    * Each row have different type, it will be using at render recycle.
    *
    * @param {number} index - Index Of data.
    * @returns {string}
    */
  var getItemType: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
  
  // Scroll to offset after WaterfallView with data rendered
  var initialContentOffset: js.UndefOr[Double] = js.undefined
  
  // Vertical margin between items
  var interItemSpacing: Double
  
  // Specific number of waterfall column
  var numberOfColumns: Double
  
  // Number of total items
  var numberOfItems: Double
  
  // Called when the WaterfallView is scrolling to bottom.
  var onEndReached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  // Called on items exposed
  var onExposureReport: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  // Called when user swipe up WaterfallView to get more data on reaching the footer
  var onFooterPulling: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  // Called when user release the getting-more-data WaterfallView
  var onFooterReleased: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  // Called when user pulls the ListView down
  var onHeaderPulling: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  // Called when user release the pulling WaterfallView
  var onHeaderReleased: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  // Called on waterfall ready
  var onInitialListReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    *  Called when the row first layout or layout changed.
    *
    * @param {Object} evt - Layout event data
    * @param {number} evt.nativeEvent.x - The position X of component
    * @param {number} evt.nativeEvent.y - The position Y of component
    * @param {number} evt.nativeEvent.width - The width of component
    * @param {number} evt.nativeEvent.hegiht - The height of component
    * @param {number} index - Index of data.
    */
  var onItemLayout: js.UndefOr[js.Function2[/* evt */ LayoutEvent, /* index */ Double, Unit]] = js.undefined
  
  /**
    * Called when user scrolls WaterfallView
    *
    * @param {Object} evt - onScroll event
    * @param {number} evt.startEdgePos - Scrolled offset of List top edge
    * @param {number} evt.endEdgePos - Scrolled offset of List end edge
    * @param {number} evt.firstVisibleRowIndex - Index of the first list item at current visible screen
    * @param {number} evt.lastVisibleRowIndex - Index of the last list item at current visible screen
    * @param {Object[]} evt.visibleRowFrames - Frame info of current screen visible items
    * @param {number} evt.visibleRowFrames[].x - Current item's horizontal offset relative to ListView
    * @param {number} evt.visibleRowFrames[].y - Current item's vertical offset relative to ListView
    * @param {number} evt.visibleRowFrames[].width - Current item's width
    * @param {number} evt.visibleRowFrames[].height - Current item's height
    */
  var onScroll: js.UndefOr[js.Function1[/* evt */ EndEdgePos, Unit]] = js.undefined
  
  // Number of items to preload on reaching the listview end
  var preloadItemNumber: js.UndefOr[Double] = js.undefined
  
  // Return banner view element
  var renderBanner: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  
  /**
    * Passing the data and returns the row component.
    *
    * @param {Object} data - Data for row rendering
    * @returns {(React.Component | undefined)}
    */
  var renderItem: js.UndefOr[js.Function1[/* data */ DataItem, ReactElement]] = js.undefined
  
  var renderPullFooter: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  
  var renderPullHeader: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  
  var style: js.UndefOr[Style] = js.undefined
}
object WaterfallViewProps {
  
  inline def apply(columnSpacing: Double, interItemSpacing: Double, numberOfColumns: Double, numberOfItems: Double): WaterfallViewProps = {
    val __obj = js.Dynamic.literal(columnSpacing = columnSpacing.asInstanceOf[js.Any], interItemSpacing = interItemSpacing.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], numberOfItems = numberOfItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterfallViewProps]
  }
  
  extension [Self <: WaterfallViewProps](x: Self) {
    
    inline def setColumnSpacing(value: Double): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
    
    inline def setContainBannerView(value: Boolean): Self = StObject.set(x, "containBannerView", value.asInstanceOf[js.Any])
    
    inline def setContainBannerViewUndefined: Self = StObject.set(x, "containBannerView", js.undefined)
    
    inline def setContainPullFooter(value: Boolean): Self = StObject.set(x, "containPullFooter", value.asInstanceOf[js.Any])
    
    inline def setContainPullFooterUndefined: Self = StObject.set(x, "containPullFooter", js.undefined)
    
    inline def setContainPullHeader(value: Boolean): Self = StObject.set(x, "containPullHeader", value.asInstanceOf[js.Any])
    
    inline def setContainPullHeaderUndefined: Self = StObject.set(x, "containPullHeader", js.undefined)
    
    inline def setContentInset(value: Right): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    inline def setGetItemKey(value: /* index */ Double => String): Self = StObject.set(x, "getItemKey", js.Any.fromFunction1(value))
    
    inline def setGetItemKeyUndefined: Self = StObject.set(x, "getItemKey", js.undefined)
    
    inline def setGetItemStyle(value: /* index */ Double => Style): Self = StObject.set(x, "getItemStyle", js.Any.fromFunction1(value))
    
    inline def setGetItemStyleUndefined: Self = StObject.set(x, "getItemStyle", js.undefined)
    
    inline def setGetItemType(value: /* index */ Double => Double): Self = StObject.set(x, "getItemType", js.Any.fromFunction1(value))
    
    inline def setGetItemTypeUndefined: Self = StObject.set(x, "getItemType", js.undefined)
    
    inline def setInitialContentOffset(value: Double): Self = StObject.set(x, "initialContentOffset", value.asInstanceOf[js.Any])
    
    inline def setInitialContentOffsetUndefined: Self = StObject.set(x, "initialContentOffset", js.undefined)
    
    inline def setInterItemSpacing(value: Double): Self = StObject.set(x, "interItemSpacing", value.asInstanceOf[js.Any])
    
    inline def setNumberOfColumns(value: Double): Self = StObject.set(x, "numberOfColumns", value.asInstanceOf[js.Any])
    
    inline def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    inline def setOnEndReached(value: () => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction0(value))
    
    inline def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
    
    inline def setOnExposureReport(value: () => Unit): Self = StObject.set(x, "onExposureReport", js.Any.fromFunction0(value))
    
    inline def setOnExposureReportUndefined: Self = StObject.set(x, "onExposureReport", js.undefined)
    
    inline def setOnFooterPulling(value: () => Unit): Self = StObject.set(x, "onFooterPulling", js.Any.fromFunction0(value))
    
    inline def setOnFooterPullingUndefined: Self = StObject.set(x, "onFooterPulling", js.undefined)
    
    inline def setOnFooterReleased(value: () => Unit): Self = StObject.set(x, "onFooterReleased", js.Any.fromFunction0(value))
    
    inline def setOnFooterReleasedUndefined: Self = StObject.set(x, "onFooterReleased", js.undefined)
    
    inline def setOnHeaderPulling(value: () => Unit): Self = StObject.set(x, "onHeaderPulling", js.Any.fromFunction0(value))
    
    inline def setOnHeaderPullingUndefined: Self = StObject.set(x, "onHeaderPulling", js.undefined)
    
    inline def setOnHeaderReleased(value: () => Unit): Self = StObject.set(x, "onHeaderReleased", js.Any.fromFunction0(value))
    
    inline def setOnHeaderReleasedUndefined: Self = StObject.set(x, "onHeaderReleased", js.undefined)
    
    inline def setOnInitialListReady(value: () => Unit): Self = StObject.set(x, "onInitialListReady", js.Any.fromFunction0(value))
    
    inline def setOnInitialListReadyUndefined: Self = StObject.set(x, "onInitialListReady", js.undefined)
    
    inline def setOnItemLayout(value: (/* evt */ LayoutEvent, /* index */ Double) => Unit): Self = StObject.set(x, "onItemLayout", js.Any.fromFunction2(value))
    
    inline def setOnItemLayoutUndefined: Self = StObject.set(x, "onItemLayout", js.undefined)
    
    inline def setOnScroll(value: /* evt */ EndEdgePos => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setPreloadItemNumber(value: Double): Self = StObject.set(x, "preloadItemNumber", value.asInstanceOf[js.Any])
    
    inline def setPreloadItemNumberUndefined: Self = StObject.set(x, "preloadItemNumber", js.undefined)
    
    inline def setRenderBanner(value: () => ReactElement): Self = StObject.set(x, "renderBanner", js.Any.fromFunction0(value))
    
    inline def setRenderBannerUndefined: Self = StObject.set(x, "renderBanner", js.undefined)
    
    inline def setRenderItem(value: /* data */ DataItem => ReactElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    
    inline def setRenderPullFooter(value: () => ReactElement): Self = StObject.set(x, "renderPullFooter", js.Any.fromFunction0(value))
    
    inline def setRenderPullFooterUndefined: Self = StObject.set(x, "renderPullFooter", js.undefined)
    
    inline def setRenderPullHeader(value: () => ReactElement): Self = StObject.set(x, "renderPullHeader", js.Any.fromFunction0(value))
    
    inline def setRenderPullHeaderUndefined: Self = StObject.set(x, "renderPullHeader", js.undefined)
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
