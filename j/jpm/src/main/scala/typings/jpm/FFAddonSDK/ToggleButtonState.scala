package typings.jpm.FFAddonSDK

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
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToggleButtonState]
  }
}

