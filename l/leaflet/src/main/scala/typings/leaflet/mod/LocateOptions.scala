package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocateOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var maximumAge: js.UndefOr[Double] = js.native
  var setView: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var watch: js.UndefOr[Boolean] = js.native
}

object LocateOptions {
  @scala.inline
  def apply(): LocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateOptions]
  }
  @scala.inline
  implicit class LocateOptionsOps[Self <: LocateOptions] (val x: Self) extends AnyVal {
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
    def setEnableHighAccuracy(value: Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighAccuracy: Self = this.set("enableHighAccuracy", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    @scala.inline
    def setSetView(value: Boolean): Self = this.set("setView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetView: Self = this.set("setView", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

