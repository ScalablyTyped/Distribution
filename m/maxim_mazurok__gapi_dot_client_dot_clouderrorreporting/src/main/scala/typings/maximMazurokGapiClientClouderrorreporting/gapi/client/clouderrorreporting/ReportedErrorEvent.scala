package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportedErrorEvent extends StObject {
  
  /** Optional. A description of the context in which the error occurred. */
  var context: js.UndefOr[ErrorContext] = js.undefined
  
  /**
    * Optional. Time when the event occurred. If not provided, the time when the event was received by the Error Reporting system is used. If provided, the time must not exceed the [logs
    * retention period](https://cloud.google.com/logging/quotas#logs_retention_periods) in the past, or be more than 24 hours in the future. If an invalid time is provided, then an error
    * is returned.
    */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The error message. If no `context.reportLocation` is provided, the message must contain a header (typically consisting of the exception type name and an error message) and
    * an exception stack trace in one of the supported programming languages and formats. Supported languages are Java, Python, JavaScript, Ruby, C#, PHP, and Go. Supported stack trace
    * formats are: * **Java**: Must be the return value of [`Throwable.printStackTrace()`](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29). *
    * **Python**: Must be the return value of [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#traceback.format_exc). * **JavaScript**: Must be the value of
    * [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API) as returned by V8. * **Ruby**: Must contain frames returned by
    * [`Exception.backtrace`](https://ruby-doc.org/core-2.2.0/Exception.html#method-i-backtrace). * **C#**: Must be the return value of
    * [`Exception.ToString()`](https://msdn.microsoft.com/en-us/library/system.exception.tostring.aspx). * **PHP**: Must be prefixed with `"PHP (Notice|Parse error|Fatal error|Warning):
    * "` and contain the result of [`(string)$exception`](https://php.net/manual/en/exception.tostring.php). * **Go**: Must be the return value of
    * [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
    */
  var message: js.UndefOr[String] = js.undefined
  
  /** Required. The service context in which this error has occurred. */
  var serviceContext: js.UndefOr[ServiceContext] = js.undefined
}
object ReportedErrorEvent {
  
  inline def apply(): ReportedErrorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportedErrorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportedErrorEvent] (val x: Self) extends AnyVal {
    
    inline def setContext(value: ErrorContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setServiceContext(value: ServiceContext): Self = StObject.set(x, "serviceContext", value.asInstanceOf[js.Any])
    
    inline def setServiceContextUndefined: Self = StObject.set(x, "serviceContext", js.undefined)
  }
}
