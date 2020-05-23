package typings.iltorb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrotliEncodeParams extends js.Object {
  var disable_literal_context_modeling: js.UndefOr[Boolean] = js.undefined
  var lgblock: js.UndefOr[Double] = js.undefined
  var lgwin: js.UndefOr[Double] = js.undefined
  /** @default 0 */
  var mode: js.UndefOr[BrotliMode] = js.undefined
  /** @default 11 */
  var quality: js.UndefOr[BrotliCompressionQuality] = js.undefined
  var size_hint: js.UndefOr[Double] = js.undefined
}

object BrotliEncodeParams {
  @scala.inline
  def apply(
    disable_literal_context_modeling: js.UndefOr[Boolean] = js.undefined,
    lgblock: js.UndefOr[Double] = js.undefined,
    lgwin: js.UndefOr[Double] = js.undefined,
    mode: BrotliMode = null,
    quality: BrotliCompressionQuality = null,
    size_hint: js.UndefOr[Double] = js.undefined
  ): BrotliEncodeParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_literal_context_modeling)) __obj.updateDynamic("disable_literal_context_modeling")(disable_literal_context_modeling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lgblock)) __obj.updateDynamic("lgblock")(lgblock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lgwin)) __obj.updateDynamic("lgwin")(lgwin.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(size_hint)) __obj.updateDynamic("size_hint")(size_hint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrotliEncodeParams]
  }
}

