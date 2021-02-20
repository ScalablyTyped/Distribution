package typings.jestConsole

import typings.jestConsole.typesMod.LogMessage
import typings.jestConsole.typesMod.LogType
import typings.node.NodeJS.WritableStream
import typings.std.Console
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customConsoleMod {
  
  @JSImport("@jest/console/build/CustomConsole", JSImport.Default)
  @js.native
  class default protected () extends CustomConsole {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream, formatBuffer: Formatter) = this()
  }
  
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
    
    def debug(firstArg: js.Any, args: js.Any*): Unit = js.native
    
    def dir(firstArg: js.Any, args: js.Any*): Unit = js.native
    
    def dirxml(firstArg: js.Any, args: js.Any*): Unit = js.native
    
    def error(firstArg: js.Any, args: js.Any*): Unit = js.native
    
    def getBuffer(): js.UndefOr[scala.Nothing] = js.native
    
    def group(title: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def group(title: String, args: js.Any*): Unit = js.native
    
    def groupCollapsed(title: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
    def groupCollapsed(title: String, args: js.Any*): Unit = js.native
    
    def info(firstArg: js.Any, args: js.Any*): Unit = js.native
    
    def log(firstArg: js.Any, args: js.Any*): Unit = js.native
    
    def warn(firstArg: js.Any, args: js.Any*): Unit = js.native
  }
  
  type Formatter = js.Function2[/* type */ LogType, /* message */ LogMessage, String]
}
