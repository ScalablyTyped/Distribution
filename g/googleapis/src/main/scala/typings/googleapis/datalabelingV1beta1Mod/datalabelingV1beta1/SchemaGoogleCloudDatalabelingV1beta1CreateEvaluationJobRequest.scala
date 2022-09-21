package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest extends StObject {
  
  /**
    * Required. The evaluation job to create.
    */
  var job: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1CreateEvaluationJobRequest](x: Self) {
    
    inline def setJob(value: SchemaGoogleCloudDatalabelingV1beta1EvaluationJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
