package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilitySeriesTypeDescriptionsOptions extends js.Object {
  var arearange: js.UndefOr[String] = js.undefined
  var areasplinerange: js.UndefOr[String] = js.undefined
  var boxplot: js.UndefOr[String] = js.undefined
  var bubble: js.UndefOr[String] = js.undefined
  var columnrange: js.UndefOr[String] = js.undefined
  var errorbar: js.UndefOr[String] = js.undefined
  var funnel: js.UndefOr[String] = js.undefined
  var pyramid: js.UndefOr[String] = js.undefined
  var waterfall: js.UndefOr[String] = js.undefined
}

object LangAccessibilitySeriesTypeDescriptionsOptions {
  @scala.inline
  def apply(
    arearange: String = null,
    areasplinerange: String = null,
    boxplot: String = null,
    bubble: String = null,
    columnrange: String = null,
    errorbar: String = null,
    funnel: String = null,
    pyramid: String = null,
    waterfall: String = null
  ): LangAccessibilitySeriesTypeDescriptionsOptions = {
    val __obj = js.Dynamic.literal()
    if (arearange != null) __obj.updateDynamic("arearange")(arearange)
    if (areasplinerange != null) __obj.updateDynamic("areasplinerange")(areasplinerange)
    if (boxplot != null) __obj.updateDynamic("boxplot")(boxplot)
    if (bubble != null) __obj.updateDynamic("bubble")(bubble)
    if (columnrange != null) __obj.updateDynamic("columnrange")(columnrange)
    if (errorbar != null) __obj.updateDynamic("errorbar")(errorbar)
    if (funnel != null) __obj.updateDynamic("funnel")(funnel)
    if (pyramid != null) __obj.updateDynamic("pyramid")(pyramid)
    if (waterfall != null) __obj.updateDynamic("waterfall")(waterfall)
    __obj.asInstanceOf[LangAccessibilitySeriesTypeDescriptionsOptions]
  }
}

