package typings.intercomClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove extends js.Object {
  var remove: js.UndefOr[Boolean] = js.undefined
}

object AnonRemove {
  @scala.inline
  def apply(remove: js.UndefOr[Boolean] = js.undefined): AnonRemove = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemove]
  }
}

