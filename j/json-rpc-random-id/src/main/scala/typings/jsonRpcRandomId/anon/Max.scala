package typings.jsonRpcRandomId.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object Max {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined, start: js.UndefOr[Double] = js.undefined): Max = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

