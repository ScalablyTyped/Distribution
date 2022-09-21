package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse extends StObject {
  
  /**
    * A list of example comparisons matching the search criteria.
    */
  var exampleComparisons: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1ExampleComparison]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse](x: Self) {
    
    inline def setExampleComparisons(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1ExampleComparison]): Self = StObject.set(x, "exampleComparisons", value.asInstanceOf[js.Any])
    
    inline def setExampleComparisonsUndefined: Self = StObject.set(x, "exampleComparisons", js.undefined)
    
    inline def setExampleComparisonsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1ExampleComparison*): Self = StObject.set(x, "exampleComparisons", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
