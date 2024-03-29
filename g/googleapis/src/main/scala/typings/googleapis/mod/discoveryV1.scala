package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoveryV1 {
  
  @JSImport("googleapis", "discovery_v1.Discovery")
  @js.native
  open class Discovery protected ()
    extends typings.googleapis.discoveryV1Mod.discoveryV1.Discovery {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "discovery_v1.Resource$Apis")
  @js.native
  open class ResourceApis protected ()
    extends typings.googleapis.discoveryV1Mod.discoveryV1.ResourceApis {
    def this(context: APIRequestContext) = this()
  }
}
