package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse extends StObject {
  
  /**
    * The list of annotated datasets to return.
    */
  var annotatedDatasets: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1AnnotatedDataset]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse](x: Self) {
    
    inline def setAnnotatedDatasets(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1AnnotatedDataset]): Self = StObject.set(x, "annotatedDatasets", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedDatasetsUndefined: Self = StObject.set(x, "annotatedDatasets", js.undefined)
    
    inline def setAnnotatedDatasetsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1AnnotatedDataset*): Self = StObject.set(x, "annotatedDatasets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
