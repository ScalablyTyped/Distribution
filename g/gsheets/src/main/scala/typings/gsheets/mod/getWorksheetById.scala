package typings.gsheets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsheets", "getWorksheetById")
@js.native
object getWorksheetById extends js.Object {
  
  def apply(spreadsheetId: String, worksheetId: String): js.Promise[WorksheetFromId] = js.native
}
