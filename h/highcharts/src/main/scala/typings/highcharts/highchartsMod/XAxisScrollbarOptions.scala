package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisScrollbarOptions extends js.Object {
  /**
    * (Highstock) The background color of the scrollbar itself.
    */
  var barBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The color of the scrollbar's border.
    */
  var barBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The border rounding radius of the bar.
    */
  var barBorderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The width of the bar's border.
    */
  var barBorderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The color of the small arrow inside the scrollbar buttons.
    */
  var buttonArrowColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The color of scrollbar buttons.
    */
  var buttonBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The color of the border of the scrollbar buttons.
    */
  var buttonBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The corner radius of the scrollbar buttons.
    */
  var buttonBorderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The border width of the scrollbar buttons.
    */
  var buttonBorderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Enable or disable the scrollbar.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The height of the scrollbar. The height also applies to the
    * width of the scroll arrows so that they are always squares. Defaults to
    * 20 for touch devices and 14 for mouse devices.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Whether to redraw the main chart as the scrollbar or the
    * navigator zoomed window is moved. Defaults to `true` for modern browsers
    * and `false` for legacy IE browsers as well as mobile devices.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The margin between the scrollbar and its axis when the
    * scrollbar is applied directly to an axis.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The minimum width of the scrollbar.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The color of the small rifles in the middle of the scrollbar.
    */
  var rifleColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) Whether to show or hide the scrollbar when the scrolled
    * content is zoomed out to it full extent.
    */
  var showFull: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The color of the track background.
    */
  var trackBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The color of the border of the scrollbar track.
    */
  var trackBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The corner radius of the border of the scrollbar track.
    */
  var trackBorderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The width of the border of the scrollbar track.
    */
  var trackBorderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The z index of the scrollbar group.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object XAxisScrollbarOptions {
  @scala.inline
  def apply(
    barBackgroundColor: ColorString | GradientColorObject | PatternObject = null,
    barBorderColor: ColorString | GradientColorObject | PatternObject = null,
    barBorderRadius: Int | Double = null,
    barBorderWidth: Int | Double = null,
    buttonArrowColor: ColorString | GradientColorObject | PatternObject = null,
    buttonBackgroundColor: ColorString | GradientColorObject | PatternObject = null,
    buttonBorderColor: ColorString | GradientColorObject | PatternObject = null,
    buttonBorderRadius: Int | Double = null,
    buttonBorderWidth: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    liveRedraw: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    minWidth: Int | Double = null,
    rifleColor: ColorString | GradientColorObject | PatternObject = null,
    showFull: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    trackBackgroundColor: ColorString | GradientColorObject | PatternObject = null,
    trackBorderColor: ColorString | GradientColorObject | PatternObject = null,
    trackBorderRadius: Int | Double = null,
    trackBorderWidth: Int | Double = null,
    zIndex: Int | Double = null
  ): XAxisScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (barBackgroundColor != null) __obj.updateDynamic("barBackgroundColor")(barBackgroundColor.asInstanceOf[js.Any])
    if (barBorderColor != null) __obj.updateDynamic("barBorderColor")(barBorderColor.asInstanceOf[js.Any])
    if (barBorderRadius != null) __obj.updateDynamic("barBorderRadius")(barBorderRadius.asInstanceOf[js.Any])
    if (barBorderWidth != null) __obj.updateDynamic("barBorderWidth")(barBorderWidth.asInstanceOf[js.Any])
    if (buttonArrowColor != null) __obj.updateDynamic("buttonArrowColor")(buttonArrowColor.asInstanceOf[js.Any])
    if (buttonBackgroundColor != null) __obj.updateDynamic("buttonBackgroundColor")(buttonBackgroundColor.asInstanceOf[js.Any])
    if (buttonBorderColor != null) __obj.updateDynamic("buttonBorderColor")(buttonBorderColor.asInstanceOf[js.Any])
    if (buttonBorderRadius != null) __obj.updateDynamic("buttonBorderRadius")(buttonBorderRadius.asInstanceOf[js.Any])
    if (buttonBorderWidth != null) __obj.updateDynamic("buttonBorderWidth")(buttonBorderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(liveRedraw)) __obj.updateDynamic("liveRedraw")(liveRedraw.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (rifleColor != null) __obj.updateDynamic("rifleColor")(rifleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showFull)) __obj.updateDynamic("showFull")(showFull.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (trackBackgroundColor != null) __obj.updateDynamic("trackBackgroundColor")(trackBackgroundColor.asInstanceOf[js.Any])
    if (trackBorderColor != null) __obj.updateDynamic("trackBorderColor")(trackBorderColor.asInstanceOf[js.Any])
    if (trackBorderRadius != null) __obj.updateDynamic("trackBorderRadius")(trackBorderRadius.asInstanceOf[js.Any])
    if (trackBorderWidth != null) __obj.updateDynamic("trackBorderWidth")(trackBorderWidth.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisScrollbarOptions]
  }
}

