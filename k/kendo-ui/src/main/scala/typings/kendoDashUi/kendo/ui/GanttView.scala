package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttView extends js.Object {
  var date: js.UndefOr[Date] = js.undefined
  var dayHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var monthHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var range: js.UndefOr[GanttViewRange] = js.undefined
  var resizeTooltipFormat: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var slotSize: js.UndefOr[Double | String] = js.undefined
  var timeHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var weekHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var yearHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
}

object GanttView {
  @scala.inline
  def apply(
    date: Date = null,
    dayHeaderTemplate: String | js.Function = null,
    monthHeaderTemplate: String | js.Function = null,
    range: GanttViewRange = null,
    resizeTooltipFormat: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    slotSize: Double | String = null,
    timeHeaderTemplate: String | js.Function = null,
    `type`: String = null,
    weekHeaderTemplate: String | js.Function = null,
    yearHeaderTemplate: String | js.Function = null
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

