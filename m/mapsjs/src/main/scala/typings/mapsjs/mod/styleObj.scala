package typings.mapsjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait styleObj extends js.Object {
  var dashArray: js.UndefOr[String] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var outlineColor: js.UndefOr[String] = js.undefined
  var outlineOpacity: js.UndefOr[Double] = js.undefined
  var outlineThicknessPix: js.UndefOr[Double] = js.undefined
}

object styleObj {
  @scala.inline
  def apply(
    dashArray: String = null,
    fillColor: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    outlineColor: String = null,
    outlineOpacity: js.UndefOr[Double] = js.undefined,
    outlineThicknessPix: js.UndefOr[Double] = js.undefined
  ): styleObj = {
    val __obj = js.Dynamic.literal()
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineOpacity)) __obj.updateDynamic("outlineOpacity")(outlineOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineThicknessPix)) __obj.updateDynamic("outlineThicknessPix")(outlineThicknessPix.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[styleObj]
  }
}

