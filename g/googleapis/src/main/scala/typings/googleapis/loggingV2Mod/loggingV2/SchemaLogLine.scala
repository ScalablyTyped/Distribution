package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Application log line emitted while processing a request.
  */
@js.native
trait SchemaLogLine extends StObject {
  
  /**
    * App-provided log message.
    */
  var logMessage: js.UndefOr[String] = js.native
  
  /**
    * Severity of this log entry.
    */
  var severity: js.UndefOr[String] = js.native
  
  /**
    * Where in the source code this log message was written.
    */
  var sourceLocation: js.UndefOr[SchemaSourceLocation] = js.native
  
  /**
    * Approximate time when this log entry was made.
    */
  var time: js.UndefOr[String] = js.native
}
object SchemaLogLine {
  
  @scala.inline
  def apply(): SchemaLogLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogLine]
  }
  
  @scala.inline
  implicit class SchemaLogLineMutableBuilder[Self <: SchemaLogLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogMessage(value: String): Self = StObject.set(x, "logMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogMessageUndefined: Self = StObject.set(x, "logMessage", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSourceLocation(value: SchemaSourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
