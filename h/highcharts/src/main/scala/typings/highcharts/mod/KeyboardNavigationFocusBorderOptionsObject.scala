package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardNavigationFocusBorderOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable/disable focus border for
    * chart.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Hide the browser's default focus
    * indicator.
    */
  var hideBrowserFocusOutline: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Focus border margin around the
    * elements.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Style options for the focus
    * border drawn around elements while navigating through them. Note that
    * some browsers in addition draw their own borders for focused elements.
    * These automatic borders can not be styled by Highcharts.
    *
    * In styled mode, the border is given the `.highcharts-focus-border` class.
    */
  var style: js.UndefOr[CSSObject] = js.native
}

object KeyboardNavigationFocusBorderOptionsObject {
  @scala.inline
  def apply(): KeyboardNavigationFocusBorderOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigationFocusBorderOptionsObject]
  }
  @scala.inline
  implicit class KeyboardNavigationFocusBorderOptionsObjectOps[Self <: KeyboardNavigationFocusBorderOptionsObject] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHideBrowserFocusOutline(value: Boolean): Self = this.set("hideBrowserFocusOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideBrowserFocusOutline: Self = this.set("hideBrowserFocusOutline", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

