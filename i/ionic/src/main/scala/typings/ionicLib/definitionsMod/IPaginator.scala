package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaginator[T /* <: Response[js.Array[js.Object]] */, S]
  extends nodeLib.IterableIterator[js.Promise[T]] {
  val state: S
}

object IPaginator {
  @scala.inline
  def apply[T /* <: Response[js.Array[js.Object]] */, S](state: S): IPaginator[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaginator[T, S]]
  }
}

