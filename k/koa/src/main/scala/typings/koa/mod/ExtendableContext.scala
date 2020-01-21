package typings.koa.mod

import typings.accepts.mod.Accepts
import typings.cookies.mod.Cookies
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendableContext extends BaseContext {
  var accept: Accepts = js.native
  var app: Application[DefaultState, DefaultContext] = js.native
  var cookies: Cookies = js.native
  var originalUrl: String = js.native
  var req: IncomingMessage = js.native
  var request: Request = js.native
  var res: ServerResponse = js.native
  /**
    * To bypass Koa's built-in response handling, you may explicitly set `ctx.respond = false;`
    */
  var respond: js.UndefOr[Boolean] = js.native
  var response: Response = js.native
}

