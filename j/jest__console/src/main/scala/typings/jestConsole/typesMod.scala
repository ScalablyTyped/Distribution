package typings.jestConsole

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ConsoleBuffer = js.Array[LogEntry]
  
  type LogCounters = StringDictionary[Double]
  
  trait LogEntry extends StObject {
    
    var message: LogMessage
    
    var origin: String
    
    var `type`: LogType
  }
  object LogEntry {
    
    @scala.inline
    def apply(message: LogMessage, origin: String, `type`: LogType): LogEntry = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    @scala.inline
    implicit class LogEntryMutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: LogMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: LogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LogMessage = String
  
  type LogTimers = StringDictionary[Date]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestConsole.jestConsoleStrings.assert
    - typings.jestConsole.jestConsoleStrings.count
    - typings.jestConsole.jestConsoleStrings.debug
    - typings.jestConsole.jestConsoleStrings.dir
    - typings.jestConsole.jestConsoleStrings.dirxml
    - typings.jestConsole.jestConsoleStrings.error
    - typings.jestConsole.jestConsoleStrings.group
    - typings.jestConsole.jestConsoleStrings.groupCollapsed
    - typings.jestConsole.jestConsoleStrings.info
    - typings.jestConsole.jestConsoleStrings.log
    - typings.jestConsole.jestConsoleStrings.time
    - typings.jestConsole.jestConsoleStrings.warn
  */
  trait LogType extends StObject
  object LogType {
    
    @scala.inline
    def assert: typings.jestConsole.jestConsoleStrings.assert = "assert".asInstanceOf[typings.jestConsole.jestConsoleStrings.assert]
    
    @scala.inline
    def count: typings.jestConsole.jestConsoleStrings.count = "count".asInstanceOf[typings.jestConsole.jestConsoleStrings.count]
    
    @scala.inline
    def debug: typings.jestConsole.jestConsoleStrings.debug = "debug".asInstanceOf[typings.jestConsole.jestConsoleStrings.debug]
    
    @scala.inline
    def dir: typings.jestConsole.jestConsoleStrings.dir = "dir".asInstanceOf[typings.jestConsole.jestConsoleStrings.dir]
    
    @scala.inline
    def dirxml: typings.jestConsole.jestConsoleStrings.dirxml = "dirxml".asInstanceOf[typings.jestConsole.jestConsoleStrings.dirxml]
    
    @scala.inline
    def error: typings.jestConsole.jestConsoleStrings.error = "error".asInstanceOf[typings.jestConsole.jestConsoleStrings.error]
    
    @scala.inline
    def group: typings.jestConsole.jestConsoleStrings.group = "group".asInstanceOf[typings.jestConsole.jestConsoleStrings.group]
    
    @scala.inline
    def groupCollapsed: typings.jestConsole.jestConsoleStrings.groupCollapsed = "groupCollapsed".asInstanceOf[typings.jestConsole.jestConsoleStrings.groupCollapsed]
    
    @scala.inline
    def info: typings.jestConsole.jestConsoleStrings.info = "info".asInstanceOf[typings.jestConsole.jestConsoleStrings.info]
    
    @scala.inline
    def log: typings.jestConsole.jestConsoleStrings.log = "log".asInstanceOf[typings.jestConsole.jestConsoleStrings.log]
    
    @scala.inline
    def time: typings.jestConsole.jestConsoleStrings.time = "time".asInstanceOf[typings.jestConsole.jestConsoleStrings.time]
    
    @scala.inline
    def warn: typings.jestConsole.jestConsoleStrings.warn = "warn".asInstanceOf[typings.jestConsole.jestConsoleStrings.warn]
  }
}
