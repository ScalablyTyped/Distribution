package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityAxisOptions extends js.Object {
  var rangeCategories: js.UndefOr[String] = js.undefined
  var rangeFromTo: js.UndefOr[String] = js.undefined
  var timeRangeDays: js.UndefOr[String] = js.undefined
  var timeRangeHours: js.UndefOr[String] = js.undefined
  var timeRangeMinutes: js.UndefOr[String] = js.undefined
  var timeRangeSeconds: js.UndefOr[String] = js.undefined
  var xAxisDescriptionPlural: js.UndefOr[String] = js.undefined
  var xAxisDescriptionSingular: js.UndefOr[String] = js.undefined
  var yAxisDescriptionPlural: js.UndefOr[String] = js.undefined
  var yAxisDescriptionSingular: js.UndefOr[String] = js.undefined
}

object LangAccessibilityAxisOptions {
  @scala.inline
  def apply(
    rangeCategories: String = null,
    rangeFromTo: String = null,
    timeRangeDays: String = null,
    timeRangeHours: String = null,
    timeRangeMinutes: String = null,
    timeRangeSeconds: String = null,
    xAxisDescriptionPlural: String = null,
    xAxisDescriptionSingular: String = null,
    yAxisDescriptionPlural: String = null,
    yAxisDescriptionSingular: String = null
  ): LangAccessibilityAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (rangeCategories != null) __obj.updateDynamic("rangeCategories")(rangeCategories.asInstanceOf[js.Any])
    if (rangeFromTo != null) __obj.updateDynamic("rangeFromTo")(rangeFromTo.asInstanceOf[js.Any])
    if (timeRangeDays != null) __obj.updateDynamic("timeRangeDays")(timeRangeDays.asInstanceOf[js.Any])
    if (timeRangeHours != null) __obj.updateDynamic("timeRangeHours")(timeRangeHours.asInstanceOf[js.Any])
    if (timeRangeMinutes != null) __obj.updateDynamic("timeRangeMinutes")(timeRangeMinutes.asInstanceOf[js.Any])
    if (timeRangeSeconds != null) __obj.updateDynamic("timeRangeSeconds")(timeRangeSeconds.asInstanceOf[js.Any])
    if (xAxisDescriptionPlural != null) __obj.updateDynamic("xAxisDescriptionPlural")(xAxisDescriptionPlural.asInstanceOf[js.Any])
    if (xAxisDescriptionSingular != null) __obj.updateDynamic("xAxisDescriptionSingular")(xAxisDescriptionSingular.asInstanceOf[js.Any])
    if (yAxisDescriptionPlural != null) __obj.updateDynamic("yAxisDescriptionPlural")(yAxisDescriptionPlural.asInstanceOf[js.Any])
    if (yAxisDescriptionSingular != null) __obj.updateDynamic("yAxisDescriptionSingular")(yAxisDescriptionSingular.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityAxisOptions]
  }
}

