package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "identitytoolkit_v3")
@js.native
object identitytoolkit_v3 extends js.Object {
  /**
    * Google Identity Toolkit API
    *
    * Help the third party sites to implement federated login.
    *
    * @example
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * @namespace identitytoolkit
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Identitytoolkit
    */
  @js.native
  class Identitytoolkit protected ()
    extends typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3.Identitytoolkit {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Relyingparty protected ()
    extends typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3.Resource$Relyingparty {
    def this(context: APIRequestContext) = this()
  }
  
}

