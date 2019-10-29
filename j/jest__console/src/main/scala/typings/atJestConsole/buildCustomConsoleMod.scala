package typings.atJestConsole

import typings.atJestConsole.buildCustomConsoleMod.CustomConsole
import typings.atJestConsole.buildCustomConsoleMod.Formatter
import typings.atJestConsole.buildTypesMod.LogMessage
import typings.atJestConsole.buildTypesMod.LogType
import typings.node.NodeJS.WritableStream
import typings.std.Console
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console/build/CustomConsole", JSImport.Namespace)
@js.native
object buildCustomConsoleMod extends js.Object {
  @js.native
  trait CustomConsole extends Console {
    var _counters: js.Any = js.native
    var _formatBuffer: js.Any = js.native
    var _groupDepth: js.Any = js.native
    var _log: js.Any = js.native
    var _logError: js.Any = js.native
    var _stderr: js.Any = js.native
    var _stdout: js.Any = js.native
    var _timers: js.Any = js.native
    def assert(value: js.Any): Unit = js.native
    def assert(value: js.Any, message: String): Unit = js.native
    def assert(value: js.Any, message: Error): Unit = js.native
    def countReset(): Unit = js.native
    def countReset(label: String): Unit = js.native
    def dirxml(firstArg: js.Any, args: js.Any*): Unit = js.native
    def getBuffer(): js.UndefOr[scala.Nothing] = js.native
  }
  
  @js.native
  class default protected () extends CustomConsole {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream, formatBuffer: Formatter) = this()
  }
  
  type Formatter = js.Function2[/* type */ LogType, /* message */ LogMessage, String]
}

