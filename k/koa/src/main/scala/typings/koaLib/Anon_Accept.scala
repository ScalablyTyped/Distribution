package typings
package koaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept[StateT] extends js.Object {
  var accept: acceptsLib.acceptsMod.acceptsNs.Accepts
  var app: koaLib.koaMod.Application[_, js.Object]
  var cookies: cookiesLib.cookiesMod.Cookies
  var originalUrl: java.lang.String
  var req: nodeLib.httpMod.IncomingMessage
  var request: koaLib.koaMod.ApplicationNs.Request
  var res: nodeLib.httpMod.ServerResponse
  /**
    * To bypass Koa's built-in response handling, you may explicitly set `ctx.respond = false;`
    */
  var respond: js.UndefOr[scala.Boolean] = js.undefined
  var response: koaLib.koaMod.ApplicationNs.Response
  var state: StateT
}

object Anon_Accept {
  @scala.inline
  def apply[StateT](
    accept: acceptsLib.acceptsMod.acceptsNs.Accepts,
    app: koaLib.koaMod.Application[_, js.Object],
    cookies: cookiesLib.cookiesMod.Cookies,
    originalUrl: java.lang.String,
    req: nodeLib.httpMod.IncomingMessage,
    request: koaLib.koaMod.ApplicationNs.Request,
    res: nodeLib.httpMod.ServerResponse,
    response: koaLib.koaMod.ApplicationNs.Response,
    state: StateT,
    respond: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Accept[StateT] = {
    val __obj = js.Dynamic.literal(accept = accept, app = app, cookies = cookies, originalUrl = originalUrl, req = req, request = request, res = res, response = response, state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(respond)) __obj.updateDynamic("respond")(respond)
    __obj.asInstanceOf[Anon_Accept[StateT]]
  }
}

