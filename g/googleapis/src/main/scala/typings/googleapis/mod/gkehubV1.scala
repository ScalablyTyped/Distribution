package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gkehubV1 {
  
  @JSImport("googleapis", "gkehub_v1.Gkehub")
  @js.native
  open class Gkehub protected ()
    extends typings.googleapis.gkehubV1Mod.gkehubV1.Gkehub {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "gkehub_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.gkehubV1Mod.gkehubV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gkehub_v1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.gkehubV1Mod.gkehubV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gkehub_v1.Resource$Projects$Locations$Features")
  @js.native
  open class ResourceProjectsLocationsFeatures protected ()
    extends typings.googleapis.gkehubV1Mod.gkehubV1.ResourceProjectsLocationsFeatures {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gkehub_v1.Resource$Projects$Locations$Memberships")
  @js.native
  open class ResourceProjectsLocationsMemberships protected ()
    extends typings.googleapis.gkehubV1Mod.gkehubV1.ResourceProjectsLocationsMemberships {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "gkehub_v1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.gkehubV1Mod.gkehubV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
