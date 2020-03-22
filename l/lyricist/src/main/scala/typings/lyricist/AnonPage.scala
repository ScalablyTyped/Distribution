package typings.lyricist

import typings.lyricist.lyricistStrings.asc
import typings.lyricist.lyricistStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var perPage: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[asc | desc] = js.undefined
}

object AnonPage {
  @scala.inline
  def apply(page: Int | Double = null, perPage: Int | Double = null, sort: asc | desc = null): AnonPage = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPage]
  }
}

