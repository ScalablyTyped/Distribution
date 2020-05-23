package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexPage extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
  var current_url: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[Double] = js.undefined
  var next_link: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var posts: js.UndefOr[js.Object] = js.undefined
  var prev: js.UndefOr[Double] = js.undefined
  var prev_link: js.UndefOr[String] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object IndexPage {
  @scala.inline
  def apply(
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
  ): IndexPage = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[IndexPage]
  }
}

