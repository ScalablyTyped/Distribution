package typings.highcharts.mod

import typings.highcharts.highchartsStrings.chart_
import typings.highcharts.highchartsStrings.flap
import typings.highcharts.highchartsStrings.ortho
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorXAxisTitleOptions extends StObject {
  
  /**
    * (Highstock, Gantt) Alignment of the title relative to the axis values.
    * Possible values are "low", "middle" or "high".
    */
  var align: js.UndefOr[AxisTitleAlignValue] = js.native
  
  /**
    * (Highstock, Gantt) The pixel distance between the axis labels or line and
    * the title. Defaults to 0 for horizontal axes, 10 for vertical
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock, Gantt) The distance of the axis title from the axis line. By
    * default, this distance is computed from the offset width of the labels,
    * the labels' distance from the axis and the title's margin. However when
    * the offset option is set, it overrides all this.
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
    * (Highstock, Gantt) The rotation of the text in degrees. 0 is horizontal,
    * 270 is vertical reading from bottom to top.
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
    * (Highstock, Gantt) CSS styles for the title. If the title text is longer
    * than the axis length, it will wrap to multiple lines by default. This can
    * be customized by setting `textOverflow: 'ellipsis'`, by setting a
    * specific `width` or by setting `whiteSpace: 'nowrap'`.
    *
    * In styled mode, the stroke width is given in the `.highcharts-axis-title`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  
  /**
    * (Highstock, Gantt) The actual text of the axis title. It can contain
    * basic HTML tags like `b`, `i` and `span` with style.
    */
  var text: js.UndefOr[String | Null] = js.native
  
  /**
    * (Highstock, Gantt) Alignment of the text, can be `"left"`, `"right"` or
    * `"center"`. Default alignment depends on the title.align:
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
object NavigatorXAxisTitleOptions {
  
  @scala.inline
  def apply(): NavigatorXAxisTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorXAxisTitleOptions]
  }
  
  @scala.inline
  implicit class NavigatorXAxisTitleOptionsMutableBuilder[Self <: NavigatorXAxisTitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AxisTitleAlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition3d(value: chart_ | flap | typings.highcharts.highchartsStrings.offset | ortho): Self = StObject.set(x, "position3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition3dNull: Self = StObject.set(x, "position3d", null)
    
    @scala.inline
    def setPosition3dUndefined: Self = StObject.set(x, "position3d", js.undefined)
    
    @scala.inline
    def setReserveSpace(value: Boolean): Self = StObject.set(x, "reserveSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReserveSpaceUndefined: Self = StObject.set(x, "reserveSpace", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSkew3d(value: Boolean): Self = StObject.set(x, "skew3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkew3dNull: Self = StObject.set(x, "skew3d", null)
    
    @scala.inline
    def setSkew3dUndefined: Self = StObject.set(x, "skew3d", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: AlignValue): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
