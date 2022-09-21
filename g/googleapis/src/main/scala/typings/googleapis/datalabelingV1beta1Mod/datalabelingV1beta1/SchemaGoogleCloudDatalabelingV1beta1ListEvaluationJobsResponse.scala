package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse extends StObject {
  
  /**
    * The list of evaluation jobs to return.
    */
  var evaluationJobs: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListEvaluationJobsResponse](x: Self) {
    
    inline def setEvaluationJobs(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1EvaluationJob]): Self = StObject.set(x, "evaluationJobs", value.asInstanceOf[js.Any])
    
    inline def setEvaluationJobsUndefined: Self = StObject.set(x, "evaluationJobs", js.undefined)
    
    inline def setEvaluationJobsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1EvaluationJob*): Self = StObject.set(x, "evaluationJobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
