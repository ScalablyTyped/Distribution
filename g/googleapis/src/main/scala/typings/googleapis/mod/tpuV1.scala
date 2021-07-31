package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tpuV1 {
  
  @JSImport("googleapis", "tpu_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.tpuV1Mod.tpuV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tpu_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.tpuV1Mod.tpuV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tpu_v1.Resource$Projects$Locations$Acceleratortypes")
  @js.native
  class ResourceProjectsLocationsAcceleratortypes protected ()
    extends typings.googleapis.tpuV1Mod.tpuV1.ResourceProjectsLocationsAcceleratortypes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tpu_v1.Resource$Projects$Locations$Nodes")
  @js.native
  class ResourceProjectsLocationsNodes protected ()
    extends typings.googleapis.tpuV1Mod.tpuV1.ResourceProjectsLocationsNodes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tpu_v1.Resource$Projects$Locations$Operations")
  @js.native
  class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.tpuV1Mod.tpuV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tpu_v1.Resource$Projects$Locations$Tensorflowversions")
  @js.native
  class ResourceProjectsLocationsTensorflowversions protected ()
    extends typings.googleapis.tpuV1Mod.tpuV1.ResourceProjectsLocationsTensorflowversions {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud TPU API
    *
    * TPU API provides customers with access to Google TPU technology.
    *
    * @example
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v1');
    *
    * @namespace tpu
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Tpu
    */
  @JSImport("googleapis", "tpu_v1.Tpu")
  @js.native
  class Tpu protected ()
    extends typings.googleapis.tpuV1Mod.tpuV1.Tpu {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
