package typings.inversifyLoggerMiddleware.interfacesMod.interfaces

import typings.inversify.interfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  var error: Boolean
  var exception: js.Any
  var guid: String
  var multiInject: Boolean
  var results: js.Array[_]
  var rootRequest: Request
  var serviceIdentifier: js.Any
  var time: String
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
}

