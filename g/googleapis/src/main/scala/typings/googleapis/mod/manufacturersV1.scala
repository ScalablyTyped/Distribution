package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manufacturersV1 {
  
  @JSImport("googleapis", "manufacturers_v1.Manufacturers")
  @js.native
  open class Manufacturers protected ()
    extends typings.googleapis.manufacturersV1Mod.manufacturersV1.Manufacturers {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "manufacturers_v1.Resource$Accounts")
  @js.native
  open class ResourceAccounts protected ()
    extends typings.googleapis.manufacturersV1Mod.manufacturersV1.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "manufacturers_v1.Resource$Accounts$Products")
  @js.native
  open class ResourceAccountsProducts protected ()
    extends typings.googleapis.manufacturersV1Mod.manufacturersV1.ResourceAccountsProducts {
    def this(context: APIRequestContext) = this()
  }
}
