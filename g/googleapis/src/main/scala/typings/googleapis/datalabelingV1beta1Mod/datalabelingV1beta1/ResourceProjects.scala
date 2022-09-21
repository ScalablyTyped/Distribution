package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var annotationSpecSets: ResourceProjectsAnnotationspecsets = js.native
  
  var context: APIRequestContext = js.native
  
  var datasets: ResourceProjectsDatasets = js.native
  
  var evaluationJobs: ResourceProjectsEvaluationjobs = js.native
  
  var evaluations: ResourceProjectsEvaluations = js.native
  
  var instructions: ResourceProjectsInstructions = js.native
  
  var operations: ResourceProjectsOperations = js.native
}
