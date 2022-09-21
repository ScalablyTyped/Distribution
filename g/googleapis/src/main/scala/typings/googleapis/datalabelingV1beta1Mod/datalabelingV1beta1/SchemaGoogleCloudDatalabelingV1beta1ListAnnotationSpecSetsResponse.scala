package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse extends StObject {
  
  /**
    * The list of annotation spec sets.
    */
  var annotationSpecSets: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse](x: Self) {
    
    inline def setAnnotationSpecSets(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]): Self = StObject.set(x, "annotationSpecSets", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetsUndefined: Self = StObject.set(x, "annotationSpecSets", js.undefined)
    
    inline def setAnnotationSpecSetsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet*): Self = StObject.set(x, "annotationSpecSets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
