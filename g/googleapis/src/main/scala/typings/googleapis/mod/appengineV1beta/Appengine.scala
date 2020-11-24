package typings.googleapis.mod.appengineV1beta

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App Engine Admin API
  *
  * Provisions and manages developers&#39; App Engine applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const appengine = google.appengine('v1beta');
  *
  * @namespace appengine
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Appengine
  */
@JSImport("googleapis", "appengine_v1beta.Appengine")
@js.native
class Appengine protected ()
  extends typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
