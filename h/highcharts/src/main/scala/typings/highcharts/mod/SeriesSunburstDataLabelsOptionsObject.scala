package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var alignTo: js.UndefOr[String] = js.native
  
  var allowOverlap: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the initial
    * animation when a series is displayed for the `dataLabels`. The animation
    * can also be set as a configuration object. Please note that this option
    * only applies to the initial animation. For other animations, see
    * chart.animation and the animation parameter under the API methods. The
    * following properties are supported:
    *
    * - `defer`: The animation delay time in milliseconds.
    */
  var animation: js.UndefOr[
    Boolean | PlotSunburstDataLabelsAnimationOptions | PlotSunburstLevelsDataLabelsAnimationOptions | PartialAnimationOptionsOb
  ] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the data label.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
    * label. Defaults to `undefined`.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
    * the data label.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
    * the data label.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
    * Particularly in styled mode, this can be used to give each series' or
    * point's data label unique styling. In addition to this option, a default
    * color class name is added so that we can give the labels a contrast text
    * shadow.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
    * labels. Defaults to `undefined`. For certain series types, like column or
    * map, the data labels can be drawn inside the points. In this case the
    * data label will be drawn with maximum contrast by default. Additionally,
    * it will be given a `text-outline` style with the opposite color, to
    * further increase the contrast. This can be overridden by setting the
    * `text-outline` style to `none` in the `dataLabels.style` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The color of the line connecting the data label to the pie
    * slice. The default color is the same as the point's color.
    *
    * In styled mode, the connector stroke is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The distance from the data label to the connector. Note that
    * data labels also have a default `padding`, so in order for the connector
    * to touch the text, the `padding` must also be 0.
    */
  var connectorPadding: js.UndefOr[Double] = js.native
  
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
  var connectorShape: js.UndefOr[String | js.Function] = js.native
  
  /**
    * (Highcharts) The width of the line connecting the data label to the pie
    * slice.
    *
    * In styled mode, the connector stroke width is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Works only if `connectorShape` is `'crookedLine'`. It
    * defines how far from the vertical plot edge the coonnector path should be
    * crooked.
    */
  var crookDistance: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
    * are outside the plot area. By default, the data label is moved inside the
    * plot area according to the overflow option.
    */
  var crop: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
    * labels until the initial series animation has finished. Setting to
    * `false` renders the data label immediately. If set to `true` inherits the
    * defer time set in plotOptions.series.animation.
    */
  var defer: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The distance of the data label from the pie's edge. Negative
    * numbers put the data label on top of the pie slices. Can also be defined
    * as a percentage of pie's radius. Connectors are only shown for data
    * labels outside the pie.
    */
  var distance: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
    * labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
    * of which data labels to display. The declarative filter is designed for
    * use when callback functions are not available, like when the chart
    * options require a pure JSON structure or for use with graphical editors.
    * For programmatic control, use the `formatter` instead, and return
    * `undefined` to disable a single data label.
    */
  var filter: js.UndefOr[DataLabelsFilterOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
    * label. Available variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
    * format the data label. Note that if a `format` is defined, the format
    * takes precedence and the formatter is ignored.
    */
  var formatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
    * of null. Works analogously to format. `nullFormat` can be applied only to
    * series which support displaying null points.
    */
  var nullFormat: js.UndefOr[Boolean | String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
    * that defines formatting for points with the value of null. Works
    * analogously to formatter. `nullPointFormatter` can be applied only to
    * series which support displaying null points.
    */
  var nullFormatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
    * flow outside the plot area. The default is `"justify"`, which aligns them
    * inside the plot area. For columns and bars, this means it will be moved
    * inside the bar. To display data labels outside the plot area, set `crop`
    * to `false` and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When either the `borderWidth` or
    * the `backgroundColor` is set, this is the padding within the box.
    */
  var padding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
    * points. If `center` alignment is not possible, it defaults to `right`.
    */
  var position: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
    * that due to a more complex structure, backgrounds, borders and padding
    * will be lost on a rotated data label.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decides how the data label will
    * be rotated relative to the perimeter of the sunburst. Valid values are
    * `auto`, `circular`, `parallel` and `perpendicular`. When `auto`, the best
    * fit will be computed for the point. The `circular` option works similiar
    * to `auto`, but uses the `textPath` feature - labels are curved, resulting
    * in a better layout, however multiple lines and `textOutline` are not
    * supported.
    *
    * The `series.rotation` option takes precedence over `rotationMode`.
    */
  var rotationMode: js.UndefOr[OptionsRotationModeValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
    * best with `borderWidth` or `backgroundColor`. Since 2.3 the shadow can be
    * an object configuration containing `color`, `offsetX`, `offsetY`,
    * `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
    * the border around the label. Symbols are predefined functions on the
    * Renderer object.
    */
  var shape: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Whether to render the connector as a soft arc or a line with
    * sharp break. Works only if `connectorShape` equals to `fixedOffset`.
    */
  var softConnector: js.UndefOr[Boolean] = js.native
  
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
  var style: js.UndefOr[CSSObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
    * should follow marker's shape. Border and background are disabled for a
    * label that follows a path.
    *
    * **Note:** Only SVG-based renderer supports this option. Setting `useHTML`
    * to true will disable this option.
    */
  var textPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
    * label. Can be one of `top`, `middle` or `bottom`. The default value
    * depends on the data, for instance in a column chart, the label is above
    * positive values and below negative values.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
    * label relative to the point in pixels.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
    * label relative to the point in pixels.
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
    * The default Z index puts it above the series. Use a Z index of 2 to
    * display it behind the series.
    */
  var z: js.UndefOr[Double] = js.native
}
object SeriesSunburstDataLabelsOptionsObject {
  
  @scala.inline
  def apply(): SeriesSunburstDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSunburstDataLabelsOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesSunburstDataLabelsOptionsObjectOps[Self <: SeriesSunburstDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setAlignTo(value: String): Self = this.set("alignTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignTo: Self = this.set("alignTo", js.undefined)
    
    @scala.inline
    def setAllowOverlap(value: Boolean): Self = this.set("allowOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverlap: Self = this.set("allowOverlap", js.undefined)
    
    @scala.inline
    def setAnimation(
      value: Boolean | PlotSunburstDataLabelsAnimationOptions | PlotSunburstLevelsDataLabelsAnimationOptions | PartialAnimationOptionsOb
    ): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setConnectorColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("connectorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorColor: Self = this.set("connectorColor", js.undefined)
    
    @scala.inline
    def setConnectorPadding(value: Double): Self = this.set("connectorPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorPadding: Self = this.set("connectorPadding", js.undefined)
    
    @scala.inline
    def setConnectorShape(value: String | js.Function): Self = this.set("connectorShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorShape: Self = this.set("connectorShape", js.undefined)
    
    @scala.inline
    def setConnectorWidth(value: Double): Self = this.set("connectorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorWidth: Self = this.set("connectorWidth", js.undefined)
    
    @scala.inline
    def setCrookDistance(value: String): Self = this.set("crookDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrookDistance: Self = this.set("crookDistance", js.undefined)
    
    @scala.inline
    def setCrop(value: Boolean): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setDistance(value: Double | String): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFilter(value: DataLabelsFilterOptionsObject): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatter(value: DataLabelsFormatterCallbackFunction): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setNullFormat(value: Boolean | String): Self = this.set("nullFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullFormat: Self = this.set("nullFormat", js.undefined)
    
    @scala.inline
    def setNullFormatter(value: DataLabelsFormatterCallbackFunction): Self = this.set("nullFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullFormatter: Self = this.set("nullFormatter", js.undefined)
    
    @scala.inline
    def setOverflow(value: DataLabelsOverflowValue): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPosition(value: AlignValue): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setRotationMode(value: OptionsRotationModeValue): Self = this.set("rotationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationMode: Self = this.set("rotationMode", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean | ShadowOptionsObject): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSoftConnector(value: Boolean): Self = this.set("softConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftConnector: Self = this.set("softConnector", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextPath(value: DataLabelsTextPathOptionsObject): Self = this.set("textPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextPath: Self = this.set("textPath", js.undefined)
    
    @scala.inline
    def setUseHTML(value: Boolean): Self = this.set("useHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHTML: Self = this.set("useHTML", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setVerticalAlignNull: Self = this.set("verticalAlign", null)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
