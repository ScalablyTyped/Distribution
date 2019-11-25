package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoveWhereFilters extends js.Object {
  var removeWhereFilters: js.UndefOr[Boolean] = js.undefined
}

object Anon_RemoveWhereFilters {
  @scala.inline
  def apply(removeWhereFilters: js.UndefOr[Boolean] = js.undefined): Anon_RemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeWhereFilters)) __obj.updateDynamic("removeWhereFilters")(removeWhereFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RemoveWhereFilters]
  }
}

