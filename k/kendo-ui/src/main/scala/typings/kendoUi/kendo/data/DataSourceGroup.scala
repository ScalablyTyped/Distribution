package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceGroup extends DataSourceItemOrGroup {
  var aggregates: js.Array[_] = js.native
  var field: String = js.native
  var hasSubgroups: Boolean = js.native
  var items: js.Array[DataSourceItemOrGroup] = js.native
  var value: js.Any = js.native
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
  @scala.inline
  implicit class DataSourceGroupOps[Self <: DataSourceGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregatesVarargs(value: js.Any*): Self = this.set("aggregates", js.Array(value :_*))
    @scala.inline
    def setAggregates(value: js.Array[_]): Self = this.set("aggregates", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasSubgroups(value: Boolean): Self = this.set("hasSubgroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: DataSourceItemOrGroup*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[DataSourceItemOrGroup]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

