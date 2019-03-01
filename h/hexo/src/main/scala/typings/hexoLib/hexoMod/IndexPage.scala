package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexPage extends js.Object {
  var current: js.UndefOr[scala.Double] = js.undefined
  var current_url: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[scala.Double] = js.undefined
  var next_link: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var posts: js.UndefOr[js.Object] = js.undefined
  var prev: js.UndefOr[scala.Double] = js.undefined
  var prev_link: js.UndefOr[java.lang.String] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object IndexPage {
  @scala.inline
  def apply(
    current: scala.Int | scala.Double = null,
    current_url: java.lang.String = null,
    next: scala.Int | scala.Double = null,
    next_link: java.lang.String = null,
    path: java.lang.String = null,
    per_page: scala.Int | scala.Double = null,
    posts: js.Object = null,
    prev: scala.Int | scala.Double = null,
    prev_link: java.lang.String = null,
    total: scala.Int | scala.Double = null
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

