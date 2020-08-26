package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardNavigationSeriesNavigationOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the keyboard navigation mode
    * for the chart. Can be "normal" or "serialize". In normal mode, left/right
    * arrow keys move between points in a series, while up/down arrow keys move
    * between series. Up/down navigation acts intelligently to figure out which
    * series makes sense to move to from any given point.
    *
    * In "serialize" mode, points are instead navigated as a single list.
    * Left/right behaves as in "normal" mode. Up/down arrow keys will behave
    * like left/right. This can be useful for unifying navigation behavior
    * with/without screen readers enabled.
    */
  var mode: js.UndefOr[OptionsModeValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer allow keyboard navigation for it.
    *
    * Set to `false` to disable.
    */
  var pointNavigationEnabledThreshold: js.UndefOr[Boolean | Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
    * through points with the keyboard.
    */
  var skipNullPoints: js.UndefOr[Boolean] = js.native
}

object KeyboardNavigationSeriesNavigationOptionsObject {
  @scala.inline
  def apply(): KeyboardNavigationSeriesNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigationSeriesNavigationOptionsObject]
  }
  @scala.inline
  implicit class KeyboardNavigationSeriesNavigationOptionsObjectOps[Self <: KeyboardNavigationSeriesNavigationOptionsObject] (val x: Self) extends AnyVal {
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
    def setMode(value: OptionsModeValue): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPointNavigationEnabledThreshold(value: Boolean | Double): Self = this.set("pointNavigationEnabledThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointNavigationEnabledThreshold: Self = this.set("pointNavigationEnabledThreshold", js.undefined)
    @scala.inline
    def setSkipNullPoints(value: Boolean): Self = this.set("skipNullPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipNullPoints: Self = this.set("skipNullPoints", js.undefined)
  }
  
}

