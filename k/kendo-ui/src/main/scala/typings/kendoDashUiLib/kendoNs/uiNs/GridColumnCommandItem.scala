package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnCommandItem extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var iconClass: js.UndefOr[java.lang.String | GridColumnCommandItemIconClass] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String | GridColumnCommandItemText] = js.undefined
  var visible: js.UndefOr[js.Function] = js.undefined
}

object GridColumnCommandItem {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    click: js.Function = null,
    iconClass: java.lang.String | GridColumnCommandItemIconClass = null,
    name: java.lang.String = null,
    template: java.lang.String = null,
    text: java.lang.String | GridColumnCommandItemText = null,
    visible: js.Function = null
  ): GridColumnCommandItem = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (click != null) __obj.updateDynamic("click")(click)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (template != null) __obj.updateDynamic("template")(template)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GridColumnCommandItem]
  }
}

