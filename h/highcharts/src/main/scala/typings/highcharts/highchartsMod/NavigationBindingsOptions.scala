package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBindingsOptions extends js.Object {
  /**
    * (Highstock) A line with arrow annotation. Includes `start` and one event
    * in `steps` array.
    */
  var arrowInfinityLine: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A ray with an arrow annotation bindings. Includes `start` and
    * one event in `steps` array.
    */
  var arrowRay: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A segment with an arrow annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var arrowSegment: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highcharts, Highstock) A circle annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var circleAnnotation: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Crooked line (three points) annotation bindings. Includes
    * `start` and two events in `steps` (for second and third points in crooked
    * line) array.
    */
  var crooked3: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Crooked line (five points) annotation bindings. Includes
    * `start` and four events in `steps` (for all consequent points in crooked
    * line) array.
    */
  var crooked5: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Hides/shows two price indicators:
    *
    * - last price in the dataset
    *
    * - last price in the selected range
    */
  var currentPriceIndicator: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Elliott wave (three points) annotation bindings. Includes
    * `start` and two events in `steps` (for second and third points) array.
    */
  var elliott3: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Elliott wave (five points) annotation bindings. Includes
    * `start` and four event in `steps` (for all consequent points in Elliott
    * wave) array.
    */
  var elliott5: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A fibonacci annotation bindings. Includes `start` and two
    * events in `steps` array (updates second point, then height).
    */
  var fibonacci: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'circlepin'`
    * shape.
    */
  var flagCirclepin: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'diamondpin'`
    * shape.
    */
  var flagDiamondpin: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag without pin shape.
    */
  var flagSimplepin: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A flag series bindings. Includes `start` event. On click,
    * finds the closest point and marks it with a flag with `'squarepin'`
    * shape.
    */
  var flagSquarepin: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Displays chart in fullscreen.
    */
  var fullScreen: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A horizontal line annotation. Includes `start` event.
    */
  var horizontalLine: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Indicators bindings. Includes `init` event to show a popup.
    */
  var indicators: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A line annotation. Includes `start` and one event in `steps`
    * array.
    */
  var infinityLine: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highcharts, Highstock) A label annotation bindings. Includes `start`
    * event only.
    */
  var labelAnnotation: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A measure (x-dimension) annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var measureX: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A measure (xy-dimension) annotation bindings. Includes
    * `start` and one event in `steps` array.
    */
  var measureXY: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A measure (y-dimension) annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var measureY: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A parallel channel (tunnel) annotation bindings. Includes
    * `start` and two events in `steps` array (updates second point, then
    * height).
    */
  var parallelChannel: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) An Andrew's pitchfork annotation bindings. Includes `start`
    * and two events in `steps` array (sets second and third control points).
    */
  var pitchfork: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A ray annotation bindings. Includes `start` and one event in
    * `steps` array.
    */
  var ray: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highcharts, Highstock) A rectangle annotation bindings. Includes `start`
    * and one event in `steps` array.
    */
  var rectangleAnnotation: js.UndefOr[StockToolsBindingsObject] = js.undefined
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
  var saveChart: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A segment annotation bindings. Includes `start` and one event
    * in `steps` array.
    */
  var segment: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Changes main series to `'candlestick'` type.
    */
  var seriesTypeCandlestick: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Changes main series to `'line'` type.
    */
  var seriesTypeLine: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Changes main series to `'ohlc'` type.
    */
  var seriesTypeOhlc: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Hides/shows all annotations on a chart.
    */
  var toggleAnnotations: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow. Green arrow
    * when pointing from above, red when pointing from below the point.
    */
  var verticalArrow: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A vertical counter annotation bindings. Includes `start`
    * event. On click, finds the closest point and marks it with a numeric
    * annotation - incrementing counter on each add.
    */
  var verticalCounter: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow and a label
    * with value.
    */
  var verticalLabel: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) A vertical line annotation. Includes `start` event.
    */
  var verticalLine: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Enables zooming in xAxis on a chart. Includes `start` event
    * which changes chart.zoomType.
    */
  var zoomX: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Enables zooming in xAxis and yAxis on a chart. Includes
    * `start` event which changes chart.zoomType.
    */
  var zoomXY: js.UndefOr[StockToolsBindingsObject] = js.undefined
  /**
    * (Highstock) Enables zooming in yAxis on a chart. Includes `start` event
    * which changes chart.zoomType.
    */
  var zoomY: js.UndefOr[StockToolsBindingsObject] = js.undefined
}

object NavigationBindingsOptions {
  @scala.inline
  def apply(
    arrowInfinityLine: StockToolsBindingsObject = null,
    arrowRay: StockToolsBindingsObject = null,
    arrowSegment: StockToolsBindingsObject = null,
    circleAnnotation: StockToolsBindingsObject = null,
    crooked3: StockToolsBindingsObject = null,
    crooked5: StockToolsBindingsObject = null,
    currentPriceIndicator: StockToolsBindingsObject = null,
    elliott3: StockToolsBindingsObject = null,
    elliott5: StockToolsBindingsObject = null,
    fibonacci: StockToolsBindingsObject = null,
    flagCirclepin: StockToolsBindingsObject = null,
    flagDiamondpin: StockToolsBindingsObject = null,
    flagSimplepin: StockToolsBindingsObject = null,
    flagSquarepin: StockToolsBindingsObject = null,
    fullScreen: StockToolsBindingsObject = null,
    horizontalLine: StockToolsBindingsObject = null,
    indicators: StockToolsBindingsObject = null,
    infinityLine: StockToolsBindingsObject = null,
    labelAnnotation: StockToolsBindingsObject = null,
    measureX: StockToolsBindingsObject = null,
    measureXY: StockToolsBindingsObject = null,
    measureY: StockToolsBindingsObject = null,
    parallelChannel: StockToolsBindingsObject = null,
    pitchfork: StockToolsBindingsObject = null,
    ray: StockToolsBindingsObject = null,
    rectangleAnnotation: StockToolsBindingsObject = null,
    saveChart: StockToolsBindingsObject = null,
    segment: StockToolsBindingsObject = null,
    seriesTypeCandlestick: StockToolsBindingsObject = null,
    seriesTypeLine: StockToolsBindingsObject = null,
    seriesTypeOhlc: StockToolsBindingsObject = null,
    toggleAnnotations: StockToolsBindingsObject = null,
    verticalArrow: StockToolsBindingsObject = null,
    verticalCounter: StockToolsBindingsObject = null,
    verticalLabel: StockToolsBindingsObject = null,
    verticalLine: StockToolsBindingsObject = null,
    zoomX: StockToolsBindingsObject = null,
    zoomXY: StockToolsBindingsObject = null,
    zoomY: StockToolsBindingsObject = null
  ): NavigationBindingsOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowInfinityLine != null) __obj.updateDynamic("arrowInfinityLine")(arrowInfinityLine)
    if (arrowRay != null) __obj.updateDynamic("arrowRay")(arrowRay)
    if (arrowSegment != null) __obj.updateDynamic("arrowSegment")(arrowSegment)
    if (circleAnnotation != null) __obj.updateDynamic("circleAnnotation")(circleAnnotation)
    if (crooked3 != null) __obj.updateDynamic("crooked3")(crooked3)
    if (crooked5 != null) __obj.updateDynamic("crooked5")(crooked5)
    if (currentPriceIndicator != null) __obj.updateDynamic("currentPriceIndicator")(currentPriceIndicator)
    if (elliott3 != null) __obj.updateDynamic("elliott3")(elliott3)
    if (elliott5 != null) __obj.updateDynamic("elliott5")(elliott5)
    if (fibonacci != null) __obj.updateDynamic("fibonacci")(fibonacci)
    if (flagCirclepin != null) __obj.updateDynamic("flagCirclepin")(flagCirclepin)
    if (flagDiamondpin != null) __obj.updateDynamic("flagDiamondpin")(flagDiamondpin)
    if (flagSimplepin != null) __obj.updateDynamic("flagSimplepin")(flagSimplepin)
    if (flagSquarepin != null) __obj.updateDynamic("flagSquarepin")(flagSquarepin)
    if (fullScreen != null) __obj.updateDynamic("fullScreen")(fullScreen)
    if (horizontalLine != null) __obj.updateDynamic("horizontalLine")(horizontalLine)
    if (indicators != null) __obj.updateDynamic("indicators")(indicators)
    if (infinityLine != null) __obj.updateDynamic("infinityLine")(infinityLine)
    if (labelAnnotation != null) __obj.updateDynamic("labelAnnotation")(labelAnnotation)
    if (measureX != null) __obj.updateDynamic("measureX")(measureX)
    if (measureXY != null) __obj.updateDynamic("measureXY")(measureXY)
    if (measureY != null) __obj.updateDynamic("measureY")(measureY)
    if (parallelChannel != null) __obj.updateDynamic("parallelChannel")(parallelChannel)
    if (pitchfork != null) __obj.updateDynamic("pitchfork")(pitchfork)
    if (ray != null) __obj.updateDynamic("ray")(ray)
    if (rectangleAnnotation != null) __obj.updateDynamic("rectangleAnnotation")(rectangleAnnotation)
    if (saveChart != null) __obj.updateDynamic("saveChart")(saveChart)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (seriesTypeCandlestick != null) __obj.updateDynamic("seriesTypeCandlestick")(seriesTypeCandlestick)
    if (seriesTypeLine != null) __obj.updateDynamic("seriesTypeLine")(seriesTypeLine)
    if (seriesTypeOhlc != null) __obj.updateDynamic("seriesTypeOhlc")(seriesTypeOhlc)
    if (toggleAnnotations != null) __obj.updateDynamic("toggleAnnotations")(toggleAnnotations)
    if (verticalArrow != null) __obj.updateDynamic("verticalArrow")(verticalArrow)
    if (verticalCounter != null) __obj.updateDynamic("verticalCounter")(verticalCounter)
    if (verticalLabel != null) __obj.updateDynamic("verticalLabel")(verticalLabel)
    if (verticalLine != null) __obj.updateDynamic("verticalLine")(verticalLine)
    if (zoomX != null) __obj.updateDynamic("zoomX")(zoomX)
    if (zoomXY != null) __obj.updateDynamic("zoomXY")(zoomXY)
    if (zoomY != null) __obj.updateDynamic("zoomY")(zoomY)
    __obj.asInstanceOf[NavigationBindingsOptions]
  }
}

