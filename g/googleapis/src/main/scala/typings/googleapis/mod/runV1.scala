package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runV1 {
  
  @JSImport("googleapis", "run_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.runV1Mod.runV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.runV1Mod.runV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Run API
    *
    * Deploy and manage user provided container images that scale automatically
    * based on HTTP traffic.
    *
    * @example
    * const {google} = require('googleapis');
    * const run = google.run('v1');
    *
    * @namespace run
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Run
    */
  @JSImport("googleapis", "run_v1.Run")
  @js.native
  class Run protected ()
    extends typings.googleapis.runV1Mod.runV1.Run {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
