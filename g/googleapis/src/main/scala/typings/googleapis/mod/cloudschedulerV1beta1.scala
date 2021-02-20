package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudschedulerV1beta1 {
  
  /**
    * Cloud Scheduler API
    *
    * Creates and manages jobs run on a regular recurring schedule.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudscheduler = google.cloudscheduler('v1beta1');
    *
    * @namespace cloudscheduler
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Cloudscheduler
    */
  @JSImport("googleapis", "cloudscheduler_v1beta1.Cloudscheduler")
  @js.native
  class Cloudscheduler protected ()
    extends typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1.Cloudscheduler {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudscheduler_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudscheduler_v1beta1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudscheduler_v1beta1.Resource$Projects$Locations$Jobs")
  @js.native
  class ResourceProjectsLocationsJobs protected ()
    extends typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1.ResourceProjectsLocationsJobs {
    def this(context: APIRequestContext) = this()
  }
}
