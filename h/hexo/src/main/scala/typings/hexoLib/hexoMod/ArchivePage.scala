package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchivePage extends IndexPage {
  var archive: js.UndefOr[scala.Boolean] = js.undefined
  var month: js.UndefOr[scala.Double] = js.undefined
  var year: js.UndefOr[scala.Double] = js.undefined
}

object ArchivePage {
  @scala.inline
  def apply(
    archive: js.UndefOr[scala.Boolean] = js.undefined,
    current: scala.Int | scala.Double = null,
    current_url: java.lang.String = null,
    month: scala.Int | scala.Double = null,
    next: scala.Int | scala.Double = null,
    next_link: java.lang.String = null,
    path: java.lang.String = null,
    per_page: scala.Int | scala.Double = null,
    posts: js.Object = null,
    prev: scala.Int | scala.Double = null,
    prev_link: java.lang.String = null,
    total: scala.Int | scala.Double = null,
    year: scala.Int | scala.Double = null
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

