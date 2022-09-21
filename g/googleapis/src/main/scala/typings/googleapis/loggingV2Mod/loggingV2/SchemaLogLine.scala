package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogLine extends StObject {
  
  /**
    * App-provided log message.
    */
  var logMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Severity of this log entry.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Where in the source code this log message was written.
    */
  var sourceLocation: js.UndefOr[SchemaSourceLocation] = js.undefined
  
  /**
    * Approximate time when this log entry was made.
    */
  var time: js.UndefOr[String | Null] = js.undefined
}
object SchemaLogLine {
  
  inline def apply(): SchemaLogLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogLine]
  }
  
  extension [Self <: SchemaLogLine](x: Self) {
    
    inline def setLogMessage(value: String): Self = StObject.set(x, "logMessage", value.asInstanceOf[js.Any])
    
    inline def setLogMessageNull: Self = StObject.set(x, "logMessage", null)
    
    inline def setLogMessageUndefined: Self = StObject.set(x, "logMessage", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSourceLocation(value: SchemaSourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
