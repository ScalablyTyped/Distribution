package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTablesPolylineOptions extends js.Object {
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
}

object FusionTablesPolylineOptions {
  @scala.inline
  def apply(strokeColor: String = null, strokeOpacity: Int | Double = null, strokeWeight: Int | Double = null): FusionTablesPolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesPolylineOptions]
  }
}

