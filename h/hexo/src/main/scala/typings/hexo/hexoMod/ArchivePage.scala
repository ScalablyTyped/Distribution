package typings.hexo.hexoMod

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
    current: Int | Double = null,
    current_url: String = null,
    month: Int | Double = null,
    next: Int | Double = null,
    next_link: String = null,
    path: String = null,
    per_page: Int | Double = null,
    posts: js.Object = null,
    prev: Int | Double = null,
    prev_link: String = null,
    total: Int | Double = null,
    year: Int | Double = null
  ): ArchivePage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(archive)) __obj.updateDynamic("archive")(archive)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (current_url != null) __obj.updateDynamic("current_url")(current_url)
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (next_link != null) __obj.updateDynamic("next_link")(next_link)
    if (path != null) __obj.updateDynamic("path")(path)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (posts != null) __obj.updateDynamic("posts")(posts)
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prev_link != null) __obj.updateDynamic("prev_link")(prev_link)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchivePage]
  }
}

