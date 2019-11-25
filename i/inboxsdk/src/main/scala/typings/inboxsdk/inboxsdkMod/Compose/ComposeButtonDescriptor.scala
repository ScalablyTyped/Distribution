package typings.inboxsdk.inboxsdkMod.Compose

import typings.inboxsdk.inboxsdkStrings.MODIFIER
import typings.inboxsdk.inboxsdkStrings.SEND_ACTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeButtonDescriptor extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var orderHint: js.UndefOr[Double] = js.undefined
  var title: String
  var `type`: js.UndefOr[MODIFIER | SEND_ACTION] = js.undefined
  def onClick(event: ComposeButtonClickEvent): Unit
}

object ComposeButtonDescriptor {
  @scala.inline
  def apply(
    onClick: ComposeButtonClickEvent => Unit,
    title: String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hasDropdown: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    iconUrl: String = null,
    orderHint: Int | Double = null,
    `type`: MODIFIER | SEND_ACTION = null
  ): ComposeButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeButtonDescriptor]
  }
}

