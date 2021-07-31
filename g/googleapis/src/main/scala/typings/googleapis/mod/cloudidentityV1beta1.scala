package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudidentityV1beta1 {
  
  /**
    * Cloud Identity API
    *
    * API for provisioning and managing identity resources.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudidentity = google.cloudidentity('v1beta1');
    *
    * @namespace cloudidentity
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Cloudidentity
    */
  @JSImport("googleapis", "cloudidentity_v1beta1.Cloudidentity")
  @js.native
  class Cloudidentity protected ()
    extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudidentity_v1beta1.Resource$Groups")
  @js.native
  class ResourceGroups protected ()
    extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceGroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudidentity_v1beta1.Resource$Groups$Memberships")
  @js.native
  class ResourceGroupsMemberships protected ()
    extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceGroupsMemberships {
    def this(context: APIRequestContext) = this()
  }
}
