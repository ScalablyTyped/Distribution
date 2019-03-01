package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ ButtonClickEvent, scala.Unit]] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var spriteCssClass: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    click: js.Function1[/* e */ ButtonClickEvent, scala.Unit] = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    iconClass: java.lang.String = null,
    imageUrl: java.lang.String = null,
    name: java.lang.String = null,
    spriteCssClass: java.lang.String = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    __obj.asInstanceOf[ButtonOptions]
  }
}

