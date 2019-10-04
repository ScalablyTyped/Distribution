package typings.koa.koaMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends BaseResponse {
  var app: Application[DefaultState, DefaultContext] = js.native
  var ctx: Context = js.native
  var req: IncomingMessage = js.native
  var request: Request = js.native
  var res: ServerResponse = js.native
}

