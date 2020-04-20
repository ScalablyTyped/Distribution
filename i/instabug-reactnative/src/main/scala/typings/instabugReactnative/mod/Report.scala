package typings.instabugReactnative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  def addFileAttachmentWithData(data: String, filename: String): Unit
  def addFileAttachmentWithUrl(url: String, filename: String): Unit
  def appendConsoleLog(consoleLog: String): Unit
  def appendTag(tag: String): Unit
  def logDebug(log: String): Unit
  def logError(log: String): Unit
  def logInfo(log: String): Unit
  def logVerbose(log: String): Unit
  def logWarn(log: String): Unit
  def setUserAttribute(key: String, value: String): Unit
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
}

