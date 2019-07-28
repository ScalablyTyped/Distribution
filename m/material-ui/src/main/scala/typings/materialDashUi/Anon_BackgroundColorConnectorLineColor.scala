package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorConnectorLineColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var connectorLineColor: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var hoverBackgroundColor: js.UndefOr[String] = js.undefined
  var hoveredIconColor: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var inactiveIconColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundColorConnectorLineColor {
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
  ): Anon_BackgroundColorConnectorLineColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (connectorLineColor != null) __obj.updateDynamic("connectorLineColor")(connectorLineColor)
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor)
    if (hoverBackgroundColor != null) __obj.updateDynamic("hoverBackgroundColor")(hoverBackgroundColor)
    if (hoveredIconColor != null) __obj.updateDynamic("hoveredIconColor")(hoveredIconColor)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (inactiveIconColor != null) __obj.updateDynamic("inactiveIconColor")(inactiveIconColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BackgroundColorConnectorLineColor]
  }
}

