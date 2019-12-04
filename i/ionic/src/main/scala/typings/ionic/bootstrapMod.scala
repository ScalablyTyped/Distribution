package typings.ionic

import typings.ionic.ionicStrings.BASE_DIRECTORY_NOT_FOUND
import typings.ionic.ionicStrings.LOCAL_CLI_NOT_FOUND
import typings.ionic.ionicStrings.VERSION_TOO_OLD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/bootstrap", JSImport.Namespace)
@js.native
object bootstrapMod extends js.Object {
  val ERROR_BASE_DIRECTORY_NOT_FOUND: BASE_DIRECTORY_NOT_FOUND = js.native
  val ERROR_LOCAL_CLI_NOT_FOUND: LOCAL_CLI_NOT_FOUND = js.native
  val ERROR_VERSION_TOO_OLD: VERSION_TOO_OLD = js.native
  def detectLocalCLI(): js.Promise[String] = js.native
}

