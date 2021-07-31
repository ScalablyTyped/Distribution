package typings.googleapis.osloginV1Mod.osloginV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/oslogin/v1", "oslogin_v1.Oslogin")
@js.native
class Oslogin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var users: ResourceUsers = js.native
}
