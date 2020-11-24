package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.googleapisCommon.apiMod.APIRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Regions")
@js.native
class ResourceProjectsRegions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var autoscalingPolicies: ResourceProjectsRegionsAutoscalingpolicies = js.native
  
  var clusters: ResourceProjectsRegionsClusters = js.native
  
  var context: APIRequestContext = js.native
  
  var jobs: ResourceProjectsRegionsJobs = js.native
  
  var operations: ResourceProjectsRegionsOperations = js.native
  
  var workflowTemplates: ResourceProjectsRegionsWorkflowtemplates = js.native
}
