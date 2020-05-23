package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ ButtonClickEvent, Unit]] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var spriteCssClass: js.UndefOr[String] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    click: /* e */ ButtonClickEvent => Unit = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconClass: String = null,
    imageUrl: String = null,
    name: String = null,
    spriteCssClass: String = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

