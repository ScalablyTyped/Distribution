package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBindingsOptions extends js.Object {
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
    * (Highstock) A fibonacci annotation bindings. Includes `start` and two
    * events in `steps` array (updates second point, then height).
    */
  var fibonacci: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
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
    */
  var fullScreen: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
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
  var saveChart: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
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
    * (Highstock) Changes main series to `'line'` type.
    */
  var seriesTypeLine: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  /**
    * (Highstock) Changes main series to `'ohlc'` type.
    */
  var seriesTypeOhlc: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  /**
    * (Highstock) Hides/shows all annotations on a chart.
    */
  var toggleAnnotations: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow. Green arrow
    * when pointing from above, red when pointing from below the point.
    */
  var verticalArrow: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  /**
    * (Highstock) A vertical counter annotation bindings. Includes `start`
    * event. On click, finds the closest point and marks it with a numeric
    * annotation - incrementing counter on each add.
    */
  var verticalCounter: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
  /**
    * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
    * On click, finds the closest point and marks it with an arrow and a label
    * with value.
    */
  var verticalLabel: js.UndefOr[NavigationBindingsOptionsObject] = js.undefined
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
  @scala.inline
  def apply(
    arrowInfinityLine: NavigationBindingsOptionsObject = null,
    arrowRay: NavigationBindingsOptionsObject = null,
    arrowSegment: NavigationBindingsOptionsObject = null,
    circleAnnotation: NavigationBindingsOptionsObject = null,
    crooked3: NavigationBindingsOptionsObject = null,
    crooked5: NavigationBindingsOptionsObject = null,
    currentPriceIndicator: NavigationBindingsOptionsObject = null,
    elliott3: NavigationBindingsOptionsObject = null,
    elliott5: NavigationBindingsOptionsObject = null,
    fibonacci: NavigationBindingsOptionsObject = null,
    flagCirclepin: NavigationBindingsOptionsObject = null,
    flagDiamondpin: NavigationBindingsOptionsObject = null,
    flagSimplepin: NavigationBindingsOptionsObject = null,
    flagSquarepin: NavigationBindingsOptionsObject = null,
    fullScreen: NavigationBindingsOptionsObject = null,
    horizontalLine: NavigationBindingsOptionsObject = null,
    indicators: NavigationBindingsOptionsObject = null,
    infinityLine: NavigationBindingsOptionsObject = null,
    labelAnnotation: NavigationBindingsOptionsObject = null,
    measureX: NavigationBindingsOptionsObject = null,
    measureXY: NavigationBindingsOptionsObject = null,
    measureY: NavigationBindingsOptionsObject = null,
    parallelChannel: NavigationBindingsOptionsObject = null,
    pitchfork: NavigationBindingsOptionsObject = null,
    ray: NavigationBindingsOptionsObject = null,
    rectangleAnnotation: NavigationBindingsOptionsObject = null,
    saveChart: NavigationBindingsOptionsObject = null,
    segment: NavigationBindingsOptionsObject = null,
    seriesTypeCandlestick: NavigationBindingsOptionsObject = null,
    seriesTypeLine: NavigationBindingsOptionsObject = null,
    seriesTypeOhlc: NavigationBindingsOptionsObject = null,
    toggleAnnotations: NavigationBindingsOptionsObject = null,
    verticalArrow: NavigationBindingsOptionsObject = null,
    verticalCounter: NavigationBindingsOptionsObject = null,
    verticalLabel: NavigationBindingsOptionsObject = null,
    verticalLine: NavigationBindingsOptionsObject = null,
    zoomX: NavigationBindingsOptionsObject = null,
    zoomXY: NavigationBindingsOptionsObject = null,
    zoomY: NavigationBindingsOptionsObject = null
  ): NavigationBindingsOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowInfinityLine != null) __obj.updateDynamic("arrowInfinityLine")(arrowInfinityLine.asInstanceOf[js.Any])
    if (arrowRay != null) __obj.updateDynamic("arrowRay")(arrowRay.asInstanceOf[js.Any])
    if (arrowSegment != null) __obj.updateDynamic("arrowSegment")(arrowSegment.asInstanceOf[js.Any])
    if (circleAnnotation != null) __obj.updateDynamic("circleAnnotation")(circleAnnotation.asInstanceOf[js.Any])
    if (crooked3 != null) __obj.updateDynamic("crooked3")(crooked3.asInstanceOf[js.Any])
    if (crooked5 != null) __obj.updateDynamic("crooked5")(crooked5.asInstanceOf[js.Any])
    if (currentPriceIndicator != null) __obj.updateDynamic("currentPriceIndicator")(currentPriceIndicator.asInstanceOf[js.Any])
    if (elliott3 != null) __obj.updateDynamic("elliott3")(elliott3.asInstanceOf[js.Any])
    if (elliott5 != null) __obj.updateDynamic("elliott5")(elliott5.asInstanceOf[js.Any])
    if (fibonacci != null) __obj.updateDynamic("fibonacci")(fibonacci.asInstanceOf[js.Any])
    if (flagCirclepin != null) __obj.updateDynamic("flagCirclepin")(flagCirclepin.asInstanceOf[js.Any])
    if (flagDiamondpin != null) __obj.updateDynamic("flagDiamondpin")(flagDiamondpin.asInstanceOf[js.Any])
    if (flagSimplepin != null) __obj.updateDynamic("flagSimplepin")(flagSimplepin.asInstanceOf[js.Any])
    if (flagSquarepin != null) __obj.updateDynamic("flagSquarepin")(flagSquarepin.asInstanceOf[js.Any])
    if (fullScreen != null) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (horizontalLine != null) __obj.updateDynamic("horizontalLine")(horizontalLine.asInstanceOf[js.Any])
    if (indicators != null) __obj.updateDynamic("indicators")(indicators.asInstanceOf[js.Any])
    if (infinityLine != null) __obj.updateDynamic("infinityLine")(infinityLine.asInstanceOf[js.Any])
    if (labelAnnotation != null) __obj.updateDynamic("labelAnnotation")(labelAnnotation.asInstanceOf[js.Any])
    if (measureX != null) __obj.updateDynamic("measureX")(measureX.asInstanceOf[js.Any])
    if (measureXY != null) __obj.updateDynamic("measureXY")(measureXY.asInstanceOf[js.Any])
    if (measureY != null) __obj.updateDynamic("measureY")(measureY.asInstanceOf[js.Any])
    if (parallelChannel != null) __obj.updateDynamic("parallelChannel")(parallelChannel.asInstanceOf[js.Any])
    if (pitchfork != null) __obj.updateDynamic("pitchfork")(pitchfork.asInstanceOf[js.Any])
    if (ray != null) __obj.updateDynamic("ray")(ray.asInstanceOf[js.Any])
    if (rectangleAnnotation != null) __obj.updateDynamic("rectangleAnnotation")(rectangleAnnotation.asInstanceOf[js.Any])
    if (saveChart != null) __obj.updateDynamic("saveChart")(saveChart.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (seriesTypeCandlestick != null) __obj.updateDynamic("seriesTypeCandlestick")(seriesTypeCandlestick.asInstanceOf[js.Any])
    if (seriesTypeLine != null) __obj.updateDynamic("seriesTypeLine")(seriesTypeLine.asInstanceOf[js.Any])
    if (seriesTypeOhlc != null) __obj.updateDynamic("seriesTypeOhlc")(seriesTypeOhlc.asInstanceOf[js.Any])
    if (toggleAnnotations != null) __obj.updateDynamic("toggleAnnotations")(toggleAnnotations.asInstanceOf[js.Any])
    if (verticalArrow != null) __obj.updateDynamic("verticalArrow")(verticalArrow.asInstanceOf[js.Any])
    if (verticalCounter != null) __obj.updateDynamic("verticalCounter")(verticalCounter.asInstanceOf[js.Any])
    if (verticalLabel != null) __obj.updateDynamic("verticalLabel")(verticalLabel.asInstanceOf[js.Any])
    if (verticalLine != null) __obj.updateDynamic("verticalLine")(verticalLine.asInstanceOf[js.Any])
    if (zoomX != null) __obj.updateDynamic("zoomX")(zoomX.asInstanceOf[js.Any])
    if (zoomXY != null) __obj.updateDynamic("zoomXY")(zoomXY.asInstanceOf[js.Any])
    if (zoomY != null) __obj.updateDynamic("zoomY")(zoomY.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBindingsOptions]
  }
}

