package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceGroup extends DataSourceItemOrGroup {
  var aggregates: js.Array[_]
  var field: String
  var hasSubgroups: Boolean
  var items: js.Array[DataSourceItemOrGroup]
  var value: js.Any
}

object DataSourceGroup {
  @scala.inline
  def apply(
    aggregates: js.Array[_],
    field: String,
    hasSubgroups: Boolean,
    items: js.Array[DataSourceItemOrGroup],
    value: js.Any
  ): DataSourceGroup = {
    val __obj = js.Dynamic.literal(aggregates = aggregates.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasSubgroups = hasSubgroups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroup]
  }
}

