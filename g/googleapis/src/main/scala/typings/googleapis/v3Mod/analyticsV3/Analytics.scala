package typings.googleapis.v3Mod.analyticsV3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Analytics")
@js.native
open class Analytics protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var data: ResourceData = js.native
  
  var management: ResourceManagement = js.native
  
  var metadata: ResourceMetadata = js.native
  
  var provisioning: ResourceProvisioning = js.native
  
  var userDeletion: ResourceUserdeletion = js.native
}
