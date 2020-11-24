package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangNavigationPopupOptions extends js.Object {
  
  var addButton: js.UndefOr[String] = js.native
  
  var arrowLine: js.UndefOr[String] = js.native
  
  var arrowRay: js.UndefOr[String] = js.native
  
  var arrowSegment: js.UndefOr[String] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var backgroundColors: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderRadius: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[String] = js.native
  
  var circle: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var connector: js.UndefOr[String] = js.native
  
  var crooked3: js.UndefOr[String] = js.native
  
  var crooked5: js.UndefOr[String] = js.native
  
  var crosshairX: js.UndefOr[String] = js.native
  
  var crosshairY: js.UndefOr[String] = js.native
  
  var editButton: js.UndefOr[String] = js.native
  
  var elliott3: js.UndefOr[String] = js.native
  
  var elliott5: js.UndefOr[String] = js.native
  
  var fibonacci: js.UndefOr[String] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var flags: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var horizontalLine: js.UndefOr[String] = js.native
  
  var infinityLine: js.UndefOr[String] = js.native
  
  var innerBackground: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelOptions: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[String] = js.native
  
  var line: js.UndefOr[String] = js.native
  
  var lines: js.UndefOr[String] = js.native
  
  var measure: js.UndefOr[String] = js.native
  
  var measureX: js.UndefOr[String] = js.native
  
  var measureXY: js.UndefOr[String] = js.native
  
  var measureY: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var outerBackground: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[String] = js.native
  
  var parallelChannel: js.UndefOr[String] = js.native
  
  var pitchfork: js.UndefOr[String] = js.native
  
  var ray: js.UndefOr[String] = js.native
  
  var rectangle: js.UndefOr[String] = js.native
  
  var removeButton: js.UndefOr[String] = js.native
  
  var saveButton: js.UndefOr[String] = js.native
  
  var segment: js.UndefOr[String] = js.native
  
  var series: js.UndefOr[String] = js.native
  
  var shapeOptions: js.UndefOr[String] = js.native
  
  var shapes: js.UndefOr[String] = js.native
  
  var simpleShapes: js.UndefOr[String] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeWidth: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var tunnel: js.UndefOr[String] = js.native
  
  var typeOptions: js.UndefOr[String] = js.native
  
  var verticalArrow: js.UndefOr[String] = js.native
  
  var verticalCounter: js.UndefOr[String] = js.native
  
  var verticalLabel: js.UndefOr[String] = js.native
  
  var verticalLine: js.UndefOr[String] = js.native
  
  var volume: js.UndefOr[String] = js.native
}
object LangNavigationPopupOptions {
  
  @scala.inline
  def apply(): LangNavigationPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangNavigationPopupOptions]
  }
  
  @scala.inline
  implicit class LangNavigationPopupOptionsOps[Self <: LangNavigationPopupOptions] (val x: Self) extends AnyVal {
    
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
    def setAddButton(value: String): Self = this.set("addButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddButton: Self = this.set("addButton", js.undefined)
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColors(value: String): Self = this.set("backgroundColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColors: Self = this.set("backgroundColors", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: String): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setCircle(value: String): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setConnector(value: String): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    
    @scala.inline
    def setCrooked3(value: String): Self = this.set("crooked3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrooked3: Self = this.set("crooked3", js.undefined)
    
    @scala.inline
    def setCrooked5(value: String): Self = this.set("crooked5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrooked5: Self = this.set("crooked5", js.undefined)
    
    @scala.inline
    def setCrosshairX(value: String): Self = this.set("crosshairX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairX: Self = this.set("crosshairX", js.undefined)
    
    @scala.inline
    def setCrosshairY(value: String): Self = this.set("crosshairY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairY: Self = this.set("crosshairY", js.undefined)
    
    @scala.inline
    def setEditButton(value: String): Self = this.set("editButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditButton: Self = this.set("editButton", js.undefined)
    
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizontalLine(value: String): Self = this.set("horizontalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalLine: Self = this.set("horizontalLine", js.undefined)
    
    @scala.inline
    def setInfinityLine(value: String): Self = this.set("infinityLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinityLine: Self = this.set("infinityLine", js.undefined)
    
    @scala.inline
    def setInnerBackground(value: String): Self = this.set("innerBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerBackground: Self = this.set("innerBackground", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelOptions(value: String): Self = this.set("labelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOptions: Self = this.set("labelOptions", js.undefined)
    
    @scala.inline
    def setLabels(value: String): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOuterBackground(value: String): Self = this.set("outerBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterBackground: Self = this.set("outerBackground", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
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
    def setRemoveButton(value: String): Self = this.set("removeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveButton: Self = this.set("removeButton", js.undefined)
    
    @scala.inline
    def setSaveButton(value: String): Self = this.set("saveButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveButton: Self = this.set("saveButton", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setShapeOptions(value: String): Self = this.set("shapeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeOptions: Self = this.set("shapeOptions", js.undefined)
    
    @scala.inline
    def setShapes(value: String): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    
    @scala.inline
    def setSimpleShapes(value: String): Self = this.set("simpleShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleShapes: Self = this.set("simpleShapes", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: String): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTunnel(value: String): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
    
    @scala.inline
    def setTypeOptions(value: String): Self = this.set("typeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeOptions: Self = this.set("typeOptions", js.undefined)
    
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
    def setVerticalLine(value: String): Self = this.set("verticalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalLine: Self = this.set("verticalLine", js.undefined)
    
    @scala.inline
    def setVolume(value: String): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
