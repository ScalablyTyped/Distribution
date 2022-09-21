package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memcacheV1 {
  
  @JSImport("googleapis", "memcache_v1.Memcache")
  @js.native
  open class Memcache protected ()
    extends typings.googleapis.memcacheV1Mod.memcacheV1.Memcache {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "memcache_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.memcacheV1Mod.memcacheV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "memcache_v1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.memcacheV1Mod.memcacheV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "memcache_v1.Resource$Projects$Locations$Instances")
  @js.native
  open class ResourceProjectsLocationsInstances protected ()
    extends typings.googleapis.memcacheV1Mod.memcacheV1.ResourceProjectsLocationsInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "memcache_v1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.memcacheV1Mod.memcacheV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
