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
    val __obj = js.Dynamic.literal(badge = badge, checked = checked, disabled = disabled, id = id, label = label)
  
    __obj.asInstanceOf[ToggleButtonState]
  }
}

