package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var maxZoom: js.UndefOr[Double] = js.native
  var refreshOnResize: js.UndefOr[Boolean] = js.native
  var snapView: js.UndefOr[Boolean] = js.native
  var zoomOnMouseWheel: js.UndefOr[Boolean] = js.native
  var zoomValue: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setRefreshOnResize(value: Boolean): Self = this.set("refreshOnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshOnResize: Self = this.set("refreshOnResize", js.undefined)
    @scala.inline
    def setSnapView(value: Boolean): Self = this.set("snapView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapView: Self = this.set("snapView", js.undefined)
    @scala.inline
    def setZoomOnMouseWheel(value: Boolean): Self = this.set("zoomOnMouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOnMouseWheel: Self = this.set("zoomOnMouseWheel", js.undefined)
    @scala.inline
    def setZoomValue(value: Double): Self = this.set("zoomValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomValue: Self = this.set("zoomValue", js.undefined)
  }
  
}

