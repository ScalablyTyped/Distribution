package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceGroup extends DataSourceItemOrGroup {
  var aggregates: js.Array[_]
  var field: java.lang.String
  var hasSubgroups: scala.Boolean
  var items: js.Array[DataSourceItemOrGroup]
  var value: js.Any
}

object DataSourceGroup {
  @scala.inline
  def apply(
    aggregates: js.Array[_],
    field: java.lang.String,
    hasSubgroups: scala.Boolean,
    items: js.Array[DataSourceItemOrGroup],
    value: js.Any
  ): DataSourceGroup = {
    val __obj = js.Dynamic.literal(aggregates = aggregates, field = field, hasSubgroups = hasSubgroups, items = items, value = value)
  
    __obj.asInstanceOf[DataSourceGroup]
  }
}

