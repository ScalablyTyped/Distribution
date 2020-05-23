package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchivePage extends IndexPage {
  var archive: js.UndefOr[Boolean] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object ArchivePage {
  @scala.inline
  def apply(
    archive: js.UndefOr[Boolean] = js.undefined,
    current: js.UndefOr[Double] = js.undefined,
    current_url: String = null,
    month: js.UndefOr[Double] = js.undefined,
    next: js.UndefOr[Double] = js.undefined,
    next_link: String = null,
    path: String = null,
    per_page: js.UndefOr[Double] = js.undefined,
    posts: js.Object = null,
    prev: js.UndefOr[Double] = js.undefined,
    prev_link: String = null,
    total: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): ArchivePage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(archive)) __obj.updateDynamic("archive")(archive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (current_url != null) __obj.updateDynamic("current_url")(current_url.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next.get.asInstanceOf[js.Any])
    if (next_link != null) __obj.updateDynamic("next_link")(next_link.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (posts != null) __obj.updateDynamic("posts")(posts.asInstanceOf[js.Any])
    if (!js.isUndefined(prev)) __obj.updateDynamic("prev")(prev.get.asInstanceOf[js.Any])
    if (prev_link != null) __obj.updateDynamic("prev_link")(prev_link.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchivePage]
  }
}

