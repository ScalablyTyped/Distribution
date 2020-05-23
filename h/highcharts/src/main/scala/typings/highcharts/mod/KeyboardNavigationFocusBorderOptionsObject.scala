package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardNavigationFocusBorderOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable/disable focus border for
    * chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Hide the browser's default focus
    * indicator.
    */
  var hideBrowserFocusOutline: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Focus border margin around the
    * elements.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Style options for the focus
    * border drawn around elements while navigating through them. Note that
    * some browsers in addition draw their own borders for focused elements.
    * These automatic borders can not be styled by Highcharts.
    *
    * In styled mode, the border is given the `.highcharts-focus-border` class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object KeyboardNavigationFocusBorderOptionsObject {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hideBrowserFocusOutline: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    style: CSSObject = null
  ): KeyboardNavigationFocusBorderOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBrowserFocusOutline)) __obj.updateDynamic("hideBrowserFocusOutline")(hideBrowserFocusOutline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardNavigationFocusBorderOptionsObject]
  }
}

