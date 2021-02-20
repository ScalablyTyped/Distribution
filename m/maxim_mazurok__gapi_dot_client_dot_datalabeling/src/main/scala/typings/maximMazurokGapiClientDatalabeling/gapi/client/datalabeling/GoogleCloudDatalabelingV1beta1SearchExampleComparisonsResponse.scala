package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse extends StObject {
  
  /** A list of example comparisons matching the search criteria. */
  var exampleComparisons: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1ExampleComparison]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExampleComparisons(value: js.Array[GoogleCloudDatalabelingV1beta1ExampleComparison]): Self = StObject.set(x, "exampleComparisons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleComparisonsUndefined: Self = StObject.set(x, "exampleComparisons", js.undefined)
    
    @scala.inline
    def setExampleComparisonsVarargs(value: GoogleCloudDatalabelingV1beta1ExampleComparison*): Self = StObject.set(x, "exampleComparisons", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
