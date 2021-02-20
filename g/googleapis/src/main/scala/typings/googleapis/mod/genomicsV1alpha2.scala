package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genomicsV1alpha2 {
  
  /**
    * Genomics API
    *
    * Uploads, processes, queries, and searches Genomics data in the cloud.
    *
    * @example
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1alpha2');
    *
    * @namespace genomics
    * @type {Function}
    * @version v1alpha2
    * @variation v1alpha2
    * @param {object=} options Options for Genomics
    */
  @JSImport("googleapis", "genomics_v1alpha2.Genomics")
  @js.native
  class Genomics protected ()
    extends typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "genomics_v1alpha2.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.v1alpha2Mod.genomicsV1alpha2.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "genomics_v1alpha2.Resource$Pipelines")
  @js.native
  class ResourcePipelines protected ()
    extends typings.googleapis.v1alpha2Mod.genomicsV1alpha2.ResourcePipelines {
    def this(context: APIRequestContext) = this()
  }
}
