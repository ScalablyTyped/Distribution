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
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeColor = badgeColor, disabled = disabled, icon = icon.asInstanceOf[js.Any], id = id, label = label)
  
    __obj.asInstanceOf[ActionButtonState]
  }
}

