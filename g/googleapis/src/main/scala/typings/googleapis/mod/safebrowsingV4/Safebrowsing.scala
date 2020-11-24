package typings.googleapis.mod.safebrowsingV4

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Safe Browsing API
  *
  * Enables client applications to check web resources (most commonly URLs)
  * against Google-generated lists of unsafe web resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const safebrowsing = google.safebrowsing('v4');
  *
  * @namespace safebrowsing
  * @type {Function}
  * @version v4
  * @variation v4
  * @param {object=} options Options for Safebrowsing
  */
@JSImport("googleapis", "safebrowsing_v4.Safebrowsing")
@js.native
class Safebrowsing protected ()
  extends typings.googleapis.safebrowsingV4Mod.safebrowsingV4.Safebrowsing {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
