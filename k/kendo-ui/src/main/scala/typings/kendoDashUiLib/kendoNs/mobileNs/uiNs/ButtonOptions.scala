package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var badge: js.UndefOr[java.lang.String] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ ButtonClickEvent, scala.Unit]] = js.undefined
  var clickOn: js.UndefOr[java.lang.String] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    badge: java.lang.String = null,
    click: /* e */ ButtonClickEvent => scala.Unit = null,
    clickOn: java.lang.String = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    name: java.lang.String = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (clickOn != null) __obj.updateDynamic("clickOn")(clickOn)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ButtonOptions]
  }
}

