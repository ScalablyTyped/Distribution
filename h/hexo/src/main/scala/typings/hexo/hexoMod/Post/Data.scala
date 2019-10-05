package typings.hexo.hexoMod.Post

import typings.moment.momentMod.MomentInput
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
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (path != null) __obj.updateDynamic("path")(path)
    if (slug != null) __obj.updateDynamic("slug")(slug)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Data]
  }
}

