package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerStyleStroke extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MapLayerStyleStroke {
  @scala.inline
  def apply(
    color: String = null,
    dashType: Int | Double = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): MapLayerStyleStroke = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerStyleStroke]
  }
}

