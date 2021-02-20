package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamV1 {
  
  /**
    * Identity and Access Management (IAM) API
    *
    * Manages identity and access control for Google Cloud Platform resources,
    * including the creation of service accounts, which you can use to
    * authenticate to Google and make API calls.
    *
    * @example
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
    *
    * @namespace iam
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Iam
    */
  @JSImport("googleapis", "iam_v1.Iam")
  @js.native
  class Iam protected ()
    extends typings.googleapis.iamV1Mod.iamV1.Iam {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Iampolicies")
  @js.native
  class ResourceIampolicies protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourceIampolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Organizations")
  @js.native
  class ResourceOrganizations protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourceOrganizations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Organizations$Roles")
  @js.native
  class ResourceOrganizationsRoles protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourceOrganizationsRoles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Permissions")
  @js.native
  class ResourcePermissions protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourcePermissions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Projects$Roles")
  @js.native
  class ResourceProjectsRoles protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourceProjectsRoles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Projects$Serviceaccounts")
  @js.native
  class ResourceProjectsServiceaccounts protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourceProjectsServiceaccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Projects$Serviceaccounts$Keys")
  @js.native
  class ResourceProjectsServiceaccountsKeys protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourceProjectsServiceaccountsKeys {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iam_v1.Resource$Roles")
  @js.native
  class ResourceRoles protected ()
    extends typings.googleapis.iamV1Mod.iamV1.ResourceRoles {
    def this(context: APIRequestContext) = this()
  }
}
