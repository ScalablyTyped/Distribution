package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osloginV1alpha {
  
  /**
    * Cloud OS Login API
    *
    * Manages OS login configuration for Google account users.
    *
    * @example
    * const {google} = require('googleapis');
    * const oslogin = google.oslogin('v1alpha');
    *
    * @namespace oslogin
    * @type {Function}
    * @version v1alpha
    * @variation v1alpha
    * @param {object=} options Options for Oslogin
    */
  @JSImport("googleapis", "oslogin_v1alpha.Oslogin")
  @js.native
  class Oslogin protected ()
    extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1alpha.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1alpha.Resource$Users$Projects")
  @js.native
  class ResourceUsersProjects protected ()
    extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.ResourceUsersProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "oslogin_v1alpha.Resource$Users$Sshpublickeys")
  @js.native
  class ResourceUsersSshpublickeys protected ()
    extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.ResourceUsersSshpublickeys {
    def this(context: APIRequestContext) = this()
  }
}
