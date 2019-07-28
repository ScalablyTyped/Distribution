package typings.iltorb.iltorbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrotliEncodeParams extends js.Object {
  var disable_literal_context_modeling: js.UndefOr[Boolean] = js.undefined
  var lgblock: js.UndefOr[Double] = js.undefined
  var lgwin: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var size_hint: js.UndefOr[Double] = js.undefined
}

object BrotliEncodeParams {
  @scala.inline
  def apply(
    disable_literal_context_modeling: js.UndefOr[Boolean] = js.undefined,
    lgblock: Int | Double = null,
    lgwin: Int | Double = null,
    mode: Int | Double = null,
    quality: Int | Double = null,
    size_hint: Int | Double = null
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

