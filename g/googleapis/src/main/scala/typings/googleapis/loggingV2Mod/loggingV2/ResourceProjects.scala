package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleapisCommon.apiMod.APIRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var exclusions: ResourceProjectsExclusions = js.native
  var logs: ResourceProjectsLogs = js.native
  var metrics: ResourceProjectsMetrics = js.native
  var sinks: ResourceProjectsSinks = js.native
}

