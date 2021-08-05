package typings.jestConsole

import typings.jestConsole.typesMod.ConsoleBuffer
import typings.jestConsole.typesMod.LogEntry
import typings.jestConsole.typesMod.LogMessage
import typings.jestConsole.typesMod.LogType
import typings.jestSourceMap.typesMod.SourceMapRegistry
import typings.std.Console
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferedConsoleMod {
  
  @JSImport("@jest/console/build/BufferedConsole", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with BufferedConsole {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@jest/console/build/BufferedConsole", JSImport.Default)
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
  
  @js.native
  trait BufferedConsole
    extends StObject
       with Console {
    
    /* private */ var _buffer: js.Any = js.native
    
    /* private */ var _counters: js.Any = js.native
    
    /* private */ var _getSourceMaps: js.Any = js.native
    
    /* private */ var _groupDepth: js.Any = js.native
    
    /* private */ var _log: js.Any = js.native
    
    /* private */ var _timers: js.Any = js.native
    
    def assert(value: js.Any): Unit = js.native
    def assert(value: js.Any, message: String): Unit = js.native
    def assert(value: js.Any, message: Error): Unit = js.native
    
    def debug(firstArg: js.Any, rest: js.Any*): Unit = js.native
    
    def dir(firstArg: js.Any, rest: js.Any*): Unit = js.native
    
    def dirxml(firstArg: js.Any, rest: js.Any*): Unit = js.native
    
    def error(firstArg: js.Any, rest: js.Any*): Unit = js.native
    
    def getBuffer(): js.UndefOr[js.Array[LogEntry]] = js.native
    
    def group(title: String, rest: js.Any*): Unit = js.native
    def group(title: Unit, rest: js.Any*): Unit = js.native
    
    def groupCollapsed(title: String, rest: js.Any*): Unit = js.native
    def groupCollapsed(title: Unit, rest: js.Any*): Unit = js.native
    
    def info(firstArg: js.Any, rest: js.Any*): Unit = js.native
    
    def log(firstArg: js.Any, rest: js.Any*): Unit = js.native
    
    def warn(firstArg: js.Any, rest: js.Any*): Unit = js.native
  }
}
