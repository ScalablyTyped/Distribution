package typings.kendoDashUi.kendo.data

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
    val __obj = js.Dynamic.literal(aggregates = aggregates, field = field, hasSubgroups = hasSubgroups, items = items, value = value)
  
    __obj.asInstanceOf[DataSourceGroup]
  }
}

