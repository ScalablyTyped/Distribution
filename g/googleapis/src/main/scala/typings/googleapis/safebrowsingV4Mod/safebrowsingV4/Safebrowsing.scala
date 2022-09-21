package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Safebrowsing")
@js.native
open class Safebrowsing protected () extends StObject {
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
