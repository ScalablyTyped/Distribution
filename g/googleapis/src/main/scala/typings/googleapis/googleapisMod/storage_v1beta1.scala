package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "storage_v1beta1")
@js.native
object storage_v1beta1 extends js.Object {
  @js.native
  class Resource$Bucketaccesscontrols protected ()
    extends typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1.Resource$Bucketaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Buckets protected ()
    extends typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1.Resource$Buckets {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Objectaccesscontrols protected ()
    extends typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1.Resource$Objectaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Objects protected ()
    extends typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1.Resource$Objects {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Storage JSON API
    *
    * Lets you store and retrieve potentially-large, immutable data objects.
    *
    * @example
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta1');
    *
    * @namespace storage
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Storage
    */
  @js.native
  class Storage protected ()
    extends typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1.Storage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

