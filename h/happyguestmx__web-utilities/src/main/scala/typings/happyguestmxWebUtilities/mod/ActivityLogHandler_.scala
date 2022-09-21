package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityLogHandler_ extends StObject {
  
  def logEntry(params: LogEntry): js.Promise[PutItemOutput]
}
object ActivityLogHandler_ {
  
  inline def apply(logEntry: LogEntry => js.Promise[PutItemOutput]): ActivityLogHandler_ = {
    val __obj = js.Dynamic.literal(logEntry = js.Any.fromFunction1(logEntry))
    __obj.asInstanceOf[ActivityLogHandler_]
  }
  
  extension [Self <: ActivityLogHandler_](x: Self) {
    
    inline def setLogEntry(value: LogEntry => js.Promise[PutItemOutput]): Self = StObject.set(x, "logEntry", js.Any.fromFunction1(value))
  }
}
