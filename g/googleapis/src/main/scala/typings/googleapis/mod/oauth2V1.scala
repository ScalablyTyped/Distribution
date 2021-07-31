package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth2V1 {
  
  /**
    * Google OAuth2 API
    *
    * Obtains end-user authorization grants for use with other Google APIs.
    *
    * @example
    * const {google} = require('googleapis');
    * const oauth2 = google.oauth2('v1');
    *
    * @namespace oauth2
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Oauth2
    */
  @JSImport("googleapis", "oauth2_v1.Oauth2")
  @js.native
  class Oauth2 protected ()
    extends typings.googleapis.oauth2V1Mod.oauth2V1.Oauth2 {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "oauth2_v1.Resource$Userinfo")
  @js.native
  class ResourceUserinfo protected ()
    extends typings.googleapis.oauth2V1Mod.oauth2V1.ResourceUserinfo {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oauth2_v1.Resource$Userinfo$V2")
  @js.native
  class ResourceUserinfoV2 protected ()
    extends typings.googleapis.oauth2V1Mod.oauth2V1.ResourceUserinfoV2 {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oauth2_v1.Resource$Userinfo$V2$Me")
  @js.native
  class ResourceUserinfoV2Me protected ()
    extends typings.googleapis.oauth2V1Mod.oauth2V1.ResourceUserinfoV2Me {
    def this(context: APIRequestContext) = this()
  }
}
