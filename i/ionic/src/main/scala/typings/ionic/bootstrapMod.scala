package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/bootstrap", JSImport.Namespace)
@js.native
object bootstrapMod extends js.Object {
  
  val ERROR_BASE_DIRECTORY_NOT_FOUND: /* "BASE_DIRECTORY_NOT_FOUND" */ String = js.native
  
  val ERROR_LOCAL_CLI_NOT_FOUND: /* "LOCAL_CLI_NOT_FOUND" */ String = js.native
  
  val ERROR_VERSION_TOO_OLD: /* "VERSION_TOO_OLD" */ String = js.native
  
  def detectLocalCLI(): js.Promise[String] = js.native
}
