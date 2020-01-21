package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSorted extends js.Object {
  var sorted: js.UndefOr[Boolean] = js.undefined
}

object AnonSorted {
  @scala.inline
  def apply(sorted: js.UndefOr[Boolean] = js.undefined): AnonSorted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSorted]
  }
}

