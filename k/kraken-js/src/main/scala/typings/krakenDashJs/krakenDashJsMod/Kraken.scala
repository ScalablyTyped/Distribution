package typings.krakenDashJs.krakenDashJsMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
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
  def kraken(req: Request[ParamsDictionary], res: Response): js.Any = js.native
  def kraken(req: Request[ParamsDictionary], res: ServerResponse): js.Any = js.native
  def kraken(req: IncomingMessage, res: Response): js.Any = js.native
  def kraken(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

