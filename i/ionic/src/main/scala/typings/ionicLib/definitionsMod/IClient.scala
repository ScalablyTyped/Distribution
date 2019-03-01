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
    `do`: js.Function1[
      superagentLib.superagentMod.requestNs.SuperAgentRequest, 
      js.Promise[APIResponseSuccess]
    ],
    make: js.Function2[HttpMethod, java.lang.String, js.Promise[ionicLib.Anon_Req]],
    paginate: js.Function1[PaginateArgs[js.Any], IPaginator[js.Any, PaginatorState]]
  ): IClient = {
    val __obj = js.Dynamic.literal(`do` = `do`)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("make")(make)
    __obj.updateDynamic("paginate")(paginate)
    __obj.asInstanceOf[IClient]
  }
}

