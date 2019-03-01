package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonState extends js.Object {
  var badge: java.lang.String
  var checked: scala.Boolean
  var disabled: scala.Boolean
  var id: java.lang.String
  var label: java.lang.String
}

object ToggleButtonState {
  @scala.inline
  def apply(
    badge: java.lang.String,
    checked: scala.Boolean,
    disabled: scala.Boolean,
    id: java.lang.String,
    label: java.lang.String
  ): ToggleButtonState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("badge")(badge)
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ToggleButtonState]
  }
}

