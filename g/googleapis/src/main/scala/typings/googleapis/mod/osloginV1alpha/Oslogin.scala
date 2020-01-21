package typings.googleapis.mod.osloginV1alpha

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

