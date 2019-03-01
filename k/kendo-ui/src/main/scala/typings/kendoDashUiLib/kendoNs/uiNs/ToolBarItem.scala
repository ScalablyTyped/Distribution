package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarItem extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var buttons: js.UndefOr[js.Array[ToolBarItemButton]] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var menuButtons: js.UndefOr[js.Array[ToolBarItemMenuButton]] = js.undefined
  var overflow: js.UndefOr[java.lang.String] = js.undefined
  var overflowTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var showIcon: js.UndefOr[java.lang.String] = js.undefined
  var showText: js.UndefOr[java.lang.String] = js.undefined
  var spriteCssClass: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var togglable: js.UndefOr[scala.Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ToolBarItem {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    buttons: js.Array[ToolBarItemButton] = null,
    click: js.Function = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    group: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    id: java.lang.String = null,
    imageUrl: java.lang.String = null,
    menuButtons: js.Array[ToolBarItemMenuButton] = null,
    overflow: java.lang.String = null,
    overflowTemplate: java.lang.String | js.Function = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    showIcon: java.lang.String = null,
    showText: java.lang.String = null,
    spriteCssClass: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    text: java.lang.String = null,
    togglable: js.UndefOr[scala.Boolean] = js.undefined,
    toggle: js.Function = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null
  ): ToolBarItem = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (click != null) __obj.updateDynamic("click")(click)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (menuButtons != null) __obj.updateDynamic("menuButtons")(menuButtons)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (overflowTemplate != null) __obj.updateDynamic("overflowTemplate")(overflowTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (showIcon != null) __obj.updateDynamic("showIcon")(showIcon)
    if (showText != null) __obj.updateDynamic("showText")(showText)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(togglable)) __obj.updateDynamic("togglable")(togglable)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ToolBarItem]
  }
}

