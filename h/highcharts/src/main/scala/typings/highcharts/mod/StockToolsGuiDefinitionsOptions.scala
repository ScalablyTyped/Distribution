package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsOptions extends js.Object {
  var advanced: js.UndefOr[StockToolsGuiDefinitionsAdvancedOptions] = js.native
  var crookedLines: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesOptions] = js.native
  var currentPriceIndicator: js.UndefOr[StockToolsGuiDefinitionsCurrentPriceIndicatorOptions] = js.native
  var flags: js.UndefOr[StockToolsGuiDefinitionsFlagsOptions] = js.native
  var fullScreen: js.UndefOr[StockToolsGuiDefinitionsFullScreenOptions] = js.native
  var indicators: js.UndefOr[StockToolsGuiDefinitionsIndicatorsOptions] = js.native
  var lines: js.UndefOr[StockToolsGuiDefinitionsLinesOptions] = js.native
  var measure: js.UndefOr[StockToolsGuiDefinitionsMeasureOptions] = js.native
  var saveChart: js.UndefOr[StockToolsGuiDefinitionsSaveChartOptions] = js.native
  var separator: js.UndefOr[StockToolsGuiDefinitionsSeparatorOptions] = js.native
  var simpleShapes: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesOptions] = js.native
  var toggleAnnotations: js.UndefOr[StockToolsGuiDefinitionsToggleAnnotationsOptions] = js.native
  var typeChange: js.UndefOr[StockToolsGuiDefinitionsTypeChangeOptions] = js.native
  var verticalLabels: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsOptions] = js.native
  var zoomChange: js.UndefOr[StockToolsGuiDefinitionsZoomChangeOptions] = js.native
}

object StockToolsGuiDefinitionsOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsOptionsOps[Self <: StockToolsGuiDefinitionsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvanced(value: StockToolsGuiDefinitionsAdvancedOptions): Self = this.set("advanced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvanced: Self = this.set("advanced", js.undefined)
    @scala.inline
    def setCrookedLines(value: StockToolsGuiDefinitionsCrookedLinesOptions): Self = this.set("crookedLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrookedLines: Self = this.set("crookedLines", js.undefined)
    @scala.inline
    def setCurrentPriceIndicator(value: StockToolsGuiDefinitionsCurrentPriceIndicatorOptions): Self = this.set("currentPriceIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPriceIndicator: Self = this.set("currentPriceIndicator", js.undefined)
    @scala.inline
    def setFlags(value: StockToolsGuiDefinitionsFlagsOptions): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setFullScreen(value: StockToolsGuiDefinitionsFullScreenOptions): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setIndicators(value: StockToolsGuiDefinitionsIndicatorsOptions): Self = this.set("indicators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicators: Self = this.set("indicators", js.undefined)
    @scala.inline
    def setLines(value: StockToolsGuiDefinitionsLinesOptions): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setMeasure(value: StockToolsGuiDefinitionsMeasureOptions): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
    @scala.inline
    def setSaveChart(value: StockToolsGuiDefinitionsSaveChartOptions): Self = this.set("saveChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveChart: Self = this.set("saveChart", js.undefined)
    @scala.inline
    def setSeparator(value: StockToolsGuiDefinitionsSeparatorOptions): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSimpleShapes(value: StockToolsGuiDefinitionsSimpleShapesOptions): Self = this.set("simpleShapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleShapes: Self = this.set("simpleShapes", js.undefined)
    @scala.inline
    def setToggleAnnotations(value: StockToolsGuiDefinitionsToggleAnnotationsOptions): Self = this.set("toggleAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleAnnotations: Self = this.set("toggleAnnotations", js.undefined)
    @scala.inline
    def setTypeChange(value: StockToolsGuiDefinitionsTypeChangeOptions): Self = this.set("typeChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeChange: Self = this.set("typeChange", js.undefined)
    @scala.inline
    def setVerticalLabels(value: StockToolsGuiDefinitionsVerticalLabelsOptions): Self = this.set("verticalLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalLabels: Self = this.set("verticalLabels", js.undefined)
    @scala.inline
    def setZoomChange(value: StockToolsGuiDefinitionsZoomChangeOptions): Self = this.set("zoomChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomChange: Self = this.set("zoomChange", js.undefined)
  }
  
}

