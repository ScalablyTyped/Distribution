package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatUser extends js.Object {
  var iconUrl: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ChatUser {
  @scala.inline
  def apply(iconUrl: String = null, name: String = null): ChatUser = {
    val __obj = js.Dynamic.literal()
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatUser]
  }
}

