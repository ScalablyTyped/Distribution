package typings.googleapis.mod.identitytoolkitV3

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

