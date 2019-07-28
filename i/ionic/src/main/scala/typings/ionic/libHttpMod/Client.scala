package typings.ionic.libHttpMod

import typings.ionic.Anon_Req
import typings.ionic.definitionsMod.APIResponseSuccess
import typings.ionic.definitionsMod.HttpMethod
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PaginateArgs
import typings.ionic.definitionsMod.PaginatorState
import typings.ionic.definitionsMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", "Client")
@js.native
class Client protected () extends IClient {
  def this(config: IConfig) = this()
  /* CompleteClass */
  override var config: IConfig = js.native
  /* CompleteClass */
  override def `do`(req: typings.ionic.definitionsMod.SuperAgentRequest): js.Promise[APIResponseSuccess] = js.native
  /* CompleteClass */
  override def make(method: HttpMethod, path: String): js.Promise[Anon_Req] = js.native
  /* CompleteClass */
  override def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState] = js.native
}

