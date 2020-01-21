package typings.knuddelsUserappsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAscendingCountBoolean extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
}

object AnonAscendingCountBoolean {
  @scala.inline
  def apply(ascending: js.UndefOr[Boolean] = js.undefined, count: Int | Double = null): AnonAscendingCountBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAscendingCountBoolean]
  }
}

