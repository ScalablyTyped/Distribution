package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudshellV1 {
  
  @JSImport("googleapis", "cloudshell_v1.Cloudshell")
  @js.native
  open class Cloudshell protected ()
    extends typings.googleapis.cloudshellV1Mod.cloudshellV1.Cloudshell {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudshell_v1.Resource$Operations")
  @js.native
  open class ResourceOperations protected ()
    extends typings.googleapis.cloudshellV1Mod.cloudshellV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudshell_v1.Resource$Users")
  @js.native
  open class ResourceUsers protected ()
    extends typings.googleapis.cloudshellV1Mod.cloudshellV1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudshell_v1.Resource$Users$Environments")
  @js.native
  open class ResourceUsersEnvironments protected ()
    extends typings.googleapis.cloudshellV1Mod.cloudshellV1.ResourceUsersEnvironments {
    def this(context: APIRequestContext) = this()
  }
}
