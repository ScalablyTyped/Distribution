package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttTooltip extends js.Object {
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object GanttTooltip {
  @scala.inline
  def apply(template: java.lang.String | js.Function = null, visible: js.UndefOr[scala.Boolean] = js.undefined): GanttTooltip = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GanttTooltip]
  }
}

