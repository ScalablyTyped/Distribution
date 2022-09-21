package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretmanagerV1 {
  
  @JSImport("googleapis", "secretmanager_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.secretmanagerV1Mod.secretmanagerV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "secretmanager_v1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.secretmanagerV1Mod.secretmanagerV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "secretmanager_v1.Resource$Projects$Secrets")
  @js.native
  open class ResourceProjectsSecrets protected ()
    extends typings.googleapis.secretmanagerV1Mod.secretmanagerV1.ResourceProjectsSecrets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "secretmanager_v1.Resource$Projects$Secrets$Versions")
  @js.native
  open class ResourceProjectsSecretsVersions protected ()
    extends typings.googleapis.secretmanagerV1Mod.secretmanagerV1.ResourceProjectsSecretsVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "secretmanager_v1.Secretmanager")
  @js.native
  open class Secretmanager protected ()
    extends typings.googleapis.secretmanagerV1Mod.secretmanagerV1.Secretmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
