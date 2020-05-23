package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveIndices extends js.Object {
  var removeIndices: js.UndefOr[Boolean] = js.undefined
}

object RemoveIndices {
  @scala.inline
  def apply(removeIndices: js.UndefOr[Boolean] = js.undefined): RemoveIndices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeIndices)) __obj.updateDynamic("removeIndices")(removeIndices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveIndices]
  }
}

