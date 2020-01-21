package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    errorCode: String = null,
    errorCount: String = null,
    errorLogEntries: js.Array[SchemaErrorLogEntry] = null
  ): SchemaErrorSummary = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount.asInstanceOf[js.Any])
    if (errorLogEntries != null) __obj.updateDynamic("errorLogEntries")(errorLogEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorSummary]
  }
}

