package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidpublisherV11 {
  
  /**
    * Google Play Developer API
    *
    * Accesses Android application developers&#39; Google Play accounts.
    *
    * @example
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v1.1');
    *
    * @namespace androidpublisher
    * @type {Function}
    * @version v1.1
    * @variation v1.1
    * @param {object=} options Options for Androidpublisher
    */
  @JSImport("googleapis", "androidpublisher_v1_1.Androidpublisher")
  @js.native
  class Androidpublisher protected ()
    extends typings.googleapis.v11Mod.androidpublisherV11.Androidpublisher {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "androidpublisher_v1_1.Resource$Inapppurchases")
  @js.native
  class ResourceInapppurchases protected ()
    extends typings.googleapis.v11Mod.androidpublisherV11.ResourceInapppurchases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidpublisher_v1_1.Resource$Purchases")
  @js.native
  class ResourcePurchases protected ()
    extends typings.googleapis.v11Mod.androidpublisherV11.ResourcePurchases {
    def this(context: APIRequestContext) = this()
  }
}
