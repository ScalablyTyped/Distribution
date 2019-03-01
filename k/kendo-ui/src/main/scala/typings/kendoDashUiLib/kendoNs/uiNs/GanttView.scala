package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttView extends js.Object {
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var dayHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var monthHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var range: js.UndefOr[GanttViewRange] = js.undefined
  var resizeTooltipFormat: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var slotSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var timeHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var weekHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var yearHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object GanttView {
  @scala.inline
  def apply(
    date: stdLib.Date = null,
    dayHeaderTemplate: java.lang.String | js.Function = null,
    monthHeaderTemplate: java.lang.String | js.Function = null,
    range: GanttViewRange = null,
    resizeTooltipFormat: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    slotSize: scala.Double | java.lang.String = null,
    timeHeaderTemplate: java.lang.String | js.Function = null,
    `type`: java.lang.String = null,
    weekHeaderTemplate: java.lang.String | js.Function = null,
    yearHeaderTemplate: java.lang.String | js.Function = null
  ): GanttView = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (dayHeaderTemplate != null) __obj.updateDynamic("dayHeaderTemplate")(dayHeaderTemplate.asInstanceOf[js.Any])
    if (monthHeaderTemplate != null) __obj.updateDynamic("monthHeaderTemplate")(monthHeaderTemplate.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (resizeTooltipFormat != null) __obj.updateDynamic("resizeTooltipFormat")(resizeTooltipFormat)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (slotSize != null) __obj.updateDynamic("slotSize")(slotSize.asInstanceOf[js.Any])
    if (timeHeaderTemplate != null) __obj.updateDynamic("timeHeaderTemplate")(timeHeaderTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (weekHeaderTemplate != null) __obj.updateDynamic("weekHeaderTemplate")(weekHeaderTemplate.asInstanceOf[js.Any])
    if (yearHeaderTemplate != null) __obj.updateDynamic("yearHeaderTemplate")(yearHeaderTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttView]
  }
}

