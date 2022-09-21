package typings.googleapis.dataprocV1Mod.dataprocV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataproc/v1", "dataproc_v1.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var autoscalingPolicies: ResourceProjectsLocationsAutoscalingpolicies = js.native
  
  var batches: ResourceProjectsLocationsBatches = js.native
  
  var context: APIRequestContext = js.native
  
  var workflowTemplates: ResourceProjectsLocationsWorkflowtemplates = js.native
}
