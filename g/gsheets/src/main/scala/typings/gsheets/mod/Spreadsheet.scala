package typings.gsheets.mod

import typings.gsheets.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spreadsheet extends js.Object {
  var title: String = js.native
  var updated: String = js.native
  var worksheets: js.Array[Id] = js.native
}

object Spreadsheet {
  @scala.inline
  def apply(title: String, updated: String, worksheets: js.Array[Id]): Spreadsheet = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], worksheets = worksheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spreadsheet]
  }
  @scala.inline
  implicit class SpreadsheetOps[Self <: Spreadsheet] (val x: Self) extends AnyVal {
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
    def setWorksheetsVarargs(value: Id*): Self = this.set("worksheets", js.Array(value :_*))
    @scala.inline
    def setWorksheets(value: js.Array[Id]): Self = this.set("worksheets", value.asInstanceOf[js.Any])
  }
  
}

