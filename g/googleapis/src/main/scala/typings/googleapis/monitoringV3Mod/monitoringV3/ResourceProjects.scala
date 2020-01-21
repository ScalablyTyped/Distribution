package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleapisCommon.apiMod.APIRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var alertPolicies: ResourceProjectsAlertpolicies = js.native
  var collectdTimeSeries: ResourceProjectsCollectdtimeseries = js.native
  var context: APIRequestContext = js.native
  var groups: ResourceProjectsGroups = js.native
  var metricDescriptors: ResourceProjectsMetricdescriptors = js.native
  var monitoredResourceDescriptors: ResourceProjectsMonitoredresourcedescriptors = js.native
  var notificationChannelDescriptors: ResourceProjectsNotificationchanneldescriptors = js.native
  var notificationChannels: ResourceProjectsNotificationchannels = js.native
  var timeSeries: ResourceProjectsTimeseries = js.native
  var uptimeCheckConfigs: ResourceProjectsUptimecheckconfigs = js.native
}

