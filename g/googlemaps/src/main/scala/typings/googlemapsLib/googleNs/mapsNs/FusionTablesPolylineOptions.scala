package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTablesPolylineOptions extends js.Object {
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
}

object FusionTablesPolylineOptions {
  @scala.inline
  def apply(
    strokeColor: java.lang.String = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeWeight: scala.Int | scala.Double = null
  ): FusionTablesPolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesPolylineOptions]
  }
}

