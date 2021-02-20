package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudresourcemanagerV2 {
  
  /**
    * Cloud Resource Manager API
    *
    * Creates, reads, and updates metadata for Google Cloud Platform resource
    * containers.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v2');
    *
    * @namespace cloudresourcemanager
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Cloudresourcemanager
    */
  @JSImport("googleapis", "cloudresourcemanager_v2.Cloudresourcemanager")
  @js.native
  class Cloudresourcemanager protected ()
    extends typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2.Cloudresourcemanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudresourcemanager_v2.Resource$Folders")
  @js.native
  class ResourceFolders protected ()
    extends typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2.ResourceFolders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudresourcemanager_v2.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
}
