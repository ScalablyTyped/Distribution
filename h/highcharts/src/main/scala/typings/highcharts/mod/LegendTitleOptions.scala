package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendTitleOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Generic CSS styles for the
    * legend title.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text or HTML string for the
    * title.
    */
  var text: js.UndefOr[String] = js.native
}

object LegendTitleOptions {
  @scala.inline
  def apply(): LegendTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendTitleOptions]
  }
  @scala.inline
  implicit class LegendTitleOptionsOps[Self <: LegendTitleOptions] (val x: Self) extends AnyVal {
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
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

