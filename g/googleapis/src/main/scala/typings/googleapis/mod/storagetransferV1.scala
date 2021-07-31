package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storagetransferV1 {
  
  @JSImport("googleapis", "storagetransfer_v1.Resource$Googleserviceaccounts")
  @js.native
  class ResourceGoogleserviceaccounts protected ()
    extends typings.googleapis.storagetransferV1Mod.storagetransferV1.ResourceGoogleserviceaccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storagetransfer_v1.Resource$Transferjobs")
  @js.native
  class ResourceTransferjobs protected ()
    extends typings.googleapis.storagetransferV1Mod.storagetransferV1.ResourceTransferjobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storagetransfer_v1.Resource$Transferoperations")
  @js.native
  class ResourceTransferoperations protected ()
    extends typings.googleapis.storagetransferV1Mod.storagetransferV1.ResourceTransferoperations {
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
  @JSImport("googleapis", "storagetransfer_v1.Storagetransfer")
  @js.native
  class Storagetransfer protected ()
    extends typings.googleapis.storagetransferV1Mod.storagetransferV1.Storagetransfer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
