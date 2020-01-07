package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "safebrowsing_v4")
@js.native
object safebrowsing_v4 extends js.Object {
  @js.native
  class Resource$Encodedfullhashes protected ()
    extends typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4.Resource$Encodedfullhashes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Encodedupdates protected ()
    extends typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4.Resource$Encodedupdates {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Fullhashes protected ()
    extends typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4.Resource$Fullhashes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Threathits protected ()
    extends typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4.Resource$Threathits {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Threatlists protected ()
    extends typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4.Resource$Threatlists {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Threatlistupdates protected ()
    extends typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4.Resource$Threatlistupdates {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Threatmatches protected ()
    extends typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4.Resource$Threatmatches {
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
  @js.native
  class Safebrowsing protected ()
    extends typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4.Safebrowsing {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

