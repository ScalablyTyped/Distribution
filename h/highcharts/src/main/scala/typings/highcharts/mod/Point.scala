package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.highchartsStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "Point")
@js.native
class Point () extends StObject {
  
  /**
    * Cancel sonification of a point. Calls onEnd functions.
    *
    * @param fadeOut
    *        Whether or not to fade out as we stop. If false, the points
    *        are cancelled synchronously.
    */
  def cancelSonify(): Unit = js.native
  def cancelSonify(fadeOut: Boolean): Unit = js.native
  
  /**
    * For categorized axes this property holds the category name for the point.
    * For other axes it holds the X value.
    */
  var category: String = js.native
  
  /**
    * The point's current color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * The point's current color index, used in styled mode instead of `color`.
    * The color index is inserted in class names used for styling.
    */
  var colorIndex: Double = js.native
  
  /**
    * (Highstock) Highstock only. If a point object is created by data
    * grouping, it doesn't reflect actual points in the raw data. In this case,
    * the `dataGroup` property holds information that points back to the raw
    * data.
    *
    * - `dataGroup.start` is the index of the first raw data point in the
    * group.
    *
    * - `dataGroup.length` is the amount of points in the group.
    */
  var dataGroup: js.UndefOr[DataGroupingInfoObject] = js.native
  
  /**
    * Get the CSS class names for individual points. Used internally where the
    * returned value is set on every point.
    *
    * @return The class names.
    */
  def getClassName(): String = js.native
  
  /**
    * Return the configuration hash needed for the data label and tooltip
    * formatters.
    *
    * @return Abstract object used in formatters and formats.
    */
  def getLabelConfig(): PointLabelObject = js.native
  
  /**
    * In a series with `zones`, return the zone that the point belongs to.
    *
    * @return The zone item.
    */
  def getZone(): SeriesZonesOptionsObject = js.native
  
  /**
    * Get the path definition for the halo, which is usually a shadow-like
    * circle around the currently hovered point.
    *
    * @param size
    *        The radius of the circular halo.
    *
    * @return The path definition.
    */
  def haloPath(size: Double): SVGPathArray = js.native
  
  /**
    * Range series only. The high or maximum value for each data point.
    */
  var high: js.UndefOr[Double] = js.native
  
  /**
    * Contains the point's index in the `Series.points` array.
    */
  val index: Double = js.native
  
  /**
    * Initialize the point. Called internally based on the `series.data`
    * option.
    *
    * @param series
    *        The series object containing this point.
    *
    * @param options
    *        The data in either number, array or object format.
    *
    * @param x
    *        Optionally, the X value of the point.
    *
    * @return The Point instance.
    *
    * @fires Highcharts.Point#afterInit
    */
  def init(series: Series, options: PointOptionsType): Point = js.native
  def init(series: Series, options: PointOptionsType, x: Double): Point = js.native
  
  /**
    * Range series only. The low or minimum value for each data point.
    */
  var low: js.UndefOr[Double] = js.native
  
  /**
    * Indicates if this is a mock point for an annotation.
    */
  var mock: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the point. The name can be given as the first position of the
    * point configuration array, or as a `name` property in the configuration:
    */
  var name: String = js.native
  
  /**
    * Runs on mouse out from the point. Called internally from mouse and touch
    * events.
    *
    * @fires Highcharts.Point#mouseOut
    */
  def onMouseOut(): Unit = js.native
  
  /**
    * Runs on mouse over the point. Called internally from mouse and touch
    * events.
    *
    * @param e
    *        The event arguments.
    */
  def onMouseOver(): Unit = js.native
  def onMouseOver(e: PointerEventObject): Unit = js.native
  
  /**
    * The point's options as applied in the initial configuration, or extended
    * through `Point.update`.
    *
    * In TypeScript you have to extend `PointOptionsObject` via an additional
    * interface to allow custom data options: (see online documentation for
    * example)
    */
  var options: PointOptionsObject = js.native
  
  /**
    * Transform number or array configs into objects. Also called for object
    * configs. Used internally to unify the different configuration formats for
    * points. For example, a simple number `10` in a line series will be
    * transformed to `{ y: 10 }`, and an array config like `[1, 10]` in a
    * scatter series will be transformed to `{ x: 1, y: 10 }`.
    *
    * @param options
    *        The input option.
    *
    * @return Transformed options.
    */
  def optionsToObject(options: PointOptionsType): Dictionary[js.Any] = js.native
  
  /**
    * The percentage for points in a stacked series or pies.
    */
  var percentage: js.UndefOr[Double] = js.native
  
  /**
    * Heatmap series only. Padding between the points in the heatmap.
    */
  var pointPadding: js.UndefOr[Double] = js.native
  
  /**
    * In Highmaps, when data is loaded from GeoJSON, the GeoJSON item's
    * properies are copied over here.
    */
  var properties: js.Any = js.native
  
  /**
    * Remove a point and optionally redraw the series and if necessary the axes
    *
    * @param redraw
    *        Whether to redraw the chart or wait for an explicit call. When
    *        doing more operations on the chart, for example running
    *        `point.remove()` in a loop, it is best practice to set `redraw` to
    *        false and call `chart.redraw()` after.
    *
    * @param animation
    *        Whether to apply animation, and optionally animation
    *        configuration.
    */
  def remove(): Unit = js.native
  def remove(redraw: Boolean): Unit = js.native
  def remove(redraw: Boolean, animation: Boolean): Unit = js.native
  def remove(redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def remove(redraw: Unit, animation: Boolean): Unit = js.native
  def remove(redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  
  /**
    * Toggle the selection status of a point.
    *
    * @param selected
    *        When `true`, the point is selected. When `false`, the point is
    *        unselected. When `null` or `undefined`, the selection state is
    *        toggled.
    *
    * @param accumulate
    *        When `true`, the selection is added to other selected points. When
    *        `false`, other selected points are deselected. Internally in
    *        Highcharts, when allowPointSelect is `true`, selected points are
    *        accumulated on Control, Shift or Cmd clicking the point.
    *
    * @fires Highcharts.Point#select
    * @fires Highcharts.Point#unselect
    */
  def select(): Unit = js.native
  def select(selected: Boolean): Unit = js.native
  def select(selected: Boolean, accumulate: Boolean): Unit = js.native
  def select(selected: Unit, accumulate: Boolean): Unit = js.native
  
  /**
    * Whether the point is selected or not.
    */
  var selected: Boolean = js.native
  
  /**
    * The series object associated with the point.
    */
  var series: Series = js.native
  
  /**
    * Set a value in an object, on the property defined by key. The key
    * supports nested properties using dot notation. The function modifies the
    * input object and does not make a copy.
    *
    * @param object
    *        The object to set the value on.
    *
    * @param value
    *        The value to set.
    *
    * @param key
    *        Key to the property to set.
    *
    * @return The modified object.
    */
  def setNestedProperty[T](`object`: T, value: js.Any, key: String): T = js.native
  
  /**
    * Set the point's state.
    *
    * @param state
    *        The new state, can be one of `'hover'`, `'select'`, `'inactive'`,
    *        or `''` (an empty string), `'normal'` or `undefined` to set to
    *        normal state.
    *
    * @param move
    *        State for animation.
    *
    * @fires Highcharts.Point#afterSetState
    */
  def setState(): Unit = js.native
  def setState(state: Unit, move: Boolean): Unit = js.native
  def setState(state: _empty): Unit = js.native
  def setState(state: _empty, move: Boolean): Unit = js.native
  def setState(state: PointStateValue): Unit = js.native
  def setState(state: PointStateValue, move: Boolean): Unit = js.native
  
  /**
    * Pie series only. Whether to display a slice offset from the center.
    */
  var sliced: js.UndefOr[Boolean] = js.native
  
  /**
    * Sonify a single point.
    *
    * @param options
    *        Options for the sonification of the point.
    */
  def sonify(options: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointSonifyOptionsObject): Unit = js.native
  
  /**
    * Extendable method for formatting each point's tooltip line.
    *
    * @param pointFormat
    *        The point format.
    *
    * @return A string to be concatenated in to the common tooltip text.
    */
  def tooltipFormatter(pointFormat: String): String = js.native
  
  /**
    * The total of values in either a stack for stacked series, or a pie in a
    * pie series.
    */
  var total: js.UndefOr[Double] = js.native
  
  /**
    * Update point with new options (typically x/y data) and optionally redraw
    * the series.
    *
    * @param options
    *        The point options. Point options are handled as described under
    *        the `series.type.data` item for each series type. For example for
    *        a line series, if options is a single number, the point will be
    *        given that number as the marin y value. If it is an array, it will
    *        be interpreted as x and y values respectively. If it is an object,
    *        advanced options are applied.
    *
    * @param redraw
    *        Whether to redraw the chart after the point is updated. If doing
    *        more operations on the chart, it is best practice to set `redraw`
    *        to false and call `chart.redraw()` after.
    *
    * @param animation
    *        Whether to apply animation, and optionally animation
    *        configuration.
    *
    * @fires Highcharts.Point#update
    */
  def update(options: PointOptionsType): Unit = js.native
  def update(options: PointOptionsType, redraw: Boolean): Unit = js.native
  def update(options: PointOptionsType, redraw: Boolean, animation: Boolean): Unit = js.native
  def update(options: PointOptionsType, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def update(options: PointOptionsType, redraw: Unit, animation: Boolean): Unit = js.native
  def update(options: PointOptionsType, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  
  /**
    * Heatmap series only. The value of the point, resulting in a color
    * controled by options as set in the colorAxis configuration.
    */
  var value: js.UndefOr[Double | Null] = js.native
  
  /**
    * For certain series types, like pie charts, where individual points can be
    * shown or hidden.
    */
  var visible: Boolean = js.native
  
  /**
    * The x value of the point.
    */
  var x: Double = js.native
  
  /**
    * The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.native
  
  /**
    * The y value of the point.
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * Highmaps only. Zoom in on the point using the global animation.
    */
  def zoomTo(): Unit = js.native
}
