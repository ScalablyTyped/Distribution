package typings
package hexoLib.hexoMod.PostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var date: js.UndefOr[momentLib.momentMod.MomentInput] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var slug: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    date: momentLib.momentMod.MomentInput = null,
    layout: java.lang.String = null,
    path: java.lang.String = null,
    slug: java.lang.String = null,
    title: java.lang.String = null
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

