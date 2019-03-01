package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupItem extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var badge: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var encoded: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonGroupItem {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    badge: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    encoded: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    iconClass: java.lang.String = null,
    imageUrl: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null
  ): ButtonGroupItem = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(encoded)) __obj.updateDynamic("encoded")(encoded)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ButtonGroupItem]
  }
}

