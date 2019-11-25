package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleColorZero extends js.Object {
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

object Anon_HandleColorZero {
  @scala.inline
  def apply(
    handleColorZero: String = null,
    handleFillColor: String = null,
    handleSize: Int | Double = null,
    handleSizeActive: Int | Double = null,
    handleSizeDisabled: Int | Double = null,
    rippleColor: String = null,
    selectionColor: String = null,
    trackColor: String = null,
    trackColorSelected: String = null,
    trackSize: Int | Double = null
  ): Anon_HandleColorZero = {
    val __obj = js.Dynamic.literal()
    if (handleColorZero != null) __obj.updateDynamic("handleColorZero")(handleColorZero.asInstanceOf[js.Any])
    if (handleFillColor != null) __obj.updateDynamic("handleFillColor")(handleFillColor.asInstanceOf[js.Any])
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize.asInstanceOf[js.Any])
    if (handleSizeActive != null) __obj.updateDynamic("handleSizeActive")(handleSizeActive.asInstanceOf[js.Any])
    if (handleSizeDisabled != null) __obj.updateDynamic("handleSizeDisabled")(handleSizeDisabled.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (trackColor != null) __obj.updateDynamic("trackColor")(trackColor.asInstanceOf[js.Any])
    if (trackColorSelected != null) __obj.updateDynamic("trackColorSelected")(trackColorSelected.asInstanceOf[js.Any])
    if (trackSize != null) __obj.updateDynamic("trackSize")(trackSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HandleColorZero]
  }
}

