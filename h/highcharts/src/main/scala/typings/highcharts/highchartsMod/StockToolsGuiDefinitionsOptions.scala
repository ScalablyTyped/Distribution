package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsOptions extends js.Object {
  var advanced: js.UndefOr[StockToolsGuiDefinitionsAdvancedOptions] = js.undefined
  var crookedLines: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesOptions] = js.undefined
  var currentPriceIndicator: js.UndefOr[StockToolsGuiDefinitionsCurrentPriceIndicatorOptions] = js.undefined
  var flags: js.UndefOr[StockToolsGuiDefinitionsFlagsOptions] = js.undefined
  var fullScreen: js.UndefOr[StockToolsGuiDefinitionsFullScreenOptions] = js.undefined
  var indicators: js.UndefOr[StockToolsGuiDefinitionsIndicatorsOptions] = js.undefined
  var lines: js.UndefOr[StockToolsGuiDefinitionsLinesOptions] = js.undefined
  var measure: js.UndefOr[StockToolsGuiDefinitionsMeasureOptions] = js.undefined
  var saveChart: js.UndefOr[StockToolsGuiDefinitionsSaveChartOptions] = js.undefined
  var separator: js.UndefOr[StockToolsGuiDefinitionsSeparatorOptions] = js.undefined
  var simpleShapes: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesOptions] = js.undefined
  var toggleAnnotations: js.UndefOr[StockToolsGuiDefinitionsToggleAnnotationsOptions] = js.undefined
  var typeChange: js.UndefOr[StockToolsGuiDefinitionsTypeChangeOptions] = js.undefined
  var verticalLabels: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsOptions] = js.undefined
  var zoomChange: js.UndefOr[StockToolsGuiDefinitionsZoomChangeOptions] = js.undefined
}

object StockToolsGuiDefinitionsOptions {
  @scala.inline
  def apply(
    advanced: StockToolsGuiDefinitionsAdvancedOptions = null,
    crookedLines: StockToolsGuiDefinitionsCrookedLinesOptions = null,
    currentPriceIndicator: StockToolsGuiDefinitionsCurrentPriceIndicatorOptions = null,
    flags: StockToolsGuiDefinitionsFlagsOptions = null,
    fullScreen: StockToolsGuiDefinitionsFullScreenOptions = null,
    indicators: StockToolsGuiDefinitionsIndicatorsOptions = null,
    lines: StockToolsGuiDefinitionsLinesOptions = null,
    measure: StockToolsGuiDefinitionsMeasureOptions = null,
    saveChart: StockToolsGuiDefinitionsSaveChartOptions = null,
    separator: StockToolsGuiDefinitionsSeparatorOptions = null,
    simpleShapes: StockToolsGuiDefinitionsSimpleShapesOptions = null,
    toggleAnnotations: StockToolsGuiDefinitionsToggleAnnotationsOptions = null,
    typeChange: StockToolsGuiDefinitionsTypeChangeOptions = null,
    verticalLabels: StockToolsGuiDefinitionsVerticalLabelsOptions = null,
    zoomChange: StockToolsGuiDefinitionsZoomChangeOptions = null
  ): StockToolsGuiDefinitionsOptions = {
    val __obj = js.Dynamic.literal()
    if (advanced != null) __obj.updateDynamic("advanced")(advanced.asInstanceOf[js.Any])
    if (crookedLines != null) __obj.updateDynamic("crookedLines")(crookedLines.asInstanceOf[js.Any])
    if (currentPriceIndicator != null) __obj.updateDynamic("currentPriceIndicator")(currentPriceIndicator.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (fullScreen != null) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (indicators != null) __obj.updateDynamic("indicators")(indicators.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (saveChart != null) __obj.updateDynamic("saveChart")(saveChart.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (simpleShapes != null) __obj.updateDynamic("simpleShapes")(simpleShapes.asInstanceOf[js.Any])
    if (toggleAnnotations != null) __obj.updateDynamic("toggleAnnotations")(toggleAnnotations.asInstanceOf[js.Any])
    if (typeChange != null) __obj.updateDynamic("typeChange")(typeChange.asInstanceOf[js.Any])
    if (verticalLabels != null) __obj.updateDynamic("verticalLabels")(verticalLabels.asInstanceOf[js.Any])
    if (zoomChange != null) __obj.updateDynamic("zoomChange")(zoomChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsOptions]
  }
}

