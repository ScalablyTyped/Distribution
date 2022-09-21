package typings.googleapis.dataprocV1Mod.dataprocV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataproc/v1", "dataproc_v1.Resource$Projects$Regions")
@js.native
open class ResourceProjectsRegions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var autoscalingPolicies: ResourceProjectsRegionsAutoscalingpolicies = js.native
  
  var clusters: ResourceProjectsRegionsClusters = js.native
  
  var context: APIRequestContext = js.native
  
  var jobs: ResourceProjectsRegionsJobs = js.native
  
  var operations: ResourceProjectsRegionsOperations = js.native
  
  var workflowTemplates: ResourceProjectsRegionsWorkflowtemplates = js.native
}
