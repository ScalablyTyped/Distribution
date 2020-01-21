package typings.hexo.mod.Post

import typings.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var date: js.UndefOr[MomentInput] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    date: MomentInput = null,
    layout: String = null,
    path: String = null,
    slug: String = null,
    title: String = null
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

