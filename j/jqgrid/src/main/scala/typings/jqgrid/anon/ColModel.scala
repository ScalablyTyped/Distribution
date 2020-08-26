package typings.jqgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColModel extends js.Object {
  var colModel: js.Any = js.native
  var rowId: js.Any = js.native
}

object ColModel {
  @scala.inline
  def apply(colModel: js.Any, rowId: js.Any): ColModel = {
    val __obj = js.Dynamic.literal(colModel = colModel.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColModel]
  }
  @scala.inline
  implicit class ColModelOps[Self <: ColModel] (val x: Self) extends AnyVal {
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
    def setColModel(value: js.Any): Self = this.set("colModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowId(value: js.Any): Self = this.set("rowId", value.asInstanceOf[js.Any])
  }
  
}

