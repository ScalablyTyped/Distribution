package typings.jestConsole

import typings.jestConsole.bufferedConsoleMod.default
import typings.jestConsole.customConsoleMod.Formatter
import typings.jestConsole.typesMod.ConsoleBuffer
import typings.jestConsole.typesMod.LogEntry
import typings.jestConsole.typesMod.LogMessage
import typings.jestConsole.typesMod.LogType
import typings.jestSourceMap.typesMod.SourceMapRegistry
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jest/console", "BufferedConsole")
  @js.native
  class BufferedConsole protected () extends default {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  /* static members */
  object BufferedConsole {
    
    @JSImport("@jest/console", "BufferedConsole")
    @js.native
    val ^ : js.Any = js.native
    
    inline def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage): js.Array[LogEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Array[LogEntry]]
    inline def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage, level: Double): js.Array[LogEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Array[LogEntry]]
    inline def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Double,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], sourceMaps.asInstanceOf[js.Any])).asInstanceOf[js.Array[LogEntry]]
    inline def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Null,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], sourceMaps.asInstanceOf[js.Any])).asInstanceOf[js.Array[LogEntry]]
    inline def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Unit,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], sourceMaps.asInstanceOf[js.Any])).asInstanceOf[js.Array[LogEntry]]
  }
  
  @JSImport("@jest/console", "CustomConsole")
  @js.native
  class CustomConsole protected ()
    extends typings.jestConsole.customConsoleMod.default {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream, formatBuffer: Formatter) = this()
  }
  
  @JSImport("@jest/console", "NullConsole")
  @js.native
  class NullConsole ()
    extends typings.jestConsole.nullConsoleMod.default
  
  inline def getConsoleOutput(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getConsoleOutput")(root.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[String]
}
