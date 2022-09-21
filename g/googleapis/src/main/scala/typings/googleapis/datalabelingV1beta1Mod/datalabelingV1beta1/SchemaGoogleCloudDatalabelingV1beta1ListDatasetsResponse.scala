package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse extends StObject {
  
  /**
    * The list of datasets to return.
    */
  var datasets: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1Dataset]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse](x: Self) {
    
    inline def setDatasets(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1Dataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1Dataset*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
