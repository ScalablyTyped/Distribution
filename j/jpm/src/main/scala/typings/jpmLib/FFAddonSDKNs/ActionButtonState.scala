package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonState extends js.Object {
  var badge: java.lang.String | scala.Double
  var badgeColor: java.lang.String
  var disabled: scala.Boolean
  var icon: Icon
  var id: java.lang.String
  var label: java.lang.String
}

object ActionButtonState {
  @scala.inline
  def apply(
    badge: java.lang.String | scala.Double,
    badgeColor: java.lang.String,
    disabled: scala.Boolean,
    icon: Icon,
    id: java.lang.String,
    label: java.lang.String
  ): ActionButtonState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    __obj.updateDynamic("badgeColor")(badgeColor)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ActionButtonState]
  }
}

