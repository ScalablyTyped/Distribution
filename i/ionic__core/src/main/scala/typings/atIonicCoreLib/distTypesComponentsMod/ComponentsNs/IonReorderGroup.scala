package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonReorderGroup extends js.Object {
  /**
    * If `true`, the reorder will be hidden.
    */
  var disabled: scala.Boolean = js.native
  /**
    * This method must be called once the `ionItemReorder` event is handled in order to complete the reorder operation.
    */
  def complete(): js.Promise[_] = js.native
  def complete(listOrReorder: js.Array[_]): js.Promise[_] = js.native
  def complete(listOrReorder: scala.Boolean): js.Promise[_] = js.native
}

