package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Application log line emitted while processing a request.
  */
trait SchemaLogLine extends StObject {
  
  /**
    * App-provided log message.
    */
  var logMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Severity of this log entry.
    */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * Where in the source code this log message was written.
    */
  var sourceLocation: js.UndefOr[SchemaSourceLocation] = js.undefined
  
  /**
    * Approximate time when this log entry was made.
    */
  var time: js.UndefOr[String] = js.undefined
}
object SchemaLogLine {
  
  inline def apply(): SchemaLogLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogLine]
  }
  
  extension [Self <: SchemaLogLine](x: Self) {
    
    inline def setLogMessage(value: String): Self = StObject.set(x, "logMessage", value.asInstanceOf[js.Any])
    
    inline def setLogMessageUndefined: Self = StObject.set(x, "logMessage", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSourceLocation(value: SchemaSourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
