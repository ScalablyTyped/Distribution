package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentV2 {
  
  /**
    * Content API for Shopping
    *
    * Manages product items, inventory, and Merchant Center accounts for Google
    * Shopping.
    *
    * @example
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * @namespace content
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Content
    */
  @JSImport("googleapis", "content_v2.Content")
  @js.native
  class Content protected ()
    extends typings.googleapis.contentV2Mod.contentV2.Content {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Accountstatuses")
  @js.native
  class ResourceAccountstatuses protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceAccountstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Accounttax")
  @js.native
  class ResourceAccounttax protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceAccounttax {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Datafeeds")
  @js.native
  class ResourceDatafeeds protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceDatafeeds {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Datafeedstatuses")
  @js.native
  class ResourceDatafeedstatuses protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceDatafeedstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Inventory")
  @js.native
  class ResourceInventory protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceInventory {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Liasettings")
  @js.native
  class ResourceLiasettings protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceLiasettings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Orderinvoices")
  @js.native
  class ResourceOrderinvoices protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceOrderinvoices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Orderpayments")
  @js.native
  class ResourceOrderpayments protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceOrderpayments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Orderreports")
  @js.native
  class ResourceOrderreports protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceOrderreports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Orderreturns")
  @js.native
  class ResourceOrderreturns protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceOrderreturns {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Orders")
  @js.native
  class ResourceOrders protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceOrders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Pos")
  @js.native
  class ResourcePos protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourcePos {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Products")
  @js.native
  class ResourceProducts protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceProducts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Productstatuses")
  @js.native
  class ResourceProductstatuses protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceProductstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2.Resource$Shippingsettings")
  @js.native
  class ResourceShippingsettings protected ()
    extends typings.googleapis.contentV2Mod.contentV2.ResourceShippingsettings {
    def this(context: APIRequestContext) = this()
  }
}
