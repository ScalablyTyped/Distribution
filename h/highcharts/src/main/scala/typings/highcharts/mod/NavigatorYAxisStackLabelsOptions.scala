package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorYAxisStackLabelsOptions extends StObject {
  
  /**
    * (Highcharts) Defines the horizontal alignment of the stack total label.
    * Can be one of `"left"`, `"center"` or `"right"`. The default value is
    * calculated at runtime and depends on orientation and whether the stack is
    * positive or negative.
    */
  var align: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Highcharts) Allow the stack labels to overlap.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Enable or disable the initial animation when a series is
    * displayed for the `stackLabels`. The animation can also be set as a
    * configuration object. Please note that this option only applies to the
    * initial animation. For other animations, see chart.animation and the
    * animation parameter under the API methods. The following properties are
    * supported:
    *
    * - `defer`: The animation delay time in milliseconds.
    */
  var animation: js.UndefOr[Boolean | NavigatorYAxisStackLabelsAnimationOptions | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highcharts) The background color or gradient for the stack label.
    */
  var backgroundColor: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts) The border color for the stack label. Defaults to
    * `undefined`.
    */
  var borderColor: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts) The border radius in pixels for the stack label.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The border width in pixels for the stack label.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Whether to hide stack labels that are outside the plot area.
    * By default, the stack label is moved inside the plot area according to
    * the overflow option.
    */
  var crop: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Enable or disable the stack total labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) A format string for the data label. Available
    * variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Callback JavaScript function to format the label. The value
    * is given by `this.total`.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[StackItemObject]] = js.native
  
  /**
    * (Highcharts) How to handle stack total labels that flow outside the plot
    * area. The default is set to `"justify"`, which aligns them inside the
    * plot area. For columns and bars, this means it will be moved inside the
    * bar. To display stack labels outside the plot area, set `crop` to `false`
    * and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.native
  
  /**
    * (Highcharts) Rotation of the labels in degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) CSS styles for the label.
    *
    * In styled mode, the styles are set in the `.highcharts-stack-label`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  
  /**
    * (Highcharts) The text alignment for the label. While `align` determines
    * where the texts anchor point is placed with regards to the stack,
    * `textAlign` determines how the text is aligned against its anchor point.
    * Possible values are `"left"`, `"center"` and `"right"`. The default value
    * is calculated at runtime and depends on orientation and whether the stack
    * is positive or negative.
    */
  var textAlign: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Highcharts, Highstock) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Defines the vertical alignment of the stack total label. Can
    * be one of `"top"`, `"middle"` or `"bottom"`. The default value is
    * calculated at runtime and depends on orientation and whether the stack is
    * positive or negative.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  
  /**
    * (Highcharts) The x position offset of the label relative to the left of
    * the stacked bar. The default value is calculated at runtime and depends
    * on orientation and whether the stack is positive or negative.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The y position offset of the label relative to the tick
    * position on the axis. The default value is calculated at runtime and
    * depends on orientation and whether the stack is positive or negative.
    */
  var y: js.UndefOr[Double] = js.native
}
object NavigatorYAxisStackLabelsOptions {
  
  @scala.inline
  def apply(): NavigatorYAxisStackLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisStackLabelsOptions]
  }
  
  @scala.inline
  implicit class NavigatorYAxisStackLabelsOptionsMutableBuilder[Self <: NavigatorYAxisStackLabelsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | NavigatorYAxisStackLabelsAnimationOptions | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ColorType): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorType): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatter(value: FormatterCallbackFunction[StackItemObject]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setOverflow(value: DataLabelsOverflowValue): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextAlign(value: AlignValue): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
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
