package typings.googleapis.mod.siteVerificationV1

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
@JSImport("googleapis", "siteVerification_v1.Siteverification")
@js.native
class Siteverification protected ()
  extends typings.googleapis.siteVerificationV1Mod.siteVerificationV1.Siteverification {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
