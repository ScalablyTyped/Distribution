package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointOptionsObject extends js.Object {
  
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
  implicit class PointOptionsObjectOps[Self <: PointOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setAccessibility(
      value: js.UndefOr[PointAccessibilityOptionsObject] with (js.UndefOr[
          typings.highcharts.accessibilityMod.highchartsAugmentingMod.PointAccessibilityOptionsObject
        ])
    ): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBoxDashStyle(value: DashStyleValue): Self = this.set("boxDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxDashStyle: Self = this.set("boxDashStyle", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClose(value: Double): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
    
    @scala.inline
    def setColorValue(value: Double): Self = this.set("colorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorValue: Self = this.set("colorValue", js.undefined)
    
    @scala.inline
    def setConnectorColor(value: String): Self = this.set("connectorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorColor: Self = this.set("connectorColor", js.undefined)
    
    @scala.inline
    def setConnectorWidth(value: Double): Self = this.set("connectorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorWidth: Self = this.set("connectorWidth", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(
      value: (DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject)*
    ): Self = this.set("dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDataLabels(
      value: DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesPieDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject | (js.Array[
          DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject
        ])
    ): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDragDrop(value: SeriesLineDataDragDropOptions): Self = this.set("dragDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDrop: Self = this.set("dragDrop", js.undefined)
    
    @scala.inline
    def setDrilldown(value: String): Self = this.set("drilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrilldown: Self = this.set("drilldown", js.undefined)
    
    @scala.inline
    def setEvents(value: PointEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | String): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    
    @scala.inline
    def setIsIntermediateSum(value: Boolean): Self = this.set("isIntermediateSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIntermediateSum: Self = this.set("isIntermediateSum", js.undefined)
    
    @scala.inline
    def setIsSum(value: Boolean): Self = this.set("isSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSum: Self = this.set("isSum", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelrank(value: Double): Self = this.set("labelrank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelrank: Self = this.set("labelrank", js.undefined)
    
    @scala.inline
    def setLegendIndex(value: Double): Self = this.set("legendIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendIndex: Self = this.set("legendIndex", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setLowColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("lowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowColor: Self = this.set("lowColor", js.undefined)
    
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMedian(value: Double): Self = this.set("median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedian: Self = this.set("median", js.undefined)
    
    @scala.inline
    def setMedianDashStyle(value: DashStyleValue): Self = this.set("medianDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedianDashStyle: Self = this.set("medianDashStyle", js.undefined)
    
    @scala.inline
    def setName(value: Double | String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpen(value: Double): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPointPadding(value: Double): Self = this.set("pointPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointPadding: Self = this.set("pointPadding", js.undefined)
    
    @scala.inline
    def setPointWidth(value: Double): Self = this.set("pointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointWidth: Self = this.set("pointWidth", js.undefined)
    
    @scala.inline
    def setQ1(value: Double): Self = this.set("q1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ1: Self = this.set("q1", js.undefined)
    
    @scala.inline
    def setQ3(value: Double): Self = this.set("q3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ3: Self = this.set("q3", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSetsVarargs(value: String*): Self = this.set("sets", js.Array(value :_*))
    
    @scala.inline
    def setSets(value: js.Array[String]): Self = this.set("sets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSets: Self = this.set("sets", js.undefined)
    
    @scala.inline
    def setSliced(value: Boolean): Self = this.set("sliced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliced: Self = this.set("sliced", js.undefined)
    
    @scala.inline
    def setStemDashStyle(value: DashStyleValue): Self = this.set("stemDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStemDashStyle: Self = this.set("stemDashStyle", js.undefined)
    
    @scala.inline
    def setTarget(value: Double): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetOptions(value: SeriesBulletDataTargetOptions): Self = this.set("targetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOptions: Self = this.set("targetOptions", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setWhiskerDashStyle(value: DashStyleValue): Self = this.set("whiskerDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiskerDashStyle: Self = this.set("whiskerDashStyle", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYNull: Self = this.set("y", null)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    
    @scala.inline
    def setZNull: Self = this.set("z", null)
  }
}
