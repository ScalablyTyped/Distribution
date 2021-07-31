package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrapMod {
  
  @JSImport("ionic/bootstrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/bootstrap", "ERROR_BASE_DIRECTORY_NOT_FOUND")
  @js.native
  val ERROR_BASE_DIRECTORY_NOT_FOUND: /* "BASE_DIRECTORY_NOT_FOUND" */ String = js.native
  
  @JSImport("ionic/bootstrap", "ERROR_LOCAL_CLI_NOT_FOUND")
  @js.native
  val ERROR_LOCAL_CLI_NOT_FOUND: /* "LOCAL_CLI_NOT_FOUND" */ String = js.native
  
  @JSImport("ionic/bootstrap", "ERROR_VERSION_TOO_OLD")
  @js.native
  val ERROR_VERSION_TOO_OLD: /* "VERSION_TOO_OLD" */ String = js.native
  
  @scala.inline
  def detectLocalCLI(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLocalCLI")().asInstanceOf[js.Promise[String]]
}
