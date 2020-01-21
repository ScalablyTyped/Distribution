package typings.leveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownClearOptions extends js.Object {
  var gt: js.UndefOr[Bytes] = js.undefined
  var gte: js.UndefOr[Bytes] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var lt: js.UndefOr[Bytes] = js.undefined
  var lte: js.UndefOr[Bytes] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object LevelDownClearOptions {
  @scala.inline
  def apply(
    gt: Bytes = null,
    gte: Bytes = null,
    limit: Int | Double = null,
    lt: Bytes = null,
    lte: Bytes = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): LevelDownClearOptions = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDownClearOptions]
  }
}

