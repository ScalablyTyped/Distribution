package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.PaginatorState> */
trait PartialPaginatorState extends js.Object {
  var done: js.UndefOr[Boolean] = js.undefined
  var loaded: js.UndefOr[Double] = js.undefined
}

object PartialPaginatorState {
  @scala.inline
  def apply(done: js.UndefOr[Boolean] = js.undefined, loaded: Int | Double = null): PartialPaginatorState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPaginatorState]
  }
}

