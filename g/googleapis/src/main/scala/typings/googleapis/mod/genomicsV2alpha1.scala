package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genomicsV2alpha1 {
  
  /**
    * Genomics API
    *
    * Uploads, processes, queries, and searches Genomics data in the cloud.
    *
    * @example
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v2alpha1');
    *
    * @namespace genomics
    * @type {Function}
    * @version v2alpha1
    * @variation v2alpha1
    * @param {object=} options Options for Genomics
    */
  @JSImport("googleapis", "genomics_v2alpha1.Genomics")
  @js.native
  class Genomics protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Pipelines")
  @js.native
  class ResourcePipelines protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourcePipelines {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Workers")
  @js.native
  class ResourceWorkers protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceWorkers {
    def this(context: APIRequestContext) = this()
  }
}
