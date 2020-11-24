package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A summary of errors by error code, plus a count and sample error log
  * entries.
  */
@js.native
trait SchemaErrorSummary extends js.Object {
  
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
  implicit class SchemaErrorSummaryOps[Self <: SchemaErrorSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorCount(value: String): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCount: Self = this.set("errorCount", js.undefined)
    
    @scala.inline
    def setErrorLogEntriesVarargs(value: SchemaErrorLogEntry*): Self = this.set("errorLogEntries", js.Array(value :_*))
    
    @scala.inline
    def setErrorLogEntries(value: js.Array[SchemaErrorLogEntry]): Self = this.set("errorLogEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorLogEntries: Self = this.set("errorLogEntries", js.undefined)
  }
}
