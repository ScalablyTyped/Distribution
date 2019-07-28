package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugePointerItemTrack extends js.Object {
  var border: js.UndefOr[LinearGaugePointerItemTrackBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object LinearGaugePointerItemTrack {
  @scala.inline
  def apply(
    border: LinearGaugePointerItemTrackBorder = null,
    color: String = null,
    opacity: Int | Double = null,
    size: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LinearGaugePointerItemTrack = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[LinearGaugePointerItemTrack]
  }
}

