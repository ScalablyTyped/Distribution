package typings.inboxsdk.inboxsdkMod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var title: String
  def onClick(event: ThreadRowButtonClickEvent): Unit
}

object ThreadRowButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: String,
    onClick: ThreadRowButtonClickEvent => Unit,
    title: String,
    hasDropdown: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null
  ): ThreadRowButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonDescriptor]
  }
}

