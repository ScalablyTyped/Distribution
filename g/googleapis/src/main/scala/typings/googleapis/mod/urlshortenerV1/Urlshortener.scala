package typings.googleapis.mod.urlshortenerV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * URL Shortener API
  *
  * Lets you create, inspect, and manage goo.gl short URLs
  *
  * @example
  * const {google} = require('googleapis');
  * const urlshortener = google.urlshortener('v1');
  *
  * @namespace urlshortener
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Urlshortener
  */
@JSImport("googleapis", "urlshortener_v1.Urlshortener")
@js.native
class Urlshortener protected ()
  extends typings.googleapis.urlshortenerV1Mod.urlshortenerV1.Urlshortener {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
