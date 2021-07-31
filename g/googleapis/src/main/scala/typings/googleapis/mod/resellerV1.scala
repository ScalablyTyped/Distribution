package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resellerV1 {
  
  /**
    * Enterprise Apps Reseller API
    *
    * Creates and manages your customers and their subscriptions.
    *
    * @example
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * @namespace reseller
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Reseller
    */
  @JSImport("googleapis", "reseller_v1.Reseller")
  @js.native
  class Reseller protected ()
    extends typings.googleapis.resellerV1Mod.resellerV1.Reseller {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "reseller_v1.Resource$Customers")
  @js.native
  class ResourceCustomers protected ()
    extends typings.googleapis.resellerV1Mod.resellerV1.ResourceCustomers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "reseller_v1.Resource$Resellernotify")
  @js.native
  class ResourceResellernotify protected ()
    extends typings.googleapis.resellerV1Mod.resellerV1.ResourceResellernotify {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "reseller_v1.Resource$Subscriptions")
  @js.native
  class ResourceSubscriptions protected ()
    extends typings.googleapis.resellerV1Mod.resellerV1.ResourceSubscriptions {
    def this(context: APIRequestContext) = this()
  }
}
