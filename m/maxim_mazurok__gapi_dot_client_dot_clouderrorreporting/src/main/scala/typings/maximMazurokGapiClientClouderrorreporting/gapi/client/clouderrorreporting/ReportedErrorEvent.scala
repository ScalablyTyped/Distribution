package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportedErrorEvent extends js.Object {
  
  /** Optional. A description of the context in which the error occurred. */
  var context: js.UndefOr[ErrorContext] = js.native
  
  /** Optional. Time when the event occurred. If not provided, the time when the event was received by the Error Reporting system will be used. */
  var eventTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The error message. If no `context.reportLocation` is provided, the message must contain a header (typically consisting of the exception type name and an error message) and
    * an exception stack trace in one of the supported programming languages and formats. Supported languages are Java, Python, JavaScript, Ruby, C#, PHP, and Go. Supported stack trace
    * formats are: * **Java**: Must be the return value of [`Throwable.printStackTrace()`](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29). *
    * **Python**: Must be the return value of [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#traceback.format_exc). * **JavaScript**: Must be the value of
    * [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API) as returned by V8. * **Ruby**: Must contain frames returned by
    * [`Exception.backtrace`](https://ruby-doc.org/core-2.2.0/Exception.html#method-i-backtrace). * **C#**: Must be the return value of
    * [`Exception.ToString()`](https://msdn.microsoft.com/en-us/library/system.exception.tostring.aspx). * **PHP**: Must start with `PHP (Notice|Parse error|Fatal error|Warning)` and
    * contain the result of [`(string)$exception`](http://php.net/manual/en/exception.tostring.php). * **Go**: Must be the return value of
    * [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
    */
  var message: js.UndefOr[String] = js.native
  
  /** Required. The service context in which this error has occurred. */
  var serviceContext: js.UndefOr[ServiceContext] = js.native
}
object ReportedErrorEvent {
  
  @scala.inline
  def apply(): ReportedErrorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportedErrorEvent]
  }
  
  @scala.inline
  implicit class ReportedErrorEventOps[Self <: ReportedErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setContext(value: ErrorContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setServiceContext(value: ServiceContext): Self = this.set("serviceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceContext: Self = this.set("serviceContext", js.undefined)
  }
}
