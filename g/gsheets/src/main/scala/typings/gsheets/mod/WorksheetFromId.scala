package typings.gsheets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetFromId extends Worksheet {
  @JSName("data")
  var data_WorksheetFromId: js.Array[Row] = js.native
}

object WorksheetFromId {
  @scala.inline
  def apply(data: js.Array[Row], title: String, updated: String): WorksheetFromId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetFromId]
  }
  @scala.inline
  implicit class WorksheetFromIdOps[Self <: WorksheetFromId] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Row*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Row]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

