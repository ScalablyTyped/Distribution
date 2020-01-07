package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "genomics_v1alpha2")
@js.native
object genomics_v1alpha2 extends js.Object {
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
  @js.native
  class Genomics protected ()
    extends typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2.Genomics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Pipelines protected ()
    extends typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2.Resource$Pipelines {
    def this(context: APIRequestContext) = this()
  }
  
}

