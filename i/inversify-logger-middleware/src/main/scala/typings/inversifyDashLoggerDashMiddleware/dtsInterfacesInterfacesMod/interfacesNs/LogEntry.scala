package typings.inversifyDashLoggerDashMiddleware.dtsInterfacesInterfacesMod.interfacesNs

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Request
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
    val __obj = js.Dynamic.literal(error = error, exception = exception, guid = guid, multiInject = multiInject, results = results, rootRequest = rootRequest, serviceIdentifier = serviceIdentifier, time = time)
  
    __obj.asInstanceOf[LogEntry]
  }
}

