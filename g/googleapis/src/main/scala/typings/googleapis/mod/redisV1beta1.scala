package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redisV1beta1 {
  
  /**
    * Google Cloud Memorystore for Redis API
    *
    * Creates and manages Redis instances on the Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const redis = google.redis('v1beta1');
    *
    * @namespace redis
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Redis
    */
  @JSImport("googleapis", "redis_v1beta1.Redis")
  @js.native
  class Redis protected ()
    extends typings.googleapis.redisV1beta1Mod.redisV1beta1.Redis {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "redis_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.redisV1beta1Mod.redisV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "redis_v1beta1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.redisV1beta1Mod.redisV1beta1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "redis_v1beta1.Resource$Projects$Locations$Instances")
  @js.native
  class ResourceProjectsLocationsInstances protected ()
    extends typings.googleapis.redisV1beta1Mod.redisV1beta1.ResourceProjectsLocationsInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "redis_v1beta1.Resource$Projects$Locations$Operations")
  @js.native
  class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.redisV1beta1Mod.redisV1beta1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
