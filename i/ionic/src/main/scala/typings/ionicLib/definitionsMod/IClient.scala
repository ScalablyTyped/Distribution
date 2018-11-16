package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IClient extends js.Object {
  var config: IConfig
  def `do`(req: superagentLib.superagentMod.requestNs.SuperAgentRequest): stdLib.Promise[APIResponseSuccess]
  def make(method: HttpMethod, path: java.lang.String): stdLib.Promise[ionicLib.Anon_Req]
  def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState]
}

