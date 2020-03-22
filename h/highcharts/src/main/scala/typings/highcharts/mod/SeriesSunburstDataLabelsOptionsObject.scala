package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSunburstDataLabelsOptionsObject extends js.Object {
  /**
    * (Highcharts) Alignment method for data labels. Possible values are:
    *
    * - `toPlotEdges`: Each label touches the nearest vertical edge of the plot
    * area.
    *
    * - `connectors`: Connectors have the same x position and the widest label
    * of each half (left & right) touches the nearest vertical edge of the plot
    * area.
    */
  var alignTo: js.UndefOr[String] = js.undefined
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the data label.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
    * label. Defaults to `undefined`.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
    * the data label.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
    * the data label.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
    * Particularly in styled mode, this can be used to give each series' or
    * point's data label unique styling. In addition to this option, a default
    * color class name is added so that we can give the labels a contrast text
    * shadow.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
    * labels. Defaults to `undefined`. For certain series types, like column or
    * map, the data labels can be drawn inside the points. In this case the
    * data label will be drawn with maximum contrast by default. Additionally,
    * it will be given a `text-outline` style with the opposite color, to
    * further increase the contrast. This can be overridden by setting the
    * `text-outline` style to `none` in the `dataLabels.style` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The color of the line connecting the data label to the pie
    * slice. The default color is the same as the point's color.
    *
    * In styled mode, the connector stroke is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The distance from the data label to the connector. Note that
    * data labels also have a default `padding`, so in order for the connector
    * to touch the text, the `padding` must also be 0.
    */
  var connectorPadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Specifies the method that is used to generate the connector
    * path. Highcharts provides 3 built-in connector shapes: `'fixedOffset'`
    * (default), `'straight'` and `'crookedLine'`. Using `'crookedLine'` has
    * the most sense (in most of the cases) when `'alignTo'` is set.
    *
    * Users can provide their own method by passing a function instead of a
    * String. 3 arguments are passed to the callback:
    *
    * - Object that holds the information about the coordinates of the label
    * (`x` & `y` properties) and how the label is located in relation to the
    * pie (`alignment` property). `alignment` can by one of the following:
    * `'left'` (pie on the left side of the data label), `'right'` (pie on the
    * right side of the data label) or `'center'` (data label overlaps the
    * pie).
    *
    * - Object that holds the information about the position of the connector.
    * Its `touchingSliceAt` porperty tells the position of the place where the
    * connector touches the slice.
    *
    * - Data label options
    *
    * The function has to return an SVG path definition in array form (see the
    * example).
    */
  var connectorShape: js.UndefOr[String | js.Function] = js.undefined
  /**
    * (Highcharts) The width of the line connecting the data label to the pie
    * slice.
    *
    * In styled mode, the connector stroke width is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Works only if `connectorShape` is `'crookedLine'`. It
    * defines how far from the vertical plot edge the coonnector path should be
    * crooked.
    */
  var crookDistance: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
    * are outside the plot area. By default, the data label is moved inside the
    * plot area according to the overflow option.
    */
  var crop: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
    * labels until the initial series animation has finished.
    */
  var defer: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The distance of the data label from the pie's edge. Negative
    * numbers put the data label on top of the pie slices. Can also be defined
    * as a percentage of pie's radius. Connectors are only shown for data
    * labels outside the pie.
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
    * labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
    * of which data labels to display. The declarative filter is designed for
    * use when callback functions are not available, like when the chart
    * options require a pure JSON structure or for use with graphical editors.
    * For programmatic control, use the `formatter` instead, and return
    * `undefined` to disable a single data label.
    */
  var filter: js.UndefOr[DataLabelsFilterOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
    * label. Available variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
    * format the data label. Note that if a `format` is defined, the format
    * takes precedence and the formatter is ignored.
    */
  var formatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) For points with an extent, like
    * columns or map areas, whether to align the data label inside the box or
    * to the actual value point. Defaults to `false` in most cases, `true` in
    * stacked columns.
    */
  var inside: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
    * of null. Works analogously to format. `nullFormat` can be applied only to
    * series which support displaying null points.
    */
  var nullFormat: js.UndefOr[Boolean | String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
    * that defines formatting for points with the value of null. Works
    * analogously to formatter. `nullPointFormatter` can be applied only to
    * series which support displaying null points.
    */
  var nullFormatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
    * flow outside the plot area. The default is `"justify"`, which aligns them
    * inside the plot area. For columns and bars, this means it will be moved
    * inside the bar. To display data labels outside the plot area, set `crop`
    * to `false` and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When either the `borderWidth` or
    * the `backgroundColor` is set, this is the padding within the box.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
    * points. If `center` alignment is not possible, it defaults to `right`.
    */
  var position: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
    * that due to a more complex structure, backgrounds, borders and padding
    * will be lost on a rotated data label.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decides how the data label will
    * be rotated relative to the perimeter of the sunburst. Valid values are
    * `auto`, `parallel` and `perpendicular`. When `auto`, the best fit will be
    * computed for the point.
    *
    * The `series.rotation` option takes precedence over `rotationMode`.
    */
  var rotationMode: js.UndefOr[OptionsRotationModeValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
    * best with `borderWidth` or `backgroundColor`. Since 2.3 the shadow can be
    * an object configuration containing `color`, `offsetX`, `offsetY`,
    * `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
    * the border around the label. Symbols are predefined functions on the
    * Renderer object.
    */
  var shape: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Whether to render the connector as a soft arc or a line with
    * sharp break. Works only if `connectorShape` equals to `fixedOffset`.
    */
  var softConnector: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
    * default `color` setting is `"contrast"`, which is a pseudo color that
    * Highcharts picks up and applies the maximum contrast to the underlying
    * point item, for example the bar in a bar chart.
    *
    * The `textOutline` is a pseudo property that applies an outline of the
    * given width with the given color, which by default is the maximum
    * contrast to the text. So a bright text color will result in a black text
    * outline for maximum readability on a mixed background. In some cases,
    * especially with grayscale text, the text outline doesn't work well, in
    * which cases it can be disabled by setting it to `"none"`. When `useHTML`
    * is true, the `textOutline` will not be picked up. In this, case, the same
    * effect can be acheived through the `text-shadow` CSS property.
    *
    * For some series types, where each point has an extent, like for example
    * tree maps, the data label may overflow the point. There are two
    * strategies for handling overflow. By default, the text will wrap to
    * multiple lines. The other strategy is to set `style.textOverflow` to
    * `ellipsis`, which will keep the text on one line plus it will break
    * inside long words.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
    * should follow marker's shape. Border and background are disabled for a
    * label that follows a path.
    *
    * **Note:** Only SVG-based renderer supports this option. Setting `useHTML`
    * to true will disable this option.
    */
  var textPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
    * label. Can be one of `top`, `middle` or `bottom`. The default value
    * depends on the data, for instance in a column chart, the label is above
    * positive values and below negative values.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
    * label relative to the point in pixels.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
    * label relative to the point in pixels.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
    * The default Z index puts it above the series. Use a Z index of 2 to
    * display it behind the series.
    */
  var z: js.UndefOr[Double] = js.undefined
}

object SeriesSunburstDataLabelsOptionsObject {
  @scala.inline
  def apply(
    alignTo: String = null,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    connectorColor: ColorString | GradientColorObject | PatternObject = null,
    connectorPadding: Int | Double = null,
    connectorShape: String | js.Function = null,
    connectorWidth: Int | Double = null,
    crookDistance: String = null,
    crop: js.UndefOr[Boolean] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    filter: DataLabelsFilterOptionsObject = null,
    format: String = null,
    formatter: DataLabelsFormatterCallbackFunction = null,
    inside: js.UndefOr[Boolean] = js.undefined,
    nullFormat: Boolean | String = null,
    nullFormatter: DataLabelsFormatterCallbackFunction = null,
    overflow: DataLabelsOverflowValue = null,
    padding: Int | Double = null,
    position: AlignValue = null,
    rotation: Int | Double = null,
    rotationMode: OptionsRotationModeValue = null,
    shadow: Boolean | ShadowOptionsObject = null,
    shape: String = null,
    softConnector: js.UndefOr[Boolean] = js.undefined,
    style: CSSObject = null,
    textPath: DataLabelsTextPathOptionsObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null,
    z: Int | Double = null
  ): SeriesSunburstDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (alignTo != null) __obj.updateDynamic("alignTo")(alignTo.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor.asInstanceOf[js.Any])
    if (connectorPadding != null) __obj.updateDynamic("connectorPadding")(connectorPadding.asInstanceOf[js.Any])
    if (connectorShape != null) __obj.updateDynamic("connectorShape")(connectorShape.asInstanceOf[js.Any])
    if (connectorWidth != null) __obj.updateDynamic("connectorWidth")(connectorWidth.asInstanceOf[js.Any])
    if (crookDistance != null) __obj.updateDynamic("crookDistance")(crookDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside.asInstanceOf[js.Any])
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat.asInstanceOf[js.Any])
    if (nullFormatter != null) __obj.updateDynamic("nullFormatter")(nullFormatter.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationMode != null) __obj.updateDynamic("rotationMode")(rotationMode.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(softConnector)) __obj.updateDynamic("softConnector")(softConnector.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSunburstDataLabelsOptionsObject]
  }
}

