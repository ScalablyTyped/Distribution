package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "content_v2")
@js.native
object content_v2 extends js.Object {
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
  @js.native
  class Content protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Content {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Accounts protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Accounts {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Accountstatuses protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Accountstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Accounttax protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Accounttax {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Datafeeds protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Datafeeds {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Datafeedstatuses protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Datafeedstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Inventory protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Inventory {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Liasettings protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Liasettings {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Orderinvoices protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Orderinvoices {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Orderpayments protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Orderpayments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Orderreports protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Orderreports {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Orderreturns protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Orderreturns {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Orders protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Orders {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Pos protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Pos {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Products protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Products {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Productstatuses protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Productstatuses {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Shippingsettings protected ()
    extends typings.googleapis.buildSrcApisContentV2Mod.content_v2.Resource$Shippingsettings {
    def this(context: APIRequestContext) = this()
  }
  
}

