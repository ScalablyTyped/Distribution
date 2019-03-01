package typings
package iltorbLib.iltorbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrotliEncodeParams extends js.Object {
  var disable_literal_context_modeling: js.UndefOr[scala.Boolean] = js.undefined
  var lgblock: js.UndefOr[scala.Double] = js.undefined
  var lgwin: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var size_hint: js.UndefOr[scala.Double] = js.undefined
}

object BrotliEncodeParams {
  @scala.inline
  def apply(
    disable_literal_context_modeling: js.UndefOr[scala.Boolean] = js.undefined,
    lgblock: scala.Int | scala.Double = null,
    lgwin: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    size_hint: scala.Int | scala.Double = null
  ): BrotliEncodeParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_literal_context_modeling)) __obj.updateDynamic("disable_literal_context_modeling")(disable_literal_context_modeling)
    if (lgblock != null) __obj.updateDynamic("lgblock")(lgblock.asInstanceOf[js.Any])
    if (lgwin != null) __obj.updateDynamic("lgwin")(lgwin.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (size_hint != null) __obj.updateDynamic("size_hint")(size_hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrotliEncodeParams]
  }
}

