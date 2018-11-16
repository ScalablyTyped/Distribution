package typings
package koaLib.koaMod.ApplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends BaseResponse {
  var app: koaLib.koaMod.Application = js.native
  var ctx: Context = js.native
  var req: nodeLib.httpMod.IncomingMessage = js.native
  var request: Request = js.native
  var res: nodeLib.httpMod.ServerResponse = js.native
}

