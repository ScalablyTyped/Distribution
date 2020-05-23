package typings.ionic.anon

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
  def apply(done: js.UndefOr[Boolean] = js.undefined, loaded: js.UndefOr[Double] = js.undefined): PartialPaginatorState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPaginatorState]
  }
}

