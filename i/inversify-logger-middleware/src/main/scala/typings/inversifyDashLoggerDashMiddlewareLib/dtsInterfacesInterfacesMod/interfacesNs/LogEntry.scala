package typings
package inversifyDashLoggerDashMiddlewareLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  var error: scala.Boolean
  var exception: js.Any
  var guid: java.lang.String
  var multiInject: scala.Boolean
  var results: js.Array[_]
  var rootRequest: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversify.interfaces.Request */ js.Any
  var serviceIdentifier: js.Any
  var time: java.lang.String
}

object LogEntry {
  @scala.inline
  def apply(
    error: scala.Boolean,
    exception: js.Any,
    guid: java.lang.String,
    multiInject: scala.Boolean,
    results: js.Array[_],
    rootRequest: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversify.interfaces.Request */ js.Any,
    serviceIdentifier: js.Any,
    time: java.lang.String
  ): LogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("exception")(exception)
    __obj.updateDynamic("guid")(guid)
    __obj.updateDynamic("multiInject")(multiInject)
    __obj.updateDynamic("results")(results)
    __obj.updateDynamic("rootRequest")(rootRequest)
    __obj.updateDynamic("serviceIdentifier")(serviceIdentifier)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[LogEntry]
  }
}

