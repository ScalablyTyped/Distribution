package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointOptionsObject extends StObject {
  
  /**
    * (Highcharts) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] with (js.UndefOr[
    typings.highcharts.accessibilityMod.highchartsAugmentingMod.PointAccessibilityOptionsObject
  ]) = js.native
  
  /**
    * (Highcharts, Highstock) The color of the border surrounding the column or
    * bar.
    *
    * In styled mode, the border stroke can be set with the `.highcharts-point`
    * rule.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock) The width of the border surrounding the column or
    * bar.
    *
    * In styled mode, the stroke width can be set with the `.highcharts-point`
    * rule.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The dash style of the box.
    */
  var boxDashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) The closing value of each data point.
    */
  var close: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Individual color for the point. By default
    * the color is pulled from the global `colors` array.
    *
    * In styled mode, the `color` option doesn't take effect. Instead, use
    * `colorIndex`.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Gantt) A specific color index to use for the point, so its
    * graphic representations are given the class name `highcharts-color-{n}`.
    * In styled mode this will change the color of the graphic. In non-styled
    * mode, the color by is set by the `fill` attribute, so the change in class
    * name won't have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Serves a purpose only if a `colorAxis` object is defined in
    * the chart options. This value will decide which color the point gets from
    * the scale of the colorAxis.
    */
  var colorValue: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) Color of the line that connects the dumbbell
    * point's values. By default it is the series' color.
    */
  var connectorColor: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock) Pixel width of the line that connects the
    * dumbbell point's values.
    */
  var connectorWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  
  /**
    * (Highcharts) A name for the dash style to use for the column or bar.
    * Overrides dashStyle on the series.
    *
    * In styled mode, the stroke dash-array can be set with the same classes as
    * listed under data.color.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Individual data label for each point. The
    * options are the same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[
    DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesPieDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject | (js.Array[
      DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject
    ])
  ] = js.native
  
  /**
    * (Highcharts) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock) The wind direction in degrees, where 0 is north
    * (pointing towards south).
    */
  var direction: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Point specific options for the draggable-points module.
    * Overrides options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesLineDataDragDropOptions] = js.native
  
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The individual point events.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.native
  
  /**
    * (Highstock) The fill color of an individual flag. By default it inherits
    * from the series color.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The node that the link runs from.
    */
  var from: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock) The high or maximum value for each data point.
    */
  var high: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The inner radius of an individual point in a solid gauge.
    * Can be given as a number (pixels) or percentage string.
    */
  var innerRadius: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) When this property is true, the points acts as a summary
    * column for the values added or substracted since the last intermediate
    * sum, or since the start of the series. The `y` value is ignored.
    */
  var isIntermediateSum: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) When this property is true, the point display the total sum
    * across the entire series. The `y` value is ignored.
    */
  var isSum: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The label of event.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The rank for this point's data label in case of collision.
    * If two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The sequential index of the data point in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The length of the vector. The rendered length
    * will relate to the `vectorLength` setting.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The low or minimum value for each data point.
    */
  var low: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
    */
  var lowColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock) Options for the point markers of line-like
    * series.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  
  /**
    * (Highcharts) The median for each data point. This is drawn as a line
    * through the middle area of the box.
    */
  var median: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The dash style of the median.
    */
  var medianDashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts) The name of the point as shown in the legend, tooltip,
    * dataLabels, etc.
    */
  var name: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highstock) The opening value of each data point.
    */
  var open: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Only for treemap. Use this option to build a tree structure.
    * The value should be the id of the point which is the parent. If no points
    * has a matching id, or this option is undefined, then the parent will be
    * set to the root.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highmaps) Point padding for a single point.
    */
  /**
    * Heatmap series only. Point padding for a single point.
    */
  var pointPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
    * the column or bar. Overrides pointWidth on the series. The width effects
    * the dimension that is not based on the point value.
    */
  var pointWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The lower quartile for each data point. This is the bottom
    * of the box.
    */
  var q1: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The higher quartile for each data point. This is the top of
    * the box.
    */
  var q3: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The outer radius of an individual point in a solid gauge.
    * Can be given as a number (pixels) or percentage string.
    */
  var radius: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The set or sets the options will be applied to. If a single
    * entry is defined, then it will create a new set. If more than one entry
    * is defined, then it will define the overlap between the sets in the
    * array.
    */
  var sets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highcharts) Whether to display a slice offset from the center.
    */
  var sliced: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The dash style of the stem.
    */
  var stemDashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts) The target value of a point.
    */
  var target: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Individual target options for each point.
    */
  var targetOptions: js.UndefOr[SeriesBulletDataTargetOptions] = js.native
  
  /**
    * (Highstock) The longer text to be shown in the flag's tooltip.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) The short text to be shown on the flag.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The node that the link runs to.
    */
  var to: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock) The wind speed in meters per second.
    */
  /**
    * Heatmap series only. The value of the point, resulting in a color
    * controled by options as set in the colorAxis configuration.
    */
  var value: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highcharts) The weighting of a word. The weight decides the relative
    * size of a word compared to the rest of the collection.
    */
  var weight: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The dash style of the whiskers.
    */
  var whiskerDashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts, Highstock) The x value of the point. For datetime axes, the
    * X value is the timestamp in milliseconds since 1970.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The y value of the point.
    */
  var y: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highcharts) The relative width for each column. On a category axis, the
    * widths are distributed so they sum up to the X axis length. On linear and
    * datetime axes, the columns will be laid out from the X value and Z units
    * along the axis.
    */
  var z: js.UndefOr[Double | Null] = js.native
}
object PointOptionsObject {
  
  @scala.inline
  def apply(
    accessibility: js.UndefOr[PointAccessibilityOptionsObject] with (js.UndefOr[
      typings.highcharts.accessibilityMod.highchartsAugmentingMod.PointAccessibilityOptionsObject
    ])
  ): PointOptionsObject = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptionsObject]
  }
  
  @scala.inline
  implicit class PointOptionsObjectMutableBuilder[Self <: PointOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(
      value: js.UndefOr[PointAccessibilityOptionsObject] with (js.UndefOr[
          typings.highcharts.accessibilityMod.highchartsAugmentingMod.PointAccessibilityOptionsObject
        ])
    ): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBoxDashStyle(value: DashStyleValue): Self = StObject.set(x, "boxDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxDashStyleUndefined: Self = StObject.set(x, "boxDashStyle", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorValue(value: Double): Self = StObject.set(x, "colorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorValueUndefined: Self = StObject.set(x, "colorValue", js.undefined)
    
    @scala.inline
    def setConnectorColor(value: String): Self = StObject.set(x, "connectorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorColorUndefined: Self = StObject.set(x, "connectorColor", js.undefined)
    
    @scala.inline
    def setConnectorWidth(value: Double): Self = StObject.set(x, "connectorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorWidthUndefined: Self = StObject.set(x, "connectorWidth", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setDataLabels(
      value: DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesPieDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject | (js.Array[
          DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject
        ])
    ): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(
      value: (DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject)*
    ): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDragDrop(value: SeriesLineDataDragDropOptions): Self = StObject.set(x, "dragDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
    
    @scala.inline
    def setDrilldown(value: String): Self = StObject.set(x, "drilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrilldownUndefined: Self = StObject.set(x, "drilldown", js.undefined)
    
    @scala.inline
    def setEvents(value: PointEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | String): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setIsIntermediateSum(value: Boolean): Self = StObject.set(x, "isIntermediateSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIntermediateSumUndefined: Self = StObject.set(x, "isIntermediateSum", js.undefined)
    
    @scala.inline
    def setIsSum(value: Boolean): Self = StObject.set(x, "isSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSumUndefined: Self = StObject.set(x, "isSum", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelrank(value: Double): Self = StObject.set(x, "labelrank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelrankUndefined: Self = StObject.set(x, "labelrank", js.undefined)
    
    @scala.inline
    def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "lowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowColorUndefined: Self = StObject.set(x, "lowColor", js.undefined)
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianDashStyle(value: DashStyleValue): Self = StObject.set(x, "medianDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianDashStyleUndefined: Self = StObject.set(x, "medianDashStyle", js.undefined)
    
    @scala.inline
    def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
    
    @scala.inline
    def setName(value: Double | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPointPadding(value: Double): Self = StObject.set(x, "pointPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointPaddingUndefined: Self = StObject.set(x, "pointPadding", js.undefined)
    
    @scala.inline
    def setPointWidth(value: Double): Self = StObject.set(x, "pointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointWidthUndefined: Self = StObject.set(x, "pointWidth", js.undefined)
    
    @scala.inline
    def setQ1(value: Double): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
    
    @scala.inline
    def setQ3(value: Double): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSets(value: js.Array[String]): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetsUndefined: Self = StObject.set(x, "sets", js.undefined)
    
    @scala.inline
    def setSetsVarargs(value: String*): Self = StObject.set(x, "sets", js.Array(value :_*))
    
    @scala.inline
    def setSliced(value: Boolean): Self = StObject.set(x, "sliced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicedUndefined: Self = StObject.set(x, "sliced", js.undefined)
    
    @scala.inline
    def setStemDashStyle(value: DashStyleValue): Self = StObject.set(x, "stemDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemDashStyleUndefined: Self = StObject.set(x, "stemDashStyle", js.undefined)
    
    @scala.inline
    def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOptions(value: SeriesBulletDataTargetOptions): Self = StObject.set(x, "targetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOptionsUndefined: Self = StObject.set(x, "targetOptions", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    @scala.inline
    def setWhiskerDashStyle(value: DashStyleValue): Self = StObject.set(x, "whiskerDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiskerDashStyleUndefined: Self = StObject.set(x, "whiskerDashStyle", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZNull: Self = StObject.set(x, "z", null)
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
