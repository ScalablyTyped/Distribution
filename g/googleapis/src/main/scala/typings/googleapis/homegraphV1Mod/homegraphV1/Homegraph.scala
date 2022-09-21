package typings.googleapis.homegraphV1Mod.homegraphV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/homegraph/v1", "homegraph_v1.Homegraph")
@js.native
open class Homegraph protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var agentUsers: ResourceAgentusers = js.native
  
  var context: APIRequestContext = js.native
  
  var devices: ResourceDevices = js.native
}
