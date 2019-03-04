package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagePaginatorState extends PaginatorState {
  var page: scala.Double
  var page_size: js.UndefOr[scala.Double] = js.undefined
}

object PagePaginatorState {
  @scala.inline
  def apply(
    done: scala.Boolean,
    loaded: scala.Double,
    page: scala.Double,
    page_size: scala.Int | scala.Double = null
  ): PagePaginatorState = {
    val __obj = js.Dynamic.literal(done = done, loaded = loaded, page = page)
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePaginatorState]
  }
}

