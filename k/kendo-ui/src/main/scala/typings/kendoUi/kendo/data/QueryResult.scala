package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object QueryResult {
  @scala.inline
  def apply(data: js.Array[_] = null, total: js.UndefOr[Double] = js.undefined): QueryResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

