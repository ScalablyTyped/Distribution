package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identitytoolkitV3 {
  
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
  @JSImport("googleapis", "identitytoolkit_v3.Identitytoolkit")
  @js.native
  class Identitytoolkit protected ()
    extends typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "identitytoolkit_v3.Resource$Relyingparty")
  @js.native
  class ResourceRelyingparty protected ()
    extends typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.ResourceRelyingparty {
    def this(context: APIRequestContext) = this()
  }
}
