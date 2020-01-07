package typings.googleapis.googleapisMod.oslogin_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
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
  extends typings.googleapis.buildSrcApisOsloginV1Mod.oslogin_v1.Oslogin {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

