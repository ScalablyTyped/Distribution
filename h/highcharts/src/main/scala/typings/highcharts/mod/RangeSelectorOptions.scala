package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelectorOptions extends js.Object {
  /**
    * (Highstock, Gantt) Whether to enable all buttons from the start. By
    * default buttons are only enabled if the corresponding time range exists
    * on the X axis, but enabling all buttons allows for dynamically loading
    * different time ranges.
    */
  var allButtonsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Positioning for the button row.
    */
  var buttonPosition: js.UndefOr[RangeSelectorButtonPositionOptions] = js.native
  /**
    * (Highstock, Gantt) The space in pixels between the buttons in the range
    * selector.
    */
  var buttonSpacing: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) A collection of attributes for the buttons. The object
    * takes SVG attributes like `fill`, `stroke`, `stroke-width`, as well as
    * `style`, a collection of CSS properties for the text.
    *
    * The object can also be extended with states, so you can set
    * presentational options for `hover`, `select` or `disabled` button states.
    *
    * CSS styles for the text label.
    *
    * In styled mode, the buttons are styled by the
    * `.highcharts-range-selector-buttons .highcharts-button` rule with its
    * different states.
    */
  var buttonTheme: js.UndefOr[SVGAttributes] = js.native
  /**
    * (Highstock, Gantt) An array of configuration objects for the buttons.
    *
    * Defaults to: (see online documentation for example)
    */
  var buttons: js.UndefOr[js.Array[RangeSelectorButtonsOptions]] = js.native
  /**
    * (Highstock, Gantt) Enable or disable the range selector.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) When the rangeselector is floating, the plot area does
    * not reserve space for it. This opens for positioning anywhere on the
    * chart.
    */
  var floating: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) The border color of the date input boxes.
    */
  var inputBoxBorderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highstock, Gantt) The pixel height of the date input boxes.
    */
  var inputBoxHeight: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The pixel width of the date input boxes.
    */
  var inputBoxWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The date format in the input boxes when not selected
    * for editing. Defaults to `%b %e, %Y`.
    */
  var inputDateFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) A custom callback function to parse values entered in
    * the input boxes and return a valid JavaScript time as milliseconds since
    * 1970.
    */
  var inputDateParser: js.UndefOr[RangeSelectorParseCallbackFunction] = js.native
  /**
    * (Highstock, Gantt) The date format in the input boxes when they are
    * selected for editing. This must be a format that is recognized by
    * JavaScript Date.parse.
    */
  var inputEditDateFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) Enable or disable the date input boxes. Defaults to
    * enabled when there is enough space, disabled if not (typically mobile).
    */
  var inputEnabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Positioning for the input boxes. Allowed properties
    * are `align`, `x` and `y`.
    */
  var inputPosition: js.UndefOr[RangeSelectorInputPositionOptions] = js.native
  /**
    * (Highstock, Gantt) CSS for the HTML inputs in the range selector.
    *
    * In styled mode, the inputs are styled by the `.highcharts-range-input
    * text` rule in SVG mode, and `input.highcharts-range-selector` when
    * active.
    */
  var inputStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highstock, Gantt) CSS styles for the labels - the Zoom, From and To
    * texts.
    *
    * In styled mode, the labels are styled by the `.highcharts-range-label`
    * class.
    */
  var labelStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highstock, Gantt) The index of the button to appear pre-selected.
    */
  var selected: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The vertical alignment of the rangeselector box.
    * Allowed properties are `top`, `middle`, `bottom`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highstock, Gantt) The x offset of the range selector relative to its
    * horizontal alignment within `chart.spacingLeft` and `chart.spacingRight`.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The y offset of the range selector relative to its
    * horizontal alignment within `chart.spacingLeft` and `chart.spacingRight`.
    */
  var y: js.UndefOr[Double] = js.native
}

object RangeSelectorOptions {
  @scala.inline
  def apply(): RangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorOptions]
  }
  @scala.inline
  implicit class RangeSelectorOptionsOps[Self <: RangeSelectorOptions] (val x: Self) extends AnyVal {
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
    def setAllButtonsEnabled(value: Boolean): Self = this.set("allButtonsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllButtonsEnabled: Self = this.set("allButtonsEnabled", js.undefined)
    @scala.inline
    def setButtonPosition(value: RangeSelectorButtonPositionOptions): Self = this.set("buttonPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonPosition: Self = this.set("buttonPosition", js.undefined)
    @scala.inline
    def setButtonSpacing(value: Double): Self = this.set("buttonSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonSpacing: Self = this.set("buttonSpacing", js.undefined)
    @scala.inline
    def setButtonTheme(value: SVGAttributes): Self = this.set("buttonTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonTheme: Self = this.set("buttonTheme", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: RangeSelectorButtonsOptions*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[RangeSelectorButtonsOptions]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setInputBoxBorderColor(value: ColorString): Self = this.set("inputBoxBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBoxBorderColor: Self = this.set("inputBoxBorderColor", js.undefined)
    @scala.inline
    def setInputBoxHeight(value: Double): Self = this.set("inputBoxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBoxHeight: Self = this.set("inputBoxHeight", js.undefined)
    @scala.inline
    def setInputBoxWidth(value: Double): Self = this.set("inputBoxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBoxWidth: Self = this.set("inputBoxWidth", js.undefined)
    @scala.inline
    def setInputDateFormat(value: String): Self = this.set("inputDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDateFormat: Self = this.set("inputDateFormat", js.undefined)
    @scala.inline
    def setInputDateParser(value: /* value */ String => Double): Self = this.set("inputDateParser", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInputDateParser: Self = this.set("inputDateParser", js.undefined)
    @scala.inline
    def setInputEditDateFormat(value: String): Self = this.set("inputEditDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputEditDateFormat: Self = this.set("inputEditDateFormat", js.undefined)
    @scala.inline
    def setInputEnabled(value: Boolean): Self = this.set("inputEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputEnabled: Self = this.set("inputEnabled", js.undefined)
    @scala.inline
    def setInputPosition(value: RangeSelectorInputPositionOptions): Self = this.set("inputPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPosition: Self = this.set("inputPosition", js.undefined)
    @scala.inline
    def setInputStyle(value: CSSObject): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSObject): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setSelected(value: Double): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
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

