package typings.jpm.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonState extends js.Object {
  var badge: String
  var checked: Boolean
  var disabled: Boolean
  var id: String
  var label: String
}

object ToggleButtonState {
  @scala.inline
  def apply(badge: String, checked: Boolean, disabled: Boolean, id: String, label: String): ToggleButtonState = {
    val __obj = js.Dynamic.literal(badge = badge, checked = checked, disabled = disabled, id = id, label = label)
  
    __obj.asInstanceOf[ToggleButtonState]
  }
}

