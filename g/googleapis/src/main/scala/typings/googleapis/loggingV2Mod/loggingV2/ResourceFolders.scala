package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Folders")
@js.native
class ResourceFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var exclusions: ResourceFoldersExclusions = js.native
  
  var logs: ResourceFoldersLogs = js.native
  
  var sinks: ResourceFoldersSinks = js.native
}
