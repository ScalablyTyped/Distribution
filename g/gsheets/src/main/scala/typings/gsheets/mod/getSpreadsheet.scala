package typings.gsheets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsheets", "getSpreadsheet")
@js.native
object getSpreadsheet extends js.Object {
  def apply(spreadsheetId: String): js.Promise[Spreadsheet] = js.native
}

