package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonVirtualScroll extends js.Object {
  /**
    * The approximate width of each footer template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxFooterHeight: scala.Double = js.native
  /**
    * The approximate height of each header template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxHeaderHeight: scala.Double = js.native
  /**
    * It is important to provide this if virtual item height will be significantly larger than the default The approximate height of each virtual item template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxItemHeight: scala.Double = js.native
  var domRender: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DomRenderFn */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DomRenderFn */ js.Any
  ] = js.native
  /**
    * Section footers and the data used within its given template can be dynamically created by passing a function to `footerFn`. The logic within the footer function can decide if the footer template should be used, and what data to give to the footer template. The function must return `null` if a footer cell shouldn't be created.
    */
  var footerFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HeaderFn */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HeaderFn */ js.Any
  ] = js.native
  /**
    * Section headers and the data used within its given template can be dynamically created by passing a function to `headerFn`. For example, a large list of contacts usually has dividers between each letter in the alphabet. App's can provide their own custom `headerFn` which is called with each record within the dataset. The logic within the header function can decide if the header template should be used, and what data to give to the header template. The function must return `null` if a header cell shouldn't be created.
    */
  var headerFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HeaderFn */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HeaderFn */ js.Any
  ] = js.native
  /**
    * An optional function that maps each item within their height. When this function is provides, heavy optimizations and fast path can be taked by `ion-virtual-scroll` leading to massive performance improvements.  This function allows to skip all DOM reads, which can be Doing so leads to massive performance
    */
  var itemHeight: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ItemHeightFn */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ItemHeightFn */ js.Any
  ] = js.native
  /**
    * The data that builds the templates within the virtual scroll. It's important to note that when this data has changed, then the entire virtual scroll is reset, which is an expensive operation and should be avoided if possible.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  /**
    * NOTE: only Vanilla JS API.
    */
  var nodeRender: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ItemRenderFn */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ItemRenderFn */ js.Any
  ] = js.native
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the footer to be rendered. Returns a JSX virtual-dom.
    */
  var renderFooter: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ scala.Double, _]] = js.native
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the header to be rendered. Returns a JSX virtual-dom.
    */
  var renderHeader: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ scala.Double, _]] = js.native
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the items to be rendered. Returns a JSX virtual-dom.
    */
  var renderItem: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ scala.Double, _]] = js.native
  /**
    * Marks the tail of the items array as dirty, so they can be re-rendered. It's equivalent to calling `checkRange(length)` where `length` is the total length of the items.
    */
  def checkEnd(): scala.Unit = js.native
  /**
    * Marks a subset of the items as dirty so they can be re-rendered. Items should be marked as dirty any time the content or their style changes.  The subset of items to be updated are specified by an offset and a length. If a length is not provided it will check all of the items beginning at the offset.
    */
  def checkRange(offset: scala.Double): scala.Unit = js.native
  def checkRange(offset: scala.Double, length: scala.Double): scala.Unit = js.native
  /**
    * Returns the position of the virtual item at the given index.
    */
  def positionForItem(index: scala.Double): js.Promise[scala.Double] = js.native
}

