package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "cloudresourcemanager_v1beta1")
@js.native
object cloudresourcemanager_v1beta1 extends js.Object {
  /**
    * Cloud Resource Manager API
    *
    * Creates, reads, and updates metadata for Google Cloud Platform resource
    * containers.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v1beta1');
    *
    * @namespace cloudresourcemanager
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Cloudresourcemanager
    */
  @js.native
  class Cloudresourcemanager protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1.Cloudresourcemanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Organizations protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1.Resource$Organizations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Projects protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1.Resource$Projects {
    def this(context: APIRequestContext) = this()
  }
  
}

