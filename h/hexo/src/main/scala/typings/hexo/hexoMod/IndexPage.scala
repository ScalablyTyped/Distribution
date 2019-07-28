package typings.hexo.hexoMod

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
    current: Int | Double = null,
    current_url: String = null,
    next: Int | Double = null,
    next_link: String = null,
    path: String = null,
    per_page: Int | Double = null,
    posts: js.Object = null,
    prev: Int | Double = null,
    prev_link: String = null,
    total: Int | Double = null
  ): IndexPage = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (current_url != null) __obj.updateDynamic("current_url")(current_url)
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (next_link != null) __obj.updateDynamic("next_link")(next_link)
    if (path != null) __obj.updateDynamic("path")(path)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (posts != null) __obj.updateDynamic("posts")(posts)
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prev_link != null) __obj.updateDynamic("prev_link")(prev_link)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexPage]
  }
}

