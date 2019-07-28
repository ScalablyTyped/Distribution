package typings.mapsjs.mapsjsMod

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
    fillOpacity: Int | Double = null,
    outlineColor: String = null,
    outlineOpacity: Int | Double = null,
    outlineThicknessPix: Int | Double = null
  ): styleObj = {
    val __obj = js.Dynamic.literal()
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineOpacity != null) __obj.updateDynamic("outlineOpacity")(outlineOpacity.asInstanceOf[js.Any])
    if (outlineThicknessPix != null) __obj.updateDynamic("outlineThicknessPix")(outlineThicknessPix.asInstanceOf[js.Any])
    __obj.asInstanceOf[styleObj]
  }
}

