package typings.inversifyLoggerMiddleware.interfacesMod.interfaces

import typings.inversify.interfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEntry extends js.Object {
  
  var error: Boolean = js.native
  
  var exception: js.Any = js.native
  
  var guid: String = js.native
  
  var multiInject: Boolean = js.native
  
  var results: js.Array[_] = js.native
  
  var rootRequest: Request = js.native
  
  var serviceIdentifier: js.Any = js.native
  
  var time: String = js.native
}
object LogEntry {
  
  @scala.inline
  def apply(
    error: Boolean,
    exception: js.Any,
    guid: String,
    multiInject: Boolean,
    results: js.Array[_],
    rootRequest: Request,
    serviceIdentifier: js.Any,
    time: String
  ): LogEntry = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], multiInject = multiInject.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], rootRequest = rootRequest.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
    
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
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setException(value: js.Any): Self = this.set("exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiInject(value: Boolean): Self = this.set("multiInject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: js.Any*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[_]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootRequest(value: Request): Self = this.set("rootRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdentifier(value: js.Any): Self = this.set("serviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
