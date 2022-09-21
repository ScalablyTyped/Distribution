package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iapV1beta1 {
  
  @JSImport("googleapis", "iap_v1beta1.Iap")
  @js.native
  open class Iap protected ()
    extends typings.googleapis.iapV1beta1Mod.iapV1beta1.Iap {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "iap_v1beta1.Resource$V1beta1")
  @js.native
  open class ResourceV1beta1 protected ()
    extends typings.googleapis.iapV1beta1Mod.iapV1beta1.ResourceV1beta1 {
    def this(context: APIRequestContext) = this()
  }
}
