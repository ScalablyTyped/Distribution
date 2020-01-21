package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnCommandItem extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var iconClass: js.UndefOr[String | GridColumnCommandItemIconClass] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String | GridColumnCommandItemText] = js.undefined
  var visible: js.UndefOr[js.Function] = js.undefined
}

object GridColumnCommandItem {
  @scala.inline
  def apply(
    className: String = null,
    click: js.Function = null,
    iconClass: String | GridColumnCommandItemIconClass = null,
    name: String = null,
    template: String = null,
    text: String | GridColumnCommandItemText = null,
    visible: js.Function = null
  ): GridColumnCommandItem = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnCommandItem]
  }
}

