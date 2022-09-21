package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var assets: ResourceProjectsAssets = js.native
  
  var bigQueryExports: ResourceProjectsBigqueryexports = js.native
  
  var context: APIRequestContext = js.native
  
  var findings: ResourceProjectsFindings = js.native
  
  var muteConfigs: ResourceProjectsMuteconfigs = js.native
  
  var sources: ResourceProjectsSources = js.native
}
