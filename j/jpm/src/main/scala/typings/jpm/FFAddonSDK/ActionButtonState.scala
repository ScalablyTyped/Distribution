package typings.jpm.FFAddonSDK

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
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeColor = badgeColor.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonState]
  }
}

