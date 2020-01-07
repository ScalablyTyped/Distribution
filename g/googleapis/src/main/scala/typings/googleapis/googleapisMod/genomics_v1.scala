package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "genomics_v1")
@js.native
object genomics_v1 extends js.Object {
  /**
    * Genomics API
    *
    * Uploads, processes, queries, and searches Genomics data in the cloud.
    *
    * @example
    * const {google} = require('googleapis');
    * const genomics = google.genomics('v1');
    *
    * @namespace genomics
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Genomics
    */
  @js.native
  class Genomics protected ()
    extends typings.googleapis.buildSrcApisGenomicsV1Mod.genomics_v1.Genomics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisGenomicsV1Mod.genomics_v1.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
}

