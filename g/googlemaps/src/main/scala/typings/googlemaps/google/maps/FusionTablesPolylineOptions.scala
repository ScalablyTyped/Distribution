package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait FusionTablesPolylineOptions extends js.Object {
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
}

object FusionTablesPolylineOptions {
  @scala.inline
  def apply(
    strokeColor: String = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeWeight: js.UndefOr[Double] = js.undefined
  ): FusionTablesPolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWeight)) __obj.updateDynamic("strokeWeight")(strokeWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesPolylineOptions]
  }
}

