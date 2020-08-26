package typings.leafletPolylinedecorator.mod.Symbol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerOptions extends js.Object {
  var markerOptions: js.UndefOr[typings.leaflet.mod.MarkerOptions] = js.native
  var rotate: js.UndefOr[Boolean] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
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
    def setMarkerOptions(value: typings.leaflet.mod.MarkerOptions): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    @scala.inline
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
  }
  
}

