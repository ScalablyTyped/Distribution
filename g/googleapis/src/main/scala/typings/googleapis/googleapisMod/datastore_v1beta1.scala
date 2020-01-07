package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "datastore_v1beta1")
@js.native
object datastore_v1beta1 extends js.Object {
  /**
    * Cloud Datastore API
    *
    * Accesses the schemaless NoSQL database to provide fully managed, robust,
    * scalable storage for your application.
    *
    * @example
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1beta1');
    *
    * @namespace datastore
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Datastore
    */
  @js.native
  class Datastore protected ()
    extends typings.googleapis.buildSrcApisDatastoreV1beta1Mod.datastore_v1beta1.Datastore {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Projects protected ()
    extends typings.googleapis.buildSrcApisDatastoreV1beta1Mod.datastore_v1beta1.Resource$Projects {
    def this(context: APIRequestContext) = this()
  }
  
}

