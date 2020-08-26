package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceParameterMapDataSort extends js.Object {
  var dir: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
}

object DataSourceParameterMapDataSort {
  @scala.inline
  def apply(): DataSourceParameterMapDataSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceParameterMapDataSort]
  }
  @scala.inline
  implicit class DataSourceParameterMapDataSortOps[Self <: DataSourceParameterMapDataSort] (val x: Self) extends AnyVal {
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
  
}

