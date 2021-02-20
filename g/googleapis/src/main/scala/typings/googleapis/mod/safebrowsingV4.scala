package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safebrowsingV4 {
  
  @JSImport("googleapis", "safebrowsing_v4.Resource$Encodedfullhashes")
  @js.native
  class ResourceEncodedfullhashes protected ()
    extends typings.googleapis.safebrowsingV4Mod.safebrowsingV4.ResourceEncodedfullhashes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "safebrowsing_v4.Resource$Encodedupdates")
  @js.native
  class ResourceEncodedupdates protected ()
    extends typings.googleapis.safebrowsingV4Mod.safebrowsingV4.ResourceEncodedupdates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "safebrowsing_v4.Resource$Fullhashes")
  @js.native
  class ResourceFullhashes protected ()
    extends typings.googleapis.safebrowsingV4Mod.safebrowsingV4.ResourceFullhashes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "safebrowsing_v4.Resource$Threathits")
  @js.native
  class ResourceThreathits protected ()
    extends typings.googleapis.safebrowsingV4Mod.safebrowsingV4.ResourceThreathits {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "safebrowsing_v4.Resource$Threatlists")
  @js.native
  class ResourceThreatlists protected ()
    extends typings.googleapis.safebrowsingV4Mod.safebrowsingV4.ResourceThreatlists {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "safebrowsing_v4.Resource$Threatlistupdates")
  @js.native
  class ResourceThreatlistupdates protected ()
    extends typings.googleapis.safebrowsingV4Mod.safebrowsingV4.ResourceThreatlistupdates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "safebrowsing_v4.Resource$Threatmatches")
  @js.native
  class ResourceThreatmatches protected ()
    extends typings.googleapis.safebrowsingV4Mod.safebrowsingV4.ResourceThreatmatches {
    def this(context: APIRequestContext) = this()
  }
  
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
}
