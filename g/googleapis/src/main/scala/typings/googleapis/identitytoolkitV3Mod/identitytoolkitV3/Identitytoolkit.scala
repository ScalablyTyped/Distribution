package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/identitytoolkit/v3", "identitytoolkit_v3.Identitytoolkit")
@js.native
class Identitytoolkit protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var relyingparty: ResourceRelyingparty = js.native
}
