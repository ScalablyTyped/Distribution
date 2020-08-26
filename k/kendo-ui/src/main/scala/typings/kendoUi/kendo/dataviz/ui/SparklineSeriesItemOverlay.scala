package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineSeriesItemOverlay extends js.Object {
  var gradient: js.UndefOr[String] = js.native
}

object SparklineSeriesItemOverlay {
  @scala.inline
  def apply(): SparklineSeriesItemOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemOverlay]
  }
  @scala.inline
  implicit class SparklineSeriesItemOverlayOps[Self <: SparklineSeriesItemOverlay] (val x: Self) extends AnyVal {
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
    def setGradient(value: String): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
  }
  
}

