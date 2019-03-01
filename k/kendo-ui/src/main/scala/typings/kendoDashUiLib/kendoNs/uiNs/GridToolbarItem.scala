package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridToolbarItem extends js.Object {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object GridToolbarItem {
  @scala.inline
  def apply(
    iconClass: java.lang.String = null,
    name: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    text: java.lang.String = null
  ): GridToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (name != null) __obj.updateDynamic("name")(name)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[GridToolbarItem]
  }
}

