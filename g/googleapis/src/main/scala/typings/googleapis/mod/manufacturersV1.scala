package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manufacturersV1 {
  
  /**
    * Manufacturer Center API
    *
    * Public API for managing Manufacturer Center related data.
    *
    * @example
    * const {google} = require('googleapis');
    * const manufacturers = google.manufacturers('v1');
    *
    * @namespace manufacturers
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Manufacturers
    */
  @JSImport("googleapis", "manufacturers_v1.Manufacturers")
  @js.native
  class Manufacturers protected ()
    extends typings.googleapis.manufacturersV1Mod.manufacturersV1.Manufacturers {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "manufacturers_v1.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typings.googleapis.manufacturersV1Mod.manufacturersV1.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "manufacturers_v1.Resource$Accounts$Products")
  @js.native
  class ResourceAccountsProducts protected ()
    extends typings.googleapis.manufacturersV1Mod.manufacturersV1.ResourceAccountsProducts {
    def this(context: APIRequestContext) = this()
  }
}
