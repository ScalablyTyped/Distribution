package typings.googleapis.googleapisMod.oauth2_v2

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google OAuth2 API
  *
  * Obtains end-user authorization grants for use with other Google APIs.
  *
  * @example
  * const {google} = require('googleapis');
  * const oauth2 = google.oauth2('v2');
  *
  * @namespace oauth2
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Oauth2
  */
@JSImport("googleapis", "oauth2_v2.Oauth2")
@js.native
class Oauth2 protected ()
  extends typings.googleapis.buildSrcApisOauth2V2Mod.oauth2_v2.Oauth2 {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

