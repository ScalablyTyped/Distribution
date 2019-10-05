package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarItemMenuButton extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var spriteCssClass: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ToolBarItemMenuButton {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    id: String = null,
    imageUrl: String = null,
    spriteCssClass: String = null,
    text: String = null,
    url: String = null
  ): ToolBarItemMenuButton = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ToolBarItemMenuButton]
  }
}

