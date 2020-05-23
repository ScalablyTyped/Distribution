package typings.leveldown.mod

import typings.abstractLeveldown.mod.AbstractIteratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownIteratorOptions extends AbstractIteratorOptions[Bytes] {
  var fillCache: js.UndefOr[Boolean] = js.undefined
}

object LevelDownIteratorOptions {
  @scala.inline
  def apply(
    fillCache: js.UndefOr[Boolean] = js.undefined,
    gt: Bytes = null,
    gte: Bytes = null,
    keyAsBuffer: js.UndefOr[Boolean] = js.undefined,
    keys: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    lt: Bytes = null,
    lte: Bytes = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    valueAsBuffer: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined
  ): LevelDownIteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillCache)) __obj.updateDynamic("fillCache")(fillCache.get.asInstanceOf[js.Any])
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (!js.isUndefined(keyAsBuffer)) __obj.updateDynamic("keyAsBuffer")(keyAsBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueAsBuffer)) __obj.updateDynamic("valueAsBuffer")(valueAsBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDownIteratorOptions]
  }
}

