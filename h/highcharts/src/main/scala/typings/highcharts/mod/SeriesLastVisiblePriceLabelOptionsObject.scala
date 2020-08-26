package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesLastVisiblePriceLabelOptionsObject extends js.Object {
  /**
    * (Highstock) Enable or disable the label.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SeriesLastVisiblePriceLabelOptionsObject {
  @scala.inline
  def apply(): SeriesLastVisiblePriceLabelOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLastVisiblePriceLabelOptionsObject]
  }
  @scala.inline
  implicit class SeriesLastVisiblePriceLabelOptionsObjectOps[Self <: SeriesLastVisiblePriceLabelOptionsObject] (val x: Self) extends AnyVal {
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
  }
  
}

