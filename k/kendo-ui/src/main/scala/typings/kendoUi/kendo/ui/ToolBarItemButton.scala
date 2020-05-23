package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarItemButton extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var showIcon: js.UndefOr[String] = js.undefined
  var showText: js.UndefOr[String] = js.undefined
  var spriteCssClass: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var togglable: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ToolBarItemButton {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    click: js.Function = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    id: String = null,
    imageUrl: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    showIcon: String = null,
    showText: String = null,
    spriteCssClass: String = null,
    text: String = null,
    togglable: js.UndefOr[Boolean] = js.undefined,
    toggle: js.Function = null,
    url: String = null
  ): ToolBarItemButton = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (showIcon != null) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (showText != null) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(togglable)) __obj.updateDynamic("togglable")(togglable.get.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarItemButton]
  }
}

