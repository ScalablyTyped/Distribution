package typings
package ionicLib.libHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", "Client")
@js.native
class Client protected ()
  extends ionicLib.definitionsMod.IClient {
  def this(config: ionicLib.definitionsMod.IConfig) = this()
  /* CompleteClass */
  override var config: ionicLib.definitionsMod.IConfig = js.native
  /* CompleteClass */
  override def `do`(req: ionicLib.definitionsMod.SuperAgentRequest): js.Promise[ionicLib.definitionsMod.APIResponseSuccess] = js.native
  /* CompleteClass */
  override def make(method: ionicLib.definitionsMod.HttpMethod, path: java.lang.String): js.Promise[ionicLib.Anon_Req] = js.native
  /* CompleteClass */
  override def paginate[T /* <: ionicLib.definitionsMod.Response[js.Array[js.Object]] */](args: ionicLib.definitionsMod.PaginateArgs[T]): ionicLib.definitionsMod.IPaginator[T, ionicLib.definitionsMod.PaginatorState] = js.native
}

