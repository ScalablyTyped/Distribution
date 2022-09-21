package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Folders")
@js.native
open class ResourceFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var assets: ResourceFoldersAssets = js.native
  
  var bigQueryExports: ResourceFoldersBigqueryexports = js.native
  
  var context: APIRequestContext = js.native
  
  var findings: ResourceFoldersFindings = js.native
  
  var muteConfigs: ResourceFoldersMuteconfigs = js.native
  
  var sources: ResourceFoldersSources = js.native
}
