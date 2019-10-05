package typings.jpm

import typings.jpm.FFAddonSDK.ActionButton
import typings.jpm.FFAddonSDK.ActionButtonState
import typings.jpm.FFAddonSDK.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Badge extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var badgeColor: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: Icon
  var id: String
  var label: String
  var onChange: js.UndefOr[js.Function1[/* state */ ActionButtonState, _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* state */ ActionButton, _]] = js.undefined
}

object Anon_Badge {
  @scala.inline
  def apply(
    icon: Icon,
    id: String,
    label: String,
    badge: String | Double = null,
    badgeColor: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* state */ ActionButtonState => _ = null,
    onClick: /* state */ ActionButton => _ = null
  ): Anon_Badge = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id, label = label)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[Anon_Badge]
  }
}

