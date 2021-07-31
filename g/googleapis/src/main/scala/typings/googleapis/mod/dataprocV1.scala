package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataprocV1 {
  
  /**
    * Cloud Dataproc API
    *
    * Manages Hadoop-based clusters and jobs on Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
    *
    * @namespace dataproc
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Dataproc
    */
  @JSImport("googleapis", "dataproc_v1.Dataproc")
  @js.native
  class Dataproc protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.Dataproc {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1.Resource$Projects$Locations$Workflowtemplates")
  @js.native
  class ResourceProjectsLocationsWorkflowtemplates protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.ResourceProjectsLocationsWorkflowtemplates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1.Resource$Projects$Regions")
  @js.native
  class ResourceProjectsRegions protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.ResourceProjectsRegions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1.Resource$Projects$Regions$Clusters")
  @js.native
  class ResourceProjectsRegionsClusters protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.ResourceProjectsRegionsClusters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1.Resource$Projects$Regions$Jobs")
  @js.native
  class ResourceProjectsRegionsJobs protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.ResourceProjectsRegionsJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1.Resource$Projects$Regions$Operations")
  @js.native
  class ResourceProjectsRegionsOperations protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.ResourceProjectsRegionsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dataproc_v1.Resource$Projects$Regions$Workflowtemplates")
  @js.native
  class ResourceProjectsRegionsWorkflowtemplates protected ()
    extends typings.googleapis.dataprocV1Mod.dataprocV1.ResourceProjectsRegionsWorkflowtemplates {
    def this(context: APIRequestContext) = this()
  }
}
