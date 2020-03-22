package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectorLineColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var connectorLineColor: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var hoverBackgroundColor: js.UndefOr[String] = js.undefined
  var hoveredIconColor: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var inactiveIconColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object AnonConnectorLineColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    connectorLineColor: String = null,
    disabledTextColor: String = null,
    hoverBackgroundColor: String = null,
    hoveredIconColor: String = null,
    iconColor: String = null,
    inactiveIconColor: String = null,
    textColor: String = null
  ): AnonConnectorLineColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (connectorLineColor != null) __obj.updateDynamic("connectorLineColor")(connectorLineColor.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (hoverBackgroundColor != null) __obj.updateDynamic("hoverBackgroundColor")(hoverBackgroundColor.asInstanceOf[js.Any])
    if (hoveredIconColor != null) __obj.updateDynamic("hoveredIconColor")(hoveredIconColor.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (inactiveIconColor != null) __obj.updateDynamic("inactiveIconColor")(inactiveIconColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectorLineColor]
  }
}

