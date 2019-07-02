package typings
package koaLib.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendableContext extends BaseContext {
  var accept: acceptsLib.acceptsMod.Accepts = js.native
  var app: Application[_, js.Object] = js.native
  var cookies: cookiesLib.cookiesMod.Cookies = js.native
  var originalUrl: java.lang.String = js.native
  var req: nodeLib.httpMod.IncomingMessage = js.native
  var request: Request = js.native
  var res: nodeLib.httpMod.ServerResponse = js.native
  /**
    * To bypass Koa's built-in response handling, you may explicitly set `ctx.respond = false;`
    */
  var respond: js.UndefOr[scala.Boolean] = js.native
  var response: Response = js.native
}

