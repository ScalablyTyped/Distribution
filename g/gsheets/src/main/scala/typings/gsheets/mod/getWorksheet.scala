package typings.gsheets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsheets", "getWorksheet")
@js.native
object getWorksheet extends js.Object {
  
  def apply(spreadsheetId: String, worksheetTitle: String): js.Promise[Worksheet] = js.native
}
