package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttToolbarItem extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object GanttToolbarItem {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    text: java.lang.String = null
  ): GanttToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[GanttToolbarItem]
  }
}

