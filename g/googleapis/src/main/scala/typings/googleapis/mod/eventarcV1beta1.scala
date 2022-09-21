package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventarcV1beta1 {
  
  @JSImport("googleapis", "eventarc_v1beta1.Eventarc")
  @js.native
  open class Eventarc protected ()
    extends typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1.Eventarc {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "eventarc_v1beta1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "eventarc_v1beta1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "eventarc_v1beta1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "eventarc_v1beta1.Resource$Projects$Locations$Triggers")
  @js.native
  open class ResourceProjectsLocationsTriggers protected ()
    extends typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1.ResourceProjectsLocationsTriggers {
    def this(context: APIRequestContext) = this()
  }
}
