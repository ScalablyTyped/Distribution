package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Application log line emitted while processing a request.
  */
@js.native
trait SchemaLogLine extends js.Object {
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
  implicit class SchemaLogLineOps[Self <: SchemaLogLine] (val x: Self) extends AnyVal {
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
    def setLogMessage(value: String): Self = this.set("logMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogMessage: Self = this.set("logMessage", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setSourceLocation(value: SchemaSourceLocation): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceLocation: Self = this.set("sourceLocation", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

