package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osloginV1 {
  
  /**
    * Cloud OS Login API
    *
    * Manages OS login configuration for Google account users.
    *
    * @example
    * const {google} = require('googleapis');
    * const oslogin = google.oslogin('v1');
    *
    * @namespace oslogin
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Oslogin
    */
  @JSImport("googleapis", "oslogin_v1.Oslogin")
  @js.native
  class Oslogin protected ()
    extends typings.googleapis.osloginV1Mod.osloginV1.Oslogin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1.Resource$Users$Projects")
  @js.native
  class ResourceUsersProjects protected ()
    extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsersProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1.Resource$Users$Sshpublickeys")
  @js.native
  class ResourceUsersSshpublickeys protected ()
    extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsersSshpublickeys {
    def this(context: APIRequestContext) = this()
  }
}
