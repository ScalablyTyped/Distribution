package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trafficdirectorV2 {
  
  @JSImport("googleapis", "trafficdirector_v2.Resource$Discovery")
  @js.native
  open class ResourceDiscovery protected ()
    extends typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2.ResourceDiscovery {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "trafficdirector_v2.Trafficdirector")
  @js.native
  open class Trafficdirector protected ()
    extends typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2.Trafficdirector {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
