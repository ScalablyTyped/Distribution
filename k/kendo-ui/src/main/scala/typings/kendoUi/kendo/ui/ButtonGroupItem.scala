package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupItem extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var badge: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var encoded: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ButtonGroupItem {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    badge: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    encoded: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconClass: String = null,
    imageUrl: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    text: String = null
  ): ButtonGroupItem = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encoded)) __obj.updateDynamic("encoded")(encoded.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupItem]
  }
}

