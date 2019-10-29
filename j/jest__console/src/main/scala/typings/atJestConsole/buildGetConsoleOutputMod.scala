package typings.atJestConsole

import typings.atJestConsole.buildTypesMod.LogEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console/build/getConsoleOutput", JSImport.Namespace)
@js.native
object buildGetConsoleOutputMod extends js.Object {
  def default(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = js.native
}

