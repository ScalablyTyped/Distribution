package typings.instabugReactnative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  def addFileAttachmentWithData(data: String, filename: String): Unit = js.native
  def addFileAttachmentWithUrl(url: String, filename: String): Unit = js.native
  def appendConsoleLog(consoleLog: String): Unit = js.native
  def appendTag(tag: String): Unit = js.native
  def logDebug(log: String): Unit = js.native
  def logError(log: String): Unit = js.native
  def logInfo(log: String): Unit = js.native
  def logVerbose(log: String): Unit = js.native
  def logWarn(log: String): Unit = js.native
  def setUserAttribute(key: String, value: String): Unit = js.native
}

object Report {
  @scala.inline
  def apply(
    addFileAttachmentWithData: (String, String) => Unit,
    addFileAttachmentWithUrl: (String, String) => Unit,
    appendConsoleLog: String => Unit,
    appendTag: String => Unit,
    logDebug: String => Unit,
    logError: String => Unit,
    logInfo: String => Unit,
    logVerbose: String => Unit,
    logWarn: String => Unit,
    setUserAttribute: (String, String) => Unit
  ): Report = {
    val __obj = js.Dynamic.literal(addFileAttachmentWithData = js.Any.fromFunction2(addFileAttachmentWithData), addFileAttachmentWithUrl = js.Any.fromFunction2(addFileAttachmentWithUrl), appendConsoleLog = js.Any.fromFunction1(appendConsoleLog), appendTag = js.Any.fromFunction1(appendTag), logDebug = js.Any.fromFunction1(logDebug), logError = js.Any.fromFunction1(logError), logInfo = js.Any.fromFunction1(logInfo), logVerbose = js.Any.fromFunction1(logVerbose), logWarn = js.Any.fromFunction1(logWarn), setUserAttribute = js.Any.fromFunction2(setUserAttribute))
    __obj.asInstanceOf[Report]
  }
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
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
    def setAddFileAttachmentWithData(value: (String, String) => Unit): Self = this.set("addFileAttachmentWithData", js.Any.fromFunction2(value))
    @scala.inline
    def setAddFileAttachmentWithUrl(value: (String, String) => Unit): Self = this.set("addFileAttachmentWithUrl", js.Any.fromFunction2(value))
    @scala.inline
    def setAppendConsoleLog(value: String => Unit): Self = this.set("appendConsoleLog", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendTag(value: String => Unit): Self = this.set("appendTag", js.Any.fromFunction1(value))
    @scala.inline
    def setLogDebug(value: String => Unit): Self = this.set("logDebug", js.Any.fromFunction1(value))
    @scala.inline
    def setLogError(value: String => Unit): Self = this.set("logError", js.Any.fromFunction1(value))
    @scala.inline
    def setLogInfo(value: String => Unit): Self = this.set("logInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setLogVerbose(value: String => Unit): Self = this.set("logVerbose", js.Any.fromFunction1(value))
    @scala.inline
    def setLogWarn(value: String => Unit): Self = this.set("logWarn", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUserAttribute(value: (String, String) => Unit): Self = this.set("setUserAttribute", js.Any.fromFunction2(value))
  }
  
}

