package typings.krakenJs.mod

import typings.expressServeStaticCore.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kraken extends Express {
  @JSName("kraken")
  var kraken_Original: Kraken = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def kraken(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def kraken(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def kraken(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def kraken(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

