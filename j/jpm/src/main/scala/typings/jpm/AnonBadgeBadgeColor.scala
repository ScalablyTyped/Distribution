package typings.jpm

import typings.jpm.FFAddonSDK.Icon
import typings.jpm.FFAddonSDK.ToggleButtonState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadgeBadgeColor extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var badgeColor: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: Icon
  var id: String
  var label: String
  var onChange: js.UndefOr[js.Function1[/* state */ ToggleButtonState, _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* state */ ToggleButtonState, _]] = js.undefined
}

object AnonBadgeBadgeColor {
  @scala.inline
  def apply(
    icon: Icon,
    id: String,
    label: String,
    badge: String | Double = null,
    badgeColor: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* state */ ToggleButtonState => _ = null,
    onClick: /* state */ ToggleButtonState => _ = null
  ): AnonBadgeBadgeColor = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[AnonBadgeBadgeColor]
  }
}

