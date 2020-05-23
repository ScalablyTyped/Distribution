package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagPage extends IndexPage {
  var tag: String
}

object TagPage {
  @scala.inline
  def apply(
    tag: String,
    current: js.UndefOr[Double] = js.undefined,
    current_url: String = null,
    next: js.UndefOr[Double] = js.undefined,
    next_link: String = null,
    path: String = null,
    per_page: js.UndefOr[Double] = js.undefined,
    posts: js.Object = null,
    prev: js.UndefOr[Double] = js.undefined,
    prev_link: String = null,
    total: js.UndefOr[Double] = js.undefined
  ): TagPage = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (current_url != null) __obj.updateDynamic("current_url")(current_url.asInstanceOf[js.Any])
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next.get.asInstanceOf[js.Any])
    if (next_link != null) __obj.updateDynamic("next_link")(next_link.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (posts != null) __obj.updateDynamic("posts")(posts.asInstanceOf[js.Any])
    if (!js.isUndefined(prev)) __obj.updateDynamic("prev")(prev.get.asInstanceOf[js.Any])
    if (prev_link != null) __obj.updateDynamic("prev_link")(prev_link.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagPage]
  }
}

