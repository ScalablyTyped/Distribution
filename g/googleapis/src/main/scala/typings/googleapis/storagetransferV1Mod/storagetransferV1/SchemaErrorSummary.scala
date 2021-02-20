package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A summary of errors by error code, plus a count and sample error log
  * entries.
  */
@js.native
trait SchemaErrorSummary extends StObject {
  
  /**
    * Required.
    */
  var errorCode: js.UndefOr[String] = js.native
  
  /**
    * Count of this type of error. Required.
    */
  var errorCount: js.UndefOr[String] = js.native
  
  /**
    * Error samples.  No more than 100 error log entries may be recorded for a
    * given error code for a single task.
    */
  var errorLogEntries: js.UndefOr[js.Array[SchemaErrorLogEntry]] = js.native
}
object SchemaErrorSummary {
  
  @scala.inline
  def apply(): SchemaErrorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorSummary]
  }
  
  @scala.inline
  implicit class SchemaErrorSummaryMutableBuilder[Self <: SchemaErrorSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    @scala.inline
    def setErrorLogEntries(value: js.Array[SchemaErrorLogEntry]): Self = StObject.set(x, "errorLogEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLogEntriesUndefined: Self = StObject.set(x, "errorLogEntries", js.undefined)
    
    @scala.inline
    def setErrorLogEntriesVarargs(value: SchemaErrorLogEntry*): Self = StObject.set(x, "errorLogEntries", js.Array(value :_*))
  }
}
