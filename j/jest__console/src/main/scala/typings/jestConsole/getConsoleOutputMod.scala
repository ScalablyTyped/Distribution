package typings.jestConsole

import typings.jestConsole.typesMod.LogEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/console/build/getConsoleOutput", JSImport.Namespace)
@js.native
object getConsoleOutputMod extends js.Object {
  
  def default(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = js.native
}
