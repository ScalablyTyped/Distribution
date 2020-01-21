package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that provides information about the nature of an error resulting
  * from an attempted execution of a script function using the Apps Script API.
  * If a run call succeeds but the script function (or Apps Script itself)
  * throws an exception, the response body&#39;s error field contains a Status
  * object. The `Status` object&#39;s `details` field contains an array with a
  * single one of these `ExecutionError` objects.
  */
@js.native
trait SchemaExecutionError extends js.Object {
  /**
    * The error message thrown by Apps Script, usually localized into the
    * user&#39;s language.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The error type, for example `TypeError` or `ReferenceError`. If the error
    * type is unavailable, this field is not included.
    */
  var errorType: js.UndefOr[String] = js.native
  /**
    * An array of objects that provide a stack trace through the script to show
    * where the execution failed, with the deepest call first.
    */
  var scriptStackTraceElements: js.UndefOr[js.Array[SchemaScriptStackTraceElement]] = js.native
}

object SchemaExecutionError {
  @scala.inline
  def apply(
    errorMessage: String = null,
    errorType: String = null,
    scriptStackTraceElements: js.Array[SchemaScriptStackTraceElement] = null
  ): SchemaExecutionError = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (errorType != null) __obj.updateDynamic("errorType")(errorType.asInstanceOf[js.Any])
    if (scriptStackTraceElements != null) __obj.updateDynamic("scriptStackTraceElements")(scriptStackTraceElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExecutionError]
  }
}

