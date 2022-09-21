package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsEvaluationjobsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the evaluation job that is going to be deleted. Format: "projects/{project_id\}/evaluationJobs/{evaluation_job_id\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsEvaluationjobsDelete {
  
  inline def apply(): ParamsResourceProjectsEvaluationjobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsEvaluationjobsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsEvaluationjobsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
