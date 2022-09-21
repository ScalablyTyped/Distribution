package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse extends StObject {
  
  /** A list of example comparisons matching the search criteria. */
  var exampleComparisons: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1ExampleComparison]] = js.undefined
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse](x: Self) {
    
    inline def setExampleComparisons(value: js.Array[GoogleCloudDatalabelingV1beta1ExampleComparison]): Self = StObject.set(x, "exampleComparisons", value.asInstanceOf[js.Any])
    
    inline def setExampleComparisonsUndefined: Self = StObject.set(x, "exampleComparisons", js.undefined)
    
    inline def setExampleComparisonsVarargs(value: GoogleCloudDatalabelingV1beta1ExampleComparison*): Self = StObject.set(x, "exampleComparisons", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
