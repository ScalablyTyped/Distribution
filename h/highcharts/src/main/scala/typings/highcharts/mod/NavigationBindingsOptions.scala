package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBindingsOptions extends js.Object {
  
  /**
    * (Highstock) A line with arrow annotation. Includes `start` and one event
    * in `steps` array.
    */
  var arrowInfinityLine: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A ray with an arrow annotation bindings. Includes `start` and
    * one event in `steps` array.
    */
  var arrowRay: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A segment with an arrow annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var arrowSegment: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock) A circle annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var circleAnnotation: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Crooked line (three points) annotation bindings. Includes
    * `start` and two events in `steps` (for second and third points in crooked
    * line) array.
    */
  var crooked3: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Crooked line (five points) annotation bindings. Includes
    * `start` and four events in `steps` (for all consequent points in crooked
    * line) array.
    */
  var crooked5: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Hides/shows two price indicators:
    *
    * - last price in the dataset
    *
    * - last price in the selected range
    */
  var currentPriceIndicator: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Elliott wave (three points) annotation bindings. Includes
    * `start` and two events in `steps` (for second and third points) array.
    */
  var elliott3: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Elliott wave (five points) annotation bindings. Includes
    * `start` and four event in `steps` (for all consequent points in Elliott
    * wave) array.
    */
  var elliott5: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A fibonacci annotation bindings. Includes `start` and two
    * events in `steps` array (updates second point, then height).
    */
  var fibonacci: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'circlepin'`
    * shape.
    */
  var flagCirclepin: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'diamondpin'`
    * shape.
    */
  var flagDiamondpin: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag without pin shape.
    */
  var flagSimplepin: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'squarepin'`
    * shape.
    */
  var flagSquarepin: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Displays chart in fullscreen.
    *
    * **Note**: Fullscreen is not supported on iPhone due to iOS limitations.
    */
  var fullScreen: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A horizontal line annotation. Includes `start` event.
    */
  var horizontalLine: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Indicators bindings. Includes `init` event to show a popup.
    *
    * Note: In order to show base series from the chart in the popup's dropdown
    * each series requires series.id to be defined.
    */
  var indicators: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A line annotation. Includes `start` and one event in `steps`
    * array.
    */
  var infinityLine: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock) A label annotation bindings. Includes `start`
    * event only.
    */
  var labelAnnotation: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A measure (x-dimension) annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var measureX: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A measure (xy-dimension) annotation bindings. Includes
    * `start` and one event in `steps` array.
    */
  var measureXY: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A measure (y-dimension) annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var measureY: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A parallel channel (tunnel) annotation bindings. Includes
    * `start` and two events in `steps` array (updates second point, then
    * height).
    */
  var parallelChannel: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) An Andrew's pitchfork annotation bindings. Includes `start`
    * and two events in `steps` array (sets second and third control points).
    */
  var pitchfork: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A ray annotation bindings. Includes `start` and one event in
    * `steps` array.
    */
  var ray: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock) A rectangle annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var rectangleAnnotation: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Save a chart in localStorage under `highcharts-chart` key.
    * Stored items:
    *
    * - annotations
    *
    * - indicators (with yAxes)
    *
    * - flags
    */
  var saveChart: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A segment annotation bindings. Includes `start` and one event
    * in `steps` array.
    */
  var segment: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Changes main series to `'candlestick'` type.
    */
  var seriesTypeCandlestick: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Changes main series to `'line'` type.
    */
  var seriesTypeLine: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Changes main series to `'ohlc'` type.
    */
  var seriesTypeOhlc: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Hides/shows all annotations on a chart.
    */
  var toggleAnnotations: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow. Green arrow
    * when pointing from above, red when pointing from below the point.
    */
  var verticalArrow: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A vertical counter annotation bindings. Includes `start`
    * event. On click, finds the closest point and marks it with a numeric
    * annotation - incrementing counter on each add.
    */
  var verticalCounter: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow and a label
    * with value.
    */
  var verticalLabel: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) A vertical line annotation. Includes `start` event.
    */
  var verticalLine: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Enables zooming in xAxis on a chart. Includes `start` event
    * which changes chart.zoomType.
    */
  var zoomX: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Enables zooming in xAxis and yAxis on a chart. Includes
    * `start` event which changes chart.zoomType.
    */
  var zoomXY: js.UndefOr[NavigationBindingsOptionsObject] = js.native
  
  /**
    * (Highstock) Enables zooming in yAxis on a chart. Includes `start` event
    * which changes chart.zoomType.
    */
  var zoomY: js.UndefOr[NavigationBindingsOptionsObject] = js.native
}
object NavigationBindingsOptions {
  
  @scala.inline
  def apply(): NavigationBindingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsOptions]
  }
  
  @scala.inline
  implicit class NavigationBindingsOptionsOps[Self <: NavigationBindingsOptions] (val x: Self) extends AnyVal {
    
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
    def setArrowInfinityLine(value: NavigationBindingsOptionsObject): Self = this.set("arrowInfinityLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowInfinityLine: Self = this.set("arrowInfinityLine", js.undefined)
    
    @scala.inline
    def setArrowRay(value: NavigationBindingsOptionsObject): Self = this.set("arrowRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowRay: Self = this.set("arrowRay", js.undefined)
    
    @scala.inline
    def setArrowSegment(value: NavigationBindingsOptionsObject): Self = this.set("arrowSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowSegment: Self = this.set("arrowSegment", js.undefined)
    
    @scala.inline
    def setCircleAnnotation(value: NavigationBindingsOptionsObject): Self = this.set("circleAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircleAnnotation: Self = this.set("circleAnnotation", js.undefined)
    
    @scala.inline
    def setCrooked3(value: NavigationBindingsOptionsObject): Self = this.set("crooked3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrooked3: Self = this.set("crooked3", js.undefined)
    
    @scala.inline
    def setCrooked5(value: NavigationBindingsOptionsObject): Self = this.set("crooked5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrooked5: Self = this.set("crooked5", js.undefined)
    
    @scala.inline
    def setCurrentPriceIndicator(value: NavigationBindingsOptionsObject): Self = this.set("currentPriceIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPriceIndicator: Self = this.set("currentPriceIndicator", js.undefined)
    
    @scala.inline
    def setElliott3(value: NavigationBindingsOptionsObject): Self = this.set("elliott3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElliott3: Self = this.set("elliott3", js.undefined)
    
    @scala.inline
    def setElliott5(value: NavigationBindingsOptionsObject): Self = this.set("elliott5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElliott5: Self = this.set("elliott5", js.undefined)
    
    @scala.inline
    def setFibonacci(value: NavigationBindingsOptionsObject): Self = this.set("fibonacci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFibonacci: Self = this.set("fibonacci", js.undefined)
    
    @scala.inline
    def setFlagCirclepin(value: NavigationBindingsOptionsObject): Self = this.set("flagCirclepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagCirclepin: Self = this.set("flagCirclepin", js.undefined)
    
    @scala.inline
    def setFlagDiamondpin(value: NavigationBindingsOptionsObject): Self = this.set("flagDiamondpin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagDiamondpin: Self = this.set("flagDiamondpin", js.undefined)
    
    @scala.inline
    def setFlagSimplepin(value: NavigationBindingsOptionsObject): Self = this.set("flagSimplepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagSimplepin: Self = this.set("flagSimplepin", js.undefined)
    
    @scala.inline
    def setFlagSquarepin(value: NavigationBindingsOptionsObject): Self = this.set("flagSquarepin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagSquarepin: Self = this.set("flagSquarepin", js.undefined)
    
    @scala.inline
    def setFullScreen(value: NavigationBindingsOptionsObject): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setHorizontalLine(value: NavigationBindingsOptionsObject): Self = this.set("horizontalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalLine: Self = this.set("horizontalLine", js.undefined)
    
    @scala.inline
    def setIndicators(value: NavigationBindingsOptionsObject): Self = this.set("indicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicators: Self = this.set("indicators", js.undefined)
    
    @scala.inline
    def setInfinityLine(value: NavigationBindingsOptionsObject): Self = this.set("infinityLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinityLine: Self = this.set("infinityLine", js.undefined)
    
    @scala.inline
    def setLabelAnnotation(value: NavigationBindingsOptionsObject): Self = this.set("labelAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAnnotation: Self = this.set("labelAnnotation", js.undefined)
    
    @scala.inline
    def setMeasureX(value: NavigationBindingsOptionsObject): Self = this.set("measureX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureX: Self = this.set("measureX", js.undefined)
    
    @scala.inline
    def setMeasureXY(value: NavigationBindingsOptionsObject): Self = this.set("measureXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureXY: Self = this.set("measureXY", js.undefined)
    
    @scala.inline
    def setMeasureY(value: NavigationBindingsOptionsObject): Self = this.set("measureY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureY: Self = this.set("measureY", js.undefined)
    
    @scala.inline
    def setParallelChannel(value: NavigationBindingsOptionsObject): Self = this.set("parallelChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelChannel: Self = this.set("parallelChannel", js.undefined)
    
    @scala.inline
    def setPitchfork(value: NavigationBindingsOptionsObject): Self = this.set("pitchfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitchfork: Self = this.set("pitchfork", js.undefined)
    
    @scala.inline
    def setRay(value: NavigationBindingsOptionsObject): Self = this.set("ray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRay: Self = this.set("ray", js.undefined)
    
    @scala.inline
    def setRectangleAnnotation(value: NavigationBindingsOptionsObject): Self = this.set("rectangleAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangleAnnotation: Self = this.set("rectangleAnnotation", js.undefined)
    
    @scala.inline
    def setSaveChart(value: NavigationBindingsOptionsObject): Self = this.set("saveChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveChart: Self = this.set("saveChart", js.undefined)
    
    @scala.inline
    def setSegment(value: NavigationBindingsOptionsObject): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setSeriesTypeCandlestick(value: NavigationBindingsOptionsObject): Self = this.set("seriesTypeCandlestick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesTypeCandlestick: Self = this.set("seriesTypeCandlestick", js.undefined)
    
    @scala.inline
    def setSeriesTypeLine(value: NavigationBindingsOptionsObject): Self = this.set("seriesTypeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesTypeLine: Self = this.set("seriesTypeLine", js.undefined)
    
    @scala.inline
    def setSeriesTypeOhlc(value: NavigationBindingsOptionsObject): Self = this.set("seriesTypeOhlc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesTypeOhlc: Self = this.set("seriesTypeOhlc", js.undefined)
    
    @scala.inline
    def setToggleAnnotations(value: NavigationBindingsOptionsObject): Self = this.set("toggleAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleAnnotations: Self = this.set("toggleAnnotations", js.undefined)
    
    @scala.inline
    def setVerticalArrow(value: NavigationBindingsOptionsObject): Self = this.set("verticalArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalArrow: Self = this.set("verticalArrow", js.undefined)
    
    @scala.inline
    def setVerticalCounter(value: NavigationBindingsOptionsObject): Self = this.set("verticalCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalCounter: Self = this.set("verticalCounter", js.undefined)
    
    @scala.inline
    def setVerticalLabel(value: NavigationBindingsOptionsObject): Self = this.set("verticalLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalLabel: Self = this.set("verticalLabel", js.undefined)
    
    @scala.inline
    def setVerticalLine(value: NavigationBindingsOptionsObject): Self = this.set("verticalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalLine: Self = this.set("verticalLine", js.undefined)
    
    @scala.inline
    def setZoomX(value: NavigationBindingsOptionsObject): Self = this.set("zoomX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomX: Self = this.set("zoomX", js.undefined)
    
    @scala.inline
    def setZoomXY(value: NavigationBindingsOptionsObject): Self = this.set("zoomXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomXY: Self = this.set("zoomXY", js.undefined)
    
    @scala.inline
    def setZoomY(value: NavigationBindingsOptionsObject): Self = this.set("zoomY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomY: Self = this.set("zoomY", js.undefined)
  }
}
