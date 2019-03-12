package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClient extends js.Object {
  var config: IConfig
  def `do`(req: superagentLib.superagentMod.requestNs.SuperAgentRequest): js.Promise[APIResponseSuccess]
  def make(method: HttpMethod, path: java.lang.String): js.Promise[ionicLib.Anon_Req]
  def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState]
}

object IClient {
  @scala.inline
  def apply(
    config: IConfig,
    `do`: superagentLib.superagentMod.requestNs.SuperAgentRequest => js.Promise[APIResponseSuccess],
    make: (HttpMethod, java.lang.String) => js.Promise[ionicLib.Anon_Req],
    paginate: PaginateArgs[js.Any] => IPaginator[js.Any, PaginatorState]
  ): IClient = {
    val __obj = js.Dynamic.literal(config = config, make = js.Any.fromFunction2(make), paginate = js.Any.fromFunction1(paginate))
    __obj.updateDynamic("do")(js.Any.fromFunction1(`do`))
    __obj.asInstanceOf[IClient]
  }
}

