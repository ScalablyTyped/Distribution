package typings.mapboxMapboxSdk.staticMod

import typings.mapboxGl.mod.LngLatBoundsLike
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
    fillOpacity: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined
  ): PathOverlay = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOverlay]
  }
}

