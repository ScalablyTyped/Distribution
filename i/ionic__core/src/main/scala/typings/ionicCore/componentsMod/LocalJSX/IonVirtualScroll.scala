package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.virtualScrollInterfaceMod.Cell
import typings.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonVirtualScroll extends js.Object {
  /**
    * The approximate width of each footer template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxFooterHeight: js.UndefOr[Double] = js.undefined
  /**
    * The approximate height of each header template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxHeaderHeight: js.UndefOr[Double] = js.undefined
  /**
    * It is important to provide this if virtual item height will be significantly larger than the default The approximate height of each virtual item template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxItemHeight: js.UndefOr[Double] = js.undefined
  /**
    * Section footers and the data used within its given template can be dynamically created by passing a function to `footerFn`. The logic within the footer function can decide if the footer template should be used, and what data to give to the footer template. The function must return `null` if a footer cell shouldn't be created.
    */
  var footerFn: js.UndefOr[HeaderFn] = js.undefined
  /**
    * An optional function that maps each item footer within their height.
    */
  var footerHeight: js.UndefOr[FooterHeightFn] = js.undefined
  /**
    * Section headers and the data used within its given template can be dynamically created by passing a function to `headerFn`. For example, a large list of contacts usually has dividers between each letter in the alphabet. App's can provide their own custom `headerFn` which is called with each record within the dataset. The logic within the header function can decide if the header template should be used, and what data to give to the header template. The function must return `null` if a header cell shouldn't be created.
    */
  var headerFn: js.UndefOr[HeaderFn] = js.undefined
  /**
    * An optional function that maps each item header within their height.
    */
  var headerHeight: js.UndefOr[HeaderHeightFn] = js.undefined
  /**
    * An optional function that maps each item within their height. When this function is provides, heavy optimizations and fast path can be taked by `ion-virtual-scroll` leading to massive performance improvements.  This function allows to skip all DOM reads, which can be Doing so leads to massive performance
    */
  var itemHeight: js.UndefOr[ItemHeightFn] = js.undefined
  /**
    * The data that builds the templates within the virtual scroll. It's important to note that when this data has changed, then the entire virtual scroll is reset, which is an expensive operation and should be avoided if possible.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * NOTE: only Vanilla JS API.
    */
  var nodeRender: js.UndefOr[ItemRenderFn] = js.undefined
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the footer to be rendered. Returns a JSX virtual-dom.
    */
  var renderFooter: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.undefined
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the header to be rendered. Returns a JSX virtual-dom.
    */
  var renderHeader: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.undefined
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the items to be rendered. Returns a JSX virtual-dom.
    */
  var renderItem: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.undefined
}

object IonVirtualScroll {
  @scala.inline
  def apply(
    approxFooterHeight: Int | Double = null,
    approxHeaderHeight: Int | Double = null,
    approxItemHeight: Int | Double = null,
    footerFn: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null] = null,
    footerHeight: (/* item */ js.Any, /* index */ Double) => Double = null,
    headerFn: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null] = null,
    headerHeight: (/* item */ js.Any, /* index */ Double) => Double = null,
    itemHeight: (/* item */ js.Any, /* index */ Double) => Double = null,
    items: js.Array[_] = null,
    nodeRender: (/* el */ HTMLElement | Null, /* cell */ Cell, /* domIndex */ Double) => HTMLElement = null,
    renderFooter: (/* item */ js.Any, /* index */ Double) => _ = null,
    renderHeader: (/* item */ js.Any, /* index */ Double) => _ = null,
    renderItem: (/* item */ js.Any, /* index */ Double) => _ = null
  ): IonVirtualScroll = {
    val __obj = js.Dynamic.literal()
    if (approxFooterHeight != null) __obj.updateDynamic("approxFooterHeight")(approxFooterHeight.asInstanceOf[js.Any])
    if (approxHeaderHeight != null) __obj.updateDynamic("approxHeaderHeight")(approxHeaderHeight.asInstanceOf[js.Any])
    if (approxItemHeight != null) __obj.updateDynamic("approxItemHeight")(approxItemHeight.asInstanceOf[js.Any])
    if (footerFn != null) __obj.updateDynamic("footerFn")(js.Any.fromFunction3(footerFn))
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(js.Any.fromFunction2(footerHeight))
    if (headerFn != null) __obj.updateDynamic("headerFn")(js.Any.fromFunction3(headerFn))
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(js.Any.fromFunction2(headerHeight))
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(js.Any.fromFunction2(itemHeight))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (nodeRender != null) __obj.updateDynamic("nodeRender")(js.Any.fromFunction3(nodeRender))
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction2(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction2(renderHeader))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    __obj.asInstanceOf[IonVirtualScroll]
  }
}

