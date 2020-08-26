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
  def apply(): SchemaExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionError]
  }
  @scala.inline
  implicit class SchemaExecutionErrorOps[Self <: SchemaExecutionError] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorType: Self = this.set("errorType", js.undefined)
    @scala.inline
    def setScriptStackTraceElementsVarargs(value: SchemaScriptStackTraceElement*): Self = this.set("scriptStackTraceElements", js.Array(value :_*))
    @scala.inline
    def setScriptStackTraceElements(value: js.Array[SchemaScriptStackTraceElement]): Self = this.set("scriptStackTraceElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptStackTraceElements: Self = this.set("scriptStackTraceElements", js.undefined)
  }
  
}

