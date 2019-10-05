package typings.atIonicAngular

import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.IterableDiffers
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atAngularCore.atAngularCoreMod.SimpleChanges
import typings.atAngularCore.atAngularCoreMod.TrackByFunction
import typings.atIonicAngular.distDirectivesVirtualDashScrollVirtualDashFooterMod.VirtualFooter
import typings.atIonicAngular.distDirectivesVirtualDashScrollVirtualDashHeaderMod.VirtualHeader
import typings.atIonicAngular.distDirectivesVirtualDashScrollVirtualDashItemMod.VirtualItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/virtual-scroll/virtual-scroll", JSImport.Namespace)
@js.native
object distDirectivesVirtualDashScrollVirtualDashScrollMod extends js.Object {
  @js.native
  class IonVirtualScroll protected () extends js.Object {
    def this(z: NgZone, iterableDiffers: IterableDiffers, elementRef: ElementRef[_]) = this()
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
    var differ: js.UndefOr[js.Any] = js.native
    var el: js.Any = js.native
    /**
      * Section footers and the data used within its given
      * template can be dynamically created by passing a function to `footerFn`.
      * The logic within the footer function can decide if the footer template
      * should be used, and what data to give to the footer template. The function
      * must return `null` if a footer cell shouldn't be created.
      */
    var footerFn: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HeaderFn */ js.Any
      ] = js.native
    /**
      * An optional function that maps each item footer within their height.
      */
    var footerHeight: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FooterHeightFn */ js.Any
      ] = js.native
    var ftrTmp: VirtualFooter = js.native
    var getComponent: js.Any = js.native
    var hdrTmp: VirtualHeader = js.native
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
    var headerFn: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HeaderFn */ js.Any
      ] = js.native
    /**
      * An optional function that maps each item header within their height.
      */
    var headerHeight: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HeaderHeightFn */ js.Any
      ] = js.native
    /**
      * An optional function that maps each item within their height.
      * When this function is provided, heavy optimizations and fast path can be taked by
      * `ion-virtual-scroll` leading to massive performance improvements.
      *
      * This function allows to skip all DOM reads, which can be Doing so leads
      * to massive performance
      */
    var itemHeight: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ItemHeightFn */ js.Any
      ] = js.native
    /**
      * The data that builds the templates within the virtual scroll.
      * It's important to note that when this data has changed, then the
      * entire virtual scroll is reset, which is an expensive operation and
      * should be avoided if possible.
      */
    var items: js.UndefOr[js.Array[_]] = js.native
    var iterableDiffers: js.Any = js.native
    var itmTmp: VirtualItem = js.native
    var nodeRender: js.Any = js.native
    var refMap: js.Any = js.native
    /**
      * Same as `ngForTrackBy` which can be used on `ngFor`.
      */
    @JSName("trackBy")
    var trackBy_Original: TrackByFunction[_] = js.native
    var z: js.Any = js.native
    /**
      * This method marks the tail the items array as dirty, so they can be re-rendered.  It's equivalent to calling:  ```js    * virtualScroll.checkRange(lastItemLen, items.length - lastItemLen);    * ```
      */
    def checkEnd(): Unit = js.native
    /**
      * This method marks a subset of items as dirty, so they can be re-rendered. Items should be marked as dirty any time the content or their style changes.  The subset of items to be updated can are specifing by an offset and a length.
      */
    def checkRange(offset: Double): Unit = js.native
    def checkRange(offset: Double, len: Double): Unit = js.native
    def ngDoCheck(): Unit = js.native
    def ngOnChanges(changes: SimpleChanges): Unit = js.native
    /**
      * Returns the position of the virtual item at the given index.
      */
    def positionForItem(index: Double): js.Promise[Double] = js.native
    /**
      * Same as `ngForTrackBy` which can be used on `ngFor`.
      */
    def trackBy(index: Double, item: js.Any): js.Any = js.native
  }
  
}

