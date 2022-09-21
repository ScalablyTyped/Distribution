package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse extends StObject {
  
  /**
    * The list of evaluations matching the search.
    */
  var evaluations: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1Evaluation]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1SearchEvaluationsResponse](x: Self) {
    
    inline def setEvaluations(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1Evaluation]): Self = StObject.set(x, "evaluations", value.asInstanceOf[js.Any])
    
    inline def setEvaluationsUndefined: Self = StObject.set(x, "evaluations", js.undefined)
    
    inline def setEvaluationsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1Evaluation*): Self = StObject.set(x, "evaluations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
