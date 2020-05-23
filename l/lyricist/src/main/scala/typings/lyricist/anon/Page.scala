package typings.lyricist.anon

import typings.lyricist.lyricistStrings.asc
import typings.lyricist.lyricistStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var perPage: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[asc | desc] = js.undefined
}

object Page {
  @scala.inline
  def apply(
    page: js.UndefOr[Double] = js.undefined,
    perPage: js.UndefOr[Double] = js.undefined,
    sort: asc | desc = null
  ): Page = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(perPage)) __obj.updateDynamic("perPage")(perPage.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

