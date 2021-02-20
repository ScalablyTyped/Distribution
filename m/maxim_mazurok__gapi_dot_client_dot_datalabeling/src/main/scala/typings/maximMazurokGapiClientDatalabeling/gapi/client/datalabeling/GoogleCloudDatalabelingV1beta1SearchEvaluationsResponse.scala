package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SearchEvaluationsResponse extends StObject {
  
  /** The list of evaluations matching the search. */
  var evaluations: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Evaluation]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1SearchEvaluationsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SearchEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SearchEvaluationsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SearchEvaluationsResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1SearchEvaluationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluations(value: js.Array[GoogleCloudDatalabelingV1beta1Evaluation]): Self = StObject.set(x, "evaluations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationsUndefined: Self = StObject.set(x, "evaluations", js.undefined)
    
    @scala.inline
    def setEvaluationsVarargs(value: GoogleCloudDatalabelingV1beta1Evaluation*): Self = StObject.set(x, "evaluations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
