package typings.jsforce.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionOverride extends js.Object {
  var formFactor: String
  var isAvailableInTouch: Boolean
  var name: String
  var pageId: String
  var url: js.UndefOr[maybe[String]] = js.undefined
}

object ActionOverride {
  @scala.inline
  def apply(
    formFactor: String,
    isAvailableInTouch: Boolean,
    name: String,
    pageId: String,
    url: maybe[String] = null
  ): ActionOverride = {
    val __obj = js.Dynamic.literal(formFactor = formFactor.asInstanceOf[js.Any], isAvailableInTouch = isAvailableInTouch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionOverride]
  }
}

