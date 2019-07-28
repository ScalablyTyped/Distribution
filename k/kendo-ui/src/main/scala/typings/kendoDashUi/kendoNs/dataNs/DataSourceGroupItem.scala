package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceGroupItem extends js.Object {
  var aggregates: js.UndefOr[js.Array[DataSourceGroupItemAggregate]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object DataSourceGroupItem {
  @scala.inline
  def apply(
    aggregates: js.Array[DataSourceGroupItemAggregate] = null,
    dir: String = null,
    field: String = null
  ): DataSourceGroupItem = {
    val __obj = js.Dynamic.literal()
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[DataSourceGroupItem]
  }
}

