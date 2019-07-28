package typings.jpm.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonState extends js.Object {
  var badge: String | Double
  var badgeColor: String
  var disabled: Boolean
  var icon: Icon
  var id: String
  var label: String
}

object ActionButtonState {
  @scala.inline
  def apply(
    badge: String | Double,
    badgeColor: String,
    disabled: Boolean,
    icon: Icon,
    id: String,
    label: String
  ): ActionButtonState = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeColor = badgeColor, disabled = disabled, icon = icon.asInstanceOf[js.Any], id = id, label = label)
  
    __obj.asInstanceOf[ActionButtonState]
  }
}

