package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
    * the fade out effect.
    */
  var hideDuration: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading label
    * `span`.
    */
  var labelStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
    * the fade in effect.
    */
  var showDuration: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading
    * screen that covers the plot area.
    *
    * In styled mode, the loading label is styled with the
    * `.highcharts-loading` class.
    */
  var style: js.UndefOr[CSSObject] = js.native
}

object LoadingOptions {
  @scala.inline
  def apply(): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingOptions]
  }
  @scala.inline
  implicit class LoadingOptionsOps[Self <: LoadingOptions] (val x: Self) extends AnyVal {
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
    def setHideDuration(value: Double): Self = this.set("hideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDuration: Self = this.set("hideDuration", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSObject): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setShowDuration(value: Double): Self = this.set("showDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDuration: Self = this.set("showDuration", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

