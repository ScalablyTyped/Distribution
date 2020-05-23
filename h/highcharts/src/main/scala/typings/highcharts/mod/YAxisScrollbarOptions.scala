package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisScrollbarOptions extends js.Object {
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
    * (Highstock) Enable the scrollbar on the Y axis.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Whether to redraw the main chart as the scrollbar or the
    * navigator zoomed window is moved. Defaults to `true` for modern browsers
    * and `false` for legacy IE browsers as well as mobile devices.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Pixel margin between the scrollbar and the axis elements.
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
    * (Highstock) Whether to show the scrollbar when it is fully zoomed out at
    * max range. Setting it to `false` on the Y axis makes the scrollbar stay
    * hidden until the user zooms in, like common in browsers.
    */
  var showFull: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The width of a vertical scrollbar or height of a horizontal
    * scrollbar. Defaults to 20 on touch devices.
    */
  var size: js.UndefOr[Double] = js.undefined
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
    * (Highstock) Z index of the scrollbar elements.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object YAxisScrollbarOptions {
  @scala.inline
  def apply(
    barBackgroundColor: ColorString | GradientColorObject | PatternObject = null,
    barBorderColor: ColorString | GradientColorObject | PatternObject = null,
    barBorderRadius: js.UndefOr[Double] = js.undefined,
    barBorderWidth: js.UndefOr[Double] = js.undefined,
    buttonArrowColor: ColorString | GradientColorObject | PatternObject = null,
    buttonBackgroundColor: ColorString | GradientColorObject | PatternObject = null,
    buttonBorderColor: ColorString | GradientColorObject | PatternObject = null,
    buttonBorderRadius: js.UndefOr[Double] = js.undefined,
    buttonBorderWidth: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    liveRedraw: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    rifleColor: ColorString | GradientColorObject | PatternObject = null,
    showFull: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    trackBackgroundColor: ColorString | GradientColorObject | PatternObject = null,
    trackBorderColor: ColorString | GradientColorObject | PatternObject = null,
    trackBorderRadius: js.UndefOr[Double] = js.undefined,
    trackBorderWidth: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): YAxisScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (barBackgroundColor != null) __obj.updateDynamic("barBackgroundColor")(barBackgroundColor.asInstanceOf[js.Any])
    if (barBorderColor != null) __obj.updateDynamic("barBorderColor")(barBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(barBorderRadius)) __obj.updateDynamic("barBorderRadius")(barBorderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barBorderWidth)) __obj.updateDynamic("barBorderWidth")(barBorderWidth.get.asInstanceOf[js.Any])
    if (buttonArrowColor != null) __obj.updateDynamic("buttonArrowColor")(buttonArrowColor.asInstanceOf[js.Any])
    if (buttonBackgroundColor != null) __obj.updateDynamic("buttonBackgroundColor")(buttonBackgroundColor.asInstanceOf[js.Any])
    if (buttonBorderColor != null) __obj.updateDynamic("buttonBorderColor")(buttonBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonBorderRadius)) __obj.updateDynamic("buttonBorderRadius")(buttonBorderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonBorderWidth)) __obj.updateDynamic("buttonBorderWidth")(buttonBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveRedraw)) __obj.updateDynamic("liveRedraw")(liveRedraw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (rifleColor != null) __obj.updateDynamic("rifleColor")(rifleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showFull)) __obj.updateDynamic("showFull")(showFull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (trackBackgroundColor != null) __obj.updateDynamic("trackBackgroundColor")(trackBackgroundColor.asInstanceOf[js.Any])
    if (trackBorderColor != null) __obj.updateDynamic("trackBorderColor")(trackBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(trackBorderRadius)) __obj.updateDynamic("trackBorderRadius")(trackBorderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackBorderWidth)) __obj.updateDynamic("trackBorderWidth")(trackBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisScrollbarOptions]
  }
}

