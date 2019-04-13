package typings
package koaLib.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends BaseRequest {
  var accept: acceptsLib.acceptsMod.Accepts = js.native
  var app: Application[_, js.Object] = js.native
  var ctx: Context = js.native
  var originalUrl: java.lang.String = js.native
  var req: nodeLib.httpMod.IncomingMessage = js.native
  var res: nodeLib.httpMod.ServerResponse = js.native
  var response: Response = js.native
}

