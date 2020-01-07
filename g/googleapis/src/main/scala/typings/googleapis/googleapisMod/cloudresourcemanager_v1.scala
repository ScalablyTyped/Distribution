package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "cloudresourcemanager_v1")
@js.native
object cloudresourcemanager_v1 extends js.Object {
  /**
    * Cloud Resource Manager API
    *
    * Creates, reads, and updates metadata for Google Cloud Platform resource
    * containers.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v1');
    *
    * @namespace cloudresourcemanager
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudresourcemanager
    */
  @js.native
  class Cloudresourcemanager protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1.Cloudresourcemanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Folders protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1.Resource$Folders {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Liens protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1.Resource$Liens {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Organizations protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1.Resource$Organizations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Projects protected ()
    extends typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1.Resource$Projects {
    def this(context: APIRequestContext) = this()
  }
  
}

