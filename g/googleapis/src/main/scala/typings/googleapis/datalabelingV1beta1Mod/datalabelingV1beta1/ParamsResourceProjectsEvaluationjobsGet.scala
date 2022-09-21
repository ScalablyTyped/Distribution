package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsEvaluationjobsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the evaluation job. Format: "projects/{project_id\} /evaluationJobs/{evaluation_job_id\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsEvaluationjobsGet {
  
  inline def apply(): ParamsResourceProjectsEvaluationjobsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsEvaluationjobsGet]
  }
  
  extension [Self <: ParamsResourceProjectsEvaluationjobsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
