package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceTransportReadOptionsData extends js.Object {
  var filter: js.UndefOr[DataSourceFilters] = js.native
  var group: js.UndefOr[js.Array[DataSourceGroupItem]] = js.native
  var skip: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[js.Array[DataSourceSortItem]] = js.native
  var take: js.UndefOr[Double] = js.native
}

object DataSourceTransportReadOptionsData {
  @scala.inline
  def apply(): DataSourceTransportReadOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportReadOptionsData]
  }
  @scala.inline
  implicit class DataSourceTransportReadOptionsDataOps[Self <: DataSourceTransportReadOptionsData] (val x: Self) extends AnyVal {
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
    def setFilter(value: DataSourceFilters): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGroupVarargs(value: DataSourceGroupItem*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: js.Array[DataSourceGroupItem]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSortVarargs(value: DataSourceSortItem*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: js.Array[DataSourceSortItem]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTake(value: Double): Self = this.set("take", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTake: Self = this.set("take", js.undefined)
  }
  
}

