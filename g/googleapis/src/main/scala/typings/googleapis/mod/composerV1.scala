package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composerV1 {
  
  @JSImport("googleapis", "composer_v1.Composer")
  @js.native
  open class Composer protected ()
    extends typings.googleapis.composerV1Mod.composerV1.Composer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "composer_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.composerV1Mod.composerV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "composer_v1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.composerV1Mod.composerV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "composer_v1.Resource$Projects$Locations$Environments")
  @js.native
  open class ResourceProjectsLocationsEnvironments protected ()
    extends typings.googleapis.composerV1Mod.composerV1.ResourceProjectsLocationsEnvironments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "composer_v1.Resource$Projects$Locations$Imageversions")
  @js.native
  open class ResourceProjectsLocationsImageversions protected ()
    extends typings.googleapis.composerV1Mod.composerV1.ResourceProjectsLocationsImageversions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "composer_v1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.composerV1Mod.composerV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
