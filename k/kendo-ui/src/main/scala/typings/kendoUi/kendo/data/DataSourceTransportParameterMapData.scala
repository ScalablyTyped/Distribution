package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceTransportParameterMapData extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceParameterMapDataAggregate]] = js.native
  var filter: js.UndefOr[DataSourceParameterMapDataFilter] = js.native
  var group: js.UndefOr[js.Array[DataSourceParameterMapDataGroup]] = js.native
  var models: js.UndefOr[js.Array[Model]] = js.native
  var page: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var skip: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[js.Array[DataSourceParameterMapDataSort]] = js.native
  var take: js.UndefOr[Double] = js.native
}

object DataSourceTransportParameterMapData {
  @scala.inline
  def apply(): DataSourceTransportParameterMapData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportParameterMapData]
  }
  @scala.inline
  implicit class DataSourceTransportParameterMapDataOps[Self <: DataSourceTransportParameterMapData] (val x: Self) extends AnyVal {
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
    def setAggregateVarargs(value: DataSourceParameterMapDataAggregate*): Self = this.set("aggregate", js.Array(value :_*))
    @scala.inline
    def setAggregate(value: js.Array[DataSourceParameterMapDataAggregate]): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    @scala.inline
    def setFilter(value: DataSourceParameterMapDataFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGroupVarargs(value: DataSourceParameterMapDataGroup*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: js.Array[DataSourceParameterMapDataGroup]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setModelsVarargs(value: Model*): Self = this.set("models", js.Array(value :_*))
    @scala.inline
    def setModels(value: js.Array[Model]): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSortVarargs(value: DataSourceParameterMapDataSort*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: js.Array[DataSourceParameterMapDataSort]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTake(value: Double): Self = this.set("take", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTake: Self = this.set("take", js.undefined)
  }
  
}

