package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudresourcemanagerV1beta1 {
  
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
  @JSImport("googleapis", "cloudresourcemanager_v1beta1.Cloudresourcemanager")
  @js.native
  class Cloudresourcemanager protected ()
    extends typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1.Cloudresourcemanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudresourcemanager_v1beta1.Resource$Organizations")
  @js.native
  class ResourceOrganizations protected ()
    extends typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1.ResourceOrganizations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudresourcemanager_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
}
