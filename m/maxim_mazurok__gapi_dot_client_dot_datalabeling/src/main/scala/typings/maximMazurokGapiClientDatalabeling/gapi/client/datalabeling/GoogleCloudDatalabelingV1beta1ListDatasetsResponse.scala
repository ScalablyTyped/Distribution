package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ListDatasetsResponse extends StObject {
  
  /** The list of datasets to return. */
  var datasets: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Dataset]] = js.undefined
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ListDatasetsResponse {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListDatasetsResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ListDatasetsResponse](x: Self) {
    
    inline def setDatasets(value: js.Array[GoogleCloudDatalabelingV1beta1Dataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: GoogleCloudDatalabelingV1beta1Dataset*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
