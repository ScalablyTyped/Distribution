package typings.highcharts.mod

import typings.highcharts.highchartsStrings.chart_
import typings.highcharts.highchartsStrings.flap
import typings.highcharts.highchartsStrings.ortho
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YAxisTitleOptions extends AxisTitleOptions {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the title relative
    * to the axis values. Possible values are "low", "middle" or "high".
    */
  var align: js.UndefOr[AxisTitleAlignValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel distance between the
    * axis labels and the title. Positive values are outside the axis line,
    * negative are inside.
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The distance of the axis title
    * from the axis line. By default, this distance is computed from the offset
    * width of the labels, the labels' distance from the axis and the title's
    * margin. However when the offset option is set, it overrides all this.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Defines how the title is repositioned according to the 3D
    * chart orientation.
    *
    * - `'offset'`: Maintain a fixed horizontal/vertical distance from the tick
    * marks, despite the chart orientation. This is the backwards compatible
    * behavior, and causes skewing of X and Z axes.
    *
    * - `'chart'`: Preserve 3D position relative to the chart. This looks nice,
    * but hard to read if the text isn't forward-facing.
    *
    * - `'flap'`: Rotated text along the axis to compensate for the chart
    * orientation. This tries to maintain text as legible as possible on all
    * orientations.
    *
    * - `'ortho'`: Rotated text along the axis direction so that the labels are
    * orthogonal to the axis. This is very similar to `'flap'`, but prevents
    * skewing the labels (X and Y scaling are still present).
    *
    * - `undefined`: Will use the config from `labels.position3d`
    */
  var position3d: js.UndefOr[chart_ | flap | typings.highcharts.highchartsStrings.offset | ortho | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to reserve space for the title
    * when laying out the axis.
    */
  var reserveSpace: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The rotation of the text in
    * degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) If enabled, the axis title will skewed to follow the
    * perspective.
    *
    * This will fix overlapping labels and titles, but texts become less
    * legible due to the distortion.
    *
    * The final appearance depends heavily on `title.position3d`.
    *
    * A `null` value will use the config from `labels.skew3d`.
    */
  var skew3d: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. If the
    * title text is longer than the axis length, it will wrap to multiple lines
    * by default. This can be customized by setting `textOverflow: 'ellipsis'`,
    * by setting a specific `width` or by setting `whiteSpace: 'nowrap'`.
    *
    * In styled mode, the stroke width is given in the `.highcharts-axis-title`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The actual text of the axis title.
    * Horizontal texts can contain HTML, but rotated texts are painted using
    * vector techniques and must be clean text. The Y axis title is disabled by
    * setting the `text` option to `undefined`.
    */
  var text: js.UndefOr[String | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the text, can be
    * `"left"`, `"right"` or `"center"`. Default alignment depends on the
    * title.align:
    *
    * Horizontal axes:
    *
    * - for `align` = `"low"`, `textAlign` is set to `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"`, `textAlign` is set to `right`
    *
    * Vertical axes:
    *
    * - for `align` = `"low"` and `opposite` = `true`, `textAlign` is set to
    * `right`
    *
    * - for `align` = `"low"` and `opposite` = `false`, `textAlign` is set to
    * `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"` and `opposite` = `true` `textAlign` is set to
    * `left`
    *
    * - for `align` = `"high"` and `opposite` = `false` `textAlign` is set to
    * `right`
    */
  var textAlign: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to use HTML to render the axis
    * title.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Horizontal pixel offset of the title
    * position.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Vertical pixel offset of the title
    * position.
    */
  var y: js.UndefOr[Double] = js.native
}
object YAxisTitleOptions {
  
  @scala.inline
  def apply(): YAxisTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisTitleOptions]
  }
  
  @scala.inline
  implicit class YAxisTitleOptionsOps[Self <: YAxisTitleOptions] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: AxisTitleAlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition3d(value: chart_ | flap | typings.highcharts.highchartsStrings.offset | ortho): Self = this.set("position3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition3d: Self = this.set("position3d", js.undefined)
    
    @scala.inline
    def setPosition3dNull: Self = this.set("position3d", null)
    
    @scala.inline
    def setReserveSpace(value: Boolean): Self = this.set("reserveSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserveSpace: Self = this.set("reserveSpace", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setSkew3d(value: Boolean): Self = this.set("skew3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkew3d: Self = this.set("skew3d", js.undefined)
    
    @scala.inline
    def setSkew3dNull: Self = this.set("skew3d", null)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    
    @scala.inline
    def setTextAlign(value: AlignValue): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setUseHTML(value: Boolean): Self = this.set("useHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHTML: Self = this.set("useHTML", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
