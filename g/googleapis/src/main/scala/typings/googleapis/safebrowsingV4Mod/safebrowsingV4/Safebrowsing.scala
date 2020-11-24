package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.googleapisCommon.apiMod.APIRequestContext
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
@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Safebrowsing")
@js.native
class Safebrowsing protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var encodedFullHashes: ResourceEncodedfullhashes = js.native
  
  var encodedUpdates: ResourceEncodedupdates = js.native
  
  var fullHashes: ResourceFullhashes = js.native
  
  var threatHits: ResourceThreathits = js.native
  
  var threatListUpdates: ResourceThreatlistupdates = js.native
  
  var threatLists: ResourceThreatlists = js.native
  
  var threatMatches: ResourceThreatmatches = js.native
}
