package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Site Verification API
  *
  * Verifies ownership of websites or domains with Google.
  *
  * @example
  * const {google} = require('googleapis');
  * const siteVerification = google.siteVerification('v1');
  *
  * @namespace siteVerification
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Siteverification
  */
@JSImport("googleapis/build/src/apis/siteVerification/v1", "siteVerification_v1.Siteverification")
@js.native
class Siteverification protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var webResource: ResourceWebresource = js.native
}
