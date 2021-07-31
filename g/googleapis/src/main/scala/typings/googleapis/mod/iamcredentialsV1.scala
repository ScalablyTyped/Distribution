package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamcredentialsV1 {
  
  /**
    * IAM Service Account Credentials API
    *
    * Creates short-lived, limited-privilege credentials for IAM service
    * accounts.
    *
    * @example
    * const {google} = require('googleapis');
    * const iamcredentials = google.iamcredentials('v1');
    *
    * @namespace iamcredentials
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Iamcredentials
    */
  @JSImport("googleapis", "iamcredentials_v1.Iamcredentials")
  @js.native
  class Iamcredentials protected ()
    extends typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1.Iamcredentials {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "iamcredentials_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "iamcredentials_v1.Resource$Projects$Serviceaccounts")
  @js.native
  class ResourceProjectsServiceaccounts protected ()
    extends typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1.ResourceProjectsServiceaccounts {
    def this(context: APIRequestContext) = this()
  }
}
