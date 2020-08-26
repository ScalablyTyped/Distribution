package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchicalDataSourceSchema extends DataSourceSchemaWithOptionsModel {
  @JSName("model")
  var model_HierarchicalDataSourceSchema: js.UndefOr[HierarchicalDataSourceSchemaModel] = js.native
}

object HierarchicalDataSourceSchema {
  @scala.inline
  def apply(): HierarchicalDataSourceSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSchema]
  }
  @scala.inline
  implicit class HierarchicalDataSourceSchemaOps[Self <: HierarchicalDataSourceSchema] (val x: Self) extends AnyVal {
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
    def setModel(value: HierarchicalDataSourceSchemaModel): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

