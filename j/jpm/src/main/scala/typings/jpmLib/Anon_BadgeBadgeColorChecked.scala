package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadgeBadgeColorChecked extends js.Object {
  var badge: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var badgeColor: js.UndefOr[java.lang.String] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[jpmLib.FFAddonSDKNs.Icon] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BadgeBadgeColorChecked {
  @scala.inline
  def apply(
    badge: java.lang.String | scala.Double = null,
    badgeColor: java.lang.String = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: jpmLib.FFAddonSDKNs.Icon = null,
    label: java.lang.String = null
  ): Anon_BadgeBadgeColorChecked = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_BadgeBadgeColorChecked]
  }
}

