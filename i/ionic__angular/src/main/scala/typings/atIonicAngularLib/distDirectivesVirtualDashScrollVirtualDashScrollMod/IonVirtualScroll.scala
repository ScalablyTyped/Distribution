package typings
package atIonicAngularLib.distDirectivesVirtualDashScrollVirtualDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/virtual-scroll/virtual-scroll", "IonVirtualScroll")
@js.native
class IonVirtualScroll protected () extends js.Object {
  def this(zone: atAngularCoreLib.atAngularCoreMod.NgZone, iterableDiffers: atAngularCoreLib.atAngularCoreMod.IterableDiffers, elementRef: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * The approximate width of each footer template's cell.
    * This dimension is used to help determine how many cells should
    * be created when initialized, and to help calculate the height of
    * the scrollable area. This height value can only use `px` units.
    * Note that the actual rendered size of each cell comes from the
    * app's CSS, whereas this approximation is used to help calculate
    * initial dimensions before the item has been rendered.
    */
  var approxFooterHeight: scala.Double = js.native
  /**
    * The approximate height of each header template's cell.
    * This dimension is used to help determine how many cells should
    * be created when initialized, and to help calculate the height of
    * the scrollable area. This height value can only use `px` units.
    * Note that the actual rendered size of each cell comes from the
    * app's CSS, whereas this approximation is used to help calculate
    * initial dimensions before the item has been rendered.
    */
  var approxHeaderHeight: scala.Double = js.native
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
  var approxItemHeight: scala.Double = js.native
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
    atIonicCoreLib.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.HeaderFn
  ] = js.native
  var ftrTmp: atIonicAngularLib.distDirectivesVirtualDashScrollVirtualDashFooterMod.VirtualFooter = js.native
  var getComponent: js.Any = js.native
  var hdrTmp: atIonicAngularLib.distDirectivesVirtualDashScrollVirtualDashHeaderMod.VirtualHeader = js.native
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
    atIonicCoreLib.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.HeaderFn
  ] = js.native
  /**
    * An optional function that maps each item within their height.
    * When this function is provides, heavy optimizations and fast path can be taked by
    * `ion-virtual-scroll` leading to massive performance improvements.
    *
    * This function allows to skip all DOM reads, which can be Doing so leads
    * to massive performance
    */
  var itemHeight: js.UndefOr[
    atIonicCoreLib.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.ItemHeightFn
  ] = js.native
  /**
    * The data that builds the templates within the virtual scroll.
    * It's important to note that when this data has changed, then the
    * entire virtual scroll is reset, which is an expensive operation and
    * should be avoided if possible.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var iterableDiffers: js.Any = js.native
  var itmTmp: atIonicAngularLib.distDirectivesVirtualDashScrollVirtualDashItemMod.VirtualItem = js.native
  var nodeRender: js.Any = js.native
  var refMap: js.Any = js.native
  /**
    * Same as `ngForTrackBy` which can be used on `ngFor`.
    */
  @JSName("trackBy")
  var trackBy_Original: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.TrackByFunction[_] = js.native
  var zone: js.Any = js.native
  /**
    * This method marks the tail the items array as dirty, so they can be re-rendered.  It's equivalent to calling:  ```js    * virtualScroll.checkRange(lastItemLen, items.length - lastItemLen);    * ```
    */
  def checkEnd(): scala.Unit = js.native
  /**
    * This method marks a subset of items as dirty, so they can be re-rendered. Items should be marked as dirty any time the content or their style changes.  The subset of items to be updated can are specifing by an offset and a length.
    */
  def checkRange(offset: scala.Double): scala.Unit = js.native
  def checkRange(offset: scala.Double, len: scala.Double): scala.Unit = js.native
  def ngDoCheck(): scala.Unit = js.native
  def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
  /**
    * Returns the position of the virtual item at the given index.
    */
  def positionForItem(index: scala.Double): js.Promise[scala.Double] = js.native
  /**
    * Same as `ngForTrackBy` which can be used on `ngFor`.
    */
  def trackBy(index: scala.Double, item: js.Any): js.Any = js.native
}

