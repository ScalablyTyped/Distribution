package typings.gsheets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetFromId extends Worksheet {
  @JSName("data")
  var data_WorksheetFromId: js.Array[Row]
}

object WorksheetFromId {
  @scala.inline
  def apply(data: js.Array[Row], title: String, updated: String): WorksheetFromId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetFromId]
  }
}

