package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Report extends StObject {
  
  /**
    * Attach a file to the report to be sent.
    * @param {string} data 
    * @param {string} fileName 
    */
  def addFileAttachmentWithData(data: String, filename: String): Unit
  
  /**
    * Attach a file to the report to be sent.
    * @param {string} url 
    * @param {string} fileName 
    */
  def addFileAttachmentWithUrl(url: String, filename: String): Unit
  
  /**
    * Append a console log to the report to be sent.
    * @param {string} consoleLog 
    */
  def appendConsoleLog(consoleLog: String): Unit
  
  /**
    * Append a tag to the report to be sent.
    * @param {string} tag 
    */
  def appendTag(tag: String): Unit
  
  /**
    * Attach debug log to the report to be sent.
    * @param {string} log 
    */
  def logDebug(log: String): Unit
  
  /**
    * Attach error log to the report to be sent.
    * @param {string} log 
    */
  def logError(log: String): Unit
  
  /**
    * Attach info log to the report to be sent.
    * @param {string} log 
    */
  def logInfo(log: String): Unit
  
  /**
    * Attach verbose log to the report to be sent.
    * @param {string} log 
    */
  def logVerbose(log: String): Unit
  
  /**
    * Attach warn log to the report to be sent.
    * @param {string} log 
    */
  def logWarn(log: String): Unit
  
  /**
    * Add a user attribute with key and value to the report to be sent.
    * @param {string} key 
    * @param {string} value 
    */
  def setUserAttribute(key: String, value: String): Unit
}
object Report {
  
  inline def apply(
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
  
  extension [Self <: Report](x: Self) {
    
    inline def setAddFileAttachmentWithData(value: (String, String) => Unit): Self = StObject.set(x, "addFileAttachmentWithData", js.Any.fromFunction2(value))
    
    inline def setAddFileAttachmentWithUrl(value: (String, String) => Unit): Self = StObject.set(x, "addFileAttachmentWithUrl", js.Any.fromFunction2(value))
    
    inline def setAppendConsoleLog(value: String => Unit): Self = StObject.set(x, "appendConsoleLog", js.Any.fromFunction1(value))
    
    inline def setAppendTag(value: String => Unit): Self = StObject.set(x, "appendTag", js.Any.fromFunction1(value))
    
    inline def setLogDebug(value: String => Unit): Self = StObject.set(x, "logDebug", js.Any.fromFunction1(value))
    
    inline def setLogError(value: String => Unit): Self = StObject.set(x, "logError", js.Any.fromFunction1(value))
    
    inline def setLogInfo(value: String => Unit): Self = StObject.set(x, "logInfo", js.Any.fromFunction1(value))
    
    inline def setLogVerbose(value: String => Unit): Self = StObject.set(x, "logVerbose", js.Any.fromFunction1(value))
    
    inline def setLogWarn(value: String => Unit): Self = StObject.set(x, "logWarn", js.Any.fromFunction1(value))
    
    inline def setSetUserAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setUserAttribute", js.Any.fromFunction2(value))
  }
}
