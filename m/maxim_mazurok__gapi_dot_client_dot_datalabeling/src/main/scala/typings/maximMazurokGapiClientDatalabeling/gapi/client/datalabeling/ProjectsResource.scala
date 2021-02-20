package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var annotationSpecSets: AnnotationSpecSetsResource = js.native
  
  var datasets: DatasetsResource = js.native
  
  var evaluationJobs: EvaluationJobsResource = js.native
  
  var evaluations: EvaluationsResource = js.native
  
  var instructions: InstructionsResource = js.native
  
  var operations: OperationsResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    annotationSpecSets: AnnotationSpecSetsResource,
    datasets: DatasetsResource,
    evaluationJobs: EvaluationJobsResource,
    evaluations: EvaluationsResource,
    instructions: InstructionsResource,
    operations: OperationsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(annotationSpecSets = annotationSpecSets.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], evaluationJobs = evaluationJobs.asInstanceOf[js.Any], evaluations = evaluations.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpecSets(value: AnnotationSpecSetsResource): Self = StObject.set(x, "annotationSpecSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasets(value: DatasetsResource): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationJobs(value: EvaluationJobsResource): Self = StObject.set(x, "evaluationJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluations(value: EvaluationsResource): Self = StObject.set(x, "evaluations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructions(value: InstructionsResource): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
