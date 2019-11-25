package typings.leafletDotGridlayerDotGooglemutant.leafletMod.gridLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google's map style.
  *
  * https://developers.google.com/maps/documentation/javascript/style-reference
  */
trait GoogleMutantStyle extends js.Object {
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#style-elements
    */
  var elementType: js.UndefOr[String] = js.undefined
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#style-features
    */
  var featureType: js.UndefOr[String] = js.undefined
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#stylers
    */
  var stylers: js.UndefOr[js.Array[GoogleMutantStyler]] = js.undefined
}

object GoogleMutantStyle {
  @scala.inline
  def apply(
    elementType: String = null,
    featureType: String = null,
    stylers: js.Array[GoogleMutantStyler] = null
  ): GoogleMutantStyle = {
    val __obj = js.Dynamic.literal()
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (featureType != null) __obj.updateDynamic("featureType")(featureType.asInstanceOf[js.Any])
    if (stylers != null) __obj.updateDynamic("stylers")(stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleMutantStyle]
  }
}

