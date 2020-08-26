package typings.leafletLoading.mod

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_.Zoom
import typings.leafletLoading.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingOptions extends ControlOptions {
  var delayIndicator: js.UndefOr[Double] = js.native
  var separate: js.UndefOr[Boolean] = js.native
  var spin: js.UndefOr[Length] = js.native
  var spinjs: js.UndefOr[Boolean] = js.native
  var zoomControl: js.UndefOr[Zoom] = js.native
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
    def setDelayIndicator(value: Double): Self = this.set("delayIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayIndicator: Self = this.set("delayIndicator", js.undefined)
    @scala.inline
    def setSeparate(value: Boolean): Self = this.set("separate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparate: Self = this.set("separate", js.undefined)
    @scala.inline
    def setSpin(value: Length): Self = this.set("spin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    @scala.inline
    def setSpinjs(value: Boolean): Self = this.set("spinjs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinjs: Self = this.set("spinjs", js.undefined)
    @scala.inline
    def setZoomControl(value: Zoom): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControl: Self = this.set("zoomControl", js.undefined)
  }
  
}

