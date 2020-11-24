package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangStockToolsGuiOptions extends js.Object {
  
  var advanced: js.UndefOr[String] = js.native
  
  var arrowLine: js.UndefOr[String] = js.native
  
  var arrowRay: js.UndefOr[String] = js.native
  
  var arrowSegment: js.UndefOr[String] = js.native
  
  var circle: js.UndefOr[String] = js.native
  
  var crooked3: js.UndefOr[String] = js.native
  
  var crooked5: js.UndefOr[String] = js.native
  
  var crookedLines: js.UndefOr[String] = js.native
  
  var currentPriceIndicator: js.UndefOr[String] = js.native
  
  var elliott3: js.UndefOr[String] = js.native
  
  var elliott5: js.UndefOr[String] = js.native
  
  var fibonacci: js.UndefOr[String] = js.native
  
  var flagCirclepin: js.UndefOr[String] = js.native
  
  var flagDiamondpin: js.UndefOr[String] = js.native
  
  var flagSimplepin: js.UndefOr[String] = js.native
  
  var flagSquarepin: js.UndefOr[String] = js.native
  
  var flags: js.UndefOr[String] = js.native
  
  var fullScreen: js.UndefOr[String] = js.native
  
  var horizontalLine: js.UndefOr[String] = js.native
  
  var indicators: js.UndefOr[String] = js.native
  
  var infinityLine: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var line: js.UndefOr[String] = js.native
  
  var lines: js.UndefOr[String] = js.native
  
  var measure: js.UndefOr[String] = js.native
  
  var measureX: js.UndefOr[String] = js.native
  
  var measureXY: js.UndefOr[String] = js.native
  
  var measureY: js.UndefOr[String] = js.native
  
  var parallelChannel: js.UndefOr[String] = js.native
  
  var pitchfork: js.UndefOr[String] = js.native
  
  var ray: js.UndefOr[String] = js.native
  
  var rectangle: js.UndefOr[String] = js.native
  
  var saveChart: js.UndefOr[String] = js.native
  
  var segment: js.UndefOr[String] = js.native
  
  var simpleShapes: js.UndefOr[String] = js.native
  
  var toggleAnnotations: js.UndefOr[String] = js.native
  
  var typeCandlestick: js.UndefOr[String] = js.native
  
  var typeChange: js.UndefOr[String] = js.native
  
  var typeLine: js.UndefOr[String] = js.native
  
  var typeOHLC: js.UndefOr[String] = js.native
  
  var verticalArrow: js.UndefOr[String] = js.native
  
  var verticalCounter: js.UndefOr[String] = js.native
  
  var verticalLabel: js.UndefOr[String] = js.native
  
  var verticalLabels: js.UndefOr[String] = js.native
  
  var verticalLine: js.UndefOr[String] = js.native
  
  var zoomChange: js.UndefOr[String] = js.native
  
  var zoomX: js.UndefOr[String] = js.native
  
  var zoomXY: js.UndefOr[String] = js.native
  
  var zoomY: js.UndefOr[String] = js.native
}
object LangStockToolsGuiOptions {
  
  @scala.inline
  def apply(): LangStockToolsGuiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangStockToolsGuiOptions]
  }
  
  @scala.inline
  implicit class LangStockToolsGuiOptionsOps[Self <: LangStockToolsGuiOptions] (val x: Self) extends AnyVal {
    
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
    def setAdvanced(value: String): Self = this.set("advanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvanced: Self = this.set("advanced", js.undefined)
    
    @scala.inline
    def setArrowLine(value: String): Self = this.set("arrowLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowLine: Self = this.set("arrowLine", js.undefined)
    
    @scala.inline
    def setArrowRay(value: String): Self = this.set("arrowRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowRay: Self = this.set("arrowRay", js.undefined)
    
    @scala.inline
    def setArrowSegment(value: String): Self = this.set("arrowSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowSegment: Self = this.set("arrowSegment", js.undefined)
    
    @scala.inline
    def setCircle(value: String): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    
    @scala.inline
    def setCrooked3(value: String): Self = this.set("crooked3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrooked3: Self = this.set("crooked3", js.undefined)
    
    @scala.inline
    def setCrooked5(value: String): Self = this.set("crooked5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrooked5: Self = this.set("crooked5", js.undefined)
    
    @scala.inline
    def setCrookedLines(value: String): Self = this.set("crookedLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrookedLines: Self = this.set("crookedLines", js.undefined)
    
    @scala.inline
    def setCurrentPriceIndicator(value: String): Self = this.set("currentPriceIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPriceIndicator: Self = this.set("currentPriceIndicator", js.undefined)
    
    @scala.inline
    def setElliott3(value: String): Self = this.set("elliott3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElliott3: Self = this.set("elliott3", js.undefined)
    
    @scala.inline
    def setElliott5(value: String): Self = this.set("elliott5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElliott5: Self = this.set("elliott5", js.undefined)
    
    @scala.inline
    def setFibonacci(value: String): Self = this.set("fibonacci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFibonacci: Self = this.set("fibonacci", js.undefined)
    
    @scala.inline
    def setFlagCirclepin(value: String): Self = this.set("flagCirclepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagCirclepin: Self = this.set("flagCirclepin", js.undefined)
    
    @scala.inline
    def setFlagDiamondpin(value: String): Self = this.set("flagDiamondpin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagDiamondpin: Self = this.set("flagDiamondpin", js.undefined)
    
    @scala.inline
    def setFlagSimplepin(value: String): Self = this.set("flagSimplepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagSimplepin: Self = this.set("flagSimplepin", js.undefined)
    
    @scala.inline
    def setFlagSquarepin(value: String): Self = this.set("flagSquarepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagSquarepin: Self = this.set("flagSquarepin", js.undefined)
    
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setFullScreen(value: String): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setHorizontalLine(value: String): Self = this.set("horizontalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalLine: Self = this.set("horizontalLine", js.undefined)
    
    @scala.inline
    def setIndicators(value: String): Self = this.set("indicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicators: Self = this.set("indicators", js.undefined)
    
    @scala.inline
    def setInfinityLine(value: String): Self = this.set("infinityLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinityLine: Self = this.set("infinityLine", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLines(value: String): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setMeasure(value: String): Self = this.set("measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
    
    @scala.inline
    def setMeasureX(value: String): Self = this.set("measureX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureX: Self = this.set("measureX", js.undefined)
    
    @scala.inline
    def setMeasureXY(value: String): Self = this.set("measureXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureXY: Self = this.set("measureXY", js.undefined)
    
    @scala.inline
    def setMeasureY(value: String): Self = this.set("measureY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureY: Self = this.set("measureY", js.undefined)
    
    @scala.inline
    def setParallelChannel(value: String): Self = this.set("parallelChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelChannel: Self = this.set("parallelChannel", js.undefined)
    
    @scala.inline
    def setPitchfork(value: String): Self = this.set("pitchfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitchfork: Self = this.set("pitchfork", js.undefined)
    
    @scala.inline
    def setRay(value: String): Self = this.set("ray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRay: Self = this.set("ray", js.undefined)
    
    @scala.inline
    def setRectangle(value: String): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
    
    @scala.inline
    def setSaveChart(value: String): Self = this.set("saveChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveChart: Self = this.set("saveChart", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setSimpleShapes(value: String): Self = this.set("simpleShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleShapes: Self = this.set("simpleShapes", js.undefined)
    
    @scala.inline
    def setToggleAnnotations(value: String): Self = this.set("toggleAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleAnnotations: Self = this.set("toggleAnnotations", js.undefined)
    
    @scala.inline
    def setTypeCandlestick(value: String): Self = this.set("typeCandlestick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeCandlestick: Self = this.set("typeCandlestick", js.undefined)
    
    @scala.inline
    def setTypeChange(value: String): Self = this.set("typeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeChange: Self = this.set("typeChange", js.undefined)
    
    @scala.inline
    def setTypeLine(value: String): Self = this.set("typeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeLine: Self = this.set("typeLine", js.undefined)
    
    @scala.inline
    def setTypeOHLC(value: String): Self = this.set("typeOHLC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeOHLC: Self = this.set("typeOHLC", js.undefined)
    
    @scala.inline
    def setVerticalArrow(value: String): Self = this.set("verticalArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalArrow: Self = this.set("verticalArrow", js.undefined)
    
    @scala.inline
    def setVerticalCounter(value: String): Self = this.set("verticalCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalCounter: Self = this.set("verticalCounter", js.undefined)
    
    @scala.inline
    def setVerticalLabel(value: String): Self = this.set("verticalLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalLabel: Self = this.set("verticalLabel", js.undefined)
    
    @scala.inline
    def setVerticalLabels(value: String): Self = this.set("verticalLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalLabels: Self = this.set("verticalLabels", js.undefined)
    
    @scala.inline
    def setVerticalLine(value: String): Self = this.set("verticalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalLine: Self = this.set("verticalLine", js.undefined)
    
    @scala.inline
    def setZoomChange(value: String): Self = this.set("zoomChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomChange: Self = this.set("zoomChange", js.undefined)
    
    @scala.inline
    def setZoomX(value: String): Self = this.set("zoomX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomX: Self = this.set("zoomX", js.undefined)
    
    @scala.inline
    def setZoomXY(value: String): Self = this.set("zoomXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomXY: Self = this.set("zoomXY", js.undefined)
    
    @scala.inline
    def setZoomY(value: String): Self = this.set("zoomY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomY: Self = this.set("zoomY", js.undefined)
  }
}
