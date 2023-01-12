package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBindingsOptions extends StObject {
  
  /**
    * (Highstock) A line with arrow annotation. Includes `start` and one event
    * in `steps` array.
    */
  var arrowInfinityLine: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A ray with an arrow annotation bindings. Includes `start` and
    * one event in `steps` array.
    */
  var arrowRay: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A segment with an arrow annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var arrowSegment: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) A circle annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var circleAnnotation: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Crooked line (three points) annotation bindings. Includes
    * `start` and two events in `steps` (for second and third points in crooked
    * line) array.
    */
  var crooked3: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Crooked line (five points) annotation bindings. Includes
    * `start` and four events in `steps` (for all consequent points in crooked
    * line) array.
    */
  var crooked5: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Hides/shows two price indicators:
    *
    * - last price in the dataset
    *
    * - last price in the selected range
    */
  var currentPriceIndicator: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Elliott wave (three points) annotation bindings. Includes
    * `start` and two events in `steps` (for second and third points) array.
    */
  var elliott3: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Elliott wave (five points) annotation bindings. Includes
    * `start` and four event in `steps` (for all consequent points in Elliott
    * wave) array.
    */
  var elliott5: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) A ellipse annotation bindings. Includes `start`
    * and two events in `steps` array. First updates the second point,
    * responsible for a rx width, and second updates the ry width.
    */
  var ellipseAnnotation: js.UndefOr[NavigationBindingsEllipseAnnotationOptions | NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A fibonacci annotation bindings. Includes `start` and two
    * events in `steps` array (updates second point, then height).
    */
  var fibonacci: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) The Fibonacci Time Zones annotation bindings. Includes
    * `start` and one event in `steps` array.
    */
  var fibonacciTimeZones: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'circlepin'`
    * shape.
    */
  var flagCirclepin: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'diamondpin'`
    * shape.
    */
  var flagDiamondpin: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag without pin shape.
    */
  var flagSimplepin: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'squarepin'`
    * shape.
    */
  var flagSquarepin: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Displays chart in fullscreen.
    *
    * **Note**: Fullscreen is not supported on iPhone due to iOS limitations.
    */
  var fullScreen: js.UndefOr[NavigationBindingsFullScreenOptions | NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A horizontal line annotation. Includes `start` event.
    */
  var horizontalLine: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Indicators bindings. Includes `init` event to show a popup.
    *
    * Note: In order to show base series from the chart in the popup's dropdown
    * each series requires series.id to be defined.
    */
  var indicators: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A line annotation. Includes `start` and one event in `steps`
    * array.
    */
  var infinityLine: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) A label annotation bindings. Includes `start`
    * event only.
    */
  var labelAnnotation: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A measure (x-dimension) annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var measureX: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A measure (xy-dimension) annotation bindings. Includes
    * `start` and one event in `steps` array.
    */
  var measureXY: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A measure (y-dimension) annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var measureY: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A parallel channel (tunnel) annotation bindings. Includes
    * `start` and two events in `steps` array (updates second point, then
    * height).
    */
  var parallelChannel: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) An Andrew's pitchfork annotation bindings. Includes `start`
    * and two events in `steps` array (sets second and third control points).
    */
  var pitchfork: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A ray annotation bindings. Includes `start` and one event in
    * `steps` array.
    */
  var ray: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) A rectangle annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var rectangleAnnotation: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
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
  var saveChart: js.UndefOr[NavigationBindingsOptionsObject | NavigationBindingsSaveChartOptions] = js.undefined
  
  /**
    * (Highstock) A segment annotation bindings. Includes `start` and one event
    * in `steps` array.
    */
  var segment: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Changes main series to `'candlestick'` type.
    */
  var seriesTypeCandlestick: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Change main series to `'hlc'` type.
    */
  var seriesTypeHLC: js.UndefOr[NavigationBindingsOptionsObject | NavigationBindingsSeriesTypeHLCOptions] = js.undefined
  
  /**
    * (Highstock) Changes main series to `'heikinashi'` type.
    */
  var seriesTypeHeikinAshi: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Changes main series to `'hollowcandlestick'` type.
    */
  var seriesTypeHollowCandlestick: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Changes main series to `'line'` type.
    */
  var seriesTypeLine: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Changes main series to `'ohlc'` type.
    */
  var seriesTypeOhlc: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A time cycles annotation bindings. Includes `start` event and
    * 1 `step` event. first click marks the beginning of the circle, and the
    * second one sets its diameter.
    */
  var timeCycles: js.UndefOr[NavigationBindingsOptionsObject | NavigationBindingsTimeCyclesOptions] = js.undefined
  
  /**
    * (Highstock) Hides/shows all annotations on a chart.
    */
  var toggleAnnotations: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow. `#06b535`
    * is the color of the arrow when pointing from above and `#f21313` when
    * pointing from below the point.
    */
  var verticalArrow: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A vertical counter annotation bindings. Includes `start`
    * event. On click, finds the closest point and marks it with a numeric
    * annotation - incrementing counter on each add.
    */
  var verticalCounter: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) A vertical line annotation. Includes `start` event.
    */
  var verticalLine: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Enables zooming in xAxis on a chart. Includes `start` event
    * which changes chart.zoomType.
    */
  var zoomX: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Enables zooming in xAxis and yAxis on a chart. Includes
    * `start` event which changes chart.zoomType.
    */
  var zoomXY: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  
  /**
    * (Highstock) Enables zooming in yAxis on a chart. Includes `start` event
    * which changes chart.zoomType.
    */
  var zoomY: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
}
object NavigationBindingsOptions {
  
  inline def apply(): NavigationBindingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationBindingsOptions] (val x: Self) extends AnyVal {
    
    inline def setArrowInfinityLine(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "arrowInfinityLine", value.asInstanceOf[js.Any])
    
    inline def setArrowInfinityLineUndefined: Self = StObject.set(x, "arrowInfinityLine", js.undefined)
    
    inline def setArrowRay(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "arrowRay", value.asInstanceOf[js.Any])
    
    inline def setArrowRayUndefined: Self = StObject.set(x, "arrowRay", js.undefined)
    
    inline def setArrowSegment(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "arrowSegment", value.asInstanceOf[js.Any])
    
    inline def setArrowSegmentUndefined: Self = StObject.set(x, "arrowSegment", js.undefined)
    
    inline def setCircleAnnotation(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "circleAnnotation", value.asInstanceOf[js.Any])
    
    inline def setCircleAnnotationUndefined: Self = StObject.set(x, "circleAnnotation", js.undefined)
    
    inline def setCrooked3(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "crooked3", value.asInstanceOf[js.Any])
    
    inline def setCrooked3Undefined: Self = StObject.set(x, "crooked3", js.undefined)
    
    inline def setCrooked5(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "crooked5", value.asInstanceOf[js.Any])
    
    inline def setCrooked5Undefined: Self = StObject.set(x, "crooked5", js.undefined)
    
    inline def setCurrentPriceIndicator(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "currentPriceIndicator", value.asInstanceOf[js.Any])
    
    inline def setCurrentPriceIndicatorUndefined: Self = StObject.set(x, "currentPriceIndicator", js.undefined)
    
    inline def setElliott3(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "elliott3", value.asInstanceOf[js.Any])
    
    inline def setElliott3Undefined: Self = StObject.set(x, "elliott3", js.undefined)
    
    inline def setElliott5(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "elliott5", value.asInstanceOf[js.Any])
    
    inline def setElliott5Undefined: Self = StObject.set(x, "elliott5", js.undefined)
    
    inline def setEllipseAnnotation(value: NavigationBindingsEllipseAnnotationOptions | NavigationBindingsOptionsObject): Self = StObject.set(x, "ellipseAnnotation", value.asInstanceOf[js.Any])
    
    inline def setEllipseAnnotationUndefined: Self = StObject.set(x, "ellipseAnnotation", js.undefined)
    
    inline def setFibonacci(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "fibonacci", value.asInstanceOf[js.Any])
    
    inline def setFibonacciTimeZones(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "fibonacciTimeZones", value.asInstanceOf[js.Any])
    
    inline def setFibonacciTimeZonesUndefined: Self = StObject.set(x, "fibonacciTimeZones", js.undefined)
    
    inline def setFibonacciUndefined: Self = StObject.set(x, "fibonacci", js.undefined)
    
    inline def setFlagCirclepin(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "flagCirclepin", value.asInstanceOf[js.Any])
    
    inline def setFlagCirclepinUndefined: Self = StObject.set(x, "flagCirclepin", js.undefined)
    
    inline def setFlagDiamondpin(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "flagDiamondpin", value.asInstanceOf[js.Any])
    
    inline def setFlagDiamondpinUndefined: Self = StObject.set(x, "flagDiamondpin", js.undefined)
    
    inline def setFlagSimplepin(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "flagSimplepin", value.asInstanceOf[js.Any])
    
    inline def setFlagSimplepinUndefined: Self = StObject.set(x, "flagSimplepin", js.undefined)
    
    inline def setFlagSquarepin(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "flagSquarepin", value.asInstanceOf[js.Any])
    
    inline def setFlagSquarepinUndefined: Self = StObject.set(x, "flagSquarepin", js.undefined)
    
    inline def setFullScreen(value: NavigationBindingsFullScreenOptions | NavigationBindingsOptionsObject): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    inline def setHorizontalLine(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "horizontalLine", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLineUndefined: Self = StObject.set(x, "horizontalLine", js.undefined)
    
    inline def setIndicators(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
    
    inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
    
    inline def setInfinityLine(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "infinityLine", value.asInstanceOf[js.Any])
    
    inline def setInfinityLineUndefined: Self = StObject.set(x, "infinityLine", js.undefined)
    
    inline def setLabelAnnotation(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "labelAnnotation", value.asInstanceOf[js.Any])
    
    inline def setLabelAnnotationUndefined: Self = StObject.set(x, "labelAnnotation", js.undefined)
    
    inline def setMeasureX(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "measureX", value.asInstanceOf[js.Any])
    
    inline def setMeasureXUndefined: Self = StObject.set(x, "measureX", js.undefined)
    
    inline def setMeasureXY(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "measureXY", value.asInstanceOf[js.Any])
    
    inline def setMeasureXYUndefined: Self = StObject.set(x, "measureXY", js.undefined)
    
    inline def setMeasureY(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "measureY", value.asInstanceOf[js.Any])
    
    inline def setMeasureYUndefined: Self = StObject.set(x, "measureY", js.undefined)
    
    inline def setParallelChannel(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "parallelChannel", value.asInstanceOf[js.Any])
    
    inline def setParallelChannelUndefined: Self = StObject.set(x, "parallelChannel", js.undefined)
    
    inline def setPitchfork(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "pitchfork", value.asInstanceOf[js.Any])
    
    inline def setPitchforkUndefined: Self = StObject.set(x, "pitchfork", js.undefined)
    
    inline def setRay(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
    
    inline def setRayUndefined: Self = StObject.set(x, "ray", js.undefined)
    
    inline def setRectangleAnnotation(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "rectangleAnnotation", value.asInstanceOf[js.Any])
    
    inline def setRectangleAnnotationUndefined: Self = StObject.set(x, "rectangleAnnotation", js.undefined)
    
    inline def setSaveChart(value: NavigationBindingsOptionsObject | NavigationBindingsSaveChartOptions): Self = StObject.set(x, "saveChart", value.asInstanceOf[js.Any])
    
    inline def setSaveChartUndefined: Self = StObject.set(x, "saveChart", js.undefined)
    
    inline def setSegment(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setSeriesTypeCandlestick(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "seriesTypeCandlestick", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeCandlestickUndefined: Self = StObject.set(x, "seriesTypeCandlestick", js.undefined)
    
    inline def setSeriesTypeHLC(value: NavigationBindingsOptionsObject | NavigationBindingsSeriesTypeHLCOptions): Self = StObject.set(x, "seriesTypeHLC", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeHLCUndefined: Self = StObject.set(x, "seriesTypeHLC", js.undefined)
    
    inline def setSeriesTypeHeikinAshi(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "seriesTypeHeikinAshi", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeHeikinAshiUndefined: Self = StObject.set(x, "seriesTypeHeikinAshi", js.undefined)
    
    inline def setSeriesTypeHollowCandlestick(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "seriesTypeHollowCandlestick", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeHollowCandlestickUndefined: Self = StObject.set(x, "seriesTypeHollowCandlestick", js.undefined)
    
    inline def setSeriesTypeLine(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "seriesTypeLine", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeLineUndefined: Self = StObject.set(x, "seriesTypeLine", js.undefined)
    
    inline def setSeriesTypeOhlc(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "seriesTypeOhlc", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeOhlcUndefined: Self = StObject.set(x, "seriesTypeOhlc", js.undefined)
    
    inline def setTimeCycles(value: NavigationBindingsOptionsObject | NavigationBindingsTimeCyclesOptions): Self = StObject.set(x, "timeCycles", value.asInstanceOf[js.Any])
    
    inline def setTimeCyclesUndefined: Self = StObject.set(x, "timeCycles", js.undefined)
    
    inline def setToggleAnnotations(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "toggleAnnotations", value.asInstanceOf[js.Any])
    
    inline def setToggleAnnotationsUndefined: Self = StObject.set(x, "toggleAnnotations", js.undefined)
    
    inline def setVerticalArrow(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "verticalArrow", value.asInstanceOf[js.Any])
    
    inline def setVerticalArrowUndefined: Self = StObject.set(x, "verticalArrow", js.undefined)
    
    inline def setVerticalCounter(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "verticalCounter", value.asInstanceOf[js.Any])
    
    inline def setVerticalCounterUndefined: Self = StObject.set(x, "verticalCounter", js.undefined)
    
    inline def setVerticalLine(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "verticalLine", value.asInstanceOf[js.Any])
    
    inline def setVerticalLineUndefined: Self = StObject.set(x, "verticalLine", js.undefined)
    
    inline def setZoomX(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "zoomX", value.asInstanceOf[js.Any])
    
    inline def setZoomXUndefined: Self = StObject.set(x, "zoomX", js.undefined)
    
    inline def setZoomXY(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "zoomXY", value.asInstanceOf[js.Any])
    
    inline def setZoomXYUndefined: Self = StObject.set(x, "zoomXY", js.undefined)
    
    inline def setZoomY(value: NavigationBindingsOptionsObject): Self = StObject.set(x, "zoomY", value.asInstanceOf[js.Any])
    
    inline def setZoomYUndefined: Self = StObject.set(x, "zoomY", js.undefined)
  }
}
