package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveWhereFilters extends js.Object {
  var removeWhereFilters: js.UndefOr[Boolean] = js.undefined
}

object RemoveWhereFilters {
  @scala.inline
  def apply(removeWhereFilters: js.UndefOr[Boolean] = js.undefined): RemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeWhereFilters)) __obj.updateDynamic("removeWhereFilters")(removeWhereFilters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveWhereFilters]
  }
}

