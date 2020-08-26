package typings.gsheets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worksheet extends js.Object {
  var data: js.Array[Row] | Null = js.native
  var title: String = js.native
  var updated: String = js.native
}

object Worksheet {
  @scala.inline
  def apply(title: String, updated: String): Worksheet = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Worksheet]
  }
  @scala.inline
  implicit class WorksheetOps[Self <: Worksheet] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: Row*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Row]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
  
}

