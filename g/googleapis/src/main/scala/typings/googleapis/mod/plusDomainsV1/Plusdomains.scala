package typings.googleapis.mod.plusDomainsV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google+ Domains API
  *
  * Builds on top of the Google+ platform for Google Apps Domains.
  *
  * @example
  * const {google} = require('googleapis');
  * const plusDomains = google.plusDomains('v1');
  *
  * @namespace plusDomains
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Plusdomains
  */
@JSImport("googleapis", "plusDomains_v1.Plusdomains")
@js.native
class Plusdomains protected ()
  extends typings.googleapis.plusDomainsV1Mod.plusDomainsV1.Plusdomains {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
