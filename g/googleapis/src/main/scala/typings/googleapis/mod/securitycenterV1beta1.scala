package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securitycenterV1beta1 {
  
  @JSImport("googleapis", "securitycenter_v1beta1.Resource$Organizations")
  @js.native
  class ResourceOrganizations protected ()
    extends typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1.ResourceOrganizations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "securitycenter_v1beta1.Resource$Organizations$Assets")
  @js.native
  class ResourceOrganizationsAssets protected ()
    extends typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1.ResourceOrganizationsAssets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "securitycenter_v1beta1.Resource$Organizations$Operations")
  @js.native
  class ResourceOrganizationsOperations protected ()
    extends typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1.ResourceOrganizationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "securitycenter_v1beta1.Resource$Organizations$Sources")
  @js.native
  class ResourceOrganizationsSources protected ()
    extends typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1.ResourceOrganizationsSources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "securitycenter_v1beta1.Resource$Organizations$Sources$Findings")
  @js.native
  class ResourceOrganizationsSourcesFindings protected ()
    extends typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1.ResourceOrganizationsSourcesFindings {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Security Command Center API
    *
    * Cloud Security Command Center API provides access to temporal views of
    * assets and findings within an organization.
    *
    * @example
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
    *
    * @namespace securitycenter
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Securitycenter
    */
  @JSImport("googleapis", "securitycenter_v1beta1.Securitycenter")
  @js.native
  class Securitycenter protected ()
    extends typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1.Securitycenter {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
