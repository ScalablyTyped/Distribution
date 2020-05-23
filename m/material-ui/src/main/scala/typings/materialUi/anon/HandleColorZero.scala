package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleColorZero extends js.Object {
  var handleColorZero: js.UndefOr[String] = js.undefined
  var handleFillColor: js.UndefOr[String] = js.undefined
  var handleSize: js.UndefOr[Double] = js.undefined
  var handleSizeActive: js.UndefOr[Double] = js.undefined
  var handleSizeDisabled: js.UndefOr[Double] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
  var selectionColor: js.UndefOr[String] = js.undefined
  var trackColor: js.UndefOr[String] = js.undefined
  var trackColorSelected: js.UndefOr[String] = js.undefined
  var trackSize: js.UndefOr[Double] = js.undefined
}

object HandleColorZero {
  @scala.inline
  def apply(
    handleColorZero: String = null,
    handleFillColor: String = null,
    handleSize: js.UndefOr[Double] = js.undefined,
    handleSizeActive: js.UndefOr[Double] = js.undefined,
    handleSizeDisabled: js.UndefOr[Double] = js.undefined,
    rippleColor: String = null,
    selectionColor: String = null,
    trackColor: String = null,
    trackColorSelected: String = null,
    trackSize: js.UndefOr[Double] = js.undefined
  ): HandleColorZero = {
    val __obj = js.Dynamic.literal()
    if (handleColorZero != null) __obj.updateDynamic("handleColorZero")(handleColorZero.asInstanceOf[js.Any])
    if (handleFillColor != null) __obj.updateDynamic("handleFillColor")(handleFillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSize)) __obj.updateDynamic("handleSize")(handleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSizeActive)) __obj.updateDynamic("handleSizeActive")(handleSizeActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSizeDisabled)) __obj.updateDynamic("handleSizeDisabled")(handleSizeDisabled.get.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (trackColor != null) __obj.updateDynamic("trackColor")(trackColor.asInstanceOf[js.Any])
    if (trackColorSelected != null) __obj.updateDynamic("trackColorSelected")(trackColorSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(trackSize)) __obj.updateDynamic("trackSize")(trackSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleColorZero]
  }
}

