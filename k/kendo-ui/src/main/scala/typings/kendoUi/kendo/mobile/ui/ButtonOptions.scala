package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var badge: js.UndefOr[String] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ ButtonClickEvent, Unit]] = js.undefined
  var clickOn: js.UndefOr[String] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    badge: String = null,
    click: /* e */ ButtonClickEvent => Unit = null,
    clickOn: String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    name: String = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (clickOn != null) __obj.updateDynamic("clickOn")(clickOn.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

