package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homegraphV1 {
  
  @JSImport("googleapis", "homegraph_v1.Homegraph")
  @js.native
  open class Homegraph protected ()
    extends typings.googleapis.homegraphV1Mod.homegraphV1.Homegraph {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "homegraph_v1.Resource$Agentusers")
  @js.native
  open class ResourceAgentusers protected ()
    extends typings.googleapis.homegraphV1Mod.homegraphV1.ResourceAgentusers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "homegraph_v1.Resource$Devices")
  @js.native
  open class ResourceDevices protected ()
    extends typings.googleapis.homegraphV1Mod.homegraphV1.ResourceDevices {
    def this(context: APIRequestContext) = this()
  }
}
