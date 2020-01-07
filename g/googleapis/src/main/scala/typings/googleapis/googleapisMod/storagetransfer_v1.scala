package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "storagetransfer_v1")
@js.native
object storagetransfer_v1 extends js.Object {
  @js.native
  class Resource$Googleserviceaccounts protected ()
    extends typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1.Resource$Googleserviceaccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Transferjobs protected ()
    extends typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1.Resource$Transferjobs {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Transferoperations protected ()
    extends typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1.Resource$Transferoperations {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Storage Transfer API
    *
    * Transfers data from external data sources to a Google Cloud Storage bucket
    * or between Google Cloud Storage buckets.
    *
    * @example
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
    *
    * @namespace storagetransfer
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Storagetransfer
    */
  @js.native
  class Storagetransfer protected ()
    extends typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1.Storagetransfer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

