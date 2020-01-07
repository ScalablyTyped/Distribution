package typings.googleapis.googleapisMod.appengine_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App Engine Admin API
  *
  * Provisions and manages developers&#39; App Engine applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const appengine = google.appengine('v1');
  *
  * @namespace appengine
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Appengine
  */
@JSImport("googleapis", "appengine_v1.Appengine")
@js.native
class Appengine protected ()
  extends typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1.Appengine {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

