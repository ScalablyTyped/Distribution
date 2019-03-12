package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeButtonDescriptor extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var hasDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var orderHint: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
  var `type`: js.UndefOr[
    inboxsdkLib.inboxsdkLibStrings.MODIFIER | inboxsdkLib.inboxsdkLibStrings.SEND_ACTION
  ] = js.undefined
  def onClick(event: ComposeButtonClickEvent): scala.Unit
}

object ComposeButtonDescriptor {
  @scala.inline
  def apply(
    onClick: ComposeButtonClickEvent => scala.Unit,
    title: java.lang.String,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    hasDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    iconClass: java.lang.String = null,
    iconUrl: java.lang.String = null,
    orderHint: scala.Int | scala.Double = null,
    `type`: inboxsdkLib.inboxsdkLibStrings.MODIFIER | inboxsdkLib.inboxsdkLibStrings.SEND_ACTION = null
  ): ComposeButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeButtonDescriptor]
  }
}

