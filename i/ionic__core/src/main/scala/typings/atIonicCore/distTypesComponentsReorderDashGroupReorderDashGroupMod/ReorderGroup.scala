package typings.atIonicCore.distTypesComponentsReorderDashGroupReorderDashGroupMod

import typings.atIonicCore.distTypesComponentsReorderDashGroupReorderDashGroupDashInterfaceMod.ItemReorderEventDetail
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/reorder-group/reorder-group", "ReorderGroup")
@js.native
class ReorderGroup () extends ComponentInterface {
  var autoscroll: js.Any = js.native
  var cachedHeights: js.Any = js.native
  var canStart: js.Any = js.native
  var completeSync: js.Any = js.native
  var containerBottom: js.Any = js.native
  var containerTop: js.Any = js.native
  /**
    * If `true`, the reorder will be hidden.
    */
  var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var gesture: js.UndefOr[js.Any] = js.native
  /**
    * Event that needs to be listened to in order to complete the reorder action.
    * Once the event has been emitted, the `complete()` method then needs
    * to be called in order to finalize the reorder action.
    */
  var ionItemReorder: EventEmitter[ItemReorderEventDetail] = js.native
  var itemIndexForTop: js.Any = js.native
  var lastToIndex: js.Any = js.native
  var onEnd: js.Any = js.native
  var onMove: js.Any = js.native
  var onStart: js.Any = js.native
  /********* DOM WRITE ********* */
  var reorderMove: js.Any = js.native
  var scrollEl: js.UndefOr[js.Any] = js.native
  var scrollElBottom: js.Any = js.native
  var scrollElInitial: js.Any = js.native
  var scrollElTop: js.Any = js.native
  var selectedItemEl: js.UndefOr[js.Any] = js.native
  var selectedItemHeight: js.Any = js.native
  var state: ReorderGroupState = js.native
  /**
    * Completes the reorder operation. Must be called by the `ionItemReorder` event.
    *
    * If a list of items is passed, the list will be reordered and returned in the
    * proper order.
    *
    * If no parameters are passed or if `true` is passed in, the reorder will complete
    * and the item will remain in the position it was dragged to. If `false` is passed,
    * the reorder will complete and the item will bounce back to its original position.
    *
    * @param listOrReorder A list of items to be sorted and returned in the new order or a
    * boolean of whether or not the reorder should reposition the item.
    */
  def complete(): js.Promise[_] = js.native
  def complete(listOrReorder: js.Array[_]): js.Promise[_] = js.native
  def complete(listOrReorder: Boolean): js.Promise[_] = js.native
  @JSName("connectedCallback")
  def connectedCallback_MReorderGroup(): js.Promise[Unit] = js.native
  def disabledChanged(): Unit = js.native
  @JSName("disconnectedCallback")
  def disconnectedCallback_MReorderGroup(): Unit = js.native
  @JSName("render")
  def render_MReorderGroup(): js.Any = js.native
}

