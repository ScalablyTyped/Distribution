package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object QueryResult {
  @scala.inline
  def apply(data: js.Array[_] = null, total: Int | Double = null): QueryResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

