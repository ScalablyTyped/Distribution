package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionOverride extends js.Object {
  var formFactor: java.lang.String
  var isAvailableInTouch: scala.Boolean
  var name: java.lang.String
  var pageId: java.lang.String
  var url: js.UndefOr[maybe[java.lang.String]] = js.undefined
}

object ActionOverride {
  @scala.inline
  def apply(
    formFactor: java.lang.String,
    isAvailableInTouch: scala.Boolean,
    name: java.lang.String,
    pageId: java.lang.String,
    url: maybe[java.lang.String] = null
  ): ActionOverride = {
    val __obj = js.Dynamic.literal(formFactor = formFactor, isAvailableInTouch = isAvailableInTouch, name = name, pageId = pageId)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionOverride]
  }
}

