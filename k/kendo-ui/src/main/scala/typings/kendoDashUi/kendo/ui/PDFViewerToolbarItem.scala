package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerToolbarItem extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var command: js.UndefOr[String] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var overflow: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var showIcon: js.UndefOr[String] = js.undefined
  var showText: js.UndefOr[String] = js.undefined
  var spriteCssClass: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var togglable: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PDFViewerToolbarItem {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    click: js.Function = null,
    command: String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    id: String = null,
    imageUrl: String = null,
    name: String = null,
    overflow: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    showIcon: String = null,
    showText: String = null,
    spriteCssClass: String = null,
    template: String | js.Function = null,
    text: String = null,
    togglable: js.UndefOr[Boolean] = js.undefined,
    toggle: js.Function = null,
    `type`: String = null
  ): PDFViewerToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (click != null) __obj.updateDynamic("click")(click)
    if (command != null) __obj.updateDynamic("command")(command)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (showIcon != null) __obj.updateDynamic("showIcon")(showIcon)
    if (showText != null) __obj.updateDynamic("showText")(showText)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(togglable)) __obj.updateDynamic("togglable")(togglable)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PDFViewerToolbarItem]
  }
}

