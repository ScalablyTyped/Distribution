package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleColorZero extends js.Object {
  var handleColorZero: js.UndefOr[java.lang.String] = js.undefined
  var handleFillColor: js.UndefOr[java.lang.String] = js.undefined
  var handleSize: js.UndefOr[scala.Double] = js.undefined
  var handleSizeActive: js.UndefOr[scala.Double] = js.undefined
  var handleSizeDisabled: js.UndefOr[scala.Double] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  var trackColor: js.UndefOr[java.lang.String] = js.undefined
  var trackColorSelected: js.UndefOr[java.lang.String] = js.undefined
  var trackSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HandleColorZero {
  @scala.inline
  def apply(
    handleColorZero: java.lang.String = null,
    handleFillColor: java.lang.String = null,
    handleSize: scala.Int | scala.Double = null,
    handleSizeActive: scala.Int | scala.Double = null,
    handleSizeDisabled: scala.Int | scala.Double = null,
    rippleColor: java.lang.String = null,
    selectionColor: java.lang.String = null,
    trackColor: java.lang.String = null,
    trackColorSelected: java.lang.String = null,
    trackSize: scala.Int | scala.Double = null
  ): Anon_HandleColorZero = {
    val __obj = js.Dynamic.literal()
    if (handleColorZero != null) __obj.updateDynamic("handleColorZero")(handleColorZero)
    if (handleFillColor != null) __obj.updateDynamic("handleFillColor")(handleFillColor)
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize.asInstanceOf[js.Any])
    if (handleSizeActive != null) __obj.updateDynamic("handleSizeActive")(handleSizeActive.asInstanceOf[js.Any])
    if (handleSizeDisabled != null) __obj.updateDynamic("handleSizeDisabled")(handleSizeDisabled.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (trackColor != null) __obj.updateDynamic("trackColor")(trackColor)
    if (trackColorSelected != null) __obj.updateDynamic("trackColorSelected")(trackColorSelected)
    if (trackSize != null) __obj.updateDynamic("trackSize")(trackSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HandleColorZero]
  }
}

