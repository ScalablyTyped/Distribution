package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveWhereFilters extends js.Object {
  var removeWhereFilters: js.UndefOr[Boolean] = js.undefined
}

object AnonRemoveWhereFilters {
  @scala.inline
  def apply(removeWhereFilters: js.UndefOr[Boolean] = js.undefined): AnonRemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeWhereFilters)) __obj.updateDynamic("removeWhereFilters")(removeWhereFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoveWhereFilters]
  }
}

