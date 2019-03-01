package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugePointerItem extends js.Object {
  var border: js.UndefOr[LinearGaugePointerItemBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[scala.Double | js.Any] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var shape: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var track: js.UndefOr[LinearGaugePointerItemTrack] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object LinearGaugePointerItem {
  @scala.inline
  def apply(
    border: LinearGaugePointerItemBorder = null,
    color: java.lang.String = null,
    margin: scala.Double | js.Any = null,
    opacity: scala.Int | scala.Double = null,
    shape: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    track: LinearGaugePointerItemTrack = null,
    value: scala.Int | scala.Double = null
  ): LinearGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugePointerItem]
  }
}

