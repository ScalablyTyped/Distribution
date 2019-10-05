package typings.jpm

import typings.jpm.FFAddonSDK.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadgeBadgeColorChecked extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var badgeColor: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Icon] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object Anon_BadgeBadgeColorChecked {
  @scala.inline
  def apply(
    badge: String | Double = null,
    badgeColor: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: Icon = null,
    label: String = null
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

