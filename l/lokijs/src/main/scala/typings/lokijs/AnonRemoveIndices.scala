package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveIndices extends js.Object {
  var removeIndices: js.UndefOr[Boolean] = js.undefined
}

object AnonRemoveIndices {
  @scala.inline
  def apply(removeIndices: js.UndefOr[Boolean] = js.undefined): AnonRemoveIndices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeIndices)) __obj.updateDynamic("removeIndices")(removeIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoveIndices]
  }
}

