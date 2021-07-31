package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentV21 {
  
  /**
    * Content API for Shopping
    *
    * Manages product items, inventory, and Merchant Center accounts for Google
    * Shopping.
    *
    * @example
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * @namespace content
    * @type {Function}
    * @version v2.1
    * @variation v2.1
    * @param {object=} options Options for Content
    */
  @JSImport("googleapis", "content_v2_1.Content")
  @js.native
  class Content protected ()
    extends typings.googleapis.v21Mod.contentV21.Content {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Accountstatuses")
  @js.native
  class ResourceAccountstatuses protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceAccountstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Accounttax")
  @js.native
  class ResourceAccounttax protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceAccounttax {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Datafeeds")
  @js.native
  class ResourceDatafeeds protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceDatafeeds {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Datafeedstatuses")
  @js.native
  class ResourceDatafeedstatuses protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceDatafeedstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Liasettings")
  @js.native
  class ResourceLiasettings protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceLiasettings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Orderinvoices")
  @js.native
  class ResourceOrderinvoices protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceOrderinvoices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Orderreports")
  @js.native
  class ResourceOrderreports protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceOrderreports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Orderreturns")
  @js.native
  class ResourceOrderreturns protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceOrderreturns {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Orders")
  @js.native
  class ResourceOrders protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceOrders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Pos")
  @js.native
  class ResourcePos protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourcePos {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Products")
  @js.native
  class ResourceProducts protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceProducts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Productstatuses")
  @js.native
  class ResourceProductstatuses protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceProductstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Regionalinventory")
  @js.native
  class ResourceRegionalinventory protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceRegionalinventory {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "content_v2_1.Resource$Shippingsettings")
  @js.native
  class ResourceShippingsettings protected ()
    extends typings.googleapis.v21Mod.contentV21.ResourceShippingsettings {
    def this(context: APIRequestContext) = this()
  }
}
