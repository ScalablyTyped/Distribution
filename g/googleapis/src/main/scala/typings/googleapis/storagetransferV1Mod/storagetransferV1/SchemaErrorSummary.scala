package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A summary of errors by error code, plus a count and sample error log
  * entries.
  */
trait SchemaErrorSummary extends StObject {
  
  /**
    * Required.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /**
    * Count of this type of error. Required.
    */
  var errorCount: js.UndefOr[String] = js.undefined
  
  /**
    * Error samples.  No more than 100 error log entries may be recorded for a
    * given error code for a single task.
    */
  var errorLogEntries: js.UndefOr[js.Array[SchemaErrorLogEntry]] = js.undefined
}
object SchemaErrorSummary {
  
  inline def apply(): SchemaErrorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorSummary]
  }
  
  extension [Self <: SchemaErrorSummary](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    inline def setErrorLogEntries(value: js.Array[SchemaErrorLogEntry]): Self = StObject.set(x, "errorLogEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorLogEntriesUndefined: Self = StObject.set(x, "errorLogEntries", js.undefined)
    
    inline def setErrorLogEntriesVarargs(value: SchemaErrorLogEntry*): Self = StObject.set(x, "errorLogEntries", js.Array(value :_*))
  }
}
