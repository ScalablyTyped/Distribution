package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonReorderGroup extends js.Object {
  /**
    * If `true`, the reorder will be hidden.
    */
  var disabled: Boolean = js.native
  /**
    * Completes the reorder operation. Must be called by the `ionItemReorder` event.  If a list of items is passed, the list will be reordered and returned in the proper order.  If no parameters are passed or if `true` is passed in, the reorder will complete and the item will remain in the position it was dragged to. If `false` is passed, the reorder will complete and the item will bounce back to its original position.
    * @param listOrReorder A list of items to be sorted and returned in the new order or a boolean of whether or not the reorder should reposition the item.
    */
  def complete(): js.Promise[_] = js.native
  def complete(listOrReorder: js.Array[_]): js.Promise[_] = js.native
  def complete(listOrReorder: Boolean): js.Promise[_] = js.native
}

