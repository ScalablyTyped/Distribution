package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridToolbarItem extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object GridToolbarItem {
  @scala.inline
  def apply(
    iconClass: String = null,
    name: String = null,
    template: String | js.Function = null,
    text: String = null
  ): GridToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (name != null) __obj.updateDynamic("name")(name)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[GridToolbarItem]
  }
}

