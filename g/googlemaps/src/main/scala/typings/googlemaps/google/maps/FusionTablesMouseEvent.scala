package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
@js.native
trait FusionTablesMouseEvent extends js.Object {
  var infoWindowHtml: js.UndefOr[String] = js.native
  var latLng: js.UndefOr[LatLng] = js.native
  var pixelOffset: js.UndefOr[Size] = js.native
  var row: js.UndefOr[js.Object] = js.native
}

object FusionTablesMouseEvent {
  @scala.inline
  def apply(): FusionTablesMouseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesMouseEvent]
  }
  @scala.inline
  implicit class FusionTablesMouseEventOps[Self <: FusionTablesMouseEvent] (val x: Self) extends AnyVal {
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
    def setInfoWindowHtml(value: String): Self = this.set("infoWindowHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoWindowHtml: Self = this.set("infoWindowHtml", js.undefined)
    @scala.inline
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
    @scala.inline
    def setPixelOffset(value: Size): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
    @scala.inline
    def setRow(value: js.Object): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
  
}

