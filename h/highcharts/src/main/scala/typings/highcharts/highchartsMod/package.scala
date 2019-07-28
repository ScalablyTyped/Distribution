package typings.highcharts

import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.globalsMod.GlobalSVGElement
import typings.highcharts.highchartsNumbers.`false`
import typings.std.Error
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object highchartsMod {
  type AnimationStepCallbackFunction = js.ThisFunction0[/* this */ SVGElement, Unit]
  type AxisEventCallbackFunction = js.ThisFunction0[/* this */ Axis, Unit]
  type AxisPointBreakEventCallbackFunction = js.ThisFunction1[/* this */ Axis, /* evt */ AxisPointBreakEventObject, Unit]
  type AxisSetExtremesEventCallbackFunction = js.ThisFunction1[/* this */ Axis, /* evt */ AxisSetExtremesEventObject, Unit]
  type AxisTickPositionerCallbackFunction = js.ThisFunction0[/* this */ Axis, js.Array[Double]]
  type ChartAddSeriesCallbackFunction = js.ThisFunction1[/* this */ Chart, /* event */ ChartAddSeriesEventObject, Unit]
  type ChartCallbackFunction = js.Function1[/* chart */ Chart, Unit]
  type ChartClickCallbackFunction = js.ThisFunction1[/* this */ Chart, /* event */ PointerEventObject, Unit]
  type ChartLoadCallbackFunction = js.ThisFunction1[/* this */ Chart, /* event */ Event, Unit]
  type ChartRedrawCallbackFunction = js.ThisFunction1[/* this */ Chart, /* event */ Event, Unit]
  type ChartRenderCallbackFunction = js.ThisFunction1[/* this */ Chart, /* event */ Event, Unit]
  type ChartSelectionCallbackFunction = js.ThisFunction1[/* this */ Chart, /* event */ ChartSelectionContextObject, js.UndefOr[Boolean]]
  type ClipRectElement = SVGElement
  type ColorString = String
  type DataBeforeParseCallbackFunction = js.Function1[/* csv */ String, String]
  type DataCompleteCallbackFunction = js.Function1[/* chartOptions */ ChartOptions, Unit]
  type DataLabelsFormatterCallbackFunction = js.ThisFunction0[/* this */ DataLabelsFormatterContextObject, String]
  type DataParseDateCallbackFunction = js.Function1[/* dateValue */ String, Double]
  type DataParsedCallbackFunction = js.Function1[/* columns */ js.Array[js.Array[js.Any]], js.UndefOr[Boolean]]
  type Dictionary[T] = StringDictionary[T]
  type DrilldownCallbackFunction = js.ThisFunction1[/* this */ Chart, /* e */ DrilldownEventObject, Unit]
  type DrillupAllCallbackFunction = js.ThisFunction1[/* this */ Chart, /* e */ DrillupAllEventObject, Unit]
  type DrillupCallbackFunction = js.ThisFunction1[/* this */ Chart, /* e */ DrillupEventObject, Unit]
  type EventCallbackFunction[T] = js.ThisFunction1[
    /* this */ T, 
    /* eventArguments */ js.UndefOr[Event | Dictionary[js.Any]], 
    Boolean | Unit
  ]
  type ExportingAfterPrintCallbackFunction = js.Function2[/* chart */ Chart, /* event */ Event, Unit]
  type ExportingBeforePrintCallbackFunction = js.Function2[/* chart */ Chart, /* event */ Event, Unit]
  type ExportingErrorCallbackFunction = js.Function2[/* options */ ExportingOptions, /* err */ Error, Unit]
  type FormatterCallbackFunction[T] = js.ThisFunction0[/* this */ T, String]
  type HTMLAttributes = Dictionary[Boolean | Double | String | js.Function]
  type HTMLDOMElement = HTMLElement
  type ObjectEachCallbackFunction[T] = js.ThisFunction3[/* this */ T, /* value */ js.Any, /* key */ String, /* obj */ js.Any, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.highcharts.highchartsStrings.straight
    - typings.highcharts.highchartsStrings.fastAvoid
    - typings.highcharts.highchartsStrings.simpleConnect
    - java.lang.String
  */
  type PathfinderTypeValue = _PathfinderTypeValue | String
  type PointLegendItemClickCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointLegendItemClickEventObject, Unit]
  type RangeSelectorClickCallbackFunction = js.Function2[/* e */ Event, /* Return */ js.UndefOr[Boolean], Unit]
  type RangeSelectorParseCallbackFunction = js.Function1[/* value */ String, Double]
  type RelativeSize = Double | String
  type ResponsiveCallbackFunction = js.Function0[Boolean]
  type SVGDOMElement = GlobalSVGElement
  type SVGPathArray = js.Array[Double | SVGPathCommand]
  type ScreenReaderClickCallbackFunction = js.Function1[/* evt */ MouseEvent, Unit]
  type ScreenReaderFormatterCallbackFunction[T] = js.Function1[/* context */ T, String]
  type SeriesAfterAnimateCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ SeriesAfterAnimateEventObject, Unit]
  type SeriesCheckboxClickCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ SeriesCheckboxClickEventObject, Unit]
  type SeriesClickCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ SeriesClickEventObject, Unit]
  type SeriesHideCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ Event, Unit]
  type SeriesLegendItemClickCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ SeriesLegendItemClickEventObject, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.highcharts.highchartsStrings.butt
    - typings.highcharts.highchartsStrings.round
    - typings.highcharts.highchartsStrings.square
    - java.lang.String
  */
  type SeriesLinecapValue = _SeriesLinecapValue | String
  type SeriesMaplineDataOptions = StringDictionary[js.Any]
  type SeriesMouseOutCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ Event, Unit]
  type SeriesMouseOverCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ Event, Unit]
  type SeriesNetworkDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ DataLabelsFormatterContextObject | SeriesNetworkDataLabelsFormatterContextObject, 
    String
  ]
  type SeriesPackedBubbleDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ DataLabelsFormatterContextObject | SeriesPackedBubbleDataLabelsFormatterContextObject, 
    String
  ]
  type SeriesPointClickCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ SeriesPointClickEventObject, Unit]
  type SeriesPointDragCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ SeriesPointDragEventObject, Unit]
  type SeriesPointDragStartCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ SeriesPointDragStartEventObject, Unit]
  type SeriesPointDropCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ SeriesPointDropEventObject, Unit]
  type SeriesPointMouseOutCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ Event, Unit]
  type SeriesPointMouseOverCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ Event, Unit]
  type SeriesPointRemoveCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ Event, Unit]
  type SeriesPointSelectCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ SeriesPointSelectEventObject, Unit]
  type SeriesPointUnselectCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ SeriesPointUnselectEventObject, Unit]
  type SeriesPointUpdateCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ SeriesPointUpdateEventObject, Unit]
  type SeriesShowCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ Event, Unit]
  type TimeFormatCallbackFunction = js.Function1[/* timestamp */ Double, String]
  type TooltipFormatterCallbackFunction = js.ThisFunction0[/* this */ TooltipFormatterContextObject, `false` | String | js.Array[String]]
  type TooltipPositionerCallbackFunction = js.Function3[
    /* labelWidth */ Double, 
    /* labelHeight */ Double, 
    /* point */ TooltipPositionerPointObject, 
    PositionObject
  ]
  type WrapProceedFunction = js.Function3[
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    js.Any
  ]
  type XAxisCrosshairLabelFormatterCallbackFunction = js.ThisFunction1[/* this */ Axis, /* value */ Double, String]
}
