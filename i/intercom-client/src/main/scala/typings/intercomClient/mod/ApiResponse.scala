package typings.intercomClient.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intercom-client", "ApiResponse")
@js.native
class ApiResponse[T] () extends IncomingMessage {
  
  var body: T = js.native
}
