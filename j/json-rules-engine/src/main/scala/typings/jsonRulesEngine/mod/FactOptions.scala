package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object FactOptions {
  @scala.inline
  def apply(cache: js.UndefOr[Boolean] = js.undefined, priority: js.UndefOr[Double] = js.undefined): FactOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactOptions]
  }
}

