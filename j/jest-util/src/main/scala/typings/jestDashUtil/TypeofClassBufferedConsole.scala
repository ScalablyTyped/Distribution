package typings.jestDashUtil

import org.scalablytyped.runtime.Instantiable1
import typings.atJestConsole.atJestConsoleMod.BufferedConsole
import typings.atJestConsole.buildTypesMod.ConsoleBuffer
import typings.atJestConsole.buildTypesMod.LogEntry
import typings.atJestConsole.buildTypesMod.LogMessage
import typings.atJestConsole.buildTypesMod.LogType
import typings.atJestSourceDashMap.buildTypesMod.SourceMapRegistry
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

