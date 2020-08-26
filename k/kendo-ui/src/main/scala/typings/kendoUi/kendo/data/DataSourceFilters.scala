package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceFilters extends DataSourceFilter {
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.native
  var logic: js.UndefOr[String] = js.native
}

object DataSourceFilters {
  @scala.inline
  def apply(): DataSourceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFilters]
  }
  @scala.inline
  implicit class DataSourceFiltersOps[Self <: DataSourceFilters] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: DataSourceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[DataSourceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setLogic(value: String): Self = this.set("logic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogic: Self = this.set("logic", js.undefined)
  }
  
}

