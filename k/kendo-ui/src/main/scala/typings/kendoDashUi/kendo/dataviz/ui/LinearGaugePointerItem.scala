package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugePointerItem extends js.Object {
  var border: js.UndefOr[LinearGaugePointerItemBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double | js.Any] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var track: js.UndefOr[LinearGaugePointerItemTrack] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object LinearGaugePointerItem {
  @scala.inline
  def apply(
    border: LinearGaugePointerItemBorder = null,
    color: String = null,
    margin: Double | js.Any = null,
    opacity: Int | Double = null,
    shape: String = null,
    size: Int | Double = null,
    track: LinearGaugePointerItemTrack = null,
    value: Int | Double = null
  ): LinearGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugePointerItem]
  }
}

