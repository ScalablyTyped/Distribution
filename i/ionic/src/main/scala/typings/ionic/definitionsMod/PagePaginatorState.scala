package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagePaginatorState extends PaginatorState {
  var page: Double
  var page_size: js.UndefOr[Double] = js.undefined
}

object PagePaginatorState {
  @scala.inline
  def apply(done: Boolean, loaded: Double, page: Double, page_size: js.UndefOr[Double] = js.undefined): PagePaginatorState = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    if (!js.isUndefined(page_size)) __obj.updateDynamic("page_size")(page_size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePaginatorState]
  }
}

