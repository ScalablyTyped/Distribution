package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainsV1beta1 {
  
  @JSImport("googleapis", "domains_v1beta1.Domains")
  @js.native
  open class Domains protected ()
    extends typings.googleapis.domainsV1beta1Mod.domainsV1beta1.Domains {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "domains_v1beta1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.domainsV1beta1Mod.domainsV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "domains_v1beta1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.domainsV1beta1Mod.domainsV1beta1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "domains_v1beta1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.domainsV1beta1Mod.domainsV1beta1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "domains_v1beta1.Resource$Projects$Locations$Registrations")
  @js.native
  open class ResourceProjectsLocationsRegistrations protected ()
    extends typings.googleapis.domainsV1beta1Mod.domainsV1beta1.ResourceProjectsLocationsRegistrations {
    def this(context: APIRequestContext) = this()
  }
}
