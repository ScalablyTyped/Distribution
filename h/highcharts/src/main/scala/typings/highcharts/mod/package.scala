package typings.highcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationStepCallbackFunction = js.ThisFunction0[/* this */ typings.highcharts.mod.SVGElement, scala.Unit]
  type AxisEventCallbackFunction = js.ThisFunction0[/* this */ typings.highcharts.mod.Axis, scala.Unit]
  type AxisPointBreakEventCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Axis, 
    /* evt */ typings.highcharts.mod.AxisPointBreakEventObject, 
    scala.Unit
  ]
  type AxisSetExtremesEventCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Axis, 
    /* evt */ typings.highcharts.mod.AxisSetExtremesEventObject, 
    scala.Unit
  ]
  type AxisTickPositionerCallbackFunction = js.ThisFunction0[/* this */ typings.highcharts.mod.Axis, js.Array[scala.Double]]
  type ChartAddSeriesCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Chart_, 
    /* event */ typings.highcharts.mod.ChartAddSeriesEventObject, 
    scala.Unit
  ]
  type ChartCallbackFunction = js.Function1[/* chart */ typings.highcharts.mod.Chart_, scala.Unit]
  type ChartClickCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Chart_, 
    /* event */ typings.highcharts.mod.PointerEventObject, 
    scala.Unit
  ]
  type ChartLoadCallbackFunction = js.ThisFunction1[/* this */ typings.highcharts.mod.Chart_, /* event */ typings.std.Event_, scala.Unit]
  type ChartRedrawCallbackFunction = js.ThisFunction1[/* this */ typings.highcharts.mod.Chart_, /* event */ typings.std.Event_, scala.Unit]
  type ChartRenderCallbackFunction = js.ThisFunction1[/* this */ typings.highcharts.mod.Chart_, /* event */ typings.std.Event_, scala.Unit]
  type ChartSelectionCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Chart_, 
    /* event */ typings.highcharts.mod.ChartSelectionContextObject, 
    js.UndefOr[scala.Boolean]
  ]
  type ClipRectElement = typings.highcharts.mod.SVGElement
  type ColorString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.highcharts.mod.ColorString
    - typings.highcharts.mod.GradientColorObject
    - typings.highcharts.mod.PatternObject
  */
  type ColorType = typings.highcharts.mod._ColorType | typings.highcharts.mod.ColorString
  type DataBeforeParseCallbackFunction = js.Function1[/* csv */ java.lang.String, java.lang.String]
  type DataCompleteCallbackFunction = js.Function1[/* chartOptions */ typings.highcharts.mod.Options, scala.Unit]
  /**
    * Callback function that returns the correspondig Date object to a match.
    */
  type DataDateFormatCallbackFunction = js.Function1[/* match */ js.Array[scala.Double], scala.Double]
  type DataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typings.highcharts.mod.DataLabelsFormatterContextObject, 
    js.UndefOr[scala.Double | java.lang.String | scala.Null]
  ]
  type DataParseDateCallbackFunction = js.Function1[/* dateValue */ java.lang.String, scala.Double]
  type DataParsedCallbackFunction = js.Function1[/* columns */ js.Array[js.Array[js.Any]], js.UndefOr[scala.Boolean]]
  type DataValueType = scala.Double | java.lang.String | scala.Null
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type DrilldownCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Chart_, 
    /* e */ typings.highcharts.mod.DrilldownEventObject, 
    scala.Unit
  ]
  type DrillupAllCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Chart_, 
    /* e */ typings.highcharts.mod.DrillupAllEventObject, 
    scala.Unit
  ]
  type DrillupCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Chart_, 
    /* e */ typings.highcharts.mod.DrillupEventObject, 
    scala.Unit
  ]
  type EventCallbackFunction[T] = js.ThisFunction1[
    /* this */ T, 
    /* eventArguments */ js.UndefOr[typings.std.Event_ | typings.highcharts.mod.Dictionary[js.Any]], 
    scala.Boolean | scala.Unit
  ]
  type ExportDataCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Chart_, 
    /* event */ typings.highcharts.mod.ExportDataEventObject, 
    scala.Unit
  ]
  type ExportingAfterPrintCallbackFunction = js.Function2[
    /* chart */ typings.highcharts.mod.Chart_, 
    /* event */ typings.std.Event_, 
    scala.Unit
  ]
  type ExportingBeforePrintCallbackFunction = js.Function2[
    /* chart */ typings.highcharts.mod.Chart_, 
    /* event */ typings.std.Event_, 
    scala.Unit
  ]
  type ExportingErrorCallbackFunction = js.Function2[
    /* options */ typings.highcharts.mod.ExportingOptions, 
    /* err */ typings.std.Error, 
    scala.Unit
  ]
  type FormatterCallbackFunction[T] = js.ThisFunction0[/* this */ T, java.lang.String]
  type HTMLAttributes = typings.highcharts.mod.Dictionary[scala.Boolean | scala.Double | java.lang.String | js.Function]
  type HTMLDOMElement = typings.std.HTMLElement
  type ObjectEachCallbackFunction[T] = js.ThisFunction3[
    /* this */ T, 
    /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* obj */ js.Any, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.highcharts.highchartsStrings.straight
    - typings.highcharts.highchartsStrings.fastAvoid
    - typings.highcharts.highchartsStrings.simpleConnect
    - java.lang.String
  */
  type PathfinderTypeValue = typings.highcharts.mod._PathfinderTypeValue | java.lang.String
  type PointClickCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.highcharts.mod.PointClickEventObject, 
    scala.Unit
  ]
  type PointDragCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.highcharts.mod.PointDragEventObject, 
    scala.Unit
  ]
  type PointDragStartCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.highcharts.mod.PointDragStartEventObject, 
    scala.Unit
  ]
  type PointDropCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.highcharts.mod.PointDropEventObject, 
    scala.Unit
  ]
  type PointLegendItemClickCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.highcharts.mod.PointLegendItemClickEventObject, 
    scala.Unit
  ]
  type PointMouseOutCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.std.PointerEvent, 
    scala.Unit
  ]
  type PointMouseOverCallbackFunction = js.ThisFunction1[/* this */ typings.highcharts.mod.Point, /* event */ typings.std.Event_, scala.Unit]
  type PointOptionsType = scala.Double | java.lang.String | typings.highcharts.mod.PointOptionsObject | (js.Array[scala.Double | java.lang.String]) | scala.Null
  type PointRemoveCallbackFunction = js.ThisFunction1[/* this */ typings.highcharts.mod.Point, /* event */ typings.std.Event_, scala.Unit]
  type PointSelectCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.highcharts.mod.PointInteractionEventObject, 
    scala.Unit
  ]
  type PointUnselectCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.highcharts.mod.PointInteractionEventObject, 
    scala.Unit
  ]
  type PointUpdateCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Point, 
    /* event */ typings.highcharts.mod.PointUpdateEventObject, 
    scala.Unit
  ]
  type RangeSelectorClickCallbackFunction = js.Function2[/* e */ typings.std.Event_, /* Return */ js.UndefOr[scala.Boolean], scala.Unit]
  type RangeSelectorParseCallbackFunction = js.Function1[/* value */ java.lang.String, scala.Double]
  type RelativeSize = scala.Double | java.lang.String
  type ResponsiveCallbackFunction = js.ThisFunction0[/* this */ typings.highcharts.mod.Chart_, scala.Boolean]
  type SVGDOMElement = typings.highcharts.globalsMod.GlobalSVGElement
  type SVGPathArray = js.Array[scala.Double | typings.highcharts.mod.SVGPathCommand]
  type ScreenReaderClickCallbackFunction = js.Function1[/* evt */ typings.std.MouseEvent, scala.Unit]
  type ScreenReaderFormatterCallbackFunction[T] = js.Function1[/* context */ T, java.lang.String]
  type SeriesAfterAnimateCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Series, 
    /* event */ typings.highcharts.mod.SeriesAfterAnimateEventObject, 
    scala.Unit
  ]
  type SeriesCheckboxClickCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Series, 
    /* event */ typings.highcharts.mod.SeriesCheckboxClickEventObject, 
    scala.Unit
  ]
  type SeriesClickCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Series, 
    /* event */ typings.highcharts.mod.SeriesClickEventObject, 
    scala.Unit
  ]
  type SeriesHideCallbackFunction = js.ThisFunction1[/* this */ typings.highcharts.mod.Series, /* event */ typings.std.Event_, scala.Unit]
  type SeriesLegendItemClickCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Series, 
    /* event */ typings.highcharts.mod.SeriesLegendItemClickEventObject, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.highcharts.highchartsStrings.butt
    - typings.highcharts.highchartsStrings.round
    - typings.highcharts.highchartsStrings.square
    - java.lang.String
  */
  type SeriesLinecapValue = typings.highcharts.mod._SeriesLinecapValue | java.lang.String
  type SeriesMouseOutCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Series, 
    /* event */ typings.std.PointerEvent, 
    scala.Unit
  ]
  type SeriesMouseOverCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.Series, 
    /* event */ typings.std.PointerEvent, 
    scala.Unit
  ]
  type SeriesNetworkgraphDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typings.highcharts.mod.DataLabelsFormatterContextObject | typings.highcharts.mod.SeriesNetworkgraphDataLabelsFormatterContextObject, 
    java.lang.String
  ]
  type SeriesPackedBubbleDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typings.highcharts.mod.DataLabelsFormatterContextObject | typings.highcharts.mod.SeriesPackedBubbleDataLabelsFormatterContextObject, 
    java.lang.String
  ]
  type SeriesSankeyDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typings.highcharts.mod.DataLabelsFormatterContextObject | typings.highcharts.mod.SeriesSankeyDataLabelsFormatterContextObject, 
    js.UndefOr[java.lang.String]
  ]
  type SeriesShowCallbackFunction = js.ThisFunction1[/* this */ typings.highcharts.mod.Series, /* event */ typings.std.Event_, scala.Unit]
  type TimeFormatCallbackFunction = js.Function1[/* timestamp */ scala.Double, java.lang.String]
  type TimelineDataLabelsFormatterCallbackFunction = js.ThisFunction0[
    /* this */ typings.highcharts.mod.DataLabelsFormatterContextObject | typings.highcharts.mod.TimelineDataLabelsFormatterContextObject, 
    js.UndefOr[scala.Double | java.lang.String | scala.Null]
  ]
  type TooltipFormatterCallbackFunction = js.ThisFunction1[
    /* this */ typings.highcharts.mod.TooltipFormatterContextObject, 
    /* tooltip */ typings.highcharts.mod.Tooltip, 
    js.UndefOr[
      typings.highcharts.highchartsBooleans.`false` | java.lang.String | (js.Array[js.UndefOr[java.lang.String | scala.Null]]) | scala.Null
    ]
  ]
  type TooltipPositionerCallbackFunction = js.Function3[
    /* labelWidth */ scala.Double, 
    /* labelHeight */ scala.Double, 
    /* point */ typings.highcharts.mod.TooltipPositionerPointObject, 
    typings.highcharts.mod.PositionObject
  ]
  type WrapProceedFunction = js.Function3[
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    js.Any
  ]
  type XAxisCrosshairLabelFormatterCallbackFunction = js.ThisFunction1[/* this */ typings.highcharts.mod.Axis, /* value */ scala.Double, java.lang.String]
}
