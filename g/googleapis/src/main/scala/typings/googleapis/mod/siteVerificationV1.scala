package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteVerificationV1 {
  
  @JSImport("googleapis", "siteVerification_v1.Resource$Webresource")
  @js.native
  open class ResourceWebresource protected ()
    extends typings.googleapis.siteVerificationV1Mod.siteVerificationV1.ResourceWebresource {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "siteVerification_v1.Siteverification")
  @js.native
  open class Siteverification protected ()
    extends typings.googleapis.siteVerificationV1Mod.siteVerificationV1.Siteverification {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
