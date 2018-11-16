package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "ApiResponse")
@js.native
class ApiResponse[T] ()
  extends nodeLib.httpMod.IncomingMessage {
  var body: T = js.native
}

