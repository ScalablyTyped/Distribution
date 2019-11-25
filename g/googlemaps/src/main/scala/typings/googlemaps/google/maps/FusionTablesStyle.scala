package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTablesStyle extends js.Object {
  var markerOptions: js.UndefOr[FusionTablesMarkerOptions] = js.undefined
  var polygonOptions: js.UndefOr[FusionTablesPolygonOptions] = js.undefined
  var polylineOptions: js.UndefOr[FusionTablesPolylineOptions] = js.undefined
  var where: js.UndefOr[String] = js.undefined
}

object FusionTablesStyle {
  @scala.inline
  def apply(
    markerOptions: FusionTablesMarkerOptions = null,
    polygonOptions: FusionTablesPolygonOptions = null,
    polylineOptions: FusionTablesPolylineOptions = null,
    where: String = null
  ): FusionTablesStyle = {
    val __obj = js.Dynamic.literal()
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions.asInstanceOf[js.Any])
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesStyle]
  }
}

