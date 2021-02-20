package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Projects")
@js.native
class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var exclusions: ResourceProjectsExclusions = js.native
  
  var logs: ResourceProjectsLogs = js.native
  
  var metrics: ResourceProjectsMetrics = js.native
  
  var sinks: ResourceProjectsSinks = js.native
}
