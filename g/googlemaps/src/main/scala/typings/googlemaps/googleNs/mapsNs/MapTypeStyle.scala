package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeStyle extends js.Object {
  var elementType: js.UndefOr[MapTypeStyleElementType] = js.undefined
  var featureType: js.UndefOr[MapTypeStyleFeatureType] = js.undefined
  var stylers: js.UndefOr[js.Array[MapTypeStyler]] = js.undefined
}

object MapTypeStyle {
  @scala.inline
  def apply(
    elementType: MapTypeStyleElementType = null,
    featureType: MapTypeStyleFeatureType = null,
    stylers: js.Array[MapTypeStyler] = null
  ): MapTypeStyle = {
    val __obj = js.Dynamic.literal()
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    if (featureType != null) __obj.updateDynamic("featureType")(featureType)
    if (stylers != null) __obj.updateDynamic("stylers")(stylers)
    __obj.asInstanceOf[MapTypeStyle]
  }
}

