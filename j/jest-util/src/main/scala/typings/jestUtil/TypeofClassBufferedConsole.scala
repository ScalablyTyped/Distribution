package typings.jestUtil

import org.scalablytyped.runtime.Instantiable1
import typings.jestConsole.mod.BufferedConsole
import typings.jestConsole.typesMod.ConsoleBuffer
import typings.jestConsole.typesMod.LogEntry
import typings.jestConsole.typesMod.LogMessage
import typings.jestConsole.typesMod.LogType
import typings.jestSourceMap.typesMod.SourceMapRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBufferedConsole
  extends Instantiable1[
      /* getSourceMaps */ js.Function0[js.UndefOr[SourceMapRegistry | Null]], 
      BufferedConsole
    ] {
  def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage): js.Array[LogEntry] = js.native
  def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage, level: Double): js.Array[LogEntry] = js.native
  def write(
    buffer: ConsoleBuffer,
    `type`: LogType,
    message: LogMessage,
    level: Double,
    sourceMaps: SourceMapRegistry
  ): js.Array[LogEntry] = js.native
  def write(
    buffer: ConsoleBuffer,
    `type`: LogType,
    message: LogMessage,
    level: Null,
    sourceMaps: SourceMapRegistry
  ): js.Array[LogEntry] = js.native
}

