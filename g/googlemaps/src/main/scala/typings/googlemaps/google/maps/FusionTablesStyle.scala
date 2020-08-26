package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
@js.native
trait FusionTablesStyle extends js.Object {
  var markerOptions: js.UndefOr[FusionTablesMarkerOptions] = js.native
  var polygonOptions: js.UndefOr[FusionTablesPolygonOptions] = js.native
  var polylineOptions: js.UndefOr[FusionTablesPolylineOptions] = js.native
  var where: js.UndefOr[String] = js.native
}

object FusionTablesStyle {
  @scala.inline
  def apply(): FusionTablesStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesStyle]
  }
  @scala.inline
  implicit class FusionTablesStyleOps[Self <: FusionTablesStyle] (val x: Self) extends AnyVal {
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
    def setMarkerOptions(value: FusionTablesMarkerOptions): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    @scala.inline
    def setPolygonOptions(value: FusionTablesPolygonOptions): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    @scala.inline
    def setPolylineOptions(value: FusionTablesPolylineOptions): Self = this.set("polylineOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolylineOptions: Self = this.set("polylineOptions", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

