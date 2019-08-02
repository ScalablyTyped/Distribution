package typings.atMapboxMapboxDashSdk.servicesStaticMod

import typings.mapboxDashGl.mapboxDashGlMod.LngLatBoundsLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOverlay extends js.Object {
  /**
    * An array of coordinates describing the path.
    */
  var coordinates: js.Array[LngLatBoundsLike]
  /**
    * Must be paired with strokeColor.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    * Must be paired with strokeColor.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  /**
    * Must be paired with strokeColor.
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object PathOverlay {
  @scala.inline
  def apply(
    coordinates: js.Array[LngLatBoundsLike],
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null
  ): PathOverlay = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOverlay]
  }
}

