package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartZoomable extends js.Object {
  var mousewheel: js.UndefOr[Boolean | ChartZoomableMousewheel] = js.native
  var selection: js.UndefOr[Boolean | ChartZoomableSelection] = js.native
}

object ChartZoomable {
  @scala.inline
  def apply(): ChartZoomable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomable]
  }
  @scala.inline
  implicit class ChartZoomableOps[Self <: ChartZoomable] (val x: Self) extends AnyVal {
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
    def setMousewheel(value: Boolean | ChartZoomableMousewheel): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMousewheel: Self = this.set("mousewheel", js.undefined)
    @scala.inline
    def setSelection(value: Boolean | ChartZoomableSelection): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
  }
  
}

