package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait FusionTablesMouseEvent extends js.Object {
  var infoWindowHtml: js.UndefOr[String] = js.undefined
  var latLng: js.UndefOr[LatLng] = js.undefined
  var pixelOffset: js.UndefOr[Size] = js.undefined
  var row: js.UndefOr[js.Object] = js.undefined
}

object FusionTablesMouseEvent {
  @scala.inline
  def apply(
    infoWindowHtml: String = null,
    latLng: LatLng = null,
    pixelOffset: Size = null,
    row: js.Object = null
  ): FusionTablesMouseEvent = {
    val __obj = js.Dynamic.literal()
    if (infoWindowHtml != null) __obj.updateDynamic("infoWindowHtml")(infoWindowHtml.asInstanceOf[js.Any])
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesMouseEvent]
  }
}

