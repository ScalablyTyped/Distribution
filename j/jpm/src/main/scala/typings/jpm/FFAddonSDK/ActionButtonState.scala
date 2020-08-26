package typings.jpm.FFAddonSDK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButtonState extends js.Object {
  var badge: String | Double = js.native
  var badgeColor: String = js.native
  var disabled: Boolean = js.native
  var icon: Icon = js.native
  var id: String = js.native
  var label: String = js.native
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
  @scala.inline
  implicit class ActionButtonStateOps[Self <: ActionButtonState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBadge(value: String | Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadgeColor(value: String): Self = this.set("badgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

