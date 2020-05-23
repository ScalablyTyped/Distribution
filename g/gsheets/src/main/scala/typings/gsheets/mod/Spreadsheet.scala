package typings.gsheets.mod

import typings.gsheets.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spreadsheet extends js.Object {
  var title: String
  var updated: String
  var worksheets: js.Array[Id]
}

object Spreadsheet {
  @scala.inline
  def apply(title: String, updated: String, worksheets: js.Array[Id]): Spreadsheet = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], worksheets = worksheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spreadsheet]
  }
}

