package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AscendingCount extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
}

object AscendingCount {
  @scala.inline
  def apply(ascending: js.UndefOr[Boolean] = js.undefined, count: js.UndefOr[Double] = js.undefined): AscendingCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AscendingCount]
  }
}

