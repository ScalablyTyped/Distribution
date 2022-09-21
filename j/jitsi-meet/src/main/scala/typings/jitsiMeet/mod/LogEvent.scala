package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEvent extends StObject {
  
  var args: String
  
  var logLevel: LogLevels
}
object LogEvent {
  
  inline def apply(args: String, logLevel: LogLevels): LogEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  extension [Self <: LogEvent](x: Self) {
    
    inline def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
  }
}
