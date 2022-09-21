package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsEvaluationjobsResume
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the evaluation job that is going to be resumed. Format: "projects/{project_id\}/evaluationJobs/{evaluation_job_id\}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ResumeEvaluationJobRequest] = js.undefined
}
object ParamsResourceProjectsEvaluationjobsResume {
  
  inline def apply(): ParamsResourceProjectsEvaluationjobsResume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsEvaluationjobsResume]
  }
  
  extension [Self <: ParamsResourceProjectsEvaluationjobsResume](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatalabelingV1beta1ResumeEvaluationJobRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
