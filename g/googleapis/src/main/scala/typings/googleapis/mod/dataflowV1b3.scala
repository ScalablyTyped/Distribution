package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataflowV1b3 {
  
  /**
    * Dataflow API
    *
    * Manages Google Cloud Dataflow projects on Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * @namespace dataflow
    * @type {Function}
    * @version v1b3
    * @variation v1b3
    * @param {object=} options Options for Dataflow
    */
  @JSImport("googleapis", "dataflow_v1b3.Dataflow")
  @js.native
  class Dataflow protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.Dataflow {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Jobs")
  @js.native
  class ResourceProjectsJobs protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Jobs$Debug")
  @js.native
  class ResourceProjectsJobsDebug protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsJobsDebug {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Jobs$Messages")
  @js.native
  class ResourceProjectsJobsMessages protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsJobsMessages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Jobs$Workitems")
  @js.native
  class ResourceProjectsJobsWorkitems protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsJobsWorkitems {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Locations$Jobs")
  @js.native
  class ResourceProjectsLocationsJobs protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Debug")
  @js.native
  class ResourceProjectsLocationsJobsDebug protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobsDebug {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Messages")
  @js.native
  class ResourceProjectsLocationsJobsMessages protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobsMessages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Workitems")
  @js.native
  class ResourceProjectsLocationsJobsWorkitems protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobsWorkitems {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Locations$Templates")
  @js.native
  class ResourceProjectsLocationsTemplates protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsTemplates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataflow_v1b3.Resource$Projects$Templates")
  @js.native
  class ResourceProjectsTemplates protected ()
    extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsTemplates {
    def this(context: APIRequestContext) = this()
  }
}
