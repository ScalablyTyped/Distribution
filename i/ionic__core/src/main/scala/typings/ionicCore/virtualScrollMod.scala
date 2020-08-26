package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonVirtualScrollElement
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.virtualScrollInterfaceMod.DomRenderFn
import typings.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll", JSImport.Namespace)
@js.native
object virtualScrollMod extends js.Object {
  @js.native
  class VirtualScroll () extends ComponentInterface {
    /**
      * The approximate width of each footer template's cell.
      * This dimension is used to help determine how many cells should
      * be created when initialized, and to help calculate the height of
      * the scrollable area. This height value can only use `px` units.
      * Note that the actual rendered size of each cell comes from the
      * app's CSS, whereas this approximation is used to help calculate
      * initial dimensions before the item has been rendered.
      */
    var approxFooterHeight: Double = js.native
    /**
      * The approximate height of each header template's cell.
      * This dimension is used to help determine how many cells should
      * be created when initialized, and to help calculate the height of
      * the scrollable area. This height value can only use `px` units.
      * Note that the actual rendered size of each cell comes from the
      * app's CSS, whereas this approximation is used to help calculate
      * initial dimensions before the item has been rendered.
      */
    var approxHeaderHeight: Double = js.native
    /**
      * It is important to provide this
      * if virtual item height will be significantly larger than the default
      * The approximate height of each virtual item template's cell.
      * This dimension is used to help determine how many cells should
      * be created when initialized, and to help calculate the height of
      * the scrollable area. This height value can only use `px` units.
      * Note that the actual rendered size of each cell comes from the
      * app's CSS, whereas this approximation is used to help calculate
      * initial dimensions before the item has been rendered.
      */
    var approxItemHeight: Double = js.native
    var calcCells: js.Any = js.native
    var calcHeightIndex: js.Any = js.native
    var cells: js.Any = js.native
    var contentEl: js.Any = js.native
    var currentScrollTop: js.Any = js.native
    /** @internal */
    var domRender: js.UndefOr[DomRenderFn] = js.native
    var el: HTMLIonVirtualScrollElement = js.native
    var enableScrollEvents: js.Any = js.native
    /**
      * Section footers and the data used within its given
      * template can be dynamically created by passing a function to `footerFn`.
      * The logic within the footer function can decide if the footer template
      * should be used, and what data to give to the footer template. The function
      * must return `null` if a footer cell shouldn't be created.
      */
    var footerFn: js.UndefOr[HeaderFn] = js.native
    /**
      * An optional function that maps each item footer within their height.
      */
    var footerHeight: js.UndefOr[FooterHeightFn] = js.native
    var getHeightIndex: js.Any = js.native
    /**
      * Section headers and the data used within its given
      * template can be dynamically created by passing a function to `headerFn`.
      * For example, a large list of contacts usually has dividers between each
      * letter in the alphabet. App's can provide their own custom `headerFn`
      * which is called with each record within the dataset. The logic within
      * the header function can decide if the header template should be used,
      * and what data to give to the header template. The function must return
      * `null` if a header cell shouldn't be created.
      */
    var headerFn: js.UndefOr[HeaderFn] = js.native
    /**
      * An optional function that maps each item header within their height.
      */
    var headerHeight: js.UndefOr[HeaderHeightFn] = js.native
    var heightIndex: js.Any = js.native
    var indexDirty: js.Any = js.native
    var isEnabled: js.Any = js.native
    /**
      * An optional function that maps each item within their height.
      * When this function is provides, heavy optimizations and fast path can be taked by
      * `ion-virtual-scroll` leading to massive performance improvements.
      *
      * This function allows to skip all DOM reads, which can be Doing so leads
      * to massive performance
      */
    var itemHeight: js.UndefOr[ItemHeightFn] = js.native
    /**
      * The data that builds the templates within the virtual scroll.
      * It's important to note that when this data has changed, then the
      * entire virtual scroll is reset, which is an expensive operation and
      * should be avoided if possible.
      */
    var items: js.UndefOr[js.Array[_]] = js.native
    var lastItemLen: js.Any = js.native
    /**
      * NOTE: only Vanilla JS API.
      */
    var nodeRender: js.UndefOr[ItemRenderFn] = js.native
    var onScroll: js.Any = js.native
    var range: js.Any = js.native
    var readVS: js.Any = js.native
    /**
      * NOTE: only JSX API for stencil.
      *
      * Provide a render function for the footer to be rendered. Returns a JSX virtual-dom.
      */
    var renderFooter: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
    /**
      * NOTE: only JSX API for stencil.
      *
      * Provide a render function for the header to be rendered. Returns a JSX virtual-dom.
      */
    var renderHeader: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
    /**
      * NOTE: only JSX API for stencil.
      *
      * Provide a render function for the items to be rendered. Returns a JSX virtual-dom.
      */
    var renderItem: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
    var renderVirtualNode: js.Any = js.native
    var rmEvent: js.Any = js.native
    var scheduleUpdate: js.Any = js.native
    var scrollEl: js.Any = js.native
    var setCellHeight: js.Any = js.native
    var timerUpdate: js.Any = js.native
    var totalHeight: Double = js.native
    var updateCellHeight: js.Any = js.native
    var updateState: js.Any = js.native
    var updateVirtualScroll: js.Any = js.native
    var viewportHeight: js.Any = js.native
    var viewportOffset: js.Any = js.native
    var virtualDom: js.Any = js.native
    var writeVS: js.Any = js.native
    /**
      * This method marks the tail the items array as dirty, so they can be re-rendered.
      *
      * It's equivalent to calling:
      *
      * ```js
      * virtualScroll.checkRange(lastItemLen);
      * ```
      */
    def checkEnd(): js.Promise[Unit] = js.native
    /**
      * This method marks a subset of items as dirty, so they can be re-rendered. Items should be marked as
      * dirty any time the content or their style changes.
      *
      * The subset of items to be updated can are specifing by an offset and a length.
      */
    def checkRange(offset: Double): js.Promise[Unit] = js.native
    def checkRange(offset: Double, len: Double): js.Promise[Unit] = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MVirtualScroll(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MVirtualScroll(): js.Promise[Unit] = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MVirtualScroll(): Unit = js.native
    def itemsChanged(): Unit = js.native
    def onResize(): Unit = js.native
    /**
      * Returns the position of the virtual item at the given index.
      */
    def positionForItem(index: Double): js.Promise[Double] = js.native
    @JSName("render")
    def render_MVirtualScroll(): js.Any = js.native
  }
  
}

