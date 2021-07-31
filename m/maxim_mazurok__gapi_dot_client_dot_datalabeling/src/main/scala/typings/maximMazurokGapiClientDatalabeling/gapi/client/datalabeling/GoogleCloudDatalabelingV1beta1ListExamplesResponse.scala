package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ListExamplesResponse extends StObject {
  
  /** The list of examples to return. */
  var examples: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Example]] = js.undefined
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ListExamplesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListExamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListExamplesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListExamplesResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ListExamplesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExamples(value: js.Array[GoogleCloudDatalabelingV1beta1Example]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: GoogleCloudDatalabelingV1beta1Example*): Self = StObject.set(x, "examples", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
