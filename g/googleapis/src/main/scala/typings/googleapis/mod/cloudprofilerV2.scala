package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudprofilerV2 {
  
  /**
    * Stackdriver Profiler API
    *
    * Manages continuous profiling information.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudprofiler = google.cloudprofiler('v2');
    *
    * @namespace cloudprofiler
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Cloudprofiler
    */
  @JSImport("googleapis", "cloudprofiler_v2.Cloudprofiler")
  @js.native
  class Cloudprofiler protected ()
    extends typings.googleapis.cloudprofilerV2Mod.cloudprofilerV2.Cloudprofiler {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudprofiler_v2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.cloudprofilerV2Mod.cloudprofilerV2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudprofiler_v2.Resource$Projects$Profiles")
  @js.native
  class ResourceProjectsProfiles protected ()
    extends typings.googleapis.cloudprofilerV2Mod.cloudprofilerV2.ResourceProjectsProfiles {
    def this(context: APIRequestContext) = this()
  }
}
