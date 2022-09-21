package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudshellV1alpha1 {
  
  @JSImport("googleapis", "cloudshell_v1alpha1.Cloudshell")
  @js.native
  open class Cloudshell protected ()
    extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudshell_v1alpha1.Resource$Users")
  @js.native
  open class ResourceUsers protected ()
    extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudshell_v1alpha1.Resource$Users$Environments")
  @js.native
  open class ResourceUsersEnvironments protected ()
    extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.ResourceUsersEnvironments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudshell_v1alpha1.Resource$Users$Environments$Publickeys")
  @js.native
  open class ResourceUsersEnvironmentsPublickeys protected ()
    extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.ResourceUsersEnvironmentsPublickeys {
    def this(context: APIRequestContext) = this()
  }
}
