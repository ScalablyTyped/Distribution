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

