package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
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
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationSpecSets(value: AnnotationSpecSetsResource): Self = this.set("annotationSpecSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasets(value: DatasetsResource): Self = this.set("datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationJobs(value: EvaluationJobsResource): Self = this.set("evaluationJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluations(value: EvaluationsResource): Self = this.set("evaluations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructions(value: InstructionsResource): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
  }
}
