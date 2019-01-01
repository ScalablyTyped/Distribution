package typings
package koaLib.koaMod.ApplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends BaseRequest {
  var accept: acceptsLib.acceptsMod.acceptsNs.Accepts = js.native
  var app: koaLib.koaMod.Application[_, js.Object] = js.native
  var ctx: Context = js.native
  var originalUrl: java.lang.String = js.native
  var req: nodeLib.httpMod.IncomingMessage = js.native
  var res: nodeLib.httpMod.ServerResponse = js.native
  var response: Response = js.native
}

