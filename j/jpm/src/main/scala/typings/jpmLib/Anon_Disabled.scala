package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[jpmLib.FFAddonSDKNs.Icon] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: jpmLib.FFAddonSDKNs.Icon = null,
    label: java.lang.String = null
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

