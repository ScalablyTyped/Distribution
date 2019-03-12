package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadgeBadgeColor extends js.Object {
  var badge: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var badgeColor: js.UndefOr[java.lang.String] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: jpmLib.FFAddonSDKNs.Icon
  var id: java.lang.String
  var label: java.lang.String
  var onChange: js.UndefOr[js.Function1[/* state */ jpmLib.FFAddonSDKNs.ToggleButtonState, _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* state */ jpmLib.FFAddonSDKNs.ToggleButtonState, _]] = js.undefined
}

object Anon_BadgeBadgeColor {
  @scala.inline
  def apply(
    icon: jpmLib.FFAddonSDKNs.Icon,
    id: java.lang.String,
    label: java.lang.String,
    badge: java.lang.String | scala.Double = null,
    badgeColor: java.lang.String = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* state */ jpmLib.FFAddonSDKNs.ToggleButtonState => _ = null,
    onClick: /* state */ jpmLib.FFAddonSDKNs.ToggleButtonState => _ = null
  ): Anon_BadgeBadgeColor = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id, label = label)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[Anon_BadgeBadgeColor]
  }
}

